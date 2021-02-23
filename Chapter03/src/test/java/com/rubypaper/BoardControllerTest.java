package com.rubypaper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

import com.rubypaper.domain.BoardVO;

//@WebMvcTest //@Controller @RestController 테스트할때, @SpringBootTest랑 같이 사용할 수 없다.
//@SpringBootTest(webEnvironment=WebEnvironment.MOCK)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc // @Controller @RestController @Service @Repository 테스트할때, @SpringBootTest랑 같이 사용할 수 있다.
public class BoardControllerTest {
	@Autowired
	//private MockMvc mockMvc;
	private TestRestTemplate restTemplate;
	
	/* @Test
	public void testHello() throws Exception {
		mockMvc.perform(get("/hello").param("name", "둘리"))
		.andExpect(status().isOk())
		.andExpect(content().string("Hello : 둘리"))
		.andDo(print());
	} */
	
	@Test
	public void testHello() throws Exception {
		String result = restTemplate.getForObject("/hello?name=둘리", String.class);
		assertEquals("Hello: 둘리", result);
	}
	
	@Test
	public void testGetBoard() throws Exception {
		BoardVO board = restTemplate.getForObject("/getBoard", BoardVO.class);
		assertEquals("테스터", board.getWriter());
	}
}

package com.rubypaper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.rubypaper.domain.Board;
import com.rubypaper.persistence.BoardRepository;

@SpringBootTest
public class QueryMethodTest {

	@Autowired
	private BoardRepository boardRepo;
	
//	@BeforeEach
//	public void dataPrepare() {
//		for(int i=0; i<=200; i++) {
//			Board board = new Board();
//			board.setTitle("테스트 제목 " + i);
//			board.setWriter("테스터");
//			board.setContent("테스트 내용 "+i);
//			board.setCreateDate(new Date());
//			board.setCnt(0L);
//			boardRepo.save(board);
//			
//		}
//	}
	
	// 테이블 내용 검색 기능
//	@Test
//	public void testFindByTitle() {
//		List<Board> boardList = boardRepo.findByTitle("테스트 제목 10");
//		
//		System.out.println("검색결과");
//		for (Board board : boardList) {
//			System.out.println("---> " + board.toString());
//		}
//	}
	
	// 17이 들어가는 내용들 검색하기
//	@Test
//	public void testFindByContentContaining() {
//		List<Board> boardList = boardRepo.findByContentContaining("17");
//		
//		System.out.println("검색결과");
//		for (Board board:boardList) {
//			System.out.println("--->" + board.toString());
//		}
//	}
	
	//OR 검색
//	@Test
//	public void testFindByTitleContainingOrContentContaining() {
//		List<Board> boardList = boardRepo.findByTitleContainingOrContentContaining("17", "17");
//		
//		System.out.println("검색 결과");
//		for(Board board:boardList) {
//			System.out.println("---> " + board.toString());
//		}
//	}
	
	//데이터 정렬하기
//	@Test
//	public void testFindByTitleContainingOrderBySeqDesc() {
//		List<Board> boardList = boardRepo.findByTitleContainingOrderBySeqDesc("17");
//		
//		System.out.println("검색결과");
//		for(Board board:boardList) {
//			System.out.println("---> " + board.toString());
//		}
//	}
	
	// 페이징 처리
	@Test
	public void testFindByTitleContaining() {
		Pageable paging = PageRequest.of(0, 5, Sort.Direction.DESC, "seq");
		
		List<Board> boardList = boardRepo.findByTitleContaining("제목", paging);
		
		System.out.println("검색 결과");
		for(Board board:boardList) {
			System.out.println("---> " + board.toString());
		}
	}
	
	
}

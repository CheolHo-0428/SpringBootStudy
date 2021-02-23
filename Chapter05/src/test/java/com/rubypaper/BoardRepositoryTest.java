package com.rubypaper;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rubypaper.domain.Board;
import com.rubypaper.persistence.BoardRepository;


@SpringBootTest
public class BoardRepositoryTest {
	@Autowired
	private BoardRepository boardRepo;
	
	// 테이블에 내용 삽입
//	@Test
//	public void testInsertBoard() {
//		Board board = new Board();
//		board.setTitle("첫 번째 게시글");
//		board.setWriter("테스터");
//		board.setContent("잘 등록되나요?");
//		board.setCreateDate(new Date());
//		board.setCnt(0L);
//		
//		boardRepo.save(board);
//	}
	
	// 테이블 내용 조회
//	@Test
//	public void testGetBoard() {
//		Board board = boardRepo.findById(1L).get();
//		System.out.println(board.toString());
//		
//	}
	
	// 테이블 내용 수정
//	@Test
//	public void testUpdateBoard() {
//		System.out.println("===1번 게시글 조회===");
//		Board board = boardRepo.findById(1L).get();
//		System.out.println(board);
//		
//		System.out.println("===1번 게시글 수정===");
//		board.setTitle("제목을 수정했습니다.");
//		boardRepo.save(board);
//	}
	
	// 삭제 기능 테스트
	@Test
	public void testDeleteBoard() {
		boardRepo.deleteById(1L);
	}
}

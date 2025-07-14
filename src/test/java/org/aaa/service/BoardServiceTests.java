package org.aaa.service;

import static org.junit.Assert.assertNotNull;

import org.aaa.domain.BoardVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j2
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")

public class BoardServiceTests {
	
	@Setter(onMethod_ =@Autowired)
	private BoardService service;
	
	@Test
	public void testExist() {
		
		log.info("======================================================");
		log.info(service);
		assertNotNull(service);
	}

	@Test
	public void testRegister() {
		BoardVO board = new BoardVO();
		board.setTitle("서비스가 만든 제목 ㅋ");
		board.setContent("서비스가 만든 내용 ㅋ");
		board.setWriter("서비스");
		
		service.register(board);
		
		log.info("======================================================");
		log.info("생성된 게시물의 번호: " + board.getBno());	
		
	}
	
	@Test
	public void testGetList() {
		log.info("======================================================");
		service.getList().forEach(Board -> log.info(Board));
		
	}
}



package org.aaa.mapper;

import org.aaa.domain.BoardVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j2
public class BoardMapperTests {
	
	@Setter(onMethod_ =@Autowired)
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}

	@Test
	public void testGetListXML() {
		mapper.getList2().forEach(board -> log.info(board));
	}
	
	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("제목111");
		board.setContent("내용111");
		board.setWriter("작성자");
		
		mapper.insert(board);
		
		log.info(board);
		log.info("내가 만든 게시물 번호는: " + board.getBno());
	}
	
	@Test
	public void testInsertSelectKey() {
		
		BoardVO board = new BoardVO();
		board.setTitle("제목222");
		board.setContent("내 게시물 번호는?: ");
		board.setWriter("작성자222");
		
		 mapper.insertSelectKey(board);
		
		log.info(board);
		log.info("내가 만든 게시물 번호는: " + board.getBno());
	}
}

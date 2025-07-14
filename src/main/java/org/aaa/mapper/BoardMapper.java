package org.aaa.mapper;

import java.util.List;

import org.aaa.domain.BoardVO;
import org.apache.ibatis.annotations.Select;

public interface BoardMapper {
	
	@Select("SELECT * FROM aaa_board WHERE bno > 0")
	public List<BoardVO> getList();
	
	public List<BoardVO> getList2(); 
	
	public void insert(BoardVO board);
	
	public BoardVO raed(Long bno);
	
	public int delect(long bno);
	
	public int update(BoardVO board);

	public void insertSelectKey(BoardVO board);


}

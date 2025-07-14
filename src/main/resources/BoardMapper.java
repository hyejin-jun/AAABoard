

import java.util.List;

import org.aaa.domain.BoardVO;

import lombok.Setter;

public class BoardMapper {
	
	@Setter("SELECT * FROM aaa_board WHERE bno > 0")
	public List<BoardVO> getList();  // 추상 메서드

}

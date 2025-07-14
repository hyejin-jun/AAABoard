package org.aaa.service;

import java.util.List;

import org.aaa.domain.BoardVO;
import org.aaa.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
@AllArgsConstructor
public abstract class BoardServiceImpl implements BoardService{  // 조원이 쓰는 자식 객체
	
	private BoardMapper mapper;
	
	@Override  // 상속받은 자식 객체라는 의미
	public void register(BoardVO board) {
		
		log.info("============= 보드서비스Impl.register 메서드 실행한드아아아아아 ==================");
		
		mapper.insert(board);
		log.info("정상 등록 후 리스트 출력한드아아아ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ");
		mapper.getList2();
	}
	
	@Override
	public BoardVO get(Long bno) {
		
		log.info("============= 보드서비스Impl.get 메서드 실행한드아아아아아 ==================");
		return mapper.raed(bno);
	}
	
	@Override
	public boolean modify(BoardVO board) {
		
		log.info("============= 보드서비스Impl.modify 메서드 실행한드아아아아아 ==================");
		return mapper.update(board)  == 1;
	}
	
	@Override
	public boolean remove(Long bno) {
		log.info("============= 보드서비스Impl.delect 메서드 실행한드아아아아아 ==================");
		return mapper.delect(bno) == 1;
		
	}
	
	@Override
	public List<BoardVO> getList() {
		log.info("============= 보드서비스Impl.getList 메서드 실행한드아아아아아 ==================");
		return mapper.getList2();
		
		
	}
	

}

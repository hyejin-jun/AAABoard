package org.aaa.controller;

import org.aaa.domain.BoardVO;
import org.aaa.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {
	private BoardService service;
	
	@GetMapping("/list")
	public void list(Model model) {  // 리스트 보기
		
		log.info(" ================= 보드 컨트롤러.리스트 실행한드아아아아아 =====================");
		model.addAttribute("list", service.getList());
	}
	
	@GetMapping("/register")  // 등록하기 ㅋ
	public String register(BoardVO board, RedirectAttributes rttr) {
		log.info(" ================= 보드 컨트롤러.register 실행한드아아아아아 =====================");
		service.register(board);  // 객체 등록 성공시 이동할 경로
		rttr.addFlashAttribute("result", board.getBno());
		return "redirect:/board/list";  // 성공하면 담 페이지 감 (리턴)
	}
	

	

}

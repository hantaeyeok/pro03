package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.dto.Board;
import com.company.service.BoardService;

@Controller
@RequestMapping("/board/")
public class BoardController {

		@Autowired
		private BoardService boardService;
		
		@GetMapping("boardList.do")
		public String getBoardList(Model model) {
			List<Board> boardList = boardService.getBoardList();
			model.addAttribute("boardList",boardList);
			return "board/boardList";
		}
		
		@GetMapping("getBoard")
		public String getBoard(@RequestParam("bno") int bno, Model model) {
			Board board = boardService.getBoard(bno);
			model.addAttribute("board",board);
			return "board/getBoard";
		}
		
//		@GetMapping("insBoard")
//		public String insBoard(Model model) {
//			model.addAttribute("board",new Board());
//			return "board/insBoard";
//		}
//		
//		@PostMapping("insProBoard")
//		public String insProBoard(Board board, Model model) {
//			boardService.insBoard(board);
//			return "redirect:/board/boardList";
//		}
//		
//		@GetMapping("upBoard")
//		public String upBoard(@RequestParam("bno") int bno, Model model) {
//			Board board = boardService.getBoard(bno);
//			model.addAttribute("board",board);
//			return "board/upBoard";
//		}
//		
//		@PostMapping("upProBoard")
//		public String upProBard(Board board, Model model) {
//			boardService.upBoard(board);
//			return "redirect:getBoard.do?bno="+board.getBno();// 수정된 게시물 상세보기로 리다이렉트
//			//사용자에게 url주소로 리다이랙트하라는 의미
//		}
//		
//		 @GetMapping("delBoard.do")
//		    public String delBoard(@RequestParam("bno") int bno) {
//		        boardService.delBoard(bno);
//		        return "redirect:boardList.do";
//		 }


		
}

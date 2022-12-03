package com.mycompany.myapp;

import com.mycompany.myapp.board.BoardDAO;
import com.mycompany.myapp.board.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Controller
////@RequestMapping(value = "/board")
//public class BoardController {
//    @Autowired
//    BoardService boardService;
//
//    @RequestMapping(value="/list",method=RequestMethod.GET)
//    public String boardlist(Model model){
//        model.addAttribute("list",boardService.getBoardList());
//        return "list";
//    }
//
//    @RequestMapping(value = "/add",method =RequestMethod.GET)
//    public String addPost(){
//        return "addpostform";
//    }
//    @RequestMapping(value="/addok",method=RequestMethod.POST)
//    public String addPostOK(BoardVO vo){
//        if (boardService.insertBoard(vo)==0)
//            System.out.println("데이터 추가 실패");
//        else
//            System.out.println("데이터 추가 성공!");
//        return "redirect:list";
//    }
//
//    @RequestMapping(value = "/editform/p3_22100366",method = RequestMethod.GET)
//    public String editPost(@PathVariable("id") int id,Model model){
//        BoardVO boardVO= boardService.getBoard(id);
//        return "editform";
//    }
//
//    @RequestMapping(value ="/editok",method = RequestMethod.POST)
//    public String editPostOk(BoardVO vo){
//        if(boardService.updateBoard(vo)==0)
//            System.out.println("데이터수정 실패!");
//        else
//            System.out.println("데이터 수정 성공!");
//        return "redirect:list";
//    }
//
//    @RequestMapping(value = "/deleteok/p3_22100366",method = RequestMethod.GET)
//    public String deletePostOK(@PathVariable("id") int id){
//        if(boardService.deleteBoard(id)==0)
//            System.out.println("데이터 삭제 실패");
//        else
//            System.out.println("데이터 삭제 성공!");
//        return "redirect:../list";
//    }
//
//
//
//}
@Controller
public class BoardController {
    @Autowired
    BoardDAO boardDAO;

    @RequestMapping(value="/", method = RequestMethod.GET)
        public String boardlist(Model model){
        model.addAttribute("list",boardDAO.getBoardList());
        return "board/list";
    }

    @RequestMapping(value = "/board/add",method =RequestMethod.GET)
        public String addPost(){
        return "board/addpostform";
    }

    @RequestMapping(value = "/editform/{seq}",method = RequestMethod.GET)
        public String editPost(@PathVariable("seq") int id,Model model){
        BoardVO boardVO= boardDAO.getBoard(id);
//        System.out.println("boardVO = " + boardVO.getSeq());
        model.addAttribute("boardVO",boardVO);
//        System.out.println("in editPost");
        return "board/editform";
    }
    @RequestMapping(value ="/board/addok",method = RequestMethod.POST)
    public String addPostOK(BoardVO vo){
        int i=boardDAO.insertBoard(vo);
        if(i==0)
            System.out.println("데이터추가 실패!");
        else
            System.out.println("데이터추가 성공!");
//        return "/board/addok";
        return "redirect:/";
    }

    @RequestMapping(value ="/editok",method = RequestMethod.POST)
        public String editPostOK(BoardVO vo){
        System.out.println("!!!!!!!!");
        if(boardDAO.updateBoard(vo)==0)
            System.out.println("데이터수정 실패!");
        else
            System.out.println("데이터 수정 성공!");
        return "redirect:/";
    }

//    @RequestMapping(value = "/board/deleteok/{sq}",method = RequestMethod.GET)
//        public String deletePostOK(@PathVariable("sq") int id){
//        if(boardDAO.delete(id)==0)
//            System.out.println("데이터 삭제 실패");
//        else
//            System.out.println("데이터 삭제 성공!");
////        return "/board/delete/{sq}";
//        return "redirect:/";
//    }

    @RequestMapping(value = "/deleteok/{sq}",method = RequestMethod.GET)
        public String deletePost(@PathVariable("sq") int id){
        int i= boardDAO.delete(id);
        if(i==0)
            System.out.println("데이터 삭제 실패");
        else
            System.out.println("데이터 삭제 성공!");
        return "redirect:/";
    }

}

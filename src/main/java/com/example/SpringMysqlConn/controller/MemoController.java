package com.example.SpringMysqlConn.controller;

import com.example.SpringMysqlConn.dto.Memo;
import com.example.SpringMysqlConn.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MemoController {

    @Autowired
    private MemoService memoService;

    @GetMapping("/list")
    public String list(Model model) {
        List<Memo> memoList = memoService.getMemo();
        model.addAttribute("memoList", memoList);

        return "list";
    }

}

package com.founderbn.qiandan.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: qianDan
 * @description: 模板控制器
 * @author: yangming
 * @create: 2018-01-16 21:28
 **/

@Controller
@RequestMapping("/demo")
@ComponentScan
public class SampleController {

    @RequestMapping("/qianDan")
    public String  toQianDan(Model model){

        model.addAttribute("name","qianDan121212121212");
         return "hello";
    }

}

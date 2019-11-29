package cn.tommyyang.springdemo.controller.rest;

import cn.tommyyang.springdemo.controller.request.NoteRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: tingzai.yang@gmail.com
 * @Time: 2019/10/23 2:44 PM
 * @Software: IntelliJ IDEA
 */

@RestController
@RequestMapping("/v1/rest")
public class APIController {

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String get(@PathVariable String id) {
        return id;
    }

    @RequestMapping(value = "/post/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String post(@RequestBody NoteRequest noteRequest, @PathVariable String id) {
        System.out.println(noteRequest);
        return "success";
    }

}

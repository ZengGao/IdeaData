package cn.tedu.sbm.controller;

import cn.tedu.sbm.entiry.TbUser;
import cn.tedu.sbm.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/hele")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/demo/{name}")
    @ResponseBody
    public String DemoController(@PathVariable("name") String name){

        List<TbUser> object = demoService.findObject();

        System.out.println(object.toString());
        return "DemoController"+object.toString();
    }
}

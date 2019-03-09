package com.dianrong.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloCotroller {

    //    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;
    @Autowired
    private DemoProperties demoProperties;

//    @RequestMapping(value = "/say/{id}",method = RequestMethod.GET)
//    public String say(@PathVariable("id") Integer id){
//    return demoProperties.getCupSize();
//}

//    @RequestMapping(value = "/say",method = RequestMethod.GET)
//    public String say(@RequestParam("id") Integer myid){
//        return "id："+myid;
//
//    }


//    @RequestMapping(value = "/say",method = RequestMethod.GET)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id",required = false,defaultValue ="0" ) Integer myid){
        return "id："+myid;

    }
}

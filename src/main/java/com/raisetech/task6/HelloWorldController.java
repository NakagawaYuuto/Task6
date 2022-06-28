package com.raisetech.task6;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloWorldController {

    @RequestMapping("/greetings")
    public String example (){
        LocalDateTime nowDateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String dateTimeJp = format.format(nowDateTime);
        return "japan,usa,britainの挨拶。日本の時刻：" + dateTimeJp;
    }

    @RequestMapping(value = "/greetings", params = "country=japan")
    public String Japanese(){
        return "おはようございます";
    }

    @RequestMapping(value = "/greetings", params = "country=usa")
    public String English(){
        return "GoodMorning";
    }

    @RequestMapping(value = "/greetings", params = "country=britain")
    public String Britain(){
        return "Cheers";
    }
}

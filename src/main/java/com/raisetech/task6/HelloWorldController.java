package com.raisetech.task6;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloWorldController {

    @RequestMapping("")
    public String example() {
        LocalDateTime nowDateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String dateTimeJp = format.format(nowDateTime);
        return "japan,usa,britainの挨拶。日本の時刻：" + dateTimeJp;
    }

    @GetMapping("/greetings")
    public String japanese(@RequestParam(name = "japan", value = "japan", required = true)String country){
        return "おはよう御座います";
    }
    public String English(@RequestParam(name = "usa", value = "usa", required = true) String country) {
        return "GoodMorning";
    }
    public String British(@RequestParam(name = "Britain", value = "Britain", required = true) String country) {
        return "Cheers";
    }
}

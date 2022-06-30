package com.raisetech.task6;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String example() {
        LocalDateTime nowDateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String dateTimeJp = format.format(nowDateTime);
        return "japan,usa,britainの挨拶。日本の時刻：" + dateTimeJp;
    }

    @GetMapping("/greetings")
    public String greeting(@RequestParam(value = "country") String country) {
        
        if (country.equals("japan")) {
            return "おはよう御座います。";
        } else if (country.equals("usa")) {
            return "GoodMorning";
        } else if (country.equals("britain")) {
            return "Cheers";
        } else return "どの国の挨拶ですか？（　japan , usa , britain )";
    }
}

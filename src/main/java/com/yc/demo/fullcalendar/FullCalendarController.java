package com.yc.demo.fullcalendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fullCalendar")
public class FullCalendarController {

    @GetMapping
    public String callendar(){
        return "fullcalendarDemo";
    }
}

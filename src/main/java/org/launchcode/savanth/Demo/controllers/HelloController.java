package org.launchcode.savanth.Demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HelloController {


    @GetMapping("form")
    public String helloForm()
    {
        return "form";

    }

   @RequestMapping(method={RequestMethod.GET, RequestMethod.POST}, value="hello")

    public String helloWithTwoQueryParam(@RequestParam String name, String name1, Model model)
    {


        String holdHellos[] ={"Hello", "Bonjour", "Kaise ho", "Ela unnav", "Kasa ho"};


        if(name1.equals("english"))
        {
            model.addAttribute("greeting",holdHellos[0]);
            model.addAttribute("name",name);
        }

        else if(name1.equals("french"))
        {
            model.addAttribute("greeting",holdHellos[1]);
            model.addAttribute("name",name);
        }

        else if(name1.equals("hindi"))
        {
            model.addAttribute("greeting",holdHellos[2]);
            model.addAttribute("name",name);
        }

        else if(name1.equals("telugu"))
        {
            model.addAttribute("greeting",holdHellos[3]);
            model.addAttribute("name",name);
        }

        else if(name1.equals("marathi"))
        {
            model.addAttribute("greeting",holdHellos[4]);
            model.addAttribute("name",name);
        }

        return "respond";
    }




}

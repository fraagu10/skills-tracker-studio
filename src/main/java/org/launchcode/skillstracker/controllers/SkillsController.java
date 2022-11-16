package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String displayHomePage() {
        return "<h1>Skills Tracker</h1>" +
                "<h2>A few skills we would like to learn. Here's a list:</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>TypeScript</li>" +
                "</ol>";
    }

    @GetMapping("form")
    @ResponseBody
    public String displayFavoritesForm() {
        String form =
                "<html>" +
                "<body>" +
                    "<form method='post' action = 'form'>" +
                        "<label>Name: <input type='text' name='name'></label>" +
                        "<label>My favorite language" +
                            "<select name='first'>" +
                                "<option value='java'>Java</option>" +
                                "<option value='javascript'>JavaScript</option>" +
                                "<option value='typescript'>TypeScript</option>" +
                            "</select>" +
                        "<label>My second favorite language" +
                            "<select name='second'>" +
                                "<option value='java'>Java</option>" +
                                "<option value='javascript'>JavaScript</option>" +
                                "<option value='typescript'>TypeScript</option>" +
                        "</select>" +
                        "<label>My third favorite language" +
                            "<select name='third'>" +
                                "<option value='java'>Java</option>" +
                                "<option value='javascript'>JavaScript</option>" +
                                "<option value='typescript'>TypeScript</option>" +
                        "</select>" +
                        "</label>" +
                        "<button type='submit'>Submit</button>" +
                        "</form>" +
                    "</body>" +
                "</html>";

        return form;
    }

    @PostMapping("form")
    @ResponseBody
    public String greetUser(@RequestParam String name, @RequestParam String first, @RequestParam String second,
                            @RequestParam String third) {
        return "<h1> Welcome, " + name + "</h1>" +
                "<ol>" +
                    "<h2>Here is your list of favorite programming languages in order:</h2>" +
                    "<li>" + first + "</li>" +
                    "<li>" + second + "</li>" +
                    "<li>" + third + "</li>" +
                "</ol>";
    }
}

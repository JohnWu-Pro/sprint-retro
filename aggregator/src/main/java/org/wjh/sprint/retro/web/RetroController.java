package org.wjh.sprint.retro.web;

import static org.wjh.spring.web.Views.redirect;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.wjh.sprint.retro.service.RetroService;

@Controller
@RequestMapping
public class RetroController {

    @Inject
    private RetroService service;

    // @RequestMapping(value = "/", method = RequestMethod.GET)
    // public String index() {
    // return forward("collect");
    // }

    @RequestMapping(value = "/collect", method = RequestMethod.GET)
    public String collect() {
        return "entry";
    }

    @RequestMapping(value = "/items", method = RequestMethod.POST)
    public String submit(@RequestParam("items") String text) {
        service.submit(text);

        return redirect("items");
    }

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public String get() {
        return "result";
    }

    @RequestMapping(value = "/clear", method = RequestMethod.GET)
    public String clear() {
        service.clear();

        return redirect("items");
    }
}

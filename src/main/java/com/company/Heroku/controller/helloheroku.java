package com.company.Heroku.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class helloheroku {
        @RequestMapping(value = "/hello", method = RequestMethod.GET)
        public String doHello() {
            return "Hello, Heroku";
        }
        @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
        public String doHi(@PathVariable String name) {
            return "What's happening, " + name;
        }
    }


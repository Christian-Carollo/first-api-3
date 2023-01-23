package co.develhope.firstapi3.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/stringhe")
public class StringController {


    @GetMapping
    public String getStrings(@RequestParam(value = "stringA") String stringA, @RequestParam(value = "stringB", required = false) String stringB) {
        if (stringB != null) {
            return stringA + stringB;
        } else {
            return stringA;
        }
    }
}


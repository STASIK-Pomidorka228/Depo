package com.impact.lessons;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class GetPostClass {
    @GetMapping("/api/share_id")
    public String getParamId(@RequestParam Long id, @RequestParam Optional<String> name){
        if(name.isPresent())
            return "You've shared this id: " + id + "and name" + name;
        return "You've shared the id: " + id;
    }

    @GetMapping({"/api/share_id/{id}", "/api/share_id/"})
    public String getParamId(@PathVariable(required = false) Long id){
        if(id==null) return "id was not definid";
        return "You've shared the id: " + id;

    }
}










































































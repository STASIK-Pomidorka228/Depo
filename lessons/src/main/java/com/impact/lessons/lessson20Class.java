package com.impact.lessons;
import main.java.com.impact.lessons.Modelws.Users;
import org.springframework.web.bind.annotation.*;

public class lessson20Class {
    Users user = new Users(4L, "Stasik", "Stasik7@gmail.com", "2057", 4, true);
    @PutMapping("/api/data/{id}")
    public Users getParamsOnPut(@PathVariable long id, @RequestBody Users users){
     users.setId(id);
     return users;
    }
    @PatchMapping("/api/data/{id}")
        public String getParamsOnPatch(@PathVariable long id, @RequestBody Users password ) {
        return "Users with id: " + id + "changed password " + password.getPassword();
    }

    @DeleteMapping("/api/data/{id}")
    public String getParamasOnDelete(@PathVariable long id){
        return "Delete user with id: " + id;
    }

}

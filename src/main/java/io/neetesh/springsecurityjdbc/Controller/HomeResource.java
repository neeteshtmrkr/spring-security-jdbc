package io.neetesh.springsecurityjdbc.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

public class HomeResource {

    @GetMapping("/")
    public String home(){
        return("<h1>Welcome</h1>");
    }

    @GetMapping("/user")
    public String user(){
        return("<h1>Welcome User</h1>");
    }

    @GetMapping("/admin")
    public String admin(){
        return("<h1>Welcome Admin</h1>");
    }
}

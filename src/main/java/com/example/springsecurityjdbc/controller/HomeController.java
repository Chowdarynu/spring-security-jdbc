package com.example.springsecurityjdbc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

   @GetMapping("/")
   public String all() {
      return ("<H1> Welcome to Spring security app</H1>");
   }

   @GetMapping("/user")
   public String user() {
      return ("<H1> Welcome User</H1>");
   }

   @GetMapping("/admin")
   public String admin() {
      return ("<H1> Welcome Admin</H1>");
   }
}

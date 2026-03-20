package cl.bancox.saldo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Holacontroller {

    @GetMapping("/hola")
    public String holaMundo() {
        return "¡HOLA MUNDO!";
    }



    @GetMapping("/chao")
    public String ChaoMundo() {
        return "¡Chao!";
    }



}

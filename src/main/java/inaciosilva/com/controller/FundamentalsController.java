package inaciosilva.com.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller01")
public class FundamentalsController {

    //método GET

    @GetMapping("/primeiroController/{id}")
    public String primeiroController(@PathVariable String id) {
        return "O Parametro do Controller é: " + id;
    }

    //metodo Com Query Params usando Id

    @GetMapping("/metodoComQueryParams")
    public String metodoComQueryParams(@RequestParam String id) {
        return "O parametro é " + id;
    }

    @GetMapping("/metodoComQueryParams2")
    public String metodoComQueryParams2(@RequestParam Map<String, String> allParams) {
        return "O parametro é " + allParams.entrySet();
    }

    //metodo com body Params
    //Metodo POST

    @PostMapping("/metodoCombodyParams")
    public String metodoCombodyParams(@RequestBody Usuario usuario) {
        return "metodoCombodyParams " + usuario.username();

    }

    //metodo Com Headers

    @PostMapping("/metodoComHeaders")
    public String metodoComHeaders(@RequestHeader("name") String name) {
        return "metodoCombodyParams " + name;

    }
        @PostMapping("/metodoComListHeaders")
    public String metodoComHeaders(@RequestHeader Map<String, String> headers){
        return "metodoCombodyParams " + headers.entrySet();

    }

    @GetMapping("/metodoResponseEntity")
    public ResponseEntity<Object> metodoResponseEntity() {
        return ResponseEntity.status(HttpStatus.CREATED).body("Messagem de error");
    } 


        record Usuario(String username) {

    }

}

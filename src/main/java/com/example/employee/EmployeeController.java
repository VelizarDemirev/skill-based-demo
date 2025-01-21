package com.example.employee;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/employee")
public class EmployeeController {
    
    @Get
    public String status() {
        
        return "Gofore";
    }
}
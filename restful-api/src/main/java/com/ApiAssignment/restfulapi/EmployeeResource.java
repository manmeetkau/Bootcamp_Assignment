package com.ApiAssignment.restfulapi;

import jakarta.validation.Valid;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class EmployeeResource {
    private EmployeeDaoService empdaoservice;
    public EmployeeResource(EmployeeDaoService empdaoservice)
    {
        this.empdaoservice=empdaoservice;
    }
@GetMapping("/employees")
    public List<Employee> retrieveAll(){
        return empdaoservice.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee retrieveEmployee(@PathVariable int id){

        Employee emp1=empdaoservice.findOne(id);
        if(emp1==null)
            throw new EmployeeNotFoundException("id:"+id);
        return emp1;

    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id){
        empdaoservice.deletebyId(id);
    }
    @PostMapping("/employees")
    public void createusers( @Valid @RequestBody Employee employee){
empdaoservice.save(employee);

    }


    @PutMapping("/employees")
    public Employee update(@RequestBody Employee e) {
        return empdaoservice.update(e);
    }
    }
        // Method*/






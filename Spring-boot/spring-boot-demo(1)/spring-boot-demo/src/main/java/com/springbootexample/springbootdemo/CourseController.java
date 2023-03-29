package com.springbootexample.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.Array;

@RestController
public class CourseController {
   @RequestMapping("/courses")
    public List<Course> retrieveall(){
        return Arrays.asList(
                new Course(1,"AWS","Durgesh"),
                new Course(2,"Java","Udemy"),
                new Course(3,"c++","Manmeet"),
                new Course(4,"python","Deepti"));

        }
    }



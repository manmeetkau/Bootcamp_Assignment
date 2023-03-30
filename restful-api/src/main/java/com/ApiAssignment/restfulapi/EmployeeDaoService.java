package com.ApiAssignment.restfulapi;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

@Component
public class EmployeeDaoService {
    private static List<Employee> employee = new ArrayList<>();

    private static int Empcount = 0;

    static {
        employee.add(new Employee(++Empcount, "Manmeetkaur", 23));
        employee.add(new Employee(++Empcount, "Mankirat", 20));
        employee.add(new Employee(++Empcount, "Balpreet", 20));
    }

    public List<Employee> findAll() {
        return employee;
    }

    public Employee findOne(int id) {
        Predicate<? super Employee> predicate = employe -> {
            return Objects.equals(employe.getId(), id);
        };
        return (employee.stream().filter(predicate).findFirst().orElse(null));

    }

    public void deletebyId(int id) {
        Predicate<? super Employee> predicate = employe -> {
            return Objects.equals(employe.getId(), id);
        };
        employee.removeIf(predicate);
    }

    public void save(Employee employees) {
        employees.setId(++Empcount);
        employee.add(employees);
    }

    public Employee update(Employee e) {
        int index=0;
        for(Employee emp:employee){
            if(emp.getId()==e.getId()){
                index=employee.indexOf(emp);
                break;
            }
        }
        employee.set(index,e);
        return e;
    }
    }




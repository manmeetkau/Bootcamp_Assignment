package com.JPQLandNativeSQL.JPQLandNativeSQL;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Employeerepository extends CrudRepository<Employee,Integer> {
    @Query("select firstName,lastName  from Employee where salary>(select AVG(salary)from Employee order by age) order by salary desc")
    List<Object[]> FindFirstNameLastName();


    @Modifying
    @Query("update Employee set salary=:newsalary where salary<:avg")
    Integer UpdateSalary(@Param("avg") Integer avg, @Param("newsalary") int newsalary);

    @Query("select AVG(salary) from Employee")
    Integer FindAvgSalary();

    @Modifying
    @Query("delete from Employee where salary=:minsal")
  Integer deleteforminsal(@Param("minsal") Integer min);

    @Query("select Min(salary) from Employee")
    Integer FindMinSal();
    @Query(value = "select emp_id,emp_first_name,emp_age from employee_table where emp_last_name Like '%Singh'", nativeQuery = true)
    List<Object[]> findallnative();


    @Modifying
    @Query(value = "delete from employee_table where emp_age=:age", nativeQuery = true)
    void CheckDelete(@Param("age") int age);



}

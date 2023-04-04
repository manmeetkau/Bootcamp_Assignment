package com.database.DatabseExaple;

import org.hibernate.query.sqm.SortOrder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QPageRequest;

import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.util.List;
import java.util.Optional;

import static org.apache.coyote.http11.Constants.A;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DatabseExapleApplicationTests {
	@Autowired
	ProductRepo productRepo;

	@Test
	void contextLoads() {
	}

	@Test
	void add() {
		Employee e1 = new Employee(9, "Anmol", 22, "Delhi");
		productRepo.save(e1);

	}

	@Test
	public void read() {
		Employee e1 = productRepo.findById(1).get();
		assertNotNull(e1);
		assertEquals("Kritika", e1.getName());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>" + e1.Location);

	}

	@Test
	public void testupdate() {
		Employee e1 = productRepo.findById(2).get();
		e1.setAge(29);
		productRepo.save(e1);
		assertEquals(29,e1.getAge());
	}

	@Test
	public void testDelete() {
		productRepo.deleteById(1);
	}

	@Test
	public void textcount() {
		System.out.println("#############" + productRepo.count());
	}

	@Test
	public void testfindByname() {
		List<Employee> emp = productRepo.findByName("Kritika");
		emp.forEach(p->assertEquals("Kritika", p.getName()));
	}


	@Test
	public void testfindagebetween() {
		List<Employee> emp = productRepo.findByAgeBetween(28, 30);
		emp.forEach(e->System.out.println(e.getName()));
	}

	@Test
	public void testfindbyLike() {
		List<Employee> emp = productRepo.findByNameLike("A%");
		emp.forEach(e -> System.out.println(e.getId() + "     " + e.getName() + "      " + e.getLocation() + "       " + e.getAge()));
		emp.forEach(e->assertEquals("Anmol",e.getName()));
	}

	@Test
	public void testFndAllPagingandSorting(){
		Pageable page= PageRequest.of(0, 3, Sort.Direction.ASC, "age");
		productRepo.findAll(page).forEach(p-> System.out.println(p.getName()));

	}
}


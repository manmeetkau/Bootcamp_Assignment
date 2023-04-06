package com.JPQLandNativeSQL.JPQLandNativeSQL;

import com.JPQLandNativeSQL.JPQLandNativeSQL.ComponentMapping.Emplooyee;
import com.JPQLandNativeSQL.JPQLandNativeSQL.ComponentMapping.EmployeeEmbeddedrepository;
import com.JPQLandNativeSQL.JPQLandNativeSQL.ComponentMapping.Salary;
import com.JPQLandNativeSQL.JPQLandNativeSQL.Jointype.Check_join;
import com.JPQLandNativeSQL.JPQLandNativeSQL.Jointype.Credit_join;
import com.JPQLandNativeSQL.JPQLandNativeSQL.Jointype.Payement_joinrespository;
import com.JPQLandNativeSQL.JPQLandNativeSQL.SingleTableStrategy.Check;
import com.JPQLandNativeSQL.JPQLandNativeSQL.SingleTableStrategy.Credit;
import com.JPQLandNativeSQL.JPQLandNativeSQL.SingleTableStrategy.Payement;
import com.JPQLandNativeSQL.JPQLandNativeSQL.SingleTableStrategy.Payementrespository;
import com.JPQLandNativeSQL.JPQLandNativeSQL.TablePerclass.Bank_Check;
import com.JPQLandNativeSQL.JPQLandNativeSQL.TablePerclass.Credit_card;
import com.JPQLandNativeSQL.JPQLandNativeSQL.TablePerclass.Payement_Tablerespository;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.io.OutputStream;
import java.util.List;

@SpringBootTest
class JpqLandNativeSqlApplicationTests {

	@Autowired
	EmployeeEmbeddedrepository embeddedrepository;
	@Autowired
	Payementrespository payrepository;
	@Autowired
	Payement_joinrespository payjoinrepo;

	@Autowired
	Payement_Tablerespository payytablerepo;

	@Autowired
	Employeerepository repository;

	@Test
	void testEmployeeCreate() {
		Employee e4 = new Employee();
		e4.setId(4);
		e4.setAge(26);
		e4.setFirstName("Vishal");
		e4.setLastName("Verma");
		e4.setSalary(40000);
		repository.save(e4);
	}
    @Transactional
	@Rollback(value = false)
	@Test
	public void testDelete() {
		repository.deleteById(52);
	}

	@Test
	public void testFirstNameLastNameByAvgSal() {
		List<Object[]> result = repository.FindFirstNameLastName();
		for (Object[] objects : result) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
		}
	}

	@Test
	public Integer testAvgSal() {

		Integer salary = repository.FindAvgSalary();

		System.out.println(salary);
		return salary;

	}
	@Transactional
	@Rollback(value = false)
	@Test
	public void UpdateSalary(){
		System.out.println(repository.UpdateSalary((repository.FindAvgSalary()),55000));
	}

	@Test
	public Integer Minsal(){
		Integer minsalary=repository.FindMinSal();
		return minsalary;

	}
	@Test
	@Transactional
	@Rollback(value = false)
	public void testDeleteByMinSalary(){
		repository.deleteforminsal(repository.FindMinSal());
	}


	@Test
	public void testfindallnative() {
		List<Object[]> result = repository.findallnative();
		for (Object[] object : result) {
			System.out.println(object[0]);
			System.out.println(object[1]);
			System.out.println(object[2]);
		}
	}


	@Test
	@Transactional
	@Rollback(false)
	public void TestDelete() {
		repository.CheckDelete(22);
	}

	@Test
	public void createpayement_single() {
		Credit credit1 = new Credit();
		credit1.setId(122);
		credit1.setCreditcard("67542217");
		credit1.setAmount(20000);
		payrepository.save(credit1);
	}

	@Test
	public void createpayement_single_check() {
		Check check1 = new Check();
		check1.setId(102);
		check1.setCheckcard("897542217");
		check1.setAmount(32000);
		payrepository.save(check1);
	}


	@Test
	public void CreatePayement_Table() {
		Credit_card credit2 = new Credit_card();
		credit2.setId(204);
		credit2.setCreditcard("78645677");
		credit2.setAmount(150000);
		payytablerepo.save(credit2);
	}

	@Test
	public void createpayementcheck_table() {
		Bank_Check cc1 = new Bank_Check();
		cc1.setId(109);
		cc1.setCheckcard("9345677");
		cc1.setAmount(670000);
		payytablerepo.save(cc1);
	}


	@Test
	public void CreatepayementCheckJoin() {
		Check_join cc1 = new Check_join();
		cc1.setId(323);
		cc1.setCheckcard("8845677");
		cc1.setAmount(250000);
		payjoinrepo.save(cc1);
	}

	@Test
	public void CreatePayementJoin() {
		Credit_join credit2 = new Credit_join();
		credit2.setId(103);
		credit2.setCreditcard("89772334");
		credit2.setAmount(56280);
		payjoinrepo.save(credit2);
	}


	@Test
 public void  testEmbeddedcomp(){
	 Emplooyee e1=new Emplooyee();
	 e1.setAge(25);
	 e1.setId(2);
	 e1.setFirstName("Riya");
	 e1.setLastName("Verma");
	 Salary sal=new Salary();
	 sal.setBasicSalary(300f);
	 sal.setBonusSalary(550f);
	 sal.setTaxAmount(60f);
	 sal.setSpecialAllowanceSalary(450f);
	 e1.setSalary(sal);
	 embeddedrepository.save(e1);
 }

}

package Assignment1;

public class Employee

{

    private String firstName;

    private String lastName;

    private double salary;

    public Employee()

    {

        firstName = "";

        lastName = "";

        salary = 0;

    }

    public Employee (String firstName, String lastName)

    {

        this.firstName = firstName;

        this.lastName = lastName;

        this.salary = 0;

    }

    public Employee( String firstName, String lastName, double s)

    {

        this.firstName = firstName;

        this.lastName = lastName;

        setSalary( s );

    }

    public String getFirstName()

    {

        return this.firstName;

    }

    public String getLastName()

    {

        return this.lastName;

    }

    public double getSalary()

    {

        return this.salary;

    }

    public void setFirstName( String firstName)

    {

        this.firstName = firstName;

    }

    public void setLastName ( String lastName)

    {

        this.lastName = lastName;

    }

    public void setSalary( double salary)

    {

        if (salary < 0 ) this.salary = 0;

        else this.salary = salary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String args[])
    {
        Employee emp=new Employee("Manmeet","kaur",30000);
        emp.getFirstName();
        emp.getLastName();
        emp.getSalary();
        emp.setFirstName("Rohan");
       // System.out.println(emp.getFirstName());
        emp.setLastName("kapoor");
        emp.setSalary(10000);
        String info=emp.toString();
        System.out.println(info);
    }
}
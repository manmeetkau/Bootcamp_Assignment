public class record_example {
    public static void main(String[] args)
    {
        record student(int id, String name, int age){
            static int counter=0;
            static void increment(){
                counter++;
            }
            student{
                increment();
            }
        };
        student stud1=new student(1,"Anmol",12);
        student stud2=new student(1,"Anmol",12);
        student stud3=new student(2,"Manpreet",15);
        System.out.println(stud1.equals(stud2));
        System.out.println("counter="+student.counter);
    }
}

package Java3;

public class User {
    String FirstName;
     String LastName;
    String age;
     String PhoneNo;

    public User( ) {
       this.FirstName = " ";
        this.LastName = " ";
        this.age = " ";
       this. PhoneNo = " ";
    }

    @Override
    public String toString() {
        return "User{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age='" + age + '\'' +
                ", PhoneNo='" + PhoneNo + '\'' +
                '}';
    }
}

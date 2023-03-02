public class classNotFound {
    public static void main(String[]args){
        try{
            Class.forName("Manmeet");
        }catch (ClassNotFoundException a){
            System.out.println("ClassNotFoundException");
            a.printStackTrace();
        }
    }
}

package Java3;

public class SingleObj {

    private static SingleObj instance = new SingleObj();



    private SingleObj(){}

    public static SingleObj getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Singleton Factory");
    }
}


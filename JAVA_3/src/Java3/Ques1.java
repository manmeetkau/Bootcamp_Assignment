package Java3;// Java program to Illustrate Usage of Enum
// Constructor, Instance Variable & Method

// Importing required classes

// Enum
enum House{
    // Attributes associated to enum
    Two_Rooms_set(12000000),
    Three_room_set(2000000),
    Bunglow(50000000),
    Flat(8000000);

    // internal data
    final int price;

    // Constructor
    private House(int pr) { price = pr; }

    // Method
    int totalPrice() { return price; }
}

class EnumPract{

    public static void main(String[] args)
    {

        System.out.println("Total price of fruits : ");

        for (House f : House.values())

            System.out.println(f + " costs "
                    + f.totalPrice()
                    );
    }
}

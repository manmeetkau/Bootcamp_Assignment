package Spring1;
class Box
{
    public int area;
    Box(int length, int width)
    {
        this.area = length * width ;
    }
class Tightly_coupled
{
    public static void main(String args[])
    {
        Box b = new Box(5,5);
        System.out.println(b.area);
    }
}

}


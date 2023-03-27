package Spring1;

public class Square implements shapeArea{
    int area;


    @Override
    public int calArea(int length,int width) {
        width=length;
        return length*width;
    }
}

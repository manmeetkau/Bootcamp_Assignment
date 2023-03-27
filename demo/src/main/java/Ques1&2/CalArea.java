package Spring1;

public class CalArea {
    private shapeArea ShapeArea;
    public CalArea(shapeArea ShapeArea)
    {
     this.ShapeArea=ShapeArea;
    }
    public int Calarea(){
        int value=ShapeArea.calArea(7,4);
        System.out.println(ShapeArea);
        return value;
    }

}

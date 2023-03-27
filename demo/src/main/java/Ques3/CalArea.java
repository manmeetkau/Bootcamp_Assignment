package SpringExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalArea {
    @Autowired
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

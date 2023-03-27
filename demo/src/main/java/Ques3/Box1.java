package SpringExample;

import org.springframework.stereotype.Component;

@Component
public class Box1 implements shapeArea {
   @Override
    public int calArea(int length, int width) {
         return length * width;



    }

}

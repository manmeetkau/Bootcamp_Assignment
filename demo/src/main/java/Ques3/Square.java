package Ques3;

import SpringExample.shapeArea;
import org.springframework.stereotype.Component;

@Component
public class Square implements shapeArea {
    @Override
    public int calArea(int length,int width) {
        width=length;
        return length*width;
    }
}

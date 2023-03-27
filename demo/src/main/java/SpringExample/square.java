package SpringExample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class square implements shapeArea {
    @Override
    public int calArea(int length,int width) {
        width=length;
        return length*width;
    }
}

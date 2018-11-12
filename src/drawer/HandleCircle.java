package drawer;

import shapes.Circle;
import shapes.Point;

import java.awt.*;

public class HandleCircle implements Handler{
    public static void handle(String[] line1, Graphics2D g){
        shapes.Point center = new Point(Double.parseDouble(line1[0]), Double.parseDouble(line1[1]));

        Circle circle = new Circle(center, Double.parseDouble(line1[2]));
        circle.draw(g);
    }
}

package drawer;

import shapes.Line;
import shapes.Point;

import java.awt.*;

public class HandleRec implements Handler {
    public static void handle(String[] line, Graphics2D g){
        shapes.Point leftDown = new shapes.Point(Double.parseDouble(line[0]),Double.parseDouble(line[1]));
        Line len = new Line(leftDown, new shapes.Point(Double.parseDouble(line[2]), Double.parseDouble(line[3])));
        Line width = new Line(leftDown, new Point(Double.parseDouble(line[4]),Double.parseDouble(line[5])));
        shapes.Rectangle rec = new shapes.Rectangle(leftDown, len, width);
        rec.draw(g);
    }
}
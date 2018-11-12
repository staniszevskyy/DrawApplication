package drawer;

import shapes.Line;
import shapes.Point;

import java.awt.*;

public class HandleLine implements Handler {
    public static void handle(String[] line, Graphics2D g) {
        shapes.Point p1 = new shapes.Point(Double.parseDouble(line[0]), Double.parseDouble(line[1]));
        shapes.Point p2 = new Point(Double.parseDouble(line[2]), Double.parseDouble(line[3]));
        Line l = new Line(p1, p2);
        l.draw(g);

    }
}
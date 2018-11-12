package shapes;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle implements Figure, Drawable {
    private Point center;
    private Color color;
    private double radius;

    public Circle(Point mid, double radius) {
        this.center = mid;
        this.color = null;
        this.radius = radius;
    }

    public double getArea(){

        return Math.PI*Math.pow(radius,2);
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }

    public void setColor(int r, int g, int b) {
        this.color = new Color(r,g,b);
    }

    public Point getCenter() {
        return center;
    }

    public Color getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void draw(Graphics2D g) {
        if (color!=null)
            g.setColor(color);
        g.draw(new Ellipse2D.Double(center.getX(), center.getY(), 2*radius, 2*radius));
    }
}

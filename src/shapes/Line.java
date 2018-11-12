package shapes;

import java.awt.*;
import java.awt.geom.Line2D;

public class Line implements Drawable {
    private Point p1;
    private Point p2;
    private Color color;
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.color = null;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public double getLength(){
        if (p1.getX()== p2.getX())
            return Math.abs(p1.getY()-p2.getY());
        else
            return Math.abs(p1.getX()-p2.getX());
    }

    public void setColor(int r, int g, int b) {
        this.color = new Color(r,g,b);
    }


    public Color getColor() {
        return color;
    }

    public void draw(Graphics2D g2){
        if (color!=null)
            g2.setColor(getColor());
        g2.draw(new Line2D.Double(p1.getX(),p1.getY(),p2.getX(),p2.getY()));
    }
}

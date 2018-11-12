package shapes;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle implements Figure, Drawable {
    private Point leftDown;
    private Line width;
    private Line length;
    private Color color;

    public Rectangle(Point leftDown, Line a, Line b) {
        this.width = a;
        this.length = b;
        this.color = null;
        this.leftDown = leftDown;
    }



    public double getArea(){
        return width.getLength()* length.getLength();
    }

    public double getPerimeter(){
        return 2* width.getLength()+2* length.getLength();
    }

    public Line getWidth() {
        return width;
    }

    public Line getLength() {
        return length;
    }

    public Point getLeftDown() {
        return leftDown;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(int r, int g, int b) {
        this.color = new Color(r,g,b);
    }

    public void draw(Graphics2D g){
        if (color!=null)
            g.setColor(color);
        g.draw(new Rectangle2D.Double(leftDown.getX(), leftDown.getY(), width.getLength(), length.getLength()));

    }
}

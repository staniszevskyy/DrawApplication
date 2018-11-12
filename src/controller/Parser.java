package controller;

import drawer.HandleCircle;
import drawer.HandleLine;
import drawer.HandleRec;
import shapes.Circle;
import shapes.Point;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {
    private String dir ;
    private Scanner in;
    private Graphics2D g;

    public Parser(String dir, Graphics2D g) {
        this.dir = dir;
        this.g = g;
    }

    public void parse() throws FileNotFoundException  {


        in = new Scanner(new File(dir));

        while (in.hasNext()) {
            String next = in.nextLine();
            next = next.replace("(", "").replace(")","").replace(","," ");
            String[] tab = next.split(" ");
            if (ValidateString.validate(tab)==true) {
                if (tab.length == 6)
                    HandleRec.handle(tab, g);
                else if (tab.length == 4)
                    HandleLine.handle(tab, g);
                else if (tab.length == 3)
                    HandleCircle.handle(tab,g);

            }
            else{
                System.out.println("Niepoprawne dane lub wartosc ujemna, rozpoczynam rysowanie kolejnego obiektu");
            }

        }
    }

    public static void handleCircle(String[] line1, Graphics2D g){
        shapes.Point center = new Point(Double.parseDouble(line1[0]), Double.parseDouble(line1[1]));

        Circle circle = new Circle(center, Double.parseDouble(line1[1]));
        circle.draw(g);
    }
}

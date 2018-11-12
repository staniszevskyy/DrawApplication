package app;

import controller.Parser;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;


public class MainWindow extends JFrame{
    public MainWindow()
    {
        setTitle("Drawing");
        setSize(1600,1080);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public void paint(Graphics g) {
        Graphics2D graph2 = (Graphics2D)g;

        try {
            Parser p = new Parser("./src/resources/input.txt", graph2);
            p.parse();
        }
        catch (FileNotFoundException e){
            System.out.println("Niepoprawna sciezka pliku");
        }

    }

    public static void main(String[] args) throws FileNotFoundException {

        MainWindow m = new MainWindow();
        try {
            m.paint(null);
        }
        catch (NullPointerException e){
        }
    }

}

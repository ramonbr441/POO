/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ads.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class App {

    public static void main(String[] args) {
        Draw draw = new Draw();


        draw.setCanvasSize(800,600);
        draw.setXscale(0,800);
        draw.setYscale(0,600);

        draw.setPenColor(Color.black);
        draw.filledSquare(400,300,100);
        draw.setPenColor(Color.green);
        draw.text(400,50,"hayabusa");

        draw.picture(400,300, "hayabusa.jpg");
    }
}

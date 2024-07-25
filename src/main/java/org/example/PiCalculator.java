package org.example;

import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.util.Scanner;
import static java.lang.Integer.parseInt;
import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class PiCalculator {
    public static void main(String[] args) {
        int iterationVal = parseInt(JOptionPane.showInputDialog("Enter iteration value:"));

        int hits = 0 ;
        double estimated_pi = 0 ;
        double error = 0 ;

        Point rectanglePoints = new Point(0,0);
        Rectangle rectangle = new Rectangle(4,4,rectanglePoints);

        Point circlePoints = new Point(2,2);
        Circle circle= new Circle(circlePoints,2);

        for(int i = 0 ; i <iterationVal ; i++){
            Point randomPoints  = rectangle.getRandomPoint();
            //System.out.println("Random point is : " + randomPoints);
            if(circle.contains(randomPoints)){
                hits++;
            }
        }
        estimated_pi= 4 * ((double) hits / iterationVal);

        error = abs((estimated_pi - Math.PI) / PI) * 100;
        System.out.println("Iteration time : " + iterationVal);
        System.out.println("Hits rate : " + hits);
        System.out.println("Estimate of pi : " + estimated_pi);
        System.out.println("Error : " + error);

        System.out.println("hits/it : " + (double)(hits/iterationVal));
    }
}

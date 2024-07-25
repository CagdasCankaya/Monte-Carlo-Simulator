package org.example;

import java.util.Random;

public class Rectangle {
    double width;
    double height;
    Point corner;

    public Rectangle(double width, double height, Point corner) {
        this.width = width;
        this.height = height;
        this.corner = corner;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Point getCorner() {
        return corner;
    }

    public void setCorner(Point corner) {
        this.corner = corner;
    }

    public boolean contains(Point point) {
        double x = point.getX();
        double y = point.getY();
       /* try {
            if(this.width>this.corner.getX() && this.height<=this.corner.getY())
            {
                return true;
            }
           /* if (this.corner.getX() >= x && this.corner.getY() <= y) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;*/

        return (x >= corner.getX() && x <= corner.getX() + width && y >= corner.getY() && corner.getY() <= corner.getY() + height);
    }
    public Point getRandomPoint(){
        Random random = new Random();
        Double x = corner.getX() + random.nextDouble() * width;
        Double y = corner.getY()+ random.nextDouble() * height;
        return new Point(x,y);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", corner=" + corner +
                '}';
    }
}

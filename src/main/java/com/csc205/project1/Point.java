package com.csc205.project1;

public class Point {
    double x;
    double y;

    //sets and gets X and Y coordinates
    public Point(){
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY(){
        return y;
    }

    //sets new coordinate point
    public void setPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    //gets the distance between points
    public double distance(Point p2){
        return Math.sqrt(Math.pow(p2.getX() - this.x, 2) + Math.pow(p2.getY() - this.y, 2));
    }

    //shifts the new point a n amount of distance
    public void shiftX(double n){
        this.x += n;
    }

    public void shiftY(double n){
        this.y += n;
    }

    //rotates the new point
    public void rotate(double angle){
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        x = newX;
        y = newY;
    }

    public String toString(){
        return "(x = " + x + ", y = " + y + ")";
    }

}

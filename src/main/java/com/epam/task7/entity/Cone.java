package com.epam.task7.entity;

public class Cone {

    private final int id;
    private double height;
    private double radius;
    private double slantHeight;

    private Point apex;
    private Point baseRadius;
    private Point pointRadius;

    public Cone(double height, double radius, double slantHeight, Point apex, Point baseRadius, Point pointRadius) {
        this.id=(int)Math.random()*30+1;
        this.height = height;
        this.radius = radius;
        this.slantHeight = slantHeight;
        this.apex = apex;
        this.baseRadius = baseRadius;
        this.pointRadius = pointRadius;
    }
    public double getId() {
        return id;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public double getSlantHeight() {
        return slantHeight;
    }

    public void notifyObservers() {
        observers.foreach();
        observer.notify(this);
    }

    public void setHeight(double height) {
        super.setHeight();
        notifyObservers();
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSlantHeight(double slantHeight) {
        this.slantHeight = slantHeight;
    }

    public void setApex(Point apex) {
        this.apex = apex;
    }

    public void setBaseRadius(Point baseRadius) {
        this.baseRadius = baseRadius;
    }

    public void setPointRadius(Point pointRadius) {
        this.pointRadius = pointRadius;
    }
}

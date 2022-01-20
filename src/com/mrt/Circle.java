package com.mrt;

public class Circle {
        private int mTest;

        public static final double DEFAULT_RADIUS =1.0;
        public static final String DEFAULT_COLOR  = "Красный";

        private double radius;
        private String color;

        public Circle()
        {
            radius = DEFAULT_RADIUS;
            color = DEFAULT_COLOR;
        }

        public Circle(double radius)
        {
            this.radius = radius;
            color = DEFAULT_COLOR;
        }

        public Circle(double radius, String color)
        {
            this.radius = radius;
            this.color = color;
        }

        public double getRadius()
        {
            return radius;
        }

        public void setRadius(double radius)
        {
            this.radius = radius;
        }

        public String grtColor()
        {
            return color;
        }

        public void setColor(String color)
        {
            this.color = color;
        }

        public String toString()
        {
            return "Круг радиуса=" +radius +" и цвета "+color;
        }

        public double getArea()
        {
            return radius* radius*Math.PI;
        }
    }

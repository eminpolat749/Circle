package org.csystem.util.math.geometry;

public class Circle {
    private double m_radius;

    public Circle()
    {
    }
    public Circle(double radius)
    {
        setRadius(radius);
    }
    public double getRadius()
    {
        return m_radius;
    }
    public void setRadius(double radius)
    {
        m_radius = Math.abs(radius);
    }

    public double getArea()
    {
        return Math.PI * m_radius * m_radius;
    }

    public double getPerimeter()
    {
        return Math.PI * m_radius * 2;
    }

    public String toString()
    {
        return String.format("Radius:%f, Area:%f, Perimeter:%f%n", m_radius, getArea(), getPerimeter());
    }


}

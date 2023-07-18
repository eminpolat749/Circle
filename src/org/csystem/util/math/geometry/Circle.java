package org.csystem.util.math.geometry;

public class Circle {
    private double m_radius;
    private double m_area, m_perimeter;

    private void calculateArea()
    {
        m_area = Math.PI * m_radius * m_radius;
    }

    private void calculatePerimeter()
    {
        m_perimeter = Math.PI * m_radius * 2;
    }

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
        calculateArea();
        calculatePerimeter();
    }

    public double getArea()
    {
        return m_area;
    }

    public double getPerimeter()
    {
        return m_perimeter;
    }

    public String toString()
    {
        return String.format("Radius:%f, Area:%f, Perimeter:%f%n", m_radius, m_area, m_perimeter);
    }


}

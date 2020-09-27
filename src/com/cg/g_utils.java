package com.cg;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public final class g_utils
{
    private g_utils() {}

    public static void draw_line(Graphics2D gr, Point begin, Point end, int stroke)
    {
        gr.setStroke(new BasicStroke(stroke));
        gr.draw(new Line2D.Double(begin.getX(), begin.getY(), end.getX(), end.getY()));
    }

    public static void fill_rect_centered(Graphics2D gr, Point center, int width, int height)
    {
        gr.fill(new Rectangle2D.Double(center.getX() - width/2, center.getY() - height/2, width, height));
    }

    public static void fill_ellipse_centered(Graphics2D gr, Point center, int radius)
    {
        gr.fill(new Ellipse2D.Double(center.getX() - radius, center.getY() - radius, radius * 2, radius * 2));
    }
}

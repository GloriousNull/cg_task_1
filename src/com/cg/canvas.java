package com.cg;

import javax.swing.*;
import java.awt.*;

import com.cg.obj.radio;

public class canvas extends JPanel
{
    private final int width;
    private final int height;
    private final radio _radio;

    public canvas(int width, int height)
    {
        this.width = width;
        this.height = height;
        _radio = new radio(new Point(width/2, height/2), 800, 600);
    }

    @Override
    public void paint(Graphics graphics)
    {
        super.paint(graphics);
        Graphics2D graphics_2d = (Graphics2D)graphics;

        //Сглаживание
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        graphics_2d.setRenderingHints(rh);

        paint_background(graphics_2d);
        _radio.paint(graphics_2d);
    }

    private void paint_background(Graphics2D graphics_2d)
    {
        graphics_2d.setColor(new Color(237,231,207));
        g_utils.fill_rect_centered(graphics_2d, new Point(width/2, height/2), width, height);
    }
}

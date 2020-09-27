package com.cg.obj;

import com.cg.g_utils;

import java.awt.*;

public class radio
{
    private final Point center;
    private final int width, height;

    public radio(Point center, int width, int height)
    {
        this.center = center;
        this.width = width;
        this.height = height;
    }

    public void paint(Graphics2D gr)
    {
        paint_buttons(gr);
        paint_handle(gr);
        paint_box(gr);
        paint_right_main(gr);
        paint_left_main(gr);
        paint_top_main(gr);

        paint_text(gr);

        paint_lines(gr);
    }

    private void paint_box(Graphics2D gr)
    {
        gr.setColor(new Color(86,87,82));
        g_utils.fill_rect_centered(gr, new Point(center.x, center.y + 70), width, height-140);
    }


    private void paint_right_main(Graphics2D gr)
    {
        gr.setColor(new Color(124,118,118));
        g_utils.fill_rect_centered(gr, new Point(center.x+width/5, center.y+height/4), width/20*11, height/2-height/20);
        gr.setColor(new Color(86,87,82));
        g_utils.fill_rect_centered(gr, new Point(center.x-width/5, center.y+height/4), width/27*11, height/2-height/20);
    }

    private void paint_left_main(Graphics2D gr)
    {
        gr.setColor(new Color(213,206,164));
        g_utils.fill_rect_centered(gr, new Point(508, 760),80,20);

        gr.setColor(new Color(86,87,82));
        g_utils.fill_rect_centered(gr, new Point(508, 560),300,200);

        gr.setColor(new Color(153,151,152));
        g_utils.fill_rect_centered(gr, new Point(508, 630), 270, 90);

        gr.setColor(new Color(206,206,206,80));
        g_utils.fill_rect_centered(gr, new Point(508, 640), 210, 70);

        gr.setColor(new Color(213,129,59));
        g_utils.fill_rect_centered(gr, new Point(508, 560), 80, 20);
    }

    private void paint_top_main(Graphics2D gr)
    {
        gr.setColor(new Color(213,206,162));
        g_utils.fill_rect_centered(gr, new Point(center.x,425),765,170);

        gr.setColor(new Color(85,87,84));
        g_utils.fill_rect_centered(gr, new Point(center.x+185, center.y-80),380,120);

        gr.setColor(new Color(93,87,87));
        g_utils.fill_rect_centered(gr, new Point(center.x+320, center.y-60),35,35);
        gr.setColor(new Color(127,119,117));
        g_utils.fill_rect_centered(gr, new Point(center.x+320, center.y-93),35,35);

        gr.setColor(new Color(253,255,254));
        g_utils.fill_rect_centered(gr, new Point(center.x+150, center.y-76),280,70);

        gr.setColor(new Color(78,37,5));
        g_utils.fill_ellipse_centered(gr, new Point(center.x-100,center.y-76),70);
        gr.setColor(new Color(86,87,82));
        g_utils.fill_ellipse_centered(gr, new Point(center.x-100,center.y-76),55);
        gr.setColor(new Color(255,46,48));
        g_utils.fill_ellipse_centered(gr, new Point(center.x-150+75,center.y-76-25),9);
    }

    private void paint_handle(Graphics2D gr)
    {
        gr.setColor(new Color(87,86,81));
        g_utils.fill_rect_centered(gr, new Point(center.x, center.y-300),750,30);
        gr.setColor(new Color(212,205,159));
        g_utils.fill_rect_centered(gr, new Point(center.x+375+15, center.y-300),25,20);
        g_utils.fill_rect_centered(gr, new Point(center.x-375-15, center.y-300),25,20);
        g_utils.fill_rect_centered(gr, new Point(center.x+375+18, center.y-220),20,150);
        g_utils.fill_rect_centered(gr, new Point(center.x-375-18, center.y-220),20,150);
    }

    private void paint_buttons(Graphics2D gr)
    {
        gr.setColor(new Color(80,89,84));
        g_utils.fill_rect_centered(gr, new Point(center.x-330, center.y-170), 50,18);
        g_utils.fill_rect_centered(gr, new Point(center.x-260, center.y-170), 50,18);
        g_utils.fill_rect_centered(gr, new Point(center.x-190, center.y-170), 50,18);
        g_utils.fill_rect_centered(gr, new Point(center.x-120, center.y-170), 50,18);
        gr.setColor(new Color(231,66,62));
        g_utils.fill_rect_centered(gr, new Point(center.x-50, center.y-170), 50,17);
    }

    private void paint_text(Graphics2D gr)
    {
        gr.setColor(new Color(66,29,3));
        int size = 30;
        gr.setFont(new Font("monospace", Font.PLAIN, size));
        gr.drawString("Spector",center.x-370, center.y-130);
    }

    private void paint_lines(Graphics2D gr)
    {
        gr.setColor(new Color(76,39,10));

        g_utils.draw_line(gr, new Point(center.x-width/2, center.y-height/2-7), new Point(center.x-width/2, center.y+height/2), 8);
        g_utils.draw_line(gr, new Point(center.x-width/2, center.y+height/2), new Point(center.x+width/2, center.y+height/2), 8);
        g_utils.draw_line(gr, new Point(center.x-width/2, center.y-height/2+140), new Point(center.x+width/2, center.y-height/2+140), 8);
        g_utils.draw_line(gr, new Point(center.x+width/2, center.y-height/2-7), new Point(center.x+width/2, center.y+height/2), 8);

        g_utils.draw_line(gr, new Point(center.x, center.y+height/4+height/40*9), new Point(center.x, center.y+height/4-height/40*9), 8);
        g_utils.draw_line(gr, new Point(center.x+width/5+width/40*11, center.y+height/4+height/40*9),
                new Point(center.x+width/5+width/40*11, center.y+height/4-height/40*9-305), 8);
        g_utils.draw_line(gr, new Point(center.x-width/5-width/40*11, center.y+height/4+height/40*9),
                new Point(center.x-width/5-width/40*11, center.y+height/4-height/40*9-305), 8);
        g_utils.draw_line(gr, new Point(center.x-width/5-width/40*11, center.y+height/4+height/40*9),
                new Point(center.x+width/5+width/40*11, center.y+height/4+height/40*9), 8);
        g_utils.draw_line(gr, new Point(center.x-width/5-width/40*11, center.y+height/4-height/40*9),
                new Point(center.x+width/5+width/40*11, center.y+height/4-height/40*9), 8);

        for (int it = 0; it < 13; ++it)
            g_utils.draw_line(gr, new Point(center.x,center.y+height/4-height/40*9+it*21),
                    new Point(center.x+width/5+width/40*11,center.y+height/4-height/40*9+it*21),5);

        g_utils.draw_line(gr, new Point(468,750), new Point(548,750), 8);
        g_utils.draw_line(gr, new Point(468,770), new Point(548,770), 8);
        g_utils.draw_line(gr, new Point(468,750), new Point(468,770), 8);
        g_utils.draw_line(gr, new Point(548,750), new Point(548,770), 8);

        g_utils.draw_line(gr, new Point(338,690), new Point(678,690),8);
        g_utils.draw_line(gr, new Point(338,530), new Point(678,530),8);
        g_utils.draw_line(gr, new Point(338,530), new Point(338,690),8);
        g_utils.draw_line(gr, new Point(678,530), new Point(678,690),8);

        g_utils.draw_line(gr, new Point(643,675), new Point(373,675),8);
        g_utils.draw_line(gr, new Point(643,585), new Point(373,585),8);
        g_utils.draw_line(gr, new Point(373,585), new Point(373,675),8);
        g_utils.draw_line(gr, new Point(643,585), new Point(643,675),8);

        //top lines
        g_utils.draw_line(gr, new Point(center.x+185+190, center.y-80+60), new Point(center.x+185+190,center.y-80-60), 8);
        g_utils.draw_line(gr, new Point(center.x+185-190, center.y-80+60), new Point(center.x+185-190,center.y-80-60), 8);
        g_utils.draw_line(gr, new Point(center.x+185+190, center.y-80+60), new Point(center.x+185-190,center.y-80+60), 8);
        g_utils.draw_line(gr, new Point(center.x+185-190, center.y-80-60), new Point(center.x+185+190,center.y-80-60), 8);

        //button
        g_utils.draw_line(gr, new Point(center.x+320+17,center.y-60+17), new Point(center.x+320+17,center.y-60-48),8);
        g_utils.draw_line(gr, new Point(center.x+320-17,center.y-60+17), new Point(center.x+320-17,center.y-60-48),8);
        g_utils.draw_line(gr, new Point(center.x+320+17,center.y-60+17), new Point(center.x+320-17,center.y-60+17),8);
        g_utils.draw_line(gr, new Point(center.x+320-17,center.y-60-48), new Point(center.x+320+17,center.y-60-48),8);


        gr.setColor(new Color(235,47,48));
        g_utils.draw_line(gr, new Point(center.x+150-15,center.y-76+10), new Point(center.x+150-15,center.y-76+33),4);
        gr.setColor(new Color(76,39,10));
        g_utils.draw_line(gr, new Point(center.x+150+140,center.y-76+35), new Point(center.x+150+140,center.y-76-35),8);
        g_utils.draw_line(gr, new Point(center.x+150-140,center.y-76+35), new Point(center.x+150-140,center.y-76-35),8);
        g_utils.draw_line(gr, new Point(center.x+150+140,center.y-76+35), new Point(center.x+150-140,center.y-76+35),8);
        g_utils.draw_line(gr, new Point(center.x+150-140,center.y-76-35), new Point(center.x+150+140,center.y-76-35),8);
        g_utils.draw_line(gr, new Point(center.x+150+140,center.y-76-20), new Point(center.x+150-140,center.y-76-20),4);

        g_utils.draw_line(gr, new Point(center.x+150-120,center.y-76-20), new Point(center.x+150-120,center.y-76+7),4);
        g_utils.draw_line(gr, new Point(center.x+150-100,center.y-76-20), new Point(center.x+150-100,center.y-76-5),4);
        g_utils.draw_line(gr, new Point(center.x+150-80,center.y-76-20), new Point(center.x+150-80,center.y-76-5),4);
        g_utils.draw_line(gr, new Point(center.x+150-60,center.y-76-20), new Point(center.x+150-60,center.y-76-5),4);
        g_utils.draw_line(gr, new Point(center.x+150-40,center.y-76-20), new Point(center.x+150-40,center.y-76+7),4);
        g_utils.draw_line(gr, new Point(center.x+150-20,center.y-76-20), new Point(center.x+150-20,center.y-76-5),4);
        g_utils.draw_line(gr, new Point(center.x+150,center.y-76-20), new Point(center.x+150,center.y-76-5),4);
        g_utils.draw_line(gr, new Point(center.x+150+20,center.y-76-20), new Point(center.x+150+20,center.y-76-5),4);
        g_utils.draw_line(gr, new Point(center.x+150+40,center.y-76-20), new Point(center.x+150+40,center.y-76+7),4);
        g_utils.draw_line(gr, new Point(center.x+150+60,center.y-76-20), new Point(center.x+150+60,center.y-76-5),4);
        g_utils.draw_line(gr, new Point(center.x+150+80,center.y-76-20), new Point(center.x+150+80,center.y-76-5),4);
        g_utils.draw_line(gr, new Point(center.x+150+100,center.y-76-20), new Point(center.x+150+100,center.y-76-5),4);
        g_utils.draw_line(gr, new Point(center.x+150+120,center.y-76-20), new Point(center.x+150+120,center.y-76+7),4);

        //handle
        g_utils.draw_line(gr, new Point(center.x-375, center.y-300-15), new Point(center.x-375, center.y-300+15),8);
        g_utils.draw_line(gr, new Point(center.x+375, center.y-300-15), new Point(center.x+375, center.y-300+15),8);
        g_utils.draw_line(gr, new Point(center.x-375, center.y-300-15), new Point(center.x+375, center.y-300-15),8);
        g_utils.draw_line(gr, new Point(center.x-375, center.y-300+15), new Point(center.x+375, center.y-300+15),8);

        g_utils.draw_line(gr, new Point(center.x+375+25,center.y-300-12), new Point(center.x+375, center.y-300-12), 8);
        g_utils.draw_line(gr, new Point(center.x-375-25, center.y-300-12), new Point(center.x-375, center.y-300-12), 8);

        //buttons
        g_utils.draw_line(gr, new Point(center.x-330+25,center.y-170+9), new Point(center.x-330+25,center.y-170-9),8);
        g_utils.draw_line(gr, new Point(center.x-330-25,center.y-170+9), new Point(center.x-330-25,center.y-170-9),8);
        g_utils.draw_line(gr, new Point(center.x-330+25,center.y-170+9), new Point(center.x-330-25,center.y-170+9),8);
        g_utils.draw_line(gr, new Point(center.x-330+25,center.y-170-9), new Point(center.x-330-25,center.y-170-9),8);

        g_utils.draw_line(gr, new Point(center.x-260+25,center.y-170+9), new Point(center.x-260+25,center.y-170-9),8);
        g_utils.draw_line(gr, new Point(center.x-260-25,center.y-170+9), new Point(center.x-260-25,center.y-170-9),8);
        g_utils.draw_line(gr, new Point(center.x-260+25,center.y-170+9), new Point(center.x-260-25,center.y-170+9),8);
        g_utils.draw_line(gr, new Point(center.x-260+25,center.y-170-9), new Point(center.x-260-25,center.y-170-9),8);

        g_utils.draw_line(gr, new Point(center.x-190+25,center.y-170+9), new Point(center.x-190+25,center.y-170-9),8);
        g_utils.draw_line(gr, new Point(center.x-190-25,center.y-170+9), new Point(center.x-190-25,center.y-170-9),8);
        g_utils.draw_line(gr, new Point(center.x-190+25,center.y-170+9), new Point(center.x-190-25,center.y-170+9),8);
        g_utils.draw_line(gr, new Point(center.x-190+25,center.y-170-9), new Point(center.x-190-25,center.y-170-9),8);

        g_utils.draw_line(gr, new Point(center.x-120+25,center.y-170+9), new Point(center.x-120+25,center.y-170-9),8);
        g_utils.draw_line(gr, new Point(center.x-120-25,center.y-170+9), new Point(center.x-120-25,center.y-170-9),8);
        g_utils.draw_line(gr, new Point(center.x-120+25,center.y-170+9), new Point(center.x-120-25,center.y-170+9),8);
        g_utils.draw_line(gr, new Point(center.x-120+25,center.y-170-9), new Point(center.x-120-25,center.y-170-9),8);

        g_utils.draw_line(gr, new Point(center.x-50+25,center.y-170+9), new Point(center.x-50+25,center.y-170-9),8);
        g_utils.draw_line(gr, new Point(center.x-50-25,center.y-170+9), new Point(center.x-50-25,center.y-170-9),8);
        g_utils.draw_line(gr, new Point(center.x-50+25,center.y-170+9), new Point(center.x-50-25,center.y-170+9),8);
        g_utils.draw_line(gr, new Point(center.x-50+25,center.y-170-9), new Point(center.x-50-25,center.y-170-9),8);

        g_utils.draw_line(gr, new Point(550,550), new Point(550,570),8);
        g_utils.draw_line(gr, new Point(470,550), new Point(470,570),8);
        g_utils.draw_line(gr, new Point(470,550), new Point(550,550),8);
        g_utils.draw_line(gr, new Point(470,570), new Point(550,570),8);
    }

}

package com.cg;

import javax.swing.*;

public class static_picture extends JFrame
{
    private JPanel body;

    public static_picture()
    {
        this.setTitle("Static picture");
        this.setContentPane(body);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(1400, 1000);
        this.setResizable(false);
        this.setVisible(true);

        canvas _canvas = new canvas(this.getWidth(), this.getHeight());
        body.add(_canvas);
    }
}

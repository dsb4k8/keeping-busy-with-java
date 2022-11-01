package com.homeoffice.projects.graphics;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class DrawingCanvas extends JComponent {
    private int width;
    private int height;
    public DrawingCanvas(int w, int h){
        width = w;
        height = h;
    }
    protected void paintComponent(Graphics g){
        ShapeUtils su = new ShapeUtils();
        Graphics g2d = (Graphics2D) g;
        //rectangle
        Rectangle2D r = new Rectangle2D.Double(0, 0, width, height);
        g2d.setColor(new Color(196, 115, 182));
        ((Graphics2D) g2d).fill(r);

//        Rectangle2D r2 = new Rectangle2D.Double((width/2) / 2, (height / 2) / 2, width/2, height/2);
        Rectangle2D r2 = new Rectangle2D.Double((su.GetRectCenter(r)[0]) , su.GetRectCenter(r)[1], width/16, height/16);

        g2d.setColor(new Color(100, 15, 100));
        ((Graphics2D) g2d).fill(r2);


        //circle
        Ellipse2D.Double e = new Ellipse2D.Double(width - width/10, height - height/10, 25, 25);
        g2d.setColor(new Color(0, 15, 100));
        ((Graphics2D) g2d).fill(e);

        //line
//        Line2D.Double line = new Line2D.Double(50, 50, 100, 100);
//        g2d.setColor((new Color(100, 100, 100)));
//        ((Graphics2D) g2d).draw(line);
        Line2D.Double line = new Line2D.Double();
        for(int i = 100; i <=0; i--){
            line.x1 =i;
            line.x2  = 30;
            line.y1 = i;
            line.y2 = 30;

            g2d.setColor((new Color(100, 100, 100)));
            ((Graphics2D) g2d).draw(line);

        }


    }


}

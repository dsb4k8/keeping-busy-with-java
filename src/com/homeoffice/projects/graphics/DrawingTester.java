package com.homeoffice.projects.graphics;
import javax.swing.*;

public class DrawingTester extends JFrame {
    public static void main(String[] args) {
        int w = 800;
        int h = 600;
        JFrame f = new JFrame();
        DrawingCanvas dc = new DrawingCanvas(w,h);
        f.setSize(w, h);
        f.setTitle("Drawing with Java Logic");
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);


    }
}

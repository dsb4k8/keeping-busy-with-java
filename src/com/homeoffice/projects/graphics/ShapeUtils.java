package com.homeoffice.projects.graphics;

import java.awt.geom.Rectangle2D;

public class ShapeUtils {
    public double[] GetRectCenter(Rectangle2D r){

        return new double[]{(r.getCenterX()/2) /2, (r.getCenterY()/2) /2};



    }

}

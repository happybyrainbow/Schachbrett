package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Brett extends GraphicalObject {

    public Brett(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void draw(DrawTool drawTool){
        for(int i = 0; i < 4; i++) {
            drawTool.drawFilledRectangle(x, y, 30, 30);
        }
    }

}

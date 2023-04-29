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

        drawTool.setCurrentColor(new Color(242, 218, 179));
        drawTool.drawFilledRectangle(0,0,600,600);

        drawTool.setCurrentColor(new Color(200, 136, 93));
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                drawTool.drawFilledRectangle(x + i*150, y + 75 + j * 150, 75, 75);
                drawTool.drawFilledRectangle(x + 75 + i*150, y + j * 150, 75, 75);
            }
        }
    }

}

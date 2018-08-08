/**
 * Created by Saul on 8/08/2018.
 */

import java.util.*;
import ecs100.*;
import java.awt.Color;

public class Physics_Simulator {

    //Origin is 400 from top
    //and 50 from the left

    int originX = 50;
    int originY = 100;
    int fromTop = 400;

    int graphEnd = originY*1000;

    /**
     * Constructor
     */
    public Physics_Simulator() {
        setupGUI();
        drawAxes();

    }

    /**
     * Initialises the UI window, and sets up the buttons.
     */
    public void setupGUI() {
        UI.initialise();
        UI.addButton("Run show", this::doSomething);
        UI.addButton("Quit", UI::quit);





    }

    public void drawAxes(){

        UI.drawLine(0,fromTop,graphEnd,fromTop); //Line for x-axis
        UI.drawLine(originX,420,originX,0); //Line for y-axis
        int maxValue = 400;
        //Labels
        int numberOfYlinesOfYLines = UI.askInt("How many lines on the Y-Axis would you like?");
        int YLineDist = fromTop/numberOfYlinesOfYLines;
        for(int i=0;i<numberOfYlinesOfYLines;i++){


            UI.drawLine(originX-5,YLineDist*i,originX+5,YLineDist*i);
            double numValue  = maxValue-(numberOfYlinesOfYLines*i);
            //String value = double.toString(numValue);
            UI.drawString(value,originX-10,YLineDist*i);
        }
    }

    public void doSomething() {
    }

    public static void main(String[] args) {
        new Physics_Simulator();
    }
}






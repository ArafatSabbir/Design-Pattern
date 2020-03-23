package design.pattern;


import design.pattern.state.Canvas;
import design.pattern.state.SelectionTool;

public class DesignPattern {


    public static void main(String[] args) {
        var canvas=new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }

    public static void drawUIControl(UIControl control){
        control.draw();
    }


    
}

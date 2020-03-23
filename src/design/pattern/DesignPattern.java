package design.pattern;


import design.pattern.state.Canvas;
import design.pattern.state.SelectionTool;

public class DesignPattern {


    public static void main(String[] args) {
        var canvas=new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
        System.out.println("Memento and State Pattern Done.");
        System.out.println("Have to enroll to Mosh Course.");
    }

    public static void drawUIControl(UIControl control){
        control.draw();
    }


    
}

package design.pattern;


public class DesignPattern {


    public static void main(String[] args) {
        drawUIControl(new TextBox());

    }

    public static void drawUIControl(UIControl uiControl){
        uiControl.draw();
    }


    
}

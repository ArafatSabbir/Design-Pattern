package design.pattern.state;

public class BrashTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Select brash");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw line");
    }
}

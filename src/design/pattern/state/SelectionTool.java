package design.pattern.state;

public class SelectionTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("Select");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw dash");
    }
}

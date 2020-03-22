package design.pattern;


import design.pattern.memento.Editor;
import design.pattern.memento.History;

public class DesignPattern {


    public static void main(String[] args) {
        var editor=new Editor();
        var history= new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());//will print b
        editor.restore(history.pop());//will print a

        System.out.println(editor.getContent());

    }


    
}

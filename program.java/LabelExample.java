package frames;
import java.awt.event.*;
import java.awt.*;
class A extends Frame{
    A(){
        setTitle("label Example");
        setSize(500,400);
        setVisible(true);
        setBackground(Color.green);
        Label l=new Label();
        l.setAlignment(Label.LEFT);
        l.setBounds(50,50,100,100);
        add(l);
        Label s=new Label("Enter id:",Label.CENTER);
        add(s);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


}
class LabelExample {
    public static void main(String args[]) {
        Frame f = new Frame();
    }
}

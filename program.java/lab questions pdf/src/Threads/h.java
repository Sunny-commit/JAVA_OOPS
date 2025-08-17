package Threads;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

class RegistrationForm extends Frame {

    RegistrationForm(){

        //control frame
        setLayout(null);
        setVisible(true);
        setTitle("Registration form");
        setSize(900,900);
        setBackground(Color.PINK);
        // setLayout(new FlowLayout());

        Label l=new Label("Registraion Form");
        add(l);
        l.setBounds(400,50,100,50);

        Label l1=new Label("Enter Name:");

        l1.setBounds(800,100,100,20);
        TextField tf=new TextField(20);
        add(tf);
        tf.setBounds(400,100,100,30);
        l1.setBounds(250,100,100,20);
        add(l1);
        Label l2=new Label("Enter E-mail:");
        add(l2);
        TextField tf1=new TextField(20);
        add(tf1);
        tf1.setBounds(400,200,100,25);
        l2.setBounds(250,200,100,20);

        Label l3=new Label("Enter Address:");
        add(l3);
        l3.setBounds(250,300,100,50);
        TextArea ta=new TextArea(25,10);
        add(ta);
        ta.setBounds(400,300,300,30);


        Label l4=new Label("Gender");
        add(l4);
        l4.setBounds(250,400,100,20);
        CheckboxGroup cbg=new CheckboxGroup();
        Checkbox cb5=new Checkbox("male",cbg,true);
        add(cb5);
        cb5.setBounds(400,400,100,50);
        Checkbox cb6=new Checkbox("Female",cbg,true);
        add(cb6);
        cb6.setBounds(500,400,100,50);

        Label l5=new Label("Hobbies");
        add(l5);
        l5.setBounds(250,500,100,50);
        Checkbox cb1=new Checkbox("watching TV");
        add(cb1);
        cb1.setBounds(350,500,100,50);
        Checkbox cb2=new Checkbox("Playing games");
        add(cb2);
        cb2.setBounds(450,500,100,50);
        Checkbox cb3=new Checkbox("Reading books");
        add(cb3);
        cb3.setBounds(550,500,100,50);
        Checkbox cb4=new Checkbox("Talking to Girlfriend");
        add(cb4);
        cb4.setBounds(650,500,100,50);

        Label l6=new Label("Intreseted Streams");
        add(l6);
        l6.setBounds(250,600,100,50);
        List li=new List(4) ;
        add(li);
        li.add("Web Development");
        li.add("Data Scinece");
        li.add("Blockchain");
        li.add("AI");

        li.setBounds(400,600,100,50);

        Button b=new Button("Submit");
        add(b);
        b.setBounds(450,680,100,30);











        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

}

public class h{
    public static void main(String[] args) {


        RegistrationForm rf = new RegistrationForm();
 }
}
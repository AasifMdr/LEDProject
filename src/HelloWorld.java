import javax.swing.*;

public class HelloWorld {

    JFrame frame;
    HelloWorld(){

        frame = new JFrame();
        JLabel label = new JLabel ("HelloWorld");
        label.setBounds( 130, 100, 100, 40);
        frame.add(label);
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new HelloWorld();
    }
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class AreaOfCircle extends JFrame implements ActionListener {

    JButton jb1;
    JTextField jt1;
    JLabel lbl;

    AreaOfCircle() {

        jt1 = new JTextField();
        jt1.setBounds(90, 50, 150, 30);
        add(jt1);


        lbl = new JLabel("Result :");
        lbl.setBounds(90, 140, 150, 30);
        add(lbl);

        jb1 = new JButton("Area Of Circle");
        jb1.setBounds(90, 200, 120, 30);
        add(jb1);

        jb1.addActionListener(this);

        setLayout(null);
        setSize(600, 400);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        float radius = Integer.parseInt(jt1.getText());
        float area = 0;

        if (e.getSource().equals(jb1)) {
            area = (22 * radius * radius) / 7;
            lbl.setText(String.valueOf(area));
        }
    }

    public static void main(String args[]) {
        AreaOfCircle areaOfCircle = new AreaOfCircle();
    }
}
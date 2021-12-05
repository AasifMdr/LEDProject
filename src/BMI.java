import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class BMI extends JFrame implements ActionListener {

    JButton jb1;
    JTextField jt1, jt2;
    JLabel lbl;

    BMI() {


        jt1 = new JTextField();
        jt1.setBounds(90, 50, 150, 30);
        add(jt1);

        jt2 = new JTextField();
        jt2.setBounds(90, 80, 150, 30);
        add(jt2);


        lbl = new JLabel("Result :");
        lbl.setBounds(90, 140, 150, 30);
        add(lbl);

        jb1 = new JButton("BMI");
        jb1.setBounds(90, 200, 100, 30);
        add(jb1);

        jb1.addActionListener(this);

        setLayout(null);
        setSize(600, 400);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        float height = Integer.parseInt(jt1.getText());
        float weight = Integer.parseInt(jt2.getText());

        float BMI = 0;

        if (e.getSource().equals(jb1)) {
            BMI = height / (weight * weight);
            lbl.setText(String.valueOf(BMI));
        }
    }

    public static void main(String args[]) {
        BMI bmi = new BMI();
    }
}
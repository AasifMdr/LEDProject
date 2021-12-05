import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class VolOfCuboid extends JFrame implements ActionListener {

    JButton jb1;
    JTextField jt1, jt2, jt3;
    JLabel lbl;

    VolOfCuboid() {

        jt1 = new JTextField();
        jt1.setBounds(90, 50, 150, 30);
        add(jt1);

        jt2 = new JTextField();
        jt2.setBounds(90, 80, 150, 30);
        add(jt2);

        jt3= new JTextField();
        jt3.setBounds(90,110,150,30);
        add(jt3);

        lbl = new JLabel("Result :");
        lbl.setBounds(90, 140, 150, 30);
        add(lbl);

        jb1 = new JButton("Volume of cuboid");
        jb1.setBounds(90, 200, 150, 30);
        add(jb1);

        jb1.addActionListener(this);

        setLayout(null);
        setSize(600, 400);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        int length = Integer.parseInt(jt1.getText());
        int width = Integer.parseInt(jt2.getText());
        int height= Integer.parseInt(jt3.getText());
        int volume = 0;

        if (e.getSource().equals(jb1)) {
            volume = length * width * height;
            lbl.setText(String.valueOf(volume));
        }
    }

    public static void main(String args[]) {
        VolOfCuboid volOfCuboid = new VolOfCuboid();
    }
}
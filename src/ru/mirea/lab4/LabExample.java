package ru.mirea.lab4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class LabExample extends JFrame {
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    JLabel lbl1 = new JLabel("Result: 0 X 0");
    JLabel lbl2 = new JLabel("Last Scorer: N/A");
    Label lbl3 = new Label("Winner: DRAW");
    Font fnt = new Font("Times New Roman", 1, 20);

    LabExample() {
        super("Example");
        this.setLayout(new GridLayout(3, 2));
        this.setSize(400, 300);
        final int[] x1 = new int[]{0};
        final int[] x2 = new int[]{0};
        this.add(this.button1);
        this.add(this.button2);
        this.add(this.lbl1);
        this.add(this.lbl2);
        this.add(this.lbl3);
        this.button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int var10002 = x1[0]++;
                int var10001 = x1[0];
                LabExample.this.lbl1.setText("Result: " + var10001 + " X " + x2[0]);
                LabExample.this.lbl2.setText("Last Scorer: AC Milan");
                if (x1[0] > x2[0]) {
                    LabExample.this.lbl3.setText("Winner: AC Milan");
                } else if (x1[0] == x2[0]) {
                    LabExample.this.lbl3.setText("Winner: DRAW");
                }

            }
        });
        this.button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int var10002 = x2[0]++;
                int var10001 = x1[0];
                LabExample.this.lbl1.setText("Result: " + var10001 + " X " + x2[0]);
                LabExample.this.lbl2.setText("Last Scorer: Real Madrid");
                if (x2[0] > x1[0]) {
                    LabExample.this.lbl3.setText("Winner: Real Madrid");
                } else if (x1[0] == x2[0]) {
                    LabExample.this.lbl3.setText("Winner: DRAW");
                }

            }
        });
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new LabExample();
    }
}


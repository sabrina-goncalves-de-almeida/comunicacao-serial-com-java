package ufpb.br.neuron.by;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewFrame extends JFrame implements ActionListener {
    JButton jBLenOn;
    JButton jBLenOff;
    JButton jBLenClose;
    NewFrame(){
        jBLenOn = new JButton("Ligar");
        jBLenOn.setBounds(200, 100, 100, 50);
        jBLenOn.addActionListener(this);
        jBLenOn.setFocusable(false);
        jBLenOn.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jBLenOn.setForeground(new Color(0x08D4D1));

        jBLenOff = new JButton("Desligar");
        jBLenOff.setBounds(300, 200, 130, 50);
        jBLenOff.addActionListener(this);
        jBLenOff.setFocusable(false);
        jBLenOff.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jBLenOff.setForeground(new Color(0x08D4D1));

        jBLenClose = new JButton("Sair");
        jBLenClose.setBounds(430, 100, 100, 50);
        jBLenClose.addActionListener(this);
        jBLenClose.setFocusable(false);
        jBLenClose.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jBLenClose.setForeground(new Color(0x08D4D1));

        this.setTitle("Sistema comunicação serial");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null); // retirar depois
        this.setSize(800,450);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0x252A34));
        this.add(jBLenOn);
        this.add(jBLenOff);
        this.add(jBLenClose);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Arduino arduino = new Arduino();
        if(e.getSource() == jBLenOn){
            arduino.comunicacaoArduino(jBLenOn);
        }
        if(e.getSource() == jBLenOff){
            arduino.comunicacaoArduino(jBLenOff);
        }
        if(e.getSource() == jBLenClose){
            arduino.comunicacaoArduino(jBLenClose);
        }
    }
}

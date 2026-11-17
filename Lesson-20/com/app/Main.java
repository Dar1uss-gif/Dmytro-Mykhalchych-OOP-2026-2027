
package com.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame("Моя перша програма");

        window.setSize(500, 350);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setLocationRelativeTo(null);

        // Створення панелі
        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Привіт! Це моя Java програма.");

        JButton button = new JButton("Натисни мене");

        panel.add(label);
        panel.add(button);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                label.setText("Кнопку успішно натиснуто!");
            }
        });

        window.add(panel);

        window.setVisible(true);
    }
}
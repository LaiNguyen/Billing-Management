/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author admin
 */
public class ButtonItem {

    private JButton button;

    public ButtonItem(String name) {
        this.button = new JButton(name);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(button.getText() + " was clicked.");
            }
        });
        this.button.setPreferredSize(new Dimension(500, 900));
    }

    public JButton getButton() {
        return button;
    }

    @Override
    public String toString() {
        return button.getText();
    }
}

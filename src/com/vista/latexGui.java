package com.vista;

import javax.swing.*;

public class latexGui extends JFrame {

    public JButton ejecutarButton;
    public JEditorPane editorPane1;
    public JLabel latex;
    public JPanel mipanel;
    public JButton arbolButton;

    public latexGui (String titulo){
        super(titulo);
        this.setDefaultCloseOperation(3);
        this.setContentPane(mipanel);
        this.pack();
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

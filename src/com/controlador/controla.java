package com.controlador;

import com.modelo.modelo;
import com.vista.latexGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controla implements ActionListener {
    private latexGui vista;
    private modelo model;
    String latex;

    public controla(latexGui vista, modelo model) {
        this.vista = vista;
        this.model = model;
        this.vista.ejecutarButton.addActionListener(this);
        this.vista.arbolButton.addActionListener(this);
    }
    public void iniciar (){
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        latex = "\\LaTeX{}";
        vista.latex.setIcon(model.actualizarIconLaTex(latex, 30));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.ejecutarButton){
            String texto = vista.editorPane1.getText();
            latex = model.antlr(texto);
            vista.latex.setIcon(model.actualizarIconLaTex(latex, 30));
        }
        if (e.getSource()==vista.arbolButton){
            model.showTree();
        }

    }
}

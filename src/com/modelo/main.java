package com.modelo;

import com.controlador.controla;
import com.vista.latexGui;


public class main {
    public static void main(String[] args)throws Exception{

        modelo mod = new modelo();
        latexGui gui = new latexGui("antlr");

        controla controller = new controla(gui,mod);
        controller.iniciar();

    }
}

package com.modelo;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import static org.antlr.v4.runtime.CharStreams.fromString;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.scilab.forge.jlatexmath.ParseException;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;

import javax.swing.*;
import java.util.Arrays;

public class modelo {
    TeXFormula formula;
    TeXIcon icon;
    String math;
    matrizParser parser;
    ParseTree tree;
    public modelo(){

    }
    public modelo(String math){
        this.math = math;
    }

    public TeXIcon getIconLaTex(){
        try {
            formula = new TeXFormula(this.math);
            this.icon = this.formula.createTeXIcon(TeXConstants.ALIGN_CENTER, 40);
            return this.icon;
        } catch (ParseException e) {
            System.err.println("Error: "+ e.getMessage());
            return this.icon = null;
        }
    }
    public TeXIcon actualizarIconLaTex(String math, int valor){
        try {
            this.math = math;
            this.formula = new TeXFormula(this.math);
            this.icon = this.formula.new TeXIconBuilder().setStyle(TeXConstants.STYLE_DISPLAY)
                    .setSize(valor)
                    .setWidth(TeXConstants.UNIT_PIXEL, 256f, TeXConstants.ALIGN_LEFT)
                    .setIsMaxWidth(true)
                    .setInterLineSpacing(TeXConstants.UNIT_PIXEL, 20f).build();
            return this.icon;

        } catch (ParseException e) {
            System.err.println("Error: "+ e.getMessage());
            return this.icon = null;
        }
    }

    public String antlr(String texto){


        CharStream input = fromString(texto);
        matrizLexer lexer= new matrizLexer(input);

        lexer.removeErrorListeners();
        lexer.addErrorListener(Error.INSTANCE);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new matrizParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(Error.INSTANCE);

        tree =parser.sentencia();
        //VISITOR
        MyVisitor visit = new MyVisitor();
        visit.visit(tree);
        //listener
        MyListener lis = new MyListener(visit.tabla);
        ParseTreeWalker walker   = new ParseTreeWalker();
        walker.walk(lis, tree);




        return lis.mathToLatex;

    }
    public void showTree(){
        JFrame frametree = new JFrame("Producciones del traductor");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
        viewer.setScale(1.5); // Scale a little
        panel.add(viewer);
        frametree.add(panel);
        frametree.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frametree.setLocationRelativeTo(null);
        frametree.pack();
        frametree.setVisible(true);
    }
}

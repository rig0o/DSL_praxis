package com.modelo;

import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

import java.util.HashMap;
import java.util.Map;

public class MyListener extends matrizParserBaseListener {

    public String mathToLatex ="";
    Map<String, RealMatrix> tabla = new HashMap<String, RealMatrix>();
    public MyListener(Map<String, RealMatrix> tabla) {
        super();
        this.tabla = tabla;
    }

    @Override
    public void exitPc(matrizParser.PcContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append("\\\\");
        mathToLatex = sb.toString();
    }

    @Override
    public void enterImprime(matrizParser.ImprimeContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append(ctx.e().getText());
        sb.append("=");
        mathToLatex = sb.toString();
    }

    @Override
    public void enterAsignacion(matrizParser.AsignacionContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append(ctx.ID().getText());
        sb.append(ctx.EQ().getText());
        mathToLatex = sb.toString();
    }

    @Override
    public void enterSuma(matrizParser.SumaContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append("+");
        mathToLatex = sb.toString();
    }

    @Override
    public void enterResta(matrizParser.RestaContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append("-");
        mathToLatex = sb.toString();
    }

    @Override
    public void enterDiv(matrizParser.DivContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append("/");
        mathToLatex = sb.toString();
    }

    @Override
    public void enterMult(matrizParser.MultContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append("*");
        mathToLatex = sb.toString();
    }

    @Override
    public void exitPotencias(matrizParser.PotenciasContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append(ctx.INT().getText());
        mathToLatex = sb.toString();
    }

    @Override
    public void enterPow(matrizParser.PowContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append("^");
        mathToLatex = sb.toString();
    }

    @Override
    public void enterTrans(matrizParser.TransContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append("^t");
        mathToLatex = sb.toString();
    }

    @Override
    public void enterVariable(matrizParser.VariableContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        Array2DRowRealMatrix matriz = (Array2DRowRealMatrix) tabla.get(ctx.ID().getText());
        sb.append("\\begin{pmatrix}");
        for (int i = 0 ; i < matriz.getRowDimension();i++) {
            for (int j = 0; j < matriz.getColumnDimension(); j++) {
                sb.append(Float.toString((float) matriz.getEntry(i, j)));
                if(j<matriz.getColumnDimension()-1)sb.append("&");
            }
            sb.append("\\\\");
        }
        sb.append("\\end{pmatrix}");
        mathToLatex = sb.toString();
    }

    @Override
    public void enterR1(matrizParser.R1Context ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append("\\begin{pmatrix}");
        mathToLatex = sb.toString();
    }

    @Override
    public void exitR1(matrizParser.R1Context ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append("\\end{pmatrix}");
        mathToLatex = sb.toString();
    }

    @Override
    public void exitDamearry(matrizParser.DamearryContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append("\\\\");
        mathToLatex = sb.toString();
    }

    @Override
    public void enterDamearry(matrizParser.DamearryContext ctx) {
        String fila =(ctx.getText());
        fila=fila.replace("{", "").replace(",", "&").replace("}", "");
        StringBuilder sb = new StringBuilder();
        sb.append(mathToLatex);
        sb.append(fila);
        mathToLatex = sb.toString();
    }
}

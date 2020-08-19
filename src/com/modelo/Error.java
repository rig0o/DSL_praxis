package com.modelo;

import org.antlr.v4.runtime.*;
import javax.swing.*;

public class Error  extends BaseErrorListener {

    public static final Error INSTANCE = new Error();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        JOptionPane.showMessageDialog(null, "line " + line + ":" + charPositionInLine + " " + msg);
    }
}


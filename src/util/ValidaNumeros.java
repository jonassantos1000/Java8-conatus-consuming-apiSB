/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Jonas Santos
 */
public class ValidaNumeros extends PlainDocument{
    

    
    @Override
    public void insertString(int offs, String str,AttributeSet a) throws BadLocationException {
        super.insertString(offs, str.replaceAll("[^0-9]", ""), a);
    }
    
    public static Number nf (String numero) throws ParseException{
        NumberFormat nf = new DecimalFormat("###,###,###.00");
        return nf.parse(numero);
    }
    
}

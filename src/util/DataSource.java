/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author faculdade
 */
public class DataSource {

    public static String getDataSource() {
        String path = "C:\\Program Files (x86)\\Conatus\\parameters\\datasource.ini";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = "http://";
            String ip = br.readLine();
            Integer porta = ip.indexOf(":");
            if(porta==-1){
                porta=8080;
                return line+ip+":8080";
            }
            return line+ip;      

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo datasource.ini não encontrado");
            System.exit(0);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao consultar arquivo datasource.ini");
            System.exit(0);
        }
        return null;
    }
}

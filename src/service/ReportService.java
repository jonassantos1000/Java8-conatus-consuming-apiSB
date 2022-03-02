/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import javax.swing.JOptionPane;
import model.reports.Report;

/**
 *
 * @author faculdade
 */
public class ReportService {

    static String webService = util.DataSource.getDataSource();
    static int codigoSucesso = 200;

    public static List<Report> findReport(){
        String urlAPI = webService+"/reports";
        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso) {
                JOptionPane.showMessageDialog(null, "Não foi possivel pesquisar relatórios");
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            }
            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream()), "UTF-8"));
            List<Report> report = model.reports.Report.converteJsonEmArray(resposta);

            return report;

        } catch (java.net.ConnectException e) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o servidor, verifique sua rede e tente novamente !");
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

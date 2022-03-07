/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import javax.swing.JOptionPane;
import model.reports.Cupom;
import model.reports.Report;
import model.reports.TotalizerPerMonth;

/**
 *
 * @author faculdade
 */
public class ReportService {

    static String webService = util.DataSource.getDataSource();
    static int codigoSucesso = 200;

    public static List<Report> findReport() {
        String urlAPI = webService + "/reports";
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

    public static List<TotalizerPerMonth> totalizerPerMonth(String ano) {
        String urlAPI = webService + "/reports/totalizerpermonth/" + ano;
        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso) {
                JOptionPane.showMessageDialog(null, "Não foi possivel pesquisar informações do relatório.");
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            }
            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream()), "UTF-8"));
            List<TotalizerPerMonth> reports = model.reports.TotalizerPerMonth.converteJsonEmArray(resposta);

            return reports;

        } catch (java.net.ConnectException e) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o servidor, verifique sua rede e tente novamente !");
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Cupom cupom(Integer id) {
        String urlAPI = webService + "/reports/proofoforder/"+id;
        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso) {
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode() + " Message: " +conexao.getResponseMessage());
            }
            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream()), "UTF-8"));

            String jsonEmString = model.reports.Cupom.converteJsonEmString(resposta);
            Gson gson = new Gson();
            Cupom set = gson.fromJson(jsonEmString, Cupom.class);

            return set;

        } catch (java.net.ConnectException e) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o servidor, verifique sua rede e tente novamente !");
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

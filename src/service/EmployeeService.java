/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.swing.JOptionPane;
import model.Employee;

/**
 *
 * @author faculdade
 */
public class EmployeeService {

    static String webService = "http://localhost:8080/";
    static int codigoSucesso = 200;

    public static Employee findById(String id) throws Exception {
        List<Employee> listEmployee = findAll(id, "", "", "", "", "");
        Employee employee = listEmployee.get(0);
        return employee;
    }

    public static List<Employee> findAll(String id, String nome, String cpf, String rg, String email, String limite) throws Exception {
        if (limite.equals("0") || limite.isEmpty()) {
            limite = "999999999";
        }
        String urlAPI = webService + "employees/custom?";
        urlAPI += "limite=" + limite;

        if (id != null & id != "") {
            urlAPI += "&id=" + id;
        }

        if (nome != null & nome != "") {
            urlAPI += "&nome=" + nome;
        }

        if (cpf != null & cpf != "") {
            urlAPI += "&cpf=" + cpf;
        }
        if (rg != null & rg != "") {
            urlAPI += "&rg=" + rg;
        }

        if (email != null & email != "") {
            urlAPI += "&email=" + email;
        }

        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso) {
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            }
            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream()), "UTF-8"));
            List<Employee> user = model.Employee.converteJsonEmArray(resposta);

            return user;
        } catch (java.net.ConnectException e) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o servidor, verifique sua rede e tente novamente !");
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void insert(Employee obj) {
        String urlAPI = webService + "employees";
        Integer codeResponse = 201;
        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("POST");
            conexao.setDoOutput(true);

            String json = model.Employee.converteEmployeeEmJson(obj);
            String rawData = json;
            String encodedData = URLEncoder.encode(rawData, "UTF-8");

            byte[] out = json.getBytes(StandardCharsets.UTF_8);
            int length = out.length;

            conexao.setFixedLengthStreamingMode(length);
            conexao.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            conexao.connect();
            try (OutputStream os = conexao.getOutputStream()) {
                os.write(out);
            }

            if (conexao.getResponseCode() != codeResponse) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao inserir este funcionario, tente novamente ! \n Caso o erro persista, contate o suporte ténico");
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            } else {
                JOptionPane.showMessageDialog(null, "Funcionario inserido com sucesso !");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void update(Employee obj, Integer id) {
        String urlAPI = webService + "employees/" + id;

        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("PUT");
            conexao.setDoOutput(true);

            String json = model.Employee.converteEmployeeEmJson(obj);
            String rawData = json;
            String encodedData = URLEncoder.encode(rawData, "UTF-8");

            byte[] out = json.getBytes(StandardCharsets.UTF_8);
            int length = out.length;

            conexao.setFixedLengthStreamingMode(length);
            conexao.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            conexao.connect();
            try (OutputStream os = conexao.getOutputStream()) {
                os.write(out);
            }
            if (conexao.getResponseCode() != codigoSucesso) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao alterar este funcionario, tente novamente ! \n Caso o erro persista, contate o suporte ténico");
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            } else {
                JOptionPane.showMessageDialog(null, "Funcionario alterado com sucesso !");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void delete(Integer id) {
        String urlAPI = webService + "employees/" + id;
        Integer codigoResposta = 204;
        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("DELETE");
            if (conexao.getResponseCode() != codigoResposta) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao apagar este funcionario, tente novamente ! \n Caso o erro persista, contate o suporte ténico");
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            } else {
                JOptionPane.showMessageDialog(null, "Funcionario foi deletado com sucesso !");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

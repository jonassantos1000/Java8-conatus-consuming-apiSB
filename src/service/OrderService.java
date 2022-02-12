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
import model.Order;

/**
 *
 * @author faculdade
 */
public class OrderService {

    static String webService = "http://localhost:8080/";
    static int codigoSucesso = 200;

    public static Order findById(String id) throws Exception {
        List<Order> listOrder = findCustom(id, "", "", "", "", "", "", "");
        Order order = listOrder.get(0);
        return order;
    }

    public static List<Order> findCustom(String codOrder, String codClient, String nameClient, String cpfClient, String rgClient, String nameEmployee, String data, String limite) {
        if (limite.equals("0") || limite.isEmpty()) {
            limite = "999999999";
        }
        String urlAPI = webService + "orders/custom?";

        urlAPI += "limite=" + limite;

        if (codOrder != null & codOrder != "") {
            urlAPI += "&codOrder=" + codOrder;
        }

        if (codClient != null & codClient != "") {
            urlAPI += "&codClient=" + codClient;
        }

        if (nameClient != null & nameClient != "") {
            urlAPI += "&nameClient=" + nameClient;
        }
        if (cpfClient != null & cpfClient != "") {
            urlAPI += "&cpfClient=" + cpfClient;
        }

        if (rgClient != null & rgClient != "") {
            urlAPI += "&rgClient=" + rgClient;
        }

        if (nameEmployee != null & nameEmployee != "") {
            urlAPI += "&nameEmployee=" + nameEmployee;
        }

        if (data != null && !"".equals(data) && !";".equals(data)) {
            try {
                urlAPI += "&data=" + data;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso) {
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            }
            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream()), "UTF-8"));
            List<Order> order = model.Order.converteJsonEmArray(resposta);

            return order;
        } catch (java.net.ConnectException e) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o servidor, verifique sua rede e tente novamente !");
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void insert(Order obj) {
        String urlAPI = webService + "orders";
        Integer codeResponse = 201;
        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("POST");
            conexao.setDoOutput(true);

            String json = model.Order.converteOrderEmJson(obj);
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
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao inserir este pedido, tente novamente ! \n Caso o erro persista, contate o suporte ténico");
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            } else {
                JOptionPane.showMessageDialog(null, "Pedido inserido com sucesso !");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void update(Order obj, Integer id) {
        String urlAPI = webService + "orders/" + id;

        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("PUT");
            conexao.setDoOutput(true);

            String json = model.Order.converteOrderEmJson(obj);
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
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao alterar este pedido, tente novamente ! \n Caso o erro persista, contate o suporte ténico");
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            } else {
                JOptionPane.showMessageDialog(null, "Pedido alterado com sucesso !");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void delete(Integer id) {
        String urlAPI = webService + "orders/" + id;
        Integer codigoResposta = 204;
        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("DELETE");
            if (conexao.getResponseCode() != codigoResposta) {
                JOptionPane.showMessageDialog(null, "Não foi possivel apagar este pedido, tente novamente ! ");
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            } else {
                JOptionPane.showMessageDialog(null, "Pedido foi deletado com sucesso !");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

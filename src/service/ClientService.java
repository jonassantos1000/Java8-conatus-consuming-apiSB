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
import model.Client;

/**
 *
 * @author faculdade
 */
public class ClientService {

    static String webService = util.DataSource.getDataSource()+"/";
    static int codigoSucesso = 200;

    public static Client findById(String id) throws Exception {
        List<Client> listClient = findAll(id,"","","","","");
        Client client =  listClient.get(0);
        return client;
    }
    
    public static List<Client> findAll(String id, String nome, String cpf, String rg, String email, String limite) {
        if (limite.equals("0") || limite.isEmpty()) {
            limite = "999999999";
        }
        String urlAPI = webService + "clients/custom?";
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
            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream()),"UTF-8"));
            List<Client> user = model.Client.converteJsonEmArray(resposta);

            return user;
        }catch(java.net.ConnectException e){
            JOptionPane.showMessageDialog(null, "Falha na conexão com o servidor, verifique sua rede e tente novamente !");
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void insert(Client obj) {
        String urlAPI = webService + "clients";
        Integer codeResponse=201;
        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("POST");
            conexao.setDoOutput(true);

            String json = model.Client.converteClientEmJson(obj);
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
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao inserir este cliente, tente novamente ! \n Caso o erro persista, contate o suporte ténico");
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            }else{
                JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso !");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void update(Client obj, Integer id) {
        String urlAPI = webService + "clients/"+id;

        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("PUT");
            conexao.setDoOutput(true);

            String json = model.Client.converteClientEmJson(obj);
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
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao alterar este cliente, tente novamente ! \n Caso o erro persista, contate o suporte ténico");
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            }else{
                JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso !");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void delete(Integer id){         
        String urlAPI = webService + "clients/"+id;
        Integer codigoResposta = 204;
        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("DELETE");
            if (conexao.getResponseCode() != codigoResposta) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao apagar este Cliente, tente novamente ! \n Caso o erro persista, contate o suporte ténico");
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            }
            else{
                JOptionPane.showMessageDialog(null, "Cliente foi deletado com sucesso !");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }
}

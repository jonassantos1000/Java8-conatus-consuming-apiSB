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
import model.Product;

/**
 *
 * @author faculdade
 */
public class ProductService {

    static String webService = "http://localhost:8080/";
    static int codigoSucesso = 200;

    public static Product findByID(String id, String inativo){
        List<Product> listProd = findAll(id,"",inativo,"");
        Product prod = listProd.get(0);
        return prod;
    }
    
    public static List<Product> findAll(String id, String descricao, String inativo, String limite) {
        if (limite.equals("0") || limite.isEmpty()) {
            limite = "999999999";
        }
        
        String urlAPI = webService + "products/custom?";
        urlAPI += "limite=" + limite;
        
        if(inativo.equals("") || inativo== null){
            inativo="F";
        }
        
        if (id != null & id != "") {
            urlAPI += "&id=" + id;
        }

        if (descricao != null & descricao!= "") {
            urlAPI += "&descricao=" + descricao;
        }

        if (inativo != null & inativo != "") {
            urlAPI += "&inativo=" + inativo;
        }
        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream()),"UTF-8"));
            List<Product> prod = model.Product.converteJsonEmArray(resposta);

            return prod;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void insert(Product obj) {
        String urlAPI = webService + "products";
        Integer codeResponse=201;
        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("POST");
            conexao.setDoOutput(true);

            String json = model.Product.converteProductEmJson(obj);
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
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao inserir este produto, tente novamente ! \n Caso o erro persista, contate o suporte ténico");
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            }else{
                JOptionPane.showMessageDialog(null, "Produto inserido com sucesso !");
            }
        } catch (Exception e) {          
            e.printStackTrace();
        }
    }
        
    public static void update(Integer id, Product obj){
        String urlAPI = webService + "products/"+id;

        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("PUT");
            conexao.setDoOutput(true);

            String json = model.Product.converteProductEmJson(obj);
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
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao alterar este produto, tente novamente ! \n Caso o erro persista, contate o suporte ténico");
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            }else{
                JOptionPane.showMessageDialog(null, "Produto alterado com sucesso !");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void delete(Integer id){
        String urlAPI = webService + "products/"+id;
        Integer codigoResposta = 204;
        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("DELETE");
            if (conexao.getResponseCode() != codigoResposta) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao apagar este produto, tente novamente ! \n Caso o erro persista, contate o suporte ténico");
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            }
            else{
                JOptionPane.showMessageDialog(null, "Produto foi deletado com sucesso !");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }
}

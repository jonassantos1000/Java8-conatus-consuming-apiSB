/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.swing.JOptionPane;
import model.Setting;

/**
 *
 * @author faculdade
 */
public class SettingService {
    static String webService = util.DataSource.getDataSource()+"/";
    static int codigoSucesso = 200;
    
    public static Setting find() {
        String urlAPI = webService + "settings";
        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso) {
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            }
            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream()), "UTF-8"));
            
            String jsonEmString = model.Setting.converteJsonEmString(resposta);
            Gson gson = new Gson();
            Setting set = gson.fromJson(jsonEmString, Setting.class);   
            
            return set;
            
        } catch (java.net.ConnectException e) {
            JOptionPane.showMessageDialog(null, "Falha na conexão com o servidor, verifique sua rede e tente novamente !");
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void update(Setting obj) {
        String urlAPI = webService + "settings";

        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            conexao.setRequestMethod("PUT");
            conexao.setDoOutput(true);

            String json = model.Setting.converteSettingEmJson(obj);
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
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao alterar as configurações, tente novamente ! \n Caso o erro persista, contate o suporte ténico");
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            } else {
                JOptionPane.showMessageDialog(null, "Configurações alteradas com sucesso !");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

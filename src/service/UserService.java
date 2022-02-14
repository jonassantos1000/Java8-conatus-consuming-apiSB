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
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author faculdade
 */
public class UserService {

    static String webService = "http://localhost:8080/users/name/";
    static int codigoSucesso = 200;

    public static User find(String login) throws Exception {
        String urlAPI = webService + login;
        try {
            URL url = new URL(urlAPI);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso) {
                JOptionPane.showMessageDialog(null, "Usuario invalido ! \n\nVerifique e tente acessar novamente !");
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            }
            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream()), "UTF-8"));

            String jsonEmString = model.Setting.converteJsonEmString(resposta);
            Gson gson = new Gson();
            User set = gson.fromJson(jsonEmString, User.class);

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

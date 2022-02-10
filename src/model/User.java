/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author faculdade
 */
public class User {
    private String usuario;
    private String senha;
    private String gerencia;

    public User (String usuario, String senha, String gerencia){
        setUsuario(usuario);
        setSenha(senha);
        setGerencia(gerencia);
    }

    public User(String usuario) {
        this.usuario = usuario;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getGerencia() {
        return gerencia;
    }

    public void setGerencia(String gerencia) {
        this.gerencia = gerencia;
    }
    
    public static String converteJsonEmString(BufferedReader buffereReader) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
    
    public static String converteUserEmJson(Setting obj) {
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        return json;
    }
    
}

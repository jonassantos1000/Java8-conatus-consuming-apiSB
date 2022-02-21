/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 *
 * @author faculdade
 */
public class CountersService { 
    String valor;
    String nome;
    
    static String webService = util.DataSource.getDataSource()+"/";
    static int codigoSucesso = 200;
    
    public static Integer getId(String campo) {
        String urlChamada=webService+"counters/"+campo;
        
        try {
            URL url = new URL(urlChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            
            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());
            
            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            CountersService counters = converteJsonEmObjeto(resposta);
                                      
            return Integer.parseInt(counters.getValor());
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public static CountersService converteJsonEmObjeto(BufferedReader buffereReader) throws IOException {
        Gson gson = new Gson();
        TypeToken tt = new TypeToken<List<CountersService>>() {};
        List<CountersService> fromJson = gson.fromJson(buffereReader, tt.getType());
        CountersService counters = new CountersService();
        for(CountersService x : fromJson){   
            counters.setNome(x.getNome());
            counters.setValor(x.getValor());
        }
        return counters;
    }
}

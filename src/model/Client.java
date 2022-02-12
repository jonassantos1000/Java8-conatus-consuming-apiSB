/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author faculdade
 */
public class Client extends People{  

    String notificaEmail;
    
    
    public Client(){
        
    }
        
    public Client(String nome, String cpf, String celular, String email, String data_cadastro, String data_alteracao, String rg, String endereco, String bairro, String numero, String CEP, String complemento, String telefone, String notificawhats, String observacao, int codigo) {
        super(nome, cpf, celular, email, data_cadastro, data_alteracao, rg, endereco, bairro, numero, CEP, complemento, telefone, observacao, codigo);
        setnotificaEmail(notificawhats);
    }
    
    public Client(int codigo, String nome, String cpf, String RG,String email) {
        this(nome,cpf,"",email,"","",RG,"","","","","","","","",codigo);      
    }
   
    public String getnotificaEmail() {
        return notificaEmail;
    }

    public void setnotificaEmail(String notificaEmail) {
        this.notificaEmail = notificaEmail;
    }

    public static List<Client> converteJsonEmArray(BufferedReader buffereReader) throws IOException {
        Gson gson = new Gson();

        TypeToken tt = new TypeToken<List<Client>>() {};
        List<Client> fromJson = gson.fromJson(buffereReader, tt.getType());

        return fromJson;
    }
    
    public static String converteClientEmJson(Client obj){
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        return json;
    }

    
}

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
public class Employee extends People {

    public Employee(){
        
    }
    
    public Employee(int codigo,String nome, String cpf, String celular, String email, String data_cadastro, String data_alteracao, String rg, String endereco, String bairro, String numero, String CEP, String complemento, String telefone, String observacao) {
        super(nome, cpf, celular, email, data_cadastro, data_alteracao, rg, endereco, bairro, numero, CEP, complemento, telefone, observacao, codigo);
    }   

    public static List<Employee> converteJsonEmArray(BufferedReader buffereReader) throws IOException {
        Gson gson = new Gson();

        TypeToken tt = new TypeToken<List<Employee>>() {};
        List<Employee> fromJson = gson.fromJson(buffereReader, tt.getType());

        return fromJson;
    }
    
    public static String converteEmployeeEmJson(Employee obj){
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        return json;
    }

    
}

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
public class Product {
    
    private Integer codigo;
    private String inativo;    
    private String descricao;
    private Double preco;
    private String data_cadastro;
    private String data_alteracao;
    private String usuario;// Para gravar o usuario que realizou o cadastro
    private String observacao;
    
    public Product(){
        
    }
    
    public Product(Integer codigo, String descricao, Double preco, String data_cadastro, String data_alteracao, String usuario,String observacao,String inativo){
        setCodigo(codigo);
        setDescricao(descricao);
        setPreco(preco);
        setData_cadastro(data_cadastro);
        setData_alteracao(data_alteracao);
        setUsuario(usuario);
        setObservacao(observacao);
        setInativo(inativo);
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getInativo() {
        return inativo;
    }

    public void setInativo(String inativo) {
        this.inativo = inativo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getData_alteracao() {
        return data_alteracao;
    }

    public void setData_alteracao(String data_alteracao) {
        this.data_alteracao = data_alteracao;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public static List<Product> converteJsonEmArray(BufferedReader buffereReader) throws IOException {
        Gson gson = new Gson();

        TypeToken tt = new TypeToken<List<Product>>() {};
        List<Product> fromJson = gson.fromJson(buffereReader, tt.getType());

        return fromJson;
    }
    
    public static String converteProductEmJson(Product obj){
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        return json;
    }
    
}

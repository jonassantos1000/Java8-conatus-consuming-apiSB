/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.reports;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author faculdade
 */
public class Cupom {

    private Integer cod_produto;
    private String descricao;
    private Integer qt_produto_vendido;
    private Double vl_unitario_produto_vendido;
    private Double subTotal;

    public Cupom() {
        super();
    }

    public Cupom(Integer cod_produto, String descricao, Integer qt_produto_vendido,
            Double vl_unitario_produto_vendido) {
        super();
        this.cod_produto = cod_produto;
        this.descricao = descricao;
        this.qt_produto_vendido = qt_produto_vendido;
        this.vl_unitario_produto_vendido = vl_unitario_produto_vendido;
    }

    public Integer getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(Integer cod_produto) {
        this.cod_produto = cod_produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQt_produto_vendido() {
        return qt_produto_vendido;
    }

    public void setQt_produto_vendido(Integer qt_produto_vendido) {
        this.qt_produto_vendido = qt_produto_vendido;
    }

    public Double getVl_unitario_produto_vendido() {
        return vl_unitario_produto_vendido;
    }

    public void setVl_unitario_produto_vendido(Double vl_unitario_produto_vendido) {
        this.vl_unitario_produto_vendido = vl_unitario_produto_vendido;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }
      
    public static String converteJsonEmString(BufferedReader buffereReader) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
}

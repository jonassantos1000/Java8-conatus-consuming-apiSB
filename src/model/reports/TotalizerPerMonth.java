/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.reports;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author faculdade
 */
public class TotalizerPerMonth {

    private String mes;
    private Integer ano;
    private Integer atendimentos;
    private Double total;

    public TotalizerPerMonth() {
        super();
    }

    public TotalizerPerMonth(String mes, Integer ano, Integer atendimentos, Double total) {
        this.mes = mes;
        this.ano = ano;
        this.atendimentos = atendimentos;
        this.total = total;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getAtendimentos() {
        return atendimentos;
    }

    public void setAtendimentos(Integer atendimentos) {
        this.atendimentos = atendimentos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    

    public static List<TotalizerPerMonth> converteJsonEmArray(BufferedReader buffereReader) throws IOException {
        Gson gson = new Gson();

        TypeToken tt = new TypeToken<List<TotalizerPerMonth>>() {
        };
        List<TotalizerPerMonth> fromJson = gson.fromJson(buffereReader, tt.getType());

        return fromJson;
    }
    
}

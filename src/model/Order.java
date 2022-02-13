package model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Order {

    private Integer codigo;
    private String dataCadastro;
    private String dataAlteracao;
    private Client client;   
    private Employee employee;
    private List<OrderItem> items = new ArrayList<>();
    private Double valorTotal;

    public Order() {

    }

    public Order(Integer codigo, String dataCadastro, String dataAlteracao, Double valorTotal,List<OrderItem> items) {
        this.codigo = codigo;
        this.dataCadastro = dataCadastro;
        this.dataAlteracao = dataAlteracao;
        this.valorTotal = valorTotal;
        this.items=items;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(String dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public static List<Order> converteJsonEmArray(BufferedReader buffereReader) throws IOException {
        Gson gson = new Gson();

        TypeToken tt = new TypeToken<List<Order>>() {};
        List<Order> fromJson = gson.fromJson(buffereReader, tt.getType());

        return fromJson;
    }
    
    public static String converteOrderEmJson(Order obj){
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        return json;
    }

}

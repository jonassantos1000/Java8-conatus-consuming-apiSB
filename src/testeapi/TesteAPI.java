/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeapi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.Client;
import model.Employee;
import model.Product;
import service.ClientService;
import service.EmployeeService;

/**
 *
 * @author faculdade
 */
public class TesteAPI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {    
        
        //TESTE FIND BY ID - PRODUCT
        /* 
        Product obj = service.ProductService.findByID("6","T");
        System.out.println("codigo: "+obj.getCodigo());
        System.out.println("email: "+ obj.getDescricao());
        System.out.println("Preco: "+ obj.getPreco());
        System.out.println("Inativo: "+ obj.getInativo());
        System.out.println("Preco: "+ obj.getData_cadastro());
        System.out.println("Observacao: "+ obj.getObservacao());
        */
        
        
        //TESTE FIND ALL - PRODUCT
        /*        
        List<Product> obj2 = service.ProductService.findAll("", "", "T", "");
        for(Product obj : obj2){
            System.out.println("codigo: "+obj.getCodigo());
            System.out.println("email: "+ obj.getDescricao());
            System.out.println("Preco: "+ obj.getPreco());
            System.out.println("Inativo: "+ obj.getInativo());
            System.out.println("Preco: "+ obj.getData_cadastro());
            System.out.println("\n ------------------------      *********************     ------------------------  ");
        }
        */

        //TESTE UPDATE PRODUTO
        /*
        Product obj = new Product();
        obj.setCodigo(3);
        obj.setDescricao("Monitor gamer - 240 hz");
        obj.setPreco(1090.50);
        obj.setInativo("F");
        obj.setData_alteracao("2020-01-28 22:58:50");
        obj.setObservacao("Marca: Acer / Dimensaoo: 19\" ");
        service.ProductService.update(obj.getCodigo(),obj);
        */
        
        //TESTE DELETE PRODUTO
        //service.ProductService.delete(6);

        
        
        //TESTE INSERT - CLIENT
        /*
        Client obj = new Client();
        obj.setCodigo(service.CountersService.getId("COD_CLIENTE"));
        obj.setNome("joazinho");
        obj.setEmail("teste update@gmail.com");
        obj.setData_cadastro("2020-01-27 22:58:50");
        service.ClientService.insert(obj);
        */
        
        
        //TESTE FIND BY ID - CLIENT
        /*
        Client obj = service.ClientService.findById("2");
        System.out.println("nome: "+obj.getNome());
        System.out.println("codigo: "+obj.getCodigo());
        System.out.println("Data_cadastro: "+ obj.getData_cadastro());
        System.out.println("Endereco: "+obj.getEndereco());
        System.out.println("Email: "+obj.getEmail());
        System.out.println("Observacao: "+ obj.getObservacao());
        */

        //TESTE FIND ALL - CLIENT
        /*
        List<Client> client = new ArrayList<Client>();                      
        client= ClientService.findAll("", "", "", "", "", "9999"); 
        for(Client x : client){
            System.out.println("Codigo: "+ x.getCodigo());
            System.out.println("Nome: "+ x.getNome());
            System.out.println("CPF: " + x.getCpf());
            System.out.println("RG: "+ x.getRg());
            System.out.println("Celular: "+ x.getCelular());
            System.out.println("Email: "+ x.getEmail());
            System.out.println("Endereco: "+ x.getEndereco());
            System.out.println("Bairro: "+ x.getBairro());
            System.out.println("Numero: "+ x.getNumero());
            System.out.println("Complemento: "+ x.getComplemento());
            System.out.println("CEP: "+ x.getCEP());
            System.out.println("Data_cadastro: "+ x.getData_cadastro());
            System.out.println("Data_alteracao: "+ x.getData_alteracao());
            System.out.println("Notificaemail: "+ x.getnotificaEmail());
            System.out.println("Telefone: "+ x.getTelefone());
            System.out.println("Observacao: "+ x.getObservacao());
            
            System.out.println("---------------------------------------------------- * * * ------------------------------------------------------------");
        }
        */
        
        //TESTE FIND BY ID - EMPLOYEE
         /*
        Employee obj = service.EmployeeService.findById("2");
        System.out.println("codigo: "+obj.getCodigo());
        System.out.println("nome: "+obj.getNome());
        System.out.println("Data_cadastro: "+ obj.getData_cadastro());
        System.out.println("Endereco: "+obj.getEndereco());
        System.out.println("Email: "+obj.getEmail());
        System.out.println("Observacao: "+ obj.getObservacao());
       */
        
        //TESTE FIND ALL - EMPLOYEE
        /*
        List<Employee> client = new ArrayList<Employee>();                      
        client= EmployeeService.findAll("", "", "", "", "", "9999"); 
        for(Employee x : client){
            System.out.println("Codigo: "+ x.getCodigo());
            System.out.println("Nome: "+ x.getNome());
            System.out.println("CPF: " + x.getCpf());
            System.out.println("RG: "+ x.getRg());
            System.out.println("Celular: "+ x.getCelular());
            System.out.println("Email: "+ x.getEmail());
            System.out.println("Endereco: "+ x.getEndereco());
            System.out.println("Bairro: "+ x.getBairro());
            System.out.println("Numero: "+ x.getNumero());
            System.out.println("Complemento: "+ x.getComplemento());
            System.out.println("CEP: "+ x.getCEP());
            System.out.println("Data_cadastro: "+ x.getData_cadastro());
            System.out.println("Data_alteracao: "+ x.getData_alteracao());
            System.out.println("Telefone: "+ x.getTelefone());
            System.out.println("Observacao: "+ x.getObservacao());
            
            System.out.println("---------------------------------------------------- * * * ------------------------------------------------------------");
        }
        */
    }
    
}

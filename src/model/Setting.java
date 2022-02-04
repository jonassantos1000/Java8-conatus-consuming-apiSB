package model;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class Setting {

    private String razaoSocial;
    private String responsavelLegal;
    private Long codigo;
    private String cnpj;
    private String email;
    private String senha;
    private String smtp;
    private String portaSMTP;
    private String ssl;
    private String tls;
    private String mensagemPadrao;
    private String data;

    public Setting() {

    }

    public Setting(String razaoSocial, String responsavelLegal, Long codigo, String cnpj, String email,
            String senha, String smtp, String portaSMTP, String sSL, String tLS, String mensagemPadrao, String data) {
        this.razaoSocial = razaoSocial;
        this.responsavelLegal = responsavelLegal;
        this.codigo = codigo;
        this.cnpj = cnpj;
        this.email = email;
        this.senha = senha;
        this.smtp = smtp;
        this.portaSMTP = portaSMTP;
        this.ssl = sSL;
        this.tls = tLS;
        this.mensagemPadrao = mensagemPadrao;
        this.data = data;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getResponsavelLegal() {
        return responsavelLegal;
    }

    public void setResponsavelLegal(String responsavelLegal) {
        this.responsavelLegal = responsavelLegal;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSmtp() {
        return smtp;
    }

    public void setSmtp(String smtp) {
        this.smtp = smtp;
    }

    public String getPortaSMTP() {
        return portaSMTP;
    }

    public void setPortaSMTP(String portaSMTP) {
        this.portaSMTP = portaSMTP;
    }

    public String getSSL() {
        return ssl;
    }

    public void setSSL(String sSL) {
        this.ssl = sSL;
    }

    public String getTLS() {
        return tls;
    }

    public void setTLS(String tLS) {
        this.tls = tLS;
    }

    public String getMensagemPadrao() {
        return mensagemPadrao;
    }

    public void setMensagemPadrao(String mensagemPadrao) {
        this.mensagemPadrao = mensagemPadrao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    
    public static String converteJsonEmString(BufferedReader buffereReader) throws IOException {
        String resposta, jsonEmString = "";
        while ((resposta = buffereReader.readLine()) != null) {
            jsonEmString += resposta;
        }
        return jsonEmString;
    }
    
    public static String converteSettingEmJson(Setting obj) {
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        return json;
    }

}

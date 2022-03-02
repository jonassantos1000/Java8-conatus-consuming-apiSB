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
public class Report {

    private Integer id;
    private String description;
    private String directory;
    private String category;

    public Report() {

    }

    public Report(Integer id, String description, String directory, String category) {
        this.id = id;
        this.description = description;
        this.directory = directory;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static List<Report> converteJsonEmArray(BufferedReader buffereReader) throws IOException {
        Gson gson = new Gson();

        TypeToken tt = new TypeToken<List<Report>>() {
        };
        List<Report> fromJson = gson.fromJson(buffereReader, tt.getType());

        return fromJson;
    }

    public static String converteReportEmJson(Report obj) {
        Gson gson = new Gson();
        String json = gson.toJson(obj);
        return json;
    }

}

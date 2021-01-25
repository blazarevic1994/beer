package com.example.beer.model;



import java.io.Serializable;
import java.util.List;


public class BeerPresentationModel implements Serializable {

    private Integer id;
    private String name;
    private String description;
    private Float meanMashTemperature;
    private Float meanFermentationTemperature;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getMeanMashTemperature() {
        return meanMashTemperature;
    }

    public void setMeanMashTemperature(Float meanMashTemperature) {
        this.meanMashTemperature = meanMashTemperature;
    }

    public Float getMeanFermentationTemperature() {
        return meanFermentationTemperature;
    }

    public void setMeanFermentationTemperature(Float meanFermentationTemperature) {
        this.meanFermentationTemperature = meanFermentationTemperature;
    }
}

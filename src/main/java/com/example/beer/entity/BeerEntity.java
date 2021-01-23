package com.example.beer.entity;




import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class BeerEntity {
    @Id
    private Integer id;

    private String name;
    private String tagline;
    private Date first_brewed;
    private String description;
    private String image_url;
    private Float abv;
    private Float ibu;
    private Float target_fg;
    private Float target_og;
    private Float ebc;
    private Float srm;
    private Float ph;
    private Float attenuation_level;
    private Float volume_value;
    private String volume_unit;
    private Float boil_volume_value;
    private String boil_volume_unit;

    @OneToOne(
            mappedBy = "beerEntity",
            cascade = CascadeType.ALL
    )
    private MethodEntity method;

    @OneToOne(
            mappedBy = "beerEntity",
            cascade = CascadeType.ALL
    )
    private IngredientsEntity ingredient;

    @OneToMany(
            mappedBy = "beerEntity",
            cascade = CascadeType.ALL
    )
    private List<FoodPairEntity> foods;

    private String brewers_tips;
    private String contributed_by;

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

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public Date getFirst_brewed() {
        return first_brewed;
    }

    public void setFirst_brewed(Date first_brewed) {
        this.first_brewed = first_brewed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Float getAbv() {
        return abv;
    }

    public void setAbv(Float abv) {
        this.abv = abv;
    }

    public Float getIbu() {
        return ibu;
    }

    public void setIbu(Float ibu) {
        this.ibu = ibu;
    }

    public Float getTarget_fg() {
        return target_fg;
    }

    public void setTarget_fg(Float target_fg) {
        this.target_fg = target_fg;
    }

    public Float getTarget_og() {
        return target_og;
    }

    public void setTarget_og(Float target_og) {
        this.target_og = target_og;
    }

    public Float getEbc() {
        return ebc;
    }

    public void setEbc(Float ebc) {
        this.ebc = ebc;
    }

    public Float getSrm() {
        return srm;
    }

    public void setSrm(Float srm) {
        this.srm = srm;
    }

    public Float getPh() {
        return ph;
    }

    public void setPh(Float ph) {
        this.ph = ph;
    }

    public Float getAttenuation_level() {
        return attenuation_level;
    }

    public void setAttenuation_level(Float attenuation_level) {
        this.attenuation_level = attenuation_level;
    }

    public Float getVolume_value() {
        return volume_value;
    }

    public void setVolume_value(Float volume_value) {
        this.volume_value = volume_value;
    }

    public String getVolume_unit() {
        return volume_unit;
    }

    public void setVolume_unit(String volume_unit) {
        this.volume_unit = volume_unit;
    }

    public Float getBoil_volume_value() {
        return boil_volume_value;
    }

    public void setBoil_volume_value(Float boil_volume_value) {
        this.boil_volume_value = boil_volume_value;
    }

    public String getBoil_volume_unit() {
        return boil_volume_unit;
    }

    public void setBoil_volume_unit(String boil_volume_unit) {
        this.boil_volume_unit = boil_volume_unit;
    }

    public MethodEntity getMethod() {
        return method;
    }

    public void setMethod(MethodEntity method) {
        this.method = method;
    }

    public IngredientsEntity getIngredient() {
        return ingredient;
    }

    public void setIngredient(IngredientsEntity ingredient) {
        this.ingredient = ingredient;
    }

    public List<FoodPairEntity> getFoods() {
        return foods;
    }

    public void setFoods(List<FoodPairEntity> foods) {
        this.foods = foods;
    }

    public String getBrewers_tips() {
        return brewers_tips;
    }

    public void setBrewers_tips(String brewers_tips) {
        this.brewers_tips = brewers_tips;
    }

    public String getContributed_by() {
        return contributed_by;
    }

    public void setContributed_by(String contributed_by) {
        this.contributed_by = contributed_by;
    }

    @Override
    public String toString() {
        return "BeerEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tagline='" + tagline + '\'' +
                ", first_brewed=" + first_brewed +
                ", description='" + description + '\'' +
                ", image_url='" + image_url + '\'' +
                ", abv=" + abv +
                ", ibu=" + ibu +
                ", target_fg=" + target_fg +
                ", target_og=" + target_og +
                ", ebc=" + ebc +
                ", srm=" + srm +
                ", ph=" + ph +
                ", attenuation_level=" + attenuation_level +
                ", volume_value=" + volume_value +
                ", volume_unit='" + volume_unit + '\'' +
                ", boil_volume_value=" + boil_volume_value +
                ", boil_volume_unit='" + boil_volume_unit + '\'' +
                ", method=" + method +
                ", ingredient=" + ingredient +
                ", foods=" + foods +
                ", brewers_tips='" + brewers_tips + '\'' +
                ", contributed_by='" + contributed_by + '\'' +
                '}';
    }
}

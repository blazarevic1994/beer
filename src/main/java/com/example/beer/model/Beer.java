package com.example.beer.model;



import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class Beer implements Serializable {
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
    private Volume volume;
    private BoilVolume boil_volume;
    private Method method;
    private Ingredient ingredients;
    private List<String> food_pairing;
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

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public BoilVolume getBoil_volume() {
        return boil_volume;
    }

    public void setBoil_volume(BoilVolume boil_volume) {
        this.boil_volume = boil_volume;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Ingredient getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getFood_pairing() {
        return food_pairing;
    }

    public void setFood_pairing(List<String> food_pairing) {
        this.food_pairing = food_pairing;
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
        return "Beer{" +
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
                ", volume=" + volume +
                ", boil_volume=" + boil_volume +
                ", method=" + method +
                ", ingredients=" + ingredients +
                ", food_pairing=" + food_pairing +
                ", brewers_tips='" + brewers_tips + '\'' +
                ", contributed_by='" + contributed_by + '\'' +
                '}';
    }
}

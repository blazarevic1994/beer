package com.example.beer.entity;



import javax.persistence.*;
import java.util.List;


@Entity
public class MethodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @OneToOne
    @JoinColumn(name = "beerEntity", referencedColumnName = "id")
    private BeerEntity beerEntity;

    @OneToMany(
            mappedBy = "methodEntity",
            cascade = CascadeType.ALL
    )
    private List<MashTempEntity> mashTemps;

    @OneToOne(
            mappedBy = "methodEntity",
            cascade = CascadeType.ALL
    )
    private FermentationEntity fermentation;

    private String twist;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BeerEntity getBeerEntity() {
        return beerEntity;
    }

    public void setBeerEntity(BeerEntity beerEntity) {
        this.beerEntity = beerEntity;
    }

    public List<MashTempEntity> getMashTemps() {
        return mashTemps;
    }

    public void setMashTemps(List<MashTempEntity> mashTemps) {
        this.mashTemps = mashTemps;
    }

    public FermentationEntity getFermentation() {
        return fermentation;
    }

    public void setFermentation(FermentationEntity fermentation) {
        this.fermentation = fermentation;
    }

    public String getTwist() {
        return twist;
    }

    public void setTwist(String twist) {
        this.twist = twist;
    }

    @Override
    public String toString() {
        return "MethodEntity{" +
                "id=" + id +
                ", mashTemps=" + mashTemps +
                ", fermentation=" + fermentation +
                ", twist='" + twist + '\'' +
                '}';
    }
}

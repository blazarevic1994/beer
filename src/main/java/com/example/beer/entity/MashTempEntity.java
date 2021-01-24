package com.example.beer.entity;



import javax.persistence.*;


@Entity
public class MashTempEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "methodEntity", referencedColumnName = "id")
    private MethodEntity methodEntity;

    private Float temp_value;
    private String temp_unit;
    private Float duration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MethodEntity getMethodEntity() {
        return methodEntity;
    }

    public void setMethodEntity(MethodEntity methodEntity) {
        this.methodEntity = methodEntity;
    }

    public Float getTemp_value() {
        return temp_value;
    }

    public void setTemp_value(Float temp_value) {
        this.temp_value = temp_value;
    }

    public String getTemp_unit() {
        return temp_unit;
    }

    public void setTemp_unit(String temp_unit) {
        this.temp_unit = temp_unit;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "MashTempEntity{" +
                "id=" + id +
                ", temp_value=" + temp_value +
                ", temp_unit='" + temp_unit + '\'' +
                ", duration=" + duration +
                '}';
    }
}

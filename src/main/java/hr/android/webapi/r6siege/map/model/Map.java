package hr.android.webapi.r6siege.map.model;

import hr.android.webapi.r6siege.operator.model.Operator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Map {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String code;
    private String name;
    private String location;
    @Column(name = "TERRAINTYPE")
    private String terrType;
    private String img;
    private String imgBas;
    private String imgGr;
    private String imgFrst;
    @ManyToMany(targetEntity = Operator.class, mappedBy = "maps")
    private List<Operator> operators;

    public Map() {
    }

    public Map(String code, String name, String location, String terrType, String img, String imgBas, String imgGr, String imgFrst) {
        this.code = code;
        this.name = name;
        this.location = location;
        this.terrType = terrType;
        this.img = img;
        this.imgBas = imgBas;
        this.imgGr = imgGr;
        this.imgFrst = imgFrst;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getTerrType() {
        return terrType;
    }

    public String getImg() {
        return img;
    }

    public String getImgBas() {
        return imgBas;
    }

    public String getImgGr() {
        return imgGr;
    }

    public String getImgFrst() {
        return imgFrst;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTerrType(String terrType) {
        this.terrType = terrType;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setImgBas(String imgBas) {
        this.imgBas = imgBas;
    }

    public void setImgGr(String imgGr) {
        this.imgGr = imgGr;
    }

    public void setImgFrst(String imgFrst) {
        this.imgFrst = imgFrst;
    }
}

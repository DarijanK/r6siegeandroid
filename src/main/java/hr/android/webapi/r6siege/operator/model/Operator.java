package hr.android.webapi.r6siege.operator.model;

import hr.android.webapi.r6siege.map.model.Map;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "Operator")
public class Operator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String code;
    @Column(name = "NAME")
    private String name;
    private String nickname;
    private String type;
    @Column(name = "ICON")
    private String iconImg;
    @Column(name = "MAIN")
    private String mainImg;
    private LocalDate dob;
    private String org;
    private String birthplace;
    private String armor;
    private String speed;
    @Column(name = "SPECGADGET")
    private String specGadget;
    @ManyToMany(targetEntity = Map.class)
    @JoinTable(name = "Operators_Maps",
            joinColumns = {@JoinColumn(name = "OPERATOR_ID")},
            inverseJoinColumns = {@JoinColumn(name = "MAP_ID")}
    )
    private List<Map> maps;

    public Operator(){}

    public Operator(int id, String code, String name, String nickname, String type, String iconImg, String mainImg, LocalDate dob, String org, String birthplace, String armor, String speed, String specGadget) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.nickname = nickname;
        this.type = type;
        this.iconImg = iconImg;
        this.mainImg = mainImg;
        this.dob = dob;
        this.org = org;
        this.birthplace = birthplace;
        this.armor = armor;
        this.speed = speed;
        this.specGadget = specGadget;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getType() {
        return type;
    }

    public String getIconImg() {
        return iconImg;
    }

    public String getMainImg() {
        return mainImg;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getOrg() {
        return org;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public String getArmor() {
        return armor;
    }

    public String getSpeed() {
        return speed;
    }

    public String getSpecGadget() {
        return specGadget;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIconImg(String iconImg) {
        this.iconImg = iconImg;
    }

    public void setMainImg(String mainImg) {
        this.mainImg = mainImg;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setSpecGadget(String specGadget) {
        this.specGadget = specGadget;
    }
}

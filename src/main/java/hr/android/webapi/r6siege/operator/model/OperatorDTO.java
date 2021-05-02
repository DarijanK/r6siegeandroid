package hr.android.webapi.r6siege.operator.model;

import java.time.LocalDate;

public class OperatorDTO {

    private String code;
    private String nickname;
    private LocalDate dob;
    private String type;
    private String iconImg;
    private String armor;
    private String speed;
    private String specGadget;

    public OperatorDTO(String code, String nickname, LocalDate dob, String type, String iconImg, String armor, String speed, String specGadget) {
        this.code = code;
        this.nickname = nickname;
        this.dob = dob;
        this.type = type;
        this.iconImg = iconImg;
        this.armor = armor;
        this.speed = speed;
        this.specGadget = specGadget;
    }

    @Override
    public String toString() {
        return "OperatorDTO{" +
                "code='" + code + '\'' +
                ", nickname='" + nickname + '\'' +
                ", dob=" + dob +
                ", type='" + type + '\'' +
                ", iconImg='" + iconImg + '\'' +
                ", armor='" + armor + '\'' +
                ", speed='" + speed + '\'' +
                ", specGadget='" + specGadget + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }

    public String getNickname() {
        return nickname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getType() {
        return type;
    }

    public String getIconImg() {
        return iconImg;
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
}

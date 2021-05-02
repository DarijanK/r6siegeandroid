package hr.android.webapi.r6siege.map.model;

public class MapDTO {

    private String code;
    private String name;
    private String location;
    private String img;
    private String imgBas;
    private String imgGr;
    private String imgFrst;

    public MapDTO() {
    }

    public MapDTO(String code, String name, String location, String img, String imgBas, String imgGr, String imgFrst) {
        this.code = code;
        this.name = name;
        this.location = location;
        this.img = img;
        this.imgBas = imgBas;
        this.imgGr = imgGr;
        this.imgFrst = imgFrst;
    }

    @Override
    public String toString() {
        return "MapDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", img='" + img + '\'' +
                ", imgBas='" + imgBas + '\'' +
                ", imgGr='" + imgGr + '\'' +
                ", imgFrst='" + imgFrst + '\'' +
                '}';
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
}

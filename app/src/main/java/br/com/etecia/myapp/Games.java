package br.com.etecia.myapp;

public class Games {

    private String nome;
    private int image;
    private String clas;
    private String desc;
    private String clase;
    private String dat;

    public Games(String nome, int image, String clas, String desc, String clase, String dat) {
        this.nome = nome;
        this.image = image;
        this.clas = clas;
        this.desc = desc;
        this.clase = clase;
        this.dat = dat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getDat() {
        return dat;
    }

    public void setDat(String dat) {
        this.dat = dat;
    }
}

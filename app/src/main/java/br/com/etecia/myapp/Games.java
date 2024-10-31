package br.com.etecia.myapp;

public class Games {

    private String nome;

    private int image;

    public Games(String nome, int image) {
        this.nome = nome;
        this.image = image;
    }
    public String getnome() {
        return nome;
    }

    public void setnome(String titulo) {
        this.nome = titulo;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int imagem) {
        this.image = imagem;
    }
}

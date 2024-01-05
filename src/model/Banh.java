package model;

public abstract class Banh {
    private int dau;
    private int thit;
    private int gao;

    public Banh() {
    }

    public Banh(int dau, int thit, int gao) {
        this.dau = dau;
        this.thit = thit;
        this.gao = gao;
    }
}

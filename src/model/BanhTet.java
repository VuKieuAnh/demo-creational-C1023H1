package model;

public class BanhTet extends Banh {
    private int r;

    public BanhTet(int dau, int thit, int gao, int r) {
        super(dau, thit, gao);
        this.r = r;
    }

    public BanhTet(int dau, int thit, int gao) {
        super(dau, thit, gao);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}

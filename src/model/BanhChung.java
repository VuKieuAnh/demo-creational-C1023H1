package model;

public class BanhChung extends Banh {
    private int canh;

    public int getCanh() {
        return canh;
    }

    public void setCanh(int canh) {
        this.canh = canh;
    }

    public BanhChung(int dau, int thit, int gao, int canh) {
        super(dau, thit, gao);
        this.canh = canh;
    }

    public BanhChung(int dau, int thit, int gao) {
        super(dau, thit, gao);
    }
}

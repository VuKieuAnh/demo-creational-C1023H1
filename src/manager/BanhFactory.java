package manager;

import model.Banh;
import model.BanhChung;
import model.BanhTet;

public class BanhFactory {
    public BanhFactory() {
    }
    public static Banh getBanh(int type, int dau, int thit, int gao){
        switch (type){
            case 1:
                return new BanhTet(dau, thit, gao);
            case 2:
                return new BanhChung(dau, thit, gao);
            default:
                return null;
        }

    }
}

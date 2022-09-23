public class BelahKetupat implements BelahKetupatInterface{
    
    @Override
    public void kelilingBelahKetupat(double s) {
        double keliling = 4 * s;
        System.out.println("Keliling Belah etupat adalah " + keliling);
    }

    @Override
    public void luasBelahKetupat(double d1, double d2) {
        double luas = (d1 * d2) / 2;
        System.out.println("Luas Belah Ketupat adalah " + luas);
    }

}
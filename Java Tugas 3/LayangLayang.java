public class LayangLayang implements LayangLayangInterface{
    
    @Override
    public void kelilingLayangLayang(double s1, double s2) {
        double keliling = 2 * (s1 + s2);
        System.out.println("Keliling Layang Layang adalah " + keliling);
    }

    @Override
    public void luasLayangLayang(double d1, double d2) {
        double luas = (d1 * d2) / 2;
        System.out.println("Luas Layang Layang adalah " + luas);
    }

}
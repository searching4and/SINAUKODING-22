public class Lingkaran implements LingkaranInterface{
    
    @Override
    public void kelilingLingkaran(double r, double pi) {
        double keliling = 2 * pi * r;
        System.out.println("Keliling Lingkaran adalah " + keliling);
    }

    @Override
    public void luasLingkaran(double r, double pi) {
        double luas = pi * r * r;
        System.out.println("Luas Lingkaran adalah " + luas);
    }

}
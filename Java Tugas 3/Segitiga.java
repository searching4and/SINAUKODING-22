public class Segitiga implements SegitigaInterface{
    
    @Override
    public void kelilingSegitiga(double s1, double s2, double s3) {
        double keliling = s1 + s2 + s3;
        System.out.println("Keliling Segitiga adalah " + keliling);
    }

    @Override
    public void luasSegitiga(double s1, double s2) {
        double luas = 0.5 * s1 * s2;
        System.out.println("Luas Segitiga adalah " + luas);
    }

}
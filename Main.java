import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu(){

        int menu = 0;
        //FARHAN FARRAS SALIM//
        while (menu != 3) {
            System.out.println("\n");
            System.out.println("============MENU UTAMA============");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajar Genjang");
            System.out.println("6. Belah Ketupat");
            System.out.println("7. Layang Layang");
            System.out.println("8. Keluar");

            System.out.print("Masukan pilihan menu : ");
            menu = input.nextInt();

            if (menu == 1) {
                persegi();
            } else if (menu == 2) {
                persegiPanjang();
            } else if (menu == 3) {
                segitiga();
            } else if (menu == 4) {
                lingkaran();
            } else if (menu == 5) {
                jajarGenjang();
            } else if (menu == 6) {
                belahKetupat();
            } else if (menu == 7) {
                layangLayang();
            } else if (menu == 8) {
                break;
            } 
        }
    }


    public static void persegi() {

        int menuPersegi = 0;

        while (menuPersegi != 3) {

            System.out.println("\n\n==============Menu Persegi============");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali");
            System.out.print("Masukan pilihan : ");
            menuPersegi = input.nextInt();

            if (menuPersegi == 1) {
                System.out.print("Masukan sisi persegi : ");
                double sisi = input.nextDouble();
                System.out.println("Luas persegi adalah : " + luasPersegi(sisi));
                System.out.println("\n\n");
            } else if (menuPersegi == 2) {
                System.out.print("Masukan sisi persegi : ");
                double sisi = input.nextDouble();
                System.out.println("Keliling persegi adalah : " + kelilingPersegi(sisi));
                System.out.println("\n\n");
            } else if (menuPersegi == 3) {
                mainMenu();
            }
        }

    }

    public static double luasPersegi(double s) {
        return s * s;
    }

    public static double kelilingPersegi(double s) {
        return 4 * s;
    }

    public static void persegiPanjang() {

        int menuPersegiPanjang = 0;

        while (menuPersegiPanjang != 3) {

            System.out.println("\n\n==============Menu Persegi Panjang============");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali");
            System.out.print("Masukan pilihan : ");
            menuPersegiPanjang = input.nextInt();

            if (menuPersegiPanjang == 1) {
                System.out.print("Masukan panjang : ");
                double s1 = input.nextDouble();
                System.out.print("Masukan lebar : ");
                double s2 = input.nextDouble();
                System.out.println("Luas persegi panjang adalah : " + luasPersegiPanjang(s1,s2));
                System.out.println("\n\n");
            } else if (menuPersegiPanjang == 2) {
                System.out.print("Masukan panjang : ");
                double s1 = input.nextDouble();
                System.out.print("Masukan lebar : ");
                double s2 = input.nextDouble();
                System.out.println("Keliling persegi panjang adalah : " + kelilingPersegiPanjang(s1,s2));
                System.out.println("\n\n");
            } else if (menuPersegiPanjang == 3) {
                mainMenu();
            }
        }

    }

    public static double luasPersegiPanjang(double s1, double s2) {
        return (s1 * s2);
    }

    public static double kelilingPersegiPanjang(double s1, double s2) {
        return (2 * (s1 + s2));
    }

    public static void segitiga() {

        int menuSegitiga = 0;

        while (menuSegitiga != 3) {

            System.out.println("\n\n==============Menu Segitiga============");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali");
            System.out.print("Masukan pilihan : ");
            menuSegitiga = input.nextInt();

            if (menuSegitiga == 1) {
                System.out.print("Masukan alas : ");
                double s1 = input.nextDouble();
                System.out.print("Masukan tinggi : ");
                double s2 = input.nextDouble();
                System.out.println("Luas persegi adalah : " + luasSegitiga(s1,s2));
                System.out.println("\n\n");
            } else if (menuSegitiga == 2) {
                System.out.print("Masukan alas : ");
                double s1 = input.nextDouble();
                System.out.print("Masukan tinggi : ");
                double s2 = input.nextDouble();
                System.out.print("Masukan sisi miring : ");
                double s3 = input.nextDouble();
                System.out.println("Keliling persegi adalah : " + kelilingSegitiga(s1,s2,s3));
                System.out.println("\n\n");
            } else if (menuSegitiga == 3) {
                mainMenu();
            }
        }

    }

    public static double luasSegitiga(double s1, double s2) {
        return (0.5 * s1 * s2);
    }

    public static double kelilingSegitiga(double s1, double s2, double s3) {
        return (s1 + s2 + s3);
    }

    public static void lingkaran() {

        int menuLingkaran = 0;

        while (menuLingkaran != 3) {

            System.out.println("\n\n==============Menu Lingkaran============");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali");
            System.out.print("Masukan pilihan : ");
            menuLingkaran = input.nextInt();

            if (menuLingkaran == 1) {
                System.out.print("Masukan jari-jari : ");
                double r = input.nextDouble();
                double pi = 3.14;
                System.out.println("Luas lingkaran adalah : " + luasLingkaran(r,pi));
                System.out.println("\n\n");
            } else if (menuLingkaran == 2) {
                System.out.print("Masukan jari-jari : ");
                double r = input.nextDouble();
                double pi = 3.14;
                System.out.println("Keliling lingkaran adalah : " + kelilingLingkaran(r,pi));
                System.out.println("\n\n");
            } else if (menuLingkaran == 3) {
                mainMenu();
            }
        }
    }

    public static double luasLingkaran(double r, double pi) {
        return (pi * r * r);
    }

    public static double kelilingLingkaran(double r, double pi) {
        return (2 * pi * r);
    }

    public static void jajarGenjang() {

        int menuJajarGenjang = 0;

        while (menuJajarGenjang != 3) {

            System.out.println("\n\n==============Menu Jajar Genjang============");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali");
            System.out.print("Masukan pilihan : ");
            menuJajarGenjang = input.nextInt();

            if (menuJajarGenjang == 1) {
                System.out.print("Masukan alas : ");
                double s1 = input.nextDouble();
                System.out.print("Masukan tinggi : ");
                double s2 = input.nextDouble();
                System.out.println("Luas jajar genjang adalah : " + luasJajarGenjang(s1,s2));
                System.out.println("\n\n");
            } else if (menuJajarGenjang == 2) {
                System.out.print("Masukan alas : ");
                double s1 = input.nextDouble();
                System.out.print("Masukan sisi miring : ");
                double s2 = input.nextDouble();
                System.out.println("Keliling jajar genjang adalah : " + kelilingJajarGenjang(s1,s2));
                System.out.println("\n\n");
            } else if (menuJajarGenjang == 3) {
                mainMenu();
            }
        }

    }

    public static double luasJajarGenjang(double s1, double s2) {
        return (s1 * s2);
    }

    public static double kelilingJajarGenjang(double s1, double s2) {
        return (2 * (s1 + s2));
    }

    public static void belahKetupat() {

        int menuBelahKetupat = 0;

        while (menuBelahKetupat != 3) {

            System.out.println("\n\n==============Menu Belah Ketupat============");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali");
            System.out.print("Masukan pilihan : ");
            menuBelahKetupat = input.nextInt();

            if (menuBelahKetupat == 1) {
                System.out.print("Masukan Diameter 1 : ");
                double d1 = input.nextDouble();
                System.out.print("Masukan Diameter 2 : ");
                double d2 = input.nextDouble();
                System.out.println("Luas belah ketupat adalah : " + luasBelahKetupat(d1,d2));
                System.out.println("\n\n");
            } else if (menuBelahKetupat == 2) {
                System.out.print("Masukan sisi : ");
                double s = input.nextDouble();
                System.out.println("Keliling belah ketupat adalah : " + kelilingBelahKetupat(s));
                System.out.println("\n\n");
            } else if (menuBelahKetupat == 3) {
                mainMenu();
            }
        }

    }

    public static double luasBelahKetupat(double d1, double d2) {
        return ((d1 * d2) / 2);
    }

    public static double kelilingBelahKetupat(double s) {
        return (4 * s);
    }

    public static void layangLayang() {

        int menuLayangLayang = 0;

        while (menuLayangLayang != 3) {

            System.out.println("\n\n==============Menu Layang Layang============");
            System.out.println("1. Luas");
            System.out.println("2. Keliling");
            System.out.println("3. Kembali");
            System.out.print("Masukan pilihan : ");
            menuLayangLayang = input.nextInt();

            if (menuLayangLayang == 1) {
                System.out.print("Masukan Diameter 1 : ");
                double d1 = input.nextDouble();
                System.out.print("Masukan Diameter 2 : ");
                double d2 = input.nextDouble();
                System.out.println("Luas layang layang adalah : " + luasLayangLayang(d1,d2));
                System.out.println("\n\n");
            } else if (menuLayangLayang == 2) {
                System.out.print("Masukan Sisi 1 : ");
                double s1 = input.nextDouble();
                System.out.print("Masukan Sisi 2 : ");
                double s2 = input.nextDouble();
                System.out.println("Keliling layang layang adalah : " + kelilingLayangLayang(s1,s2));
                System.out.println("\n\n");
            } else if (menuLayangLayang == 3) {
                mainMenu();
            }
        }

    }

    public static double luasLayangLayang(double d1, double d2) {
        return ((d1 * d2) / 2);
    }

    public static double kelilingLayangLayang(double s1, double s2) {
        return (2 * (s1 + s2));
    }
}

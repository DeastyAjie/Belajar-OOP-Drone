package dasar;

public class Terbang {

    public static void main(String[] args) {

        Drone Terbang = new Drone();

        Terbang.merk = "Punya ajieee :<";
        Terbang.energi = 0;
        Terbang.ketinggian = 25;
        Terbang.kecepatan = 10;

        Terbang.terbang();
        Terbang.turun();
        Terbang.belok();
        Terbang.maju();
        Terbang.mundur();
        Terbang.matikanMesin();

        if (Terbang.matiSam()) {
            System.out.println("Game Over!");
        } else {
            System.out.println("Player tidak mati");
        }
    }

}

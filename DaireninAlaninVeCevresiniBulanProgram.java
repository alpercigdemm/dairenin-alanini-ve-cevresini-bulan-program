import java.util.Scanner;
public class DaireninAlaninVeCevresiniBulanProgram {
    public static void main(String[] args) {

        int r;
        double pi =3.14,alan,cevre,merkezAci,daireDilimi;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yari capini giriniz= ");
        r = inp.nextInt();
        System.out.print("Merkez acisinin olcusunu giriniz= ");
        merkezAci = inp.nextDouble();

        daireDilimi = (pi* (r*r)*merkezAci) / 360;
        alan = pi * r * r;
        cevre = 2 * pi * r;
        System.out.println("Dairenin Alani= " + alan );
        System.out.println("Dairenin Cevresi= " + cevre);
        System.out.println("Daire Dilimi= " + daireDilimi);


    }
}

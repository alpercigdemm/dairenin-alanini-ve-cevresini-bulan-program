# Dairenin Alanını ve Çevresini Bulan Program

Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

* Alan Formülü : π * r * r;

* Çevre Formülü : 2 * π * r;

## **Ödev**
* Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

* 𝜋 sayısını = 3.14 alınız.

* Formül : (𝜋 * (r*r) * 𝛼) / 360

**Cevap**

```
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


```
www.patika.dev

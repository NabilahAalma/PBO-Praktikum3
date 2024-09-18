package Matematika;

public class MatematikaInheritance {
    public static void main(String[] args) {
        Matematika2 mtk = new Matematika2();

        // class MatematikaInheritance yang memanggil semua method dari class Matematika dan Matematika2   
        System.out.println("Pertambahan : 20 + 10 = " + mtk.pertambahan(20, 10));//parameter di isi dengan nilai yang diperintahkan pada masing-masing operasi
        System.out.println("Pengurangan : 10 - 5 = " + mtk.pengurangan(10, 5));//kemudian output nya akan ditampilkan/di print
        System.out.println("Perkalian : 10 * 3 = " + mtk.perkalian(10, 3));
        System.out.println("Pembagian : 21 / 2 = " + mtk.pembagian(21, 2));
        System.out.println("Modulus : 20 % 2 = " + mtk.pembagian(2, 20)); //method dari class Matematika2
    }//mungkin dalam versi lain dapat gunakan double pada semua variabel dan tipe data yang akan di operasikan jika ingin mengoperasikan maupun menghasilkan nilai pecahan
//misalnya pada contoh soal pengisian parameter untuk pembagian dimana : 21 / 2 = 10.5, namun karena int jadi di bulatkan jadi 10
}
//run:
//Pertambahan : 20 + 10 = 30
//Pengurangan : 10 - 5 = 5
//Perkalian : 10 * 3 = 30
//Pembagian : 21 / 2 = 10
//Modulus : 20 % 2 = 0
//BUILD SUCCESSFUL (total time: 0 seconds)
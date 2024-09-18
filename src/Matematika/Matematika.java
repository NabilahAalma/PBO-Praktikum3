package Matematika;

//Untuk class Matematika2 yang merupakan inherit dari class Matematika (soal latihan pertemuan 2),

public class Matematika{
    public int pertambahan(int a, int b) {
        return a + b; //method mengembalikan nilai dengan menambahkan+ nilai var a dan var b
    }
    
    public int pengurangan(int a, int b) {
        return a - b;//method mengembalikan nilai dengan mengurangkan- nilai var a dan var b
    }
    
    public int perkalian(int a, int b) {
        return a * b;//method mengembalikan nilai dengan mengalikan* nilai var a dan var b
    }
    
    public int pembagian(int a, int b) { //tipe data int akan menghasilkan nilai bil.bulat jadi koma an nya tidak di print
        if (b == 0) { //jika nilai var b adala 0, maka dikecualikan dari operasi aritmatika dan menampilkan "Pembagian nol tidak dapat dilakukan", sebab nilai var b=0 sebagai pembagi akan menghasilkan nilai tidak terdefinisi
           throw new ArithmeticException("Pembagian nol tidak dapat dilakukan");
        }
        return (int) a / b; //selain itu maka method akan mengembalikan nilai dengan membagi/ nilai var a dan var b
    } //mungkin dalam versi lain dapat gunakan double pada semua variabel dan tipe data yang akan di operasikan jika ingin mengoperasikan maupun menghasilkan nilai pecahan
    //misalnya pada contoh soal pengisian parameter untuk pembagian dimana : 21 / 2 = 10.5, namun karena int jadi di bulatkan jadi 10
}
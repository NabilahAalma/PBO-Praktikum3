package Suhu;

//Buat class KonversiSuhu2() yang inherit dari class KonversiSuhu() dan mempunyai method fahrenheitToReamur() 
// public class dapat diakses/diimplementasikan oleh class lain dimanapun 

public class KonversiSuhu2 extends KonversiSuhu {//KonversiSuhu2 inheritance dari KonversiSuhu, yang mengizinkan untuk menggunakan methods dari Class parent.
    public double fahrenheitToReamur(double fahrenheit) {//parameter var fahrenheit dengan tipe double, sebab fahrenheit yang ingin di ubah
        return ((fahrenheit - 32) * 4/9);//return value. method untuk konversi suhu dari Fahrenheit ke Reamur
    }
}
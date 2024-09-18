package Suhu;

//Buat class KonversiSuhu() yang mempunyai method celciusToFahrenheit() dan celciusToReamur() 
// public class dapat diakses/diimplementasikan oleh class lain dimanapun 
public class KonversiSuhu {
    public double celciusToFahrenheit(double celcius) {//parameter var celcius dengan tipe double, sebab celcius yang ingin di ubah
        return ((celcius * 9/5) + 32); //return value. method untuk konversi suhu dari Celcius ke Fahrenheit
    }

    public double celciusToReamur(double celcius) {//parameter var celcius dengan tipe double, sebab celcius yang ingin di ubah
        return celcius * 4/5;//return value. method untuk konversi suhu dari Celcius ke Reamur
    }
}
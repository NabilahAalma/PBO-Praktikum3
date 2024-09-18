package Suhu;

//Buat class DemoKonversiSuhu() yang memberikan nilai dan memanggil semua method dari  class KonversiSuhu() dan class KonversiSuhu1() 
// public class dapat diakses/diimplementasikan oleh class lain dimanapun 

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        
        KonversiSuhu konversiSuhu = new KonversiSuhu();
        KonversiSuhu2 konversiSuhu2 = new KonversiSuhu2();

        System.out.println("25.0 Celcius to Fahrenheit is: " + konversiSuhu.celciusToFahrenheit(25.0) + " Fahrenheit");
        System.out.println("20.0 Celcius to Reamur is: " + konversiSuhu.celciusToReamur(20.0) + " Reamur");
        System.out.println("72.0 Fahrenheit to Reamur is: " + konversiSuhu2.fahrenheitToReamur(72.0) + " Reamur");
    }
    
}
//run:
//25.0 Celcius to Fahrenheit is: 77.0 Fahrenheit
//20.0 Celcius to Reamur is: 16.0 Reamur
//72.0 Fahrenheit to Reamur is: 17.77777777777778 Reamur
//BUILD SUCCESSFUL (total time: 0 seconds)
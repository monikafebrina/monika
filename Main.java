/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String args[])
    {
       System.out.println(Calculator.info);
       
       Calculator calculator1 = new Calculator();
       Calculator calculator4 = new Calculator();
       Calculator calculator2 = new Calculator(3,5);
       Calculator calculator3 = new Calculator(3);
       
       System.out.println("Nilai awal setelah konstruktor dipanggil");
       System.out.println("Nilai op2 Constructor tanpa parameter: "+calculator1.op2);
       System.out.println("Nilai op2 Constructor dengan 2 parameter: "+calculator2.op2);
       System.out.println("Nilai op2 Constructor dengan 3 parameter: "+calculator3.op2);
       
       System.out.println("Nilai op1 Constructor tanpa parameter: "+calculator1.getOp1());
       System.out.println("Nilai op1 Constructor dengan 2 parameter: "+calculator2.getOp1());
       System.out.println("Nilai op1 Constructor dengan 3 parameter: "+calculator3.getOp1());
       
       System.out.println("");
       System.out.println(Calculator.jumlahobject);
       
       System.out.println("");
       double hasil1 = calculator1.jumlah();
       double hasil2 = calculator1.jumlah(6.2 , 4.2);
       System.out.println("Hasil penjumlahan method jumlah tanpa parameter: "+ hasil1);
       System.out.println("Hasil penjumlahan method jumlah dengan parameter: "+ hasil2);
       
       System.out.println("");
       double kurang1 = calculator1.kurang();
       double kurang2 = calculator1.kurang(6.2,  4.2 );
       System.out.println("Hasil pengurangan method kurang tanpa parameter:  " + kurang1);
       System.out.println("Hasil pengurangan  method kurang dengan parameter:  "+ kurang2);
       
       System.out.println("");
       double kali1 = calculator1.kali();
       double kali2 = calculator1.kali(6.2,  4.2 );
       System.out.println("Hasil perkalian method kali tanpa parameter:  " + kali1);
       System.out.println("Hasil peekalian  method kali dengan parameter:  "+ kali2);
       
        
       System.out.println("");
       double bagi1 = calculator1.bagi();
       double bagi2 = calculator1.bagi(6.2,  4.2  );
       System.out.println("Hasil pembagian method bagi tanpa parameter:  " + bagi1);
       System.out.println("Hasil pembagian method bagi dengan parameter:  "+ bagi2);
       
       
  
       CalculatorProgrammer clp = new CalculatorProgrammer();
       System.out.println(" \n CalculatorProgrammer");
       System.out.println("Bentuk Biner dari Desimal " + " :"+ Integer.toBinaryString(5));
       System.out.println("Bentuk Hex dari Desimal " + " :"+ Integer.toHexString(5));

    
      Calculatorscientific cs = new Calculatorscientific();
      System.out.println(" \n Calculatorscientific");
      System.out.println("Faktorial dari 6! adalah" + cs. menghitungFaktorial(5));
      System.out.println("luas lingkarannya adalah" + cs.luas());
      System.out.println("luas Bujur sangkar adalah" + cs.bujurSangkar(10));
}
}





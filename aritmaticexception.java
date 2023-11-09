public class aritmaticexception {
    public static void main(String[] a){
        try{
            int hasil = 10/0;
            System.out.println(hasil);
        }
        catch(ArithmeticException e1){
            System.out.println("ada error di pembagian : "+e1);
        }
    }
}

public class TestEror {
    public static void main(String[] a){
        try{
            int[] angka ={10,20};
            System.out.println(angka[1]);
            int hasil = 10/5;
            System.out.println(hasil);
        }
        catch(ArithmeticException e1){
            System.out.println("ada error di pembagian : "+e1);
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("ada error aray : "+e2);
        }
        catch(Exception e){
            System.out.println("ada error : "+e);
        }
        finally{
            System.out.println("blok selalu jalan,entah exception ada atau tidak");
        }
    }
}

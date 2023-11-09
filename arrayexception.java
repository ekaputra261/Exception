public class arrayexception {
    public static void main(String[] a){
        try{
            int[] angka ={10,20};
            System.out.println(angka[3]);
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("ada error aray : "+e2);
        }
    }
}

public class pointerexcaption {
    public static void main(String[] a){
        try{
            String text = null;
            int length = text.length();
            System.out.println(text.length());
        }
        catch(NullPointerException e2){
            System.out.println("String kosong : "+e2);
        }
    }
}

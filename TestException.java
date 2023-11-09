public class TestException  {
    public static void bagi(int a,int b) throws Exception{
        if(b == 0){
            throw new Exception("Penyebut Tidak Boleh 0");
        }
        else{
            int hasil = a/b;
            System.out.println(hasil);
        }
    }
    public static void main(String[] a){
        try{
            bagi(10,0);
        } catch(Exception e){
            System.out.println(e);
        }
    }
}

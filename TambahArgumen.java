public class TambahArgumen {
    public static void main(String[] args){
        int jumlah = 0;
        for(int i = 0; i < args.length; i++){
            jumlah += Integer.parseInt(args [i]);
        }
        System.out.println("Jumlah = "+jumlah);
    }
}

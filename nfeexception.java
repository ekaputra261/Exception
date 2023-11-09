public class nfeexception {
    public static void main(String[] args){
        double jumlah = 0;
        for(int i = 0; i < args.length; i++){
            try{
                jumlah += Double.parseDouble(args[i]);
            } catch (NumberFormatException nfe){
                System.err.println(args[i]+" Format Salah ");
            }
        }
        System.out.println("Jumlah = "+jumlah);
    }
}

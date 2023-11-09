public class TugasException {
    public static void tugas(String nama) throws Exception{
        if(nama != "putra"){
            throw new Exception("Contoh Exeception 1 : Nama harus putra");
        }
        else{
            String hasil = "Ini Tugas Saya";
            System.out.println(hasil);
        }
    }
    public static void main(String[] args){
        try{
            tugas("adam");

        } catch(Exception e){
            System.out.println(e);
        }
    }
}

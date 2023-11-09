public class Overdraft extends Exception {
    private final double deficit;
    public Overdraft(String msg, double deficit){
        super(msg);
        this.deficit = deficit;
    }
    public double getDeficit(){
        return deficit;
    }
}

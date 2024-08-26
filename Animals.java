interface Animals{

 public String eat(String s);

}
class lion implements Animals{
    public String eat(String s){
        return s;
    }
}
public class test{
    public static void main(String[] args) {
        lion l=new lion();
        System.out.println( l.eat("meat"));
    }
}
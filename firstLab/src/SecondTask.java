import static java.lang.Math.sqrt;
import static java.lang.Double.parseDouble;

public class SecondTask {
    private static double count = 1;

    public static void main(String[] args) {
        if(args.length != count) {
            System.out.println("illegal arguments");
        }else{
            System.out.println("side length: "+ sqrt(parseDouble(args[0])));
            System.out.println("i didnt understand second tast");
        }
    }
}

import static java.lang.Math.sqrt;
import static java.lang.Double.parseDouble;


public class MySquare{
     public static double square(String a){
        return parseDouble(a) * parseDouble(a);
    }
    public static double area(String[] args){
        double halfSum = 0;
        for(String c:args){
            halfSum += Double.parseDouble(c) / 2.0;
        }
        return sqrt(halfSum *(halfSum - parseDouble(args[0])) * (halfSum - parseDouble(args[1])) * (halfSum - parseDouble(args[2])));
    }

}
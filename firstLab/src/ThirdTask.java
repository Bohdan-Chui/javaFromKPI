import static java.lang.Double.parseDouble;
import static java.lang.Math.sqrt;


class ThirdTask {
    private static double count = 2;

    public static void main(String[] args) {
        if(args.length != count) {
            System.out.println("illegal arguments");
        }else{
            double hypotenuse = sqrt( MySquare.square(args[0]) +  MySquare.square(args[1]));
            System.out.println("height: " + parseDouble(args[0]) * parseDouble(args[1]) / hypotenuse);
            System.out.println("hypotenuse: " + hypotenuse);
        }
    }
}
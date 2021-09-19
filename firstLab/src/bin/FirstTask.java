public class FirstTask {
    private static double count = 3;

    public static void main(String[] args) {
        if(args.length != count) {
            System.out.println("illegal arguments");
        }else{
            double halfSum = 0;
            for(String c:args){
                halfSum += Double.parseDouble(c) / 2.0;
            }
            System.out.println("square: " + MySquare.area(args));
            System.out.println("Half perimetr: " + halfSum );

        }
    }
}

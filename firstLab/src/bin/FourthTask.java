public class FourthTask {
    private static double count = 5;

    public static void main(String[] args) {
        if(args.length != count) {
            System.out.println("illegal arguments");
        }else{
            System.out.println("square: " + (MySquare.area(new String[]{args[0],args[1],args[4]}) + MySquare.area(new String[]{args[2],args[3],args[4]})));

            }
        }
    }
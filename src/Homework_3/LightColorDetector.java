package Homework_3;

public class LightColorDetector {

    //this should be in the class "LightColorDetectorTest"
    //this should be similar as we did in classroom
    //in that classes main method, you create new object LightColorDetector
    //and call this objects methods
    public static void main( String[] args ) {

        int x = 400;

        wavelength(x);
    }

    //so this method should be public and non-static
    //and probably called printWaveByLength
    //as it takes vawe length and print it's color
    private static void wavelength( int x ) {
        if (x >= 300 && x <= 450) {
            System.out.println("Violet");
        } else if (x > 450 && x <= 495) {
            System.out.println("Blue");
        } else if (x > 495 && x <= 570) {
            System.out.println("Green");
        } else if (x > 570 && x <= 590) {
            System.out.println("Yellow");
        } else if (x > 590 && x <= 620) {
            System.out.println("Orange");
        } else if (x > 620 && x <= 750) {
            System.out.println("Red");
        } else
            System.out.println("Light not visible");
    }

};

//please comment in english as it is easier for me
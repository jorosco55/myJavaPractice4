package practice4;

public class myPractice {

    /**
     * Classes in Java can be extended,
     * creating new classes which retain
     * characteristics of the base class.
      * @param args
     */

    public static void main(String[] args) {

        myRectangle myTangle = new myRectangle();
        myTriangle myAngle = new myTriangle();

        myTangle.set_values(10, 10);
        myAngle.set_values(10, 10);

        System.out.println("Area of Rectange = " + myTangle.area());
        System.out.println("Area of Triangle = " + myAngle.area());


    }

}

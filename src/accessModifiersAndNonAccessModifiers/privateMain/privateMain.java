package accessModifiersAndNonAccessModifiers.privateMain;

public class privateMain {

    private double piPrivate = 3.14;
    private void privateMetod () {
        System.out.println("Ben private. "+ this.piPrivate);
    }

    void main () {

        this.piPrivate = 3.15;



    }



}
class a {

    privateMain pm = new privateMain();
    //pm.


}
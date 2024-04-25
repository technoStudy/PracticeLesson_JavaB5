package practiseLessons.accessModifiersAndNonAccessModifiers.publicMain;

public class MainPublic {

    public double pi= 3.14;

    public void publicMetod(){
        System.out.println("ben public. "+ this.pi);
    }

    double piDefault = 3.18;
    void defaultMedod () {
        System.out.println("Ben Default. "+ this.piDefault);

    }


}

package practiseLessons.polymorphism;

public class AreaCalculator {
     // polimorfik metot : shap interface kullanarak herhangi bir nesnenin alanini hesaplayacagiz
    public static double calculateArea(Shape shape){
        return shape.calculorArea();
    }
}

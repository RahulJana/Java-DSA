class Shape{
    public void displayArea(){
        System.out.println("Display area");
    }
}

class Triangle extends Shape{
    public void displayArea(int l, int h){
        System.out.println(l*h*0.5);
    }
}

class EquilateralTriangle extends Triangle{
    public void displayArea(int l, int h){
        System.out.println(l*h*0.5);
    }
}

class Circle extends Shape{
    public void displayArea(int r){
        System.out.println(Math.PI*r*r);
    }
}

public class Main{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.displayArea(10);
    }
}

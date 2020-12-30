package Main;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed; // 필드

    Car(){
        this.company = ("기아자동차");
    } // 생성자1

    Car(String model){
        this.model = model;
    } // 생성자2

    Car(String model, String color){
        this.model = model;
        this.color = color;
    } // 생성자3


    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    } // 생성자5




    public static void main(String[] args) throws Exception{

        Car car1 = new Car(); // 클래스를 이용하여 car1 인터페이스 생성한다.
        System.out.println("car1.company : "+ car1.company);
        // Overloading 클래스로 car1 객체 생성하고 car1에 있는 company 필드 호출

        Car car2 = new Car("Sonata", "Black");
        System.out.println("car2.company: "+car2.company);
        System.out.println("car2.model: "+ car2.model);
        System.out.println("car2.model: "+ car2.color);

        Car car4 = new Car("Forte");
        System.out.println("car4.company: " + car4.company);
        System.out.println("car4.model: "+ car4.model);

        Car car3 = new Car("Santafe", "Blue", 23);
        System.out.println("car3.company: "+ car3.company);
        System.out.println("car3.model: " + car3.model);


        //
    }
}
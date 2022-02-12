package week3.day1;

public class MyVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Vehicle car1=new Vehicle();
    Car car2=new Car();
    Audi car3=new Audi();
    
    car1.applyBrake();
    car1.soundHorn();
    
    car2.applyBrake();
    car2.soundHorn();
    car2.openDoor();
    
    car3.applyBrake();
    car3.soundHorn();
    car3.openDoor();
    car3.autoPark();
    car3.applyBrake();
    
   
	}

}

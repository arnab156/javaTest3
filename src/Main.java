import java.awt.*;

public class Main {

    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("My name is Arnab");
        System.out.println("This is my first Java App");


//        Cars myCar = new Cars(inputAverageMilesPerGallon:25.5,inputLicensePlate: "1B7789",Color.DARK_GRAY,inputAreTailLightsWorking:true);
//
//        Cars arnabCar = new Cars(inputAverageMilesPerGallon:25.5,
//                inputLicensePlate:"Y36GGY",
//                Color.BLACK,
//                inputAreTailLightsWorking:false);
        Car myCar = new Car(23.1,"HOBBY",Color.darkGray, true);
        Car arnabCar = new Car(25.4,"GGYB78",Color.BLACK, false);

        System.out.println("Your Car's License Plate Number: " + myCar.licensePlate);
        System.out.println("ArnabCar's License Plate Number: " + arnabCar.licensePlate);


        System.out.println("ArnabCar's old car color: " + arnabCar.paintColor);
        arnabCar.changePaintColor(Color.RED);
        System.out.println("ArnabCar's new car color: " + arnabCar.paintColor.toString());






        double mySpeed  = 20;
        mySpeed = myCar.speedingUp(mySpeed);
        System.out.println("myCar's speed is now:  " + mySpeed);


        String s = "Dog";
        String newS = s.replace('D','F');
//        String newS = s.replace( 'D', newChar: 'F');
        System.out.println(newS);
    }

}

//to import color library etc
import java.awt.*;

public class Cars {

    //System.out.println("Hello World");
    //Data Types: Integer, 1,2,3
    //Double 1.34
    //string  "hgejje"
    //Color AWT LIBRARY
    //boolean

          double averageMilesPerGallon;
          String licensePlate;
          Color paintColor;
          boolean areTailLightsWorking;


          public void Cars(double inputAverageMilesPerGallon,
                     String inputLicensePlate,
                     Color inputPaintColor,
                     boolean inputAreTailLightsWorking){
              this.averageMilesPerGallon = inputAverageMilesPerGallon;
              this.licensePlate = inputLicensePlate;
              this.paintColor = inputPaintColor;
              this.areTailLightsWorking = inputAreTailLightsWorking;
          }
}



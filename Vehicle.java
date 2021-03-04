package sample;

public class Vehicle

{

         String vehicle;


              Engine engine;


         Size size;


    Colour colour;

        public Vehicle (String vehicle, Engine engine, Size size, Colour colour)



        {
               this.vehicle = vehicle;


                 this.engine = engine;


                       this.size = size;


                this.colour = colour;


    }


    public String toString()

    {


           return " Silnik, " + engine.engine + "\n Marka, " + vehicle + "\n Kolor, " + colour.colour + "\n Wymiary," + size.size;

    }

}
public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch BEAST", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

//        thePC.getMonitor().drawPixelAt(1500, 1200, "red"); // Drawing pixel at 1500, 1200 in color red
//        thePC.getMotherboard().loadProgram("Windows 1.0"); // Program Windows 1.0 is now loading...
//        thePC.getTheCase().pressPowerButton();  // Power button pressed

        thePC.powerUp();
    }
}

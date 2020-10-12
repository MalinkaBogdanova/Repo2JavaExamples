package EcapsulationChallenge93;

public class Main {
    // Create a class and demonstate proper encapsulation techniques
    // the class will be called Printer
    // It will simulate a real Computer Printer
    // It should have fields for the toner Level, number of pages printed, and
    // also whether its a duplex printer (capable of printing on both sides of the paper).
    // Add methods to fill up the toner (up to a maximum of 100%), another method to
    // simulate printing a page (which should increase the number of pages printed).
   
    public static void main(String[] args) {
        Printer newPrinter= new Printer(40,true);
        System.out.println("Initial pages count = "+newPrinter.getPagesPrinted());
        System.out.println("Initial tonerLevel = "+ newPrinter.getTonerLevel());
        System.out.println(newPrinter.fillUp(40));
        System.out.println(newPrinter.printPages(20));

    }
}

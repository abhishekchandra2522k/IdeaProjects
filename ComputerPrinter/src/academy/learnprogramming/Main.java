package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        ComputerPrinter printer = new ComputerPrinter(50, false);
        System.out.println("Initial page count: " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " +
                            printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " +
                printer.getPagesPrinted());
    }
}

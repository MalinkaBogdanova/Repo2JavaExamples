package EcapsulationChallenge93;

public class Printer {
    // the class will be called Printer
    // It will simulate a real Computer Printer
    // It should have fields for the toner Level, number of pages printed, and
    // also whether its a duplex printer (capable of printing on both sides of the paper).
    // Add methods to fill up the toner (up to a maximum of 100%),
    // another method to (should return tonerLevel)
    // simulate printing a page
    // (which should increase the number of pages printed).

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrint;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplexPrint = duplexPrinter;
        this.pagesPrinted = 0;
    }

    public int fillUp(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerLevel > 100) {
                return -1;
            }
            return this.tonerLevel += tonerAmount;
        } else {
            return -1;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int printPages(int newPages) {
        int pagesAll = this.pagesPrinted += newPages;
        if (!duplexPrint) {
            return pagesAll;
        }

        int allDuplexPages = pagesAll / 2 + pagesAll % 2;
        return allDuplexPages;


    }
}

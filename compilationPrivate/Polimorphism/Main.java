package Polimorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "The Shark is big";
    }
}

class It extends Movie {

    public It() {
        super("It - Steven King - Horror");
    }

    @Override
    public String plot() {
        return "Stiven King presents it ";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("StarWars");
    }

    @Override
    public String plot() {
        return "StarWars and its Enemy";
    }
}

class HappyTogether extends Movie {

    public HappyTogether() {
        super("Happy Together");
    }

    @Override
    public String plot() {
        return "Everybody deserves Happiness ";
    }
}

class Frozen extends Movie {

    public Frozen() {
        super("Frozen");
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomPlot();
            System.out.println("Movie's № " + i + "\n" + "movie's name is: "
                    + movie.getName() + "\n" + "Plot: " + movie.plot());
        }

    }

    public static Movie randomPlot() {
        int randomNumber = (int) ((Math.random() * 5) + 1);
        System.out.println("The random number generated is: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new Frozen();
            case 3:
                return new HappyTogether();
            case 4:
                return new It();
            case 5:
                return new StarWars();
        }
        return null;
    }

}

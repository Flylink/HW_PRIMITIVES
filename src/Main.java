public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13676;
        int milesCalculator = (ticketPrice / 20);
        int bonusMiles = milesCalculator;

        System.out.println("За билет стоимостью " + ticketPrice + " руб. начислено " + bonusMiles + " миль.");
    }
}
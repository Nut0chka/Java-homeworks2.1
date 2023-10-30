public class Main {
    public static void main(String[] args) {
        int ticketPrice = 5000;
        int spentTicket = 20;

        int bonusMiles = ticketPrice / spentTicket;

        System.out.println("Начислено: " + bonusMiles + " бонусных миль");
    }
}
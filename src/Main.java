public class Main {
    public static void main(String[] args) {
       //double cardBalance, double interestDue
        double cardBalance = 5000;
        double interestDue= cardBalance * .17 ;
        System.out.println("The interest due after one month is "+ interestDue);
        cardBalance = cardBalance + interestDue;
        interestDue = cardBalance * .17;
        System.out.println("The interest due after two months is " + interestDue);


    }
}
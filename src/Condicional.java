public class Condicional {
    public static void main(String[] args) {
        int launchYear = 2021;
        boolean includedPlan = false;
        double movieNote = 8.1;
        String planType = "normal";

        if (launchYear >= 2022) {
            System.out.println("Lançamentos que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (includedPlan == true || planType.equals("plus") ) {
            System.out.println("Filme liberado!");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}

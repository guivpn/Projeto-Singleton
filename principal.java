public class principal {
    public static void main(String[] args) {
        CaldeiraChocolate caldeiraChocolate = CaldeiraChocolate.getInstancia();

        //Enchendo
        caldeiraChocolate.encher();

        //Fervendo
        caldeiraChocolate.ferver();

        //Drenando
        caldeiraChocolate.drenar();
    }
}

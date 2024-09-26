public class CaldeiraChocolate {
    private boolean vazia;
    private boolean fervida;
    private static CaldeiraChocolate instancia;


    private CaldeiraChocolate() {
        vazia = true;
        fervida = false;
    }
    //Obtendo unica forma
    public static CaldeiraChocolate getInstancia() {
        if(instancia == null) {
            instancia = new CaldeiraChocolate();
        }
        return instancia;
    }

    //Metodos
    
    public void encher() {
        if(vazia) {
            System.out.println("Preenchendo com chocolate e leite.");
        }
    }

    public void ferver() {
        if(vazia == false && fervida == false) {
            System.out.println("Colocando mistura de chocolate e leite em ebulição.");
        }
    }

    public void drenar() {
        if(fervida = true && vazia == false) {
            System.out.println("Drenando mistura.");
        }
    }

}

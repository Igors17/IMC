package aula2;

public class Imc {

    public static void main(String[] args) {

        int peso = 73;
        double altura = 1.74;

        double imc;

        imc = peso / (altura * altura);

        System.out.println("Seu IMC FOI " + imc);

        if (imc >= 18.5) {
            System.out.println("Abaixo  do peso");
        }




    }
}

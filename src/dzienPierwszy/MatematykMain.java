package dzienPierwszy;

public class MatematykMain {

    //psvm
    public static void main(String[] args) {

        Matematyk blondynka = new Matematyk();

//        blondynka.add(5.8, 6666.8);
        double wynikDodawania = blondynka.add(5.8, 6666.8);

        System.out.println("Wynik odejmowania to: ");
        System.out.println(wynikDodawania);

        double subtraction = blondynka.subtraction(10, 3.22);

        System.out.println("A wynik odejmowania to: ");
        System.out.println(subtraction);


    }




}

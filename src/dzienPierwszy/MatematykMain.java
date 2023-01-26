package dzienPierwszy;

public class MatematykMain {

    //psvm
    public static void main(String[] args) {

        Matematyk blondynka = new Matematyk();


        int a = 15;
        int b = 25;
        int c = (a+b);
        int h = 5;
        int d = c*h;
        int x = 2;

        float add = blondynka.add(a,b);
        double multiply = blondynka.multiply(c,h);
        double division = blondynka.division(d,x);




        System.out.println("pole trapezu wynosi:");
        System.out.println(division);










    }




}

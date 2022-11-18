public class Main {
    public static void main(String[] args) {
        //Primera parte
        int resultado;
        resultado = sum(4, 2, 5);
        System.out.println(resultado);

        //Segunda parte
        int incremPuer;
        incremPuer = 1;

        Coche miCoche = new Coche(4);

        incremPuer=miCoche.incrementarPuertas(incremPuer);

        System.out.println("Número de puertas que tiene el objeto (coche): "+incremPuer);
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    int puertas;

    public Coche (int p) {
        puertas=p;
    }

    public int incrementarPuertas(int incremPuer){
        return puertas+incremPuer;
    }

}
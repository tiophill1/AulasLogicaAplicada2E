public class Main {
    public static void main(String[] args) {
        //Laços enquanto - while
        int contador = 0;
        while (contador < 10) {
            System.out.println("Contador = " + contador);
            //Incremento
            contador = contador + 1;
        }
        //laço do para faça - for
        for (int x = 0; x < 10; x++) {
            System.out.println("contador = " + x);
        }
        ///laço faça enquanto - do
        int cont =1;
        do{
            //processo
            System.out.println(cont);
            cont++; //incremento
            }while(cont <= 10);
    }
}
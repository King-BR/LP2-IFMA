public class atv5quest3 {
    public static void main(String[] args) {
        int valores[] = { 12, 25, -1, -53, 6, 9, -32, 36, -15, 629 };
        int par = -1, impar = -1;

        for(int i = 0; i < 10; i++) {
            if(valores[i] % 2 == 0) {
                if(valores[i] > par || par == -1) {
                    par = valores[i];
                }
            } else {
                if(valores[i] < impar || impar == -1) {
                    impar = valores[i];
                }
            }
        }

        System.out.print("\nMaior valor par: ");
        System.out.println(par);
        System.out.print("Menor valor impar: ");
        System.out.println(impar);
    }
}

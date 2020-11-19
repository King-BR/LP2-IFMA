public class atv5quest4 {
    public static void main(String[] args) {
        int vetor1[] = { 18, 2, -1, 33, 61, 9, -32, 16, -15, 9 };
        int vetor2[] = { 12, 25, 10, 5, 60, 19, 52, 36, 5, 62 };
        int vetorSoma[] = new int[10];

        System.out.print("\n");
        for(int i = 0; i < 10; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
            System.out.println(vetorSoma[i]);
        }
    }
}

public class atv3quest2 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 80; i > 40; i--) {
            if(i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println(soma);
    }
}

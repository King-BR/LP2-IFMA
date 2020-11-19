public class atv2quest6 {
    public static void main(String[] args) {
        float premio1 = (float) (780000.00 * 0.46);
        float premio2 = (float) (780000.00 * 0.32);
        float premio3 = (float) (780000.00 - premio1 - premio2);

        System.out.println("O primeiro ganhador receberá: R$ " + premio1);
        System.out.println("O segundo ganhador receberá: R$ " + premio2);
        System.out.println("O terceiro ganhador receberá: R$ " + premio3);
    }
}

public class Main {
    public static void main(String[] args) {
        ContaSimples ana = new ContaSimples(100.00, "123-4");
        ContaSimples roberto = new ContaSimples(2.00, "123-5");

        System.out.println("Saldo da conta de Ana: " + ana.getSaldo());
        System.out.println("Saldo da conta de Roberto: " + roberto.getSaldo());

        ContaSimples.Transferencia(ana, roberto, 50.00);

        System.out.println("Saldo da conta de Ana: " + ana.getSaldo());
        System.out.println("Saldo da conta de Roberto: " + roberto.getSaldo());

    }
}
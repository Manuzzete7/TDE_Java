public class ContaBancariaTeste {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("001", "João");
        ContaBancaria conta2 = new ContaBancaria("002", "Maria");
        conta1.depositar(500);
        conta1.sacar(150);
        conta2.depositar(1000);
        conta2.sacar(300);
        System.out.println("Titular: " + conta1.getTitular() + " | Saldo: R$" + conta1.getSaldo());
        System.out.println("Titular: " + conta2.getTitular() + " | Saldo: R$" + conta2.getSaldo());
    }
}

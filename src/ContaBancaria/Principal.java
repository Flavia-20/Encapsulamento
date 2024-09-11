package ContaBancaria;

public class Principal {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.setNumeroConta("1234");
        conta.titular = "Pedro";
        conta.setSaldo(400);

        System.out.println(conta.getNumeroConta());
        System.out.println(conta.getSaldo());
        System.out.println(conta.titular);;
    }

}

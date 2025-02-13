import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    Scanner teclado = new Scanner(System.in);
    private String nome;
    private int numero;
    private double saldo;
    private String agencia;

    public void nomeCliente(){
        System.out.println("digite seu nome: ");
        nome = teclado.nextLine();
    }
    public void numeroCliente(){
        System.out.println("digite o número da conta: ");
        numero = teclado.nextInt();
    }
    public void saldoCliente(){
        System.out.println("digite sua saldo: ");
        saldo = teclado.nextDouble();
    }
    public void agenciaCliente(){
        System.out.println("digite seu agencia: ");
        agencia = teclado.nextLine();
    }

    public static void main(String[] args) {
       ContaTerminal conta = new ContaTerminal();
       conta.nomeCliente();
       conta.numeroCliente();
       conta.saldoCliente();
       conta.agenciaCliente();
        System.out.println("Olá " + conta.nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo + " ja esta disponivel para saque.");
    }
}
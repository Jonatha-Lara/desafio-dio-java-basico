import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String agencia;
        int conta;
        String nome;
        Double saldo;
        
        System.out.println("Por favor digite o número da AGÊNCIA.");
        agencia = sc.next();
        
        System.out.println("Por favor digite o número da CONTA.");
        conta = sc.nextInt();

        System.out.println("Por favor digite o seu NOME.");
        nome = sc.next();

        System.out.println("Por favor digite o valor do seu primeiro depósito em REAIS R$. ");
        saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nome + ", Obrigado por criar uma conta em nosso banco, sua Agência é: " + agencia +", seu número de conta é: "+ conta +" e seu saldo é R$ " +saldo);
    }
}

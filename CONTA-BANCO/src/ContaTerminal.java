import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor Digite os dados abaixo:");
        
        System.out.println("Nome: ");
        String nome = scanner.next();

        System.out.println("Digite a sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite sua agência no formato XXX-X: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo R$ "+saldo+" já está disponivél para saque.");


    }
}

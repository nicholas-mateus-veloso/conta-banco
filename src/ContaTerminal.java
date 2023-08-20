package src;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta [Tipo: Integer]: ");
        Integer numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da agência [Tipo: String]: ");
        String agencia = scanner.next();

        System.out.print("Por favor, digite o nome [Tipo: String]: ");
        String nomeCliente = scanner.next();

        System.out.print("Por favor, digite o saldo [Tipo: Double - usar \",\"]: ");
        BigDecimal saldo = scanner.nextBigDecimal();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo.setScale(2, RoundingMode.HALF_EVEN) + " já está disponível para saque.");

    }
}
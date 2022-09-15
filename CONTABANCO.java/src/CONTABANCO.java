import java.util.Scanner;

public class CONTABANCO {
    static float deposito;
    static float saque;
    static float SALDOINICIAL = 0.00f;
    static float saldoDisponivel = SALDOINICIAL;
    static StringBuilder sb = new StringBuilder();
    
    static void Depositar() { //MÉTODO DEPÓSITO
    System.out.print("Digite o valor do depósito: R$ : ");
    Scanner in = new Scanner(System.in);
    deposito = in.nextFloat();
        if (deposito >= 0) {
        saldoDisponivel += deposito;
        sb.append("\nDEPÓSITO: \t(+)" + deposito); //+ "\n" + "Saldo disponível no dia: " + saldoDisponivel) SUGESTÃO DE ESTÉTICA
        } else {
            System.out.println("Valor inválido! (valor negativo)");
        }
    }

  static void Sacar() { // MÉTODO SAQUE

    System.out.print("Digite o valor do saque: R$ : ");
    Scanner in = new Scanner(System.in);
    saque = in.nextFloat();
        if (saque >= 0) {
            if (saque <= saldoDisponivel) {
            saldoDisponivel -= saque;
            sb.append("\nSAQUE: \t\t(-)" + saque);
            } else {
            System.out.println("Saldo indisponível.");
            }
            } else {
            System.out.println("Valor inválido! (valor negativo)");
            }
   
    }
    static void Extrato (){ //MÉTODO DO EXTRATO
        System.out.println("\n============= EXTRATO ============");
        System.out.println("Segue o extrato da sua conta: \n" + sb.toString() + "\n\nSeu saldo disponível é de R$" + saldoDisponivel);
        System.out.println("==================================\n");
    }
    
  public static void main(String[] args) {
      
      Scanner in = new Scanner(System.in);  
      
	int opcao;
    do {
      System.out.println("########## MENU ##########");
      System.out.println("1 - Depositar");
      System.out.println("2 - Sacar");
      System.out.println("3 - Saldo");
      System.out.println("4 - Extrato");
      System.out.println("5 - Sair");
      System.out.println("############################\n");
      System.out.print("Digite abaixo a opção desejada: \n");
      opcao = in.nextInt();
      //System.out.println("==========================");

      switch (opcao) {
        case 1:
          Depositar();
          break;
          case 2:
          Sacar();
          break;
          case 3:
          System.out.println("\n --> SEU SALDO É DE R$ : " + saldoDisponivel + " reais<--\n");
          break;
        case 4:
            Extrato();
          break;
        case 5:
            System.out.println("\nSaindo do Sistema...");
        default:
            if(opcao <0) {
                System.out.println("\nOpção informada não disponível no MENU!!\n");
            }if (opcao >5){
                System.out.println("\nOpção informada não disponível no MENU!!\n");
            }else{
                break;
            }
      }
      //System.out.print("\nAperte ENTER para continuar...");
    } while (opcao != 5);
    in.close();
  }
}
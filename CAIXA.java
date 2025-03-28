import java.util.Scanner;
public class Caixa
{
    public static void main()
    {
        Scanner ler = new Scanner (System.in);
        int saldo, operação, valor;
        
        System.out.printf ("\n SELECIONE A OPERAÇÃO DESEJADA:");
        System.out.printf ("\n [1] SAQUE \n [2] DEPÓSITO \n [3] EXIBIR LIMITE");
        operação = ler.nextInt ();
        saldo=84000;

        do
        {
            
        } while ();
          switch (operação)
        {
        case 1:
        System.out.printf ("\n SALDO ATUAL: %d REAIS", saldo);
        System.out.printf ("DIGITE O VALOR A SER SACADO:");
        valor = ler.nextInt();
        if (valor<= 5000)
        {
        if (valor<saldo)
        {
        saldo = saldo - valor;
        System.out.printf ("\n PRONTO.");
        System.out.printf ("\n O VALOR SELECIONADO SERÁ SACADO DENTRO DE ALGUNS INSTANTES.");
        System.out.printf ("\n SEU NOVO SALDO É DE: %d REAIS.", saldo);
        System.out.printf ("\n OPERAÇÃO FINALIZADA");
        }
        else{
        System.out.printf ("\n SALDO INSUFICIENTE.");
        System.out.printf ("\n SEU SALDO ATUAL É DE: %d REAIS.", saldo);
        System.out.printf ("\n OPERAÇÃO CANCELADA.");
        }
    }
    else{
       System.out.printf ("\n LIMITE DIÁRIO EXCEDIDO.");
       System.out.printf ("\n O LIMITE ATUAL PARA  SAQUES ELTRÔNICOS É DE: 3.000 REAIS DIÁRIOS.");
       System.out.printf ("\n OPERAÇÃO CANCELADA."); 
    }
        break;
        
        case 2:
            if (valor<= 5000){
            System.out.printf ("\n SALDO ATUAL: %d REAIS", saldo);
            System.out.printf ("\n DIGITE O VALOR A SER DEPOSITADO:");
            valor = ler.nextInt();
            saldo = saldo + valor;
            System.out.printf ("\n PRONTO.");
            System.out.printf ("\n O VALOR SELECIONADO SERÁ DEPOSITADO DENTRO DE 2 DIAS ÚTEIS.");
            System.out.printf ("\n SEU NOVO SALDO SERÁ DE: %d REAIS.", saldo);
            System.out.printf ("\n OPERAÇÃO FINALIZADA");
            saldo= saldo-valor;
        }
            else{
            System.out.printf ("\n LIMITE DIÁRIO EXCEDIDO.");
            System.out.printf ("\n O LIMITE ATUAL PARA  DEPÓSITOS ELTRÔNICOS É DE: 5.000 REAIS DIÁRIOS.");
            System.out.printf ("\n OPERAÇÃO CANCELADA."); 
            }
        break;
        
        case 3:
     }
}

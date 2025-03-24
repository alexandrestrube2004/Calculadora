import java.util.Scanner;
public class calculadora
{
    public static void main ()
    {
        Scanner ler= new Scanner(System.in);
        int op1, op2, top, r;
        
        System.out.printf ("\n Digite o tipo de operação desejada: \n [1] para Adição \n [2] para subtração \n [3] para multiplicação \n [4] para divisão");
        top= ler.nextInt();
        
        System.out.printf ("\n Digite o operador 1:");
        op1= ler.nextInt();
        
        System.out.printf ("\n Digite o operador 2:");
        op2= ler.nextInt();
        
        switch (top)
        {
            case 1:
            r= op1+op2;
            System.out.printf ("\n A resposta é %d", r);
            break;
            case 2:
            r= op1-op2;
            System.out.printf ("\n A resposta é %d", r);
            break;
            case 3:
            r= op1*op2;
            System.out.printf ("\n A resposta é %d", r);
            break;
            case 4:
                if (op2==0) System.out.printf ("\n Valor inválido!!!");
            r= op1/op2;
            System.out.printf ("\n A resposta é %d", r);
            break;
        }
        
    }
}

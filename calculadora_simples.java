import java.util.Scanner;

public class calculadora_simples {
    public static void main(String[] args){
    Scanner entrada = new Scanner(System.in) ;
    char continuar;

do{
System.out.print ("Olá! Seja bem-vindo\nSelecione o tipo de operação que deseja reaizar(+ , - , * , / , %) :");
String operacao = entrada.nextLine();

System.out.println("Selecione o primeiro número");
double n1 = Double.parseDouble(entrada.nextLine());

System.out.println("Selecione o segundo número");
double n2 = Double.parseDouble(entrada.nextLine());

if(operacao.equals( "+")){
    System.out.println("O resultado da soma: " + (n1+n2));
}
if (operacao.equals( "-")){
    System.out.println("O resultado da subtração: " + (n1-n2));
}

if (operacao.equals( "*")){
    System.out.println("O resultado da multiplicação: " + (n1*n2));
}

if (operacao.equals( "/")){
    System.out.println("O resultado da divisão: " + (n1/n2));
}

if (operacao.equals( "%")){
    System.out.println("O resultado do Módulo: " + (n1%n2));
}
System.out.print("Deseja realizar outra operação ? (s/n) --> ");
continuar =  entrada.nextLine().charAt(0);}
while (continuar == 's'|| continuar == 'S');
System.out.println("Obrigado!");
entrada.close();
}};
    


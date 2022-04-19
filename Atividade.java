import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner dd = new Scanner(System.in);

    // Exercício 1
    int num1, num2;
    System.out.println("");
    System.out.println("Exercício 1");
    System.out.print("Digite um número inteiro: ");
    num1 = dd.nextInt ();
    System.out.print("Digite outro número inteiro: ");
    num2 = dd.nextInt ();
    if (num1 > num2)
      System.out.println("O número " + num1 + " é maior que o número " + num2);
    else 
      System.out.println("O número " + num2 + " é maior que o número " + num1);
    
    // Exercício 2
    float num;
    System.out.println("");
    System.out.println("Exercício 2");
    System.out.print("Digite um número: ");
    num = dd.nextFloat ();
    if (num>0)
      System.out.println("O número " + num + " é positivo!");
    else
      System.out.println("O número " + num + " é negativo!");

    // Exercício 3
    char s;
    System.out.println("");
    System.out.println("Exercício 3");
    System.out.print("Digite seu sexo (Masculino = m) / (Feminino = f): ");
    s = dd.next().charAt(0);
    if (s == 'f')
      System.out.println("Feminino");
    else
      if (s == 'm')
        System.out.println("Masculino");
      else
        System.out.println("Sexo inválido");

    // Exercício 4
    float nota1, nota2, media;
    System.out.println("");
    System.out.println("Exercício 4");
    System.out.print("Digite uma nota: ");
    nota1 = dd.nextFloat ();
    System.out.print("Digite outra nota: ");
    nota2 = dd.nextFloat ();
    media = (nota1 + nota2) / 2;
    if (media >= 7 && media < 10)
      System.out.println("Aprovado! Média = " + media);
    else
      if (media < 7)
        System.out.println("Reprovado! Média = " + media);
      if (media == 10)
        System.out.println("Aprovado com distinção! Média = " + media);

    // Exercício 5
        float n1, n2, n3;
        System.out.println("");
        System.out.println("Exercício 5");
        System.out.print("Digite um número: ");
        n1 = dd.nextFloat ();
        System.out.print("Digite outro número: ");
        n2 = dd.nextFloat ();
        System.out.print("Digite outro número: ");
        n3 = dd.nextFloat ();
        if (n1 > n2 && n1 > n3)
          System.out.print("O maior número digitado é o " + n1);
        else
          if (n2 > n1 && n2 > n3)
            System.out.print("O maior número digitado é o " + n2);
          else
            System.out.print("O maior número digitado é o " + n3);
    
    // Exercício 6
    float numero1, numero2, numero3;
    System.out.println("");
    System.out.println("Exercício 6");
    System.out.print("Digite um número: ");
    numero1 = dd.nextFloat ();
    System.out.print("Digite outro número: ");
    numero2 = dd.nextFloat ();
    System.out.print("Digite outro número: ");
    numero3 = dd.nextFloat ();
    if (numero1 > numero2 && numero1 > numero3)
      if (numero2 > numero3)
        System.out.println("O maior número é o " + numero1 + " e o menor é o " + numero3);
      else
        System.out.println("O maior número é o " + numero1 + " e o menor é o " + numero2);
    else
      if (numero2 > numero1 && numero2 > numero3)
        if (numero1 > numero3)
          System.out.println("O maior número é o " + numero2 + " e o menor é o " + numero3);
        else
          System.out.println("O maior número é o " + numero2 + " e o menor é o " + numero1);
      if (numero3 > numero1 && numero3 > numero2)
        if (numero1 > numero2)
          System.out.println("O maior número é o " + numero3 + " e o menor é o " + numero2);
        else
          System.out.println("O maior número é o " + numero3 + " e o menor é o " + numero1);
    // Exercício 7
    int number1, number2, number3;
    System.out.println("");
    System.out.println("Exercício 7");
    System.out.print("Digite um número: ");
    number1 = dd.nextInt ();
    System.out.print("Digite outro número: ");
    number2 = dd.nextInt ();
    System.out.print("Digite outro número: ");
    number3 = dd.nextInt ();
    if (number1 > number2 && number1 > number3)
      if (number2 > number3)
        System.out.println("Em ordem decrescente: " + number1 + ", " + number2 + ", " + number3);
      else
        System.out.println("Em ordem decrescente: " + number1 + ", " + number3 + ", " + number2);
    else
      if (number2 > number1 && number2 > number3)
        if (number1 > number3)
          System.out.println("Em ordem decrescente: " + number2 + ", " + number1 + ", " + number3);
        else
          System.out.println("Em ordem decrescente: " + number2 + ", " + number3 + ", " + number1);
      if (number3 > number1 && number3 > number2)
        if (number1 > number2)
          System.out.println("Em ordem decrescente: " + number3 + ", " + number1 + ", " + number2);
        else
          System.out.println("Em ordem decrescente: " + number3 + ", " + number2 + ", " + number1);
    
    // Exercício 8
    double salario, reajuste=0, novo_salario;
    System.out.println("");
    System.out.println("Exercício 8");
    System.out.print("Digite o salário de um funcionário: ");
    salario = dd.nextDouble ();
    if (salario <= 280.00){
      reajuste = (salario * 20) / 100;
      novo_salario = salario + reajuste;
      System.out.println("O salário era de R$" + salario + ", o reajuste foi de 20% (R$"+ reajuste + "), passando a ser R$" + novo_salario);
      }
    if (salario > 280.00 && salario <= 700.00){
      reajuste = (salario * 15) / 100;
      novo_salario = salario + reajuste;
      System.out.println("O salário era de R$" + salario + ", o reajuste foi de 15% (R$"+ reajuste + "), passando a ser R$" + novo_salario);
      }
    if (salario > 700 && salario <= 1500){
      reajuste = (salario * 10) / 100;
      novo_salario = salario + reajuste;
      System.out.println("O salário era de R$" + salario + ", o reajuste foi de 10% (R$"+ reajuste + "), passando a ser R$" + novo_salario);
      }
    else{
      reajuste = (salario * 5) / 100;
      novo_salario = salario + reajuste;
      System.out.println("O salário era de R$" + salario + ", o reajuste foi de 5% (R$"+ reajuste + "), passando a ser R$" + novo_salario);
      }
    
    // Exercício 9 
    float nota_1, nota_2, _media;
    System.out.println("");
    System.out.println("Exercício 9");
    System.out.print("Digite uma nota: ");
    nota_1 = dd.nextFloat ();
    System.out.print("Digite a segunda nota: ");
    nota_2 = dd.nextFloat();
    _media = (nota_1 + nota_2) / 2;
    if (_media >= 9){
      System.out.println("Média " + _media + " / Conceito: A");
    }
    if (_media < 9 && _media >= 7.5){
      System.out.println("Média " + _media + " / Conceito: B");
    }
    if (_media < 7.5 && _media >= 6){
      System.out.println("Média " + _media + " / Conceito: C");
    }
    if (_media < 6 && _media >= 4){
      System.out.println("Média " + _media + " / Conceito: D");
    }
    if (_media < 4){
      System.out.println("Média " + _media + " / Conceito: E");
    }

    // Exercício 10
    Scanner dd2 = new Scanner(System.in);
    int valor, valor2, valor3, ced100=0, ced50=0, ced10=0, ced5=0, ced1=0;
    System.out.println("");
    System.out.println("Exercício 10");
    System.out.print("Digite um valor para sacar (Min. 10 / Max. 600): ");
    valor = dd2.nextInt ();
    valor2 = valor;
    if (valor > 10 && valor < 600)
      if (valor >= 100){
        ced100 = valor / 100;
        valor3 = ced100 * 100;
        valor-= valor3;
      }
      if (valor >= 50){
        ced50 = valor / 50;
        valor3 = ced50 * 50;
        valor-= valor3;
      }
      if (valor >= 10){
        ced10 = valor / 10;
        valor3 = ced10 * 10;
        valor-= valor3;
      }
      if (valor >= 5){
        ced5 = valor / 5;
        valor3 = ced5 * 5;
        valor-= valor3;
      }
      if (valor >= 1){
        ced1 = valor / 1;
        valor3 = ced1 * 1;
        valor-= valor3;
      }
      valor2 -= valor;
      System.out.println("Valor sacado: R$"+valor2);
      System.out.println("Notas sacadas:");
      System.out.println("R$ 100 = "+ced100);
      System.out.println("R$ 50 = "+ced50);
      System.out.println("R$ 10 = "+ced10);
      System.out.println("R$ 5 = "+ced5);
      System.out.println("R$ 1 = "+ced1);
  }
}

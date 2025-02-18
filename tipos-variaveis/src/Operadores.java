public class Operadores {
    public static void main(String[] args) {
      /*  boolean variavel = true;
       //invertendo o valor de uma variaevl booleana.
       variavel = !variavel;
       System.out.println(variavel);*/

      //verificando se a condição é verdadeira ou não
       /*int a, b;

       a = 5;
       b = 6;

       String resultado = a==b ? "Verdadeiro" : "Falso"; 
       System.out.println(resultado);*/

       int numero1 = 1;
       int numero2 = 2;

       boolean simNao = numero1 == numero2;

       System.out.println("numeroUm é igual numeroDois?" + simNao);

       simNao = numero1 != numero2;

       System.out.println("numeroUm é diferente numeroDois?" + simNao);


       //comparação de strings
       String nomeUm = "Isak";
       String nomeDois = new String("Isak");

       System.out.println(nomeUm.equals(nomeDois));


       //Utilizando && e || para verificar condições
       boolean condicao1 = true;
       boolean condicao2 = false;

       if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
       }

       if (condicao1 || condicao2) {
            System.out.println("Uma das duas condições é verdadeira");
       }

    }
}

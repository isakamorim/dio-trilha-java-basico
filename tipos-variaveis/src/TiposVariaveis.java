public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        double salarioMinimo = 2500.33; //double com valores quebrados como por exemplo 2.500,33, sempre deve ser representado com um ponto e não virgula.

        int cep = 01070333; //se o int precisa começar com um zero, é necessário alterar para string, pois a variavel int não armazena 0 a esquerda.
        String cepComZero = "09956245"; //exmplo de cep como string.
        System.out.println( cep + "\n"+ cepComZero);

        float pi = 3.14F; //para uum float, precisamos encerrar o número com um "F" para não ser confundido com um double.
        long cpf = 98765432109L; //assim como o long, necessário colocar o "L" no final.

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //casting adicionado como correção do erro para um numero em short ao invés de int.

        //FAZENDO COM QUE UMA VARIAVEL NUNCA MUDE DE VALOR (CONSTANTE)
        final double VALOR_DE_PI = 3.14; //coloque o final no inicio da declaração da váriavel e a nomeie em capslock.

    }
}

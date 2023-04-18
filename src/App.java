import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.flush();

        System.out.println("Sistema de Diagnóstico de IMC");
        //Entradas
        // Nome, altura e peso de uma pessoa
        
        Scanner scanner = new Scanner(System.in);

        //Lendo o nome
        System.out.print("Entre com seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("");

        //Lendo a altura
        System.out.print("Entre com sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("");

        //Lendo o peso
        System.out.print("Entre com seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("");

        scanner.close();

        //Processamento
        // IMC = divide-se o peso do paciente pela sua altura elevada ao quadrado.
        double imc = peso / Math.pow(altura, 2);
        // Diagnóstico 
        //IMC	            CLASSIFICAÇÃO	OBESIDADE (GRAU)
        //MENOR QUE 18,5	MAGREZA	        0
        //ENTRE 18,5 E 24,9	NORMAL	        0
        //ENTRE 25,0 E 29,9	SOBREPESO	    I
        //ENTRE 30,0 E 39,9	OBESIDADE	    II
        //MAIOR QUE 40,0	OBESIDADE GRAVE	III
        //Classificação
        String classificacao = "";
        int grauObesidade = 0;

        if (imc < 18.5) {
            classificacao = "MAGREZA";
            grauObesidade = 0;
        } else if (imc >= 18.5 && imc < 25) {
            classificacao = "NORMAL";
            grauObesidade = 0;
        } else if (imc >= 25 && imc < 30) {
            classificacao = "SOBREPESO";
            grauObesidade = 1;
        } else if (imc >= 30 && imc < 40) {
            classificacao = "OBESIDADE";
            grauObesidade = 2;
        } else {
            classificacao = "OBESIDADE GRAVE";
            grauObesidade = 3;
        }

        //Saídas
        //O funcionário Zé Pedro, da altura 1.75 e peso 85.5
        // %s -> String
        // %d -> Inteiro
        // %f -> Float
        // %n -> Quebra de linha
        System.out.printf("O funcionário %s, da altura %2.2f e peso %3.2f tem o IMC = %2.2f com Diagnóstico %s %d", nome, altura, peso, imc, classificacao, grauObesidade);
    }

}

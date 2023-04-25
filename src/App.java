import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Sistema de Diagnóstico de IMC");
        //Entradas

        Scanner scanner = new Scanner(System.in);

        String nome = lerNome(scanner);
        double altura = lerAltura(scanner);
        double peso = lerPeso(scanner);

        scanner.close();

        //Processamento
        double imc = calcularImc(altura, peso);
        String classificacao = calcularClassificacao(imc);
        int grauObesidade = calcularGrauObesidade(imc);

        //Saídas
        System.out.printf("O funcionário %s, da altura %2.2f e peso %3.2f tem o IMC = %2.2f com Diagnóstico %s %d", nome, altura, peso, imc, classificacao, grauObesidade);
    }

    private static double lerPeso(Scanner scanner) {
        System.out.print("Entre com seu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("");
        return peso;
    }

    private static String lerNome(Scanner scanner) {
        System.out.print("Entre com seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("");
        return nome;
    }

    private static double lerAltura(Scanner scanner) {
        System.out.print("Entre com sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("");
        return altura;
    }

    private static double calcularImc(double altura, double peso) {
        double imc = peso / Math.pow(altura, 2);
        return imc;
    }

    private static String calcularClassificacao(double imc) {
         // Diagnóstico 
        //IMC	            CLASSIFICAÇÃO	OBESIDADE (GRAU)
        //MENOR QUE 18,5	MAGREZA	        0
        //ENTRE 18,5 E 24,9	NORMAL	        0
        //ENTRE 25,0 E 29,9	SOBREPESO	    I
        //ENTRE 30,0 E 39,9	OBESIDADE	    II
        //MAIOR QUE 40,0	OBESIDADE GRAVE	III

        String classificacao;
        if (imc < 18.5) {
            classificacao = "MAGREZA";
        } else if (imc >= 18.5 && imc < 25) {
            classificacao = "NORMAL";
        } else if (imc >= 25 && imc < 30) {
            classificacao = "SOBREPESO";
        } else if (imc >= 30 && imc < 40) {
            classificacao = "OBESIDADE";
        } else {
            classificacao = "OBESIDADE GRAVE";
        }
        return classificacao;
    }

    private static int calcularGrauObesidade(double imc) {
        int grauObesidade;
        if (imc < 18.5) {
            grauObesidade = 0;
        } else if (imc >= 18.5 && imc < 25) {
            grauObesidade = 0;
        } else if (imc >= 25 && imc < 30) {
            grauObesidade = 1;
        } else if (imc >= 30 && imc < 40) {
            grauObesidade = 2;
        } else {
            grauObesidade = 3;
        }
        return grauObesidade;
    }



}


import java.util.Scanner;

public class ConversorTemperaturaIanGustavo2A {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        Boolean continuar = true;

        while (continuar) {
            System.out.println("===Conversor de Temperatura ==");
            System.out.println("1. Celsius");
            System.out.println("2. Fahrenheit");
            System.out.println("3. Kelvin");
            System.out.println("4. Sair");
            System.out.println("Escolha a unidade de origem (1-4)");
            int escolha = s1.nextInt();

            if (escolha == 4) {
                continuar = false;
                continue;
            }
            if (escolha < 1 || escolha > 4) {
                System.out.println("Opcao invalida");
                continue;
            }
            System.out.println("Digite o valor da temperatura: ");
            double graus = s1.nextDouble();

            switch (escolha) {
                case 1:
                    Celsius c1 = new Celsius(graus);
                    System.out.println("*******************");
                    System.out.println("resultado");
                    System.out.println("Fahrenheit" + c1.paraFahrenheit());
                    System.out.println("Kelvin" + c1.paraKelvin());
                    System.out.println("*******************");
                    break;
                case 2:
                    Fahrenheit fahrenheit = new Fahrenheit(graus);
                    System.out.println("*******************");
                    System.out.println("resultado");
                    System.out.println("Fahrenheit" + fahrenheit.paraCelsius());
                    System.out.println("Kelvin" + fahrenheit.paraKelvin());
                    System.out.println("*******************");
                    break;
                case 3:
                    Kelvin kelvin = new Kelvin(graus);
                    System.out.println("*******************");
                    System.out.println("resultado");
                    System.out.println("Fahrenheit" + kelvin.paraCelsius());
                    System.out.println("Kelvin" + kelvin.paraFahrenheit());
                    System.out.println("*******************");
                    break;

            }
        }
        System.out.println("Programa encerrado!");
        s1.close();
    }
}

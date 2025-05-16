//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o primeiro parametro: ");

            int parametro1 = scan.nextInt();
        System.out.println("Digite o segundo parametro: ");
            int parametro2 = scan.nextInt();

            try{
                contar(parametro1, parametro2);

            }catch(ParametrosInvalidosException ex) {
                System.out.println("O segundo parametro deve ser maior que o primeiro!");
            }
        }

    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message) {
            super(message);
        }
    }

        static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
            if(parametro1 > parametro2) {
                throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro!");
            }else{
                int contagem = parametro2 - parametro1;
                for(int i = 0; i < contagem; i++) {
                    System.out.println("Imprimindo o numero " + (i + 1));
                }
            }


        }


    }

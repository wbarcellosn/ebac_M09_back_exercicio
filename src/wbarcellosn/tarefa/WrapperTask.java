/**
 * @author winic
 */
package wbarcellosn.tarefa;

import java.util.Scanner;

public class WrapperTask {

    Scanner scanner = new Scanner(System.in);

    int primitiveNumber;
    Integer wrapperNumber;

    public static void main(String[] args) {
        WrapperTask conversion = new WrapperTask();

        System.out.println("\n**************************************************\n");
        System.out.println("Início do programa\n");
        conversion.setPrimitiveNumber();
        System.out.println("\nEste é o número com o tipo int: " + conversion.primitiveNumber);
        conversion.convertToWrapper();
        System.out.println("Este é o número encapsulado em um wrapper Integer: " + conversion.wrapperNumber);
        System.out.println("\nFim do programa");
        System.out.println("\n**************************************************");
    }

    public void setPrimitiveNumber() {
        System.out.println("Digite abaixo um número inteiro");
        this.primitiveNumber = scanner.nextInt();
    }

    public void convertToWrapper() {
        this.wrapperNumber = this.primitiveNumber;
    }
}

package excercise1;

import java.io.IOException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String Input = "";
        System.out.println("Ingresar c para salir");
        SystemCommunication SysCom = new SystemCommunication();
        while (!Input.equals("c"))
        {
            System.out.println("Ingrese un mensaje o '1' si desea recibir un mensaje");
            Input = scan.nextLine();
            if (Input.equals("1")) {
                System.out.println("Esperando el mensaje...");
                System.out.println(SC.ReceiveMessage());
            } else if (!Input.equals("c")) {
                SysCom.SendMessage(Input);
            }
        }
    }
}

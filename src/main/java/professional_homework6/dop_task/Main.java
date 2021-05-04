package professional_homework6.dop_task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String login;
        String password;

        while (true) {
            System.out.println("login: ");
            if (sc.hasNext("[a-zA-Z]+")) {
               login = sc.nextLine();
            } else {
                System.out.println("invalid username");
                sc.nextLine();
                continue;
            }
            System.out.println("password: ");
            if (sc.hasNext("[a-z-A-Z0-9]+")) {
                password = sc.nextLine();
            } else {
                System.out.println("invalid password");
                sc.nextLine();
                continue;
            }
            break;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("login: ").append(login).append("\n").append("password: ").append(password);
        System.out.println(sb.toString());

    }
}

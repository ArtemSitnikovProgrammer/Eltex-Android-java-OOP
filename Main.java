import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {

        ArrayList<User> userListOriginal = new ArrayList<>();
        ArrayList<User> userListIsFile = new ArrayList<>();

        FileWriter nFile = new FileWriter("userList.txt");


        for (int i = 0; i <= 10; i++) {
            userListOriginal.add(new Individual("individual", "NSK", "89831344087", "Manager"));
        }

        userListOriginal.forEach(user -> {
            try {
                nFile.write(user.getName() + " ");
                nFile.write(user.getAddress() + " ");
                nFile.write(user.getPhoneNumber() + "\n");


            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        nFile.close();

        FileReader fr = new FileReader("userList.txt");
        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()) {

            String[] lineSplit = scan.nextLine().split(" ");
            userListIsFile.add(new Individual(lineSplit[0], lineSplit[1], lineSplit[2]));

        }
        fr.close();

        userListOriginal.forEach(System.out::println);
        System.out.println();
        userListIsFile.forEach(System.out::println);

        for (int i = 0; i < userListIsFile.size(); i++) {
            System.out.println(userListOriginal.get(i));
            System.out.println(ENV.compare(userListOriginal.get(i), userListIsFile.get(i)));
        }

    }

}
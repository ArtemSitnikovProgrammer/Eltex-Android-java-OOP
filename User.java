import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


class ENV {
    static int ID = 0;

    static boolean compare(User a, User b) {

        return a.getId() == b.getId() &
                a.getName().equals(b.getName()) &
                a.getAddress().equals(b.getAddress()) &
                a.getPhoneNumber().equals(b.getPhoneNumber());
    }

}

abstract class User {

    //private static ArrayList<User> userListOriginal = new ArrayList<>();
    //private static ArrayList<User> userListIsFile = new ArrayList<>();

    private int id;
    private String name;
    private String address;
    private String phoneNumber;
//    private int age;
//    private String gender;

    public User() {
        id = ENV.ID;
        ENV.ID++;

        name = "";
        address = "";
        phoneNumber = "";

    }

    public User(String name, String address, String phoneNumber) {
        id = ENV.ID;
        ENV.ID++;

        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public User(int id, String name, String address, String phoneNumber) {
        this.id = id;
        ENV.ID++;

        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    public static void wtiteToFile() {
//        try {
//            FileWriter nFile = new FileWriter("userList.txt");
//
//            userListOriginal.forEach(user -> {
//                nFile.write(user.getName() + " ");
//                nFile.write(user.getAddress() + " ");
//                nFile.write(user.getPhoneNumber() + "\n");
//            });
//            nFile.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }

//    public static ArrayList<User> readToFile() {
//        FileReader fr = new FileReader("userList.txt");
//        Scanner scan = new Scanner(fr);
//
//        while (scan.hasNextLine()) {
//
//            String[] lineSplit = scan.nextLine().split(" ");
//            userListIsFile.add(new Individual(lineSplit[0], lineSplit[1], lineSplit[2]));
//
//        }
//        fr.close();
//
//        return userListIsFile;
//    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", ";
    }
}

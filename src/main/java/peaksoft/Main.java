package peaksoft;

import peaksoft.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Nuriza","Abdillaeva",(byte)25);
        userService.saveUser("Erbol","Anarbaev",(byte)26);

       // userService.removeUserById(1);

        userService.getAllUsers().forEach(System.out::println);

       // userService.cleanUsersTable();
        //userService.dropUsersTable();

        System.out.println(userService.existsByFirstName("Erbol"));


    }
}

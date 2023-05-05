package Main;

import Entitie.User;
import Repository.UserRepository;

public class Main {

    static UserRepository userRepository = new UserRepository();

    public static void main(String[] args) {

        //2 Users created
        User user1 = new User();
        user1.setId(userRepository.idcont());
        user1.setName("Jardel");
        user1.setAge(25);
        user1.setEmail("jardel@email.com");
        userRepository.create(user1);

        User user2 = new User();
        user2.setId(userRepository.idcont());
        user2.setName("Karina");
        user2.setAge(26);
        user2.setEmail("karina@email.com");

        userRepository.create(user2);

        // Users listing
        userlisting();

        //Update User "Jardel" at new age
        User user3 = new User();
        int idUpdate = 0;
        user3.setName("Jardel");
        user3.setAge(22);
        user3.setEmail("jardel@email.com");
        userRepository.update(idUpdate, user3);

        // Users Update listing
        userlisting();

        //User "Jardel" deleting
        int userdelete = 0;
        userRepository.delete(userdelete);

        // User listing with "id = 0" exclude
        userlisting();

    }

    private static void userlisting() {

        System.out.println("=============");
        System.out.println("List of Users");
        System.out.println("=============");
        var list = userRepository.read();
        for (User user : list) {

            System.out.println("Id: " + user.getId() +
                    " Name: " + user.getName() +
                    " Age: " + user.getAge() +
                    " Email: " + user.getEmail());
        }
    }
}
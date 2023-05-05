package Repository;

import Entitie.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRepositoryTest {

    @Test
    public void create_creatingElementSizeWillIncreaseOneUnit(){
        UserRepository userRepository = new UserRepository();
        int AtualSize = UserRepository.userList.size();
        User user = new User();
        user.setId(userRepository.idcont());
        user.setName("Jardel");
        user.setAge(25);
        user.setEmail("jardel@email.com");
        userRepository.create(user);
        Assertions.assertEquals(AtualSize + 1, UserRepository.userList.size());
    }

    @Test
    void read_createdListEqualReturnedListMethod() {
        UserRepository userRepository = new UserRepository();
        User user = new User();
        user.setId(userRepository.idcont());
        user.setName("Jardel");
        user.setAge(25);
        user.setEmail("jardel@email.com");
        userRepository.create(user);
        var listTest= UserRepository.userList;
        Assertions.assertEquals(listTest,userRepository.read());
    }

    @Test
    void update_updateUserReturnsProposedDataforUpdate() {
        UserRepository userRepository = new UserRepository();
        User user = new User();
        int id = 0;
        user.setId(userRepository.idcont());
        user.setName("Jardel");
        user.setAge(25);
        user.setEmail("jardel@email.com");
        userRepository.create(user);

        User user1 = new User();
        user1.setName("Jardel");
        user1.setAge(22);
        user1.setEmail("jardel@email.com");
        userRepository.update(id, user1);
        Assertions.assertEquals(user1,UserRepository.userList.get(0));

    }

    @Test
    void delete_DeletingElementSizeListDecrementsOneUnit() {
        UserRepository userRepository = new UserRepository();
        User user = new User();
        user.setId(userRepository.idcont());
        user.setName("Jardel");
        user.setAge(25);
        user.setEmail("jardel@email.com");
        userRepository.create(user);
        int AtualSize = UserRepository.userList.size();
        userRepository.delete(0);
        Assertions.assertEquals(AtualSize - 1, UserRepository.userList.size());
    }


}


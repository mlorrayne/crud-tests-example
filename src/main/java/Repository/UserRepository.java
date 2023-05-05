package Repository;

import Entitie.User;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {

    public static ArrayList<User> userList = new ArrayList<>();

    @Override
    public void create(User user) {
        userList.add(user);
    }

    @Override
    public List<User> read() {
        return userList;
    }

    @Override
    public void update(int id, User user) {
        userList.set(id, user);
    }

    @Override
    public void delete(int id) {
        userList.remove(id);
    }

    @Override
    public int idcont() {
        return (int) userList.stream().count();
    }
}


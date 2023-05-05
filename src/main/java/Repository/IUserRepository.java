package Repository;

import Entitie.User;

import java.util.List;

public interface IUserRepository {

    public void create(User user);
    public List<User> read();
    public void update(int id, User user);
    public void delete(int id);
    public int idcont();

}

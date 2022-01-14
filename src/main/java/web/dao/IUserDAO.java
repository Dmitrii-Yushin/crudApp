package web.dao;

import web.models.User;

import java.util.List;

public interface IUserDAO {

    List<User> index();

    User show(long id);

    void save(User user);

    void update(long id, User user);

    void delete(long id);
}

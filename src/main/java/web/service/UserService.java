package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.models.User;

import java.util.List;
@Service
public class UserService implements IUserService {

    @Autowired
    UserDAO userDAO;

    @Transactional(readOnly = true)
    @Override
    public List<User> index() {
        return userDAO.index();
    }
    @Transactional(readOnly = true)
    @Override
    public User show(long id) {
        return userDAO.show(id);
    }
    @Transactional
    @Override
    public void save(User user) {
        userDAO.save(user);
    }
    @Transactional
    @Override
    public void update(long id, User user) {
        userDAO.update(id, user);
    }
    @Transactional
    @Override
    public void delete(long id) {
        userDAO.delete(id);
    }
}

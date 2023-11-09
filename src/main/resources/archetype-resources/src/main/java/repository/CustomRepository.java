package ${package}.repository;

import ${package}.model.User;

public interface CustomRepository {

    public void saveUser(User user);

    public User findUserByUserName(String userName);

    public long updateUser(User user);

    public void deleteUserById(Long id);

}

package ${package}.repository;

import ${package}.model.User;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by summer on 2017/5/5.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomRepositoryTest {

    @Autowired
    private CustomRepository customRepository;

    @Test
    public void testSaveUser() throws Exception {
        User user = new User();
        user.setId(2l);
        user.setUserName("user1");
        user.setPassWord("fffooo123");
        customRepository.saveUser(user);
    }

    @Test
    public void findUserByUserName() {
        User user = customRepository.findUserByUserName("user1");
        assertEquals("user1", user.getUserName());
    }

    @Test
    public void updateUser() {
        User user = new User();
        user.setId(2l);
        user.setUserName("天空");
        user.setPassWord("fffxxxx");
        customRepository.updateUser(user);
    }

    @Test
    public void deleteUserById() {
        customRepository.deleteUserById(1l);
    }

}

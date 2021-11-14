package test;

import com.yym.dao.userMapper;
import com.yym.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Springtest {
    @Test
    public void test01() throws IOException {
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123");
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sessionFactory.openSession();
        userMapper mapper = sqlSession.getMapper(userMapper.class);
        /*List<User> userList = mapper.fandAll(user);*/
       /* User user1 = mapper.fandByuser(user);
        System.out.println(user1);*/
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        List<User> list1 = mapper.fandByIds(list);
        System.out.println(list1);
    }

}


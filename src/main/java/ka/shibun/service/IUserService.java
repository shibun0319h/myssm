package ka.shibun.service;

import ka.shibun.domain.User;

import java.util.List;

/**
 * @author shibun
 * @create 2019/3/26
 * @since 1.0.0
 */
public interface IUserService {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    User selectByPrimaryKey(Long id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}
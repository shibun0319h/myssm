package ka.shibun.service.impl;

import ka.shibun.domain.User;
import ka.shibun.mapper.UserMapper;
import ka.shibun.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author shibun
 * @create 2019/3/26
 * @since 1.0.0
 */
@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    @Transactional
    public int deleteByPrimaryKey(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public User selectByPrimaryKey(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    @Override
    @Transactional
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }
}
package io.github.herouu.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.herouu.user.entity.User;
import io.github.herouu.user.mapper.UserMapper;
import io.github.herouu.user.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户业务实现类
 *
 * @author pangu
 */
@Transactional
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}

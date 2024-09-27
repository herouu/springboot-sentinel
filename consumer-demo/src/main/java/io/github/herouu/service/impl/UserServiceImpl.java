package io.github.herouu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.github.herouu.api.entity.User;
import io.github.herouu.mapper.UserMapper;
import io.github.herouu.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * 用户业务实现类
 *
 * @author pangu
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}

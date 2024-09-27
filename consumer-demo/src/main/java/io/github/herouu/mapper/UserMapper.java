package io.github.herouu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.herouu.api.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户mapper类
 *
 * @author pangu
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}

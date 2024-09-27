package io.github.herouu.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.herouu.api.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单mapper
 *
 * @author pangu
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}

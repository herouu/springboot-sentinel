package io.github.herouu.api.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户表
 *
 * @author pangu
 */
@Data
@TableName("demo_user")
public class User {
	@TableId
	Integer id;
	String name;
	int age;
}

package cn.zc.user.service.impl;

import cn.zc.user.mapper.UserMapper;
import cn.zc.user.service.UserService;
import cn.zc.user.entity.User;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}

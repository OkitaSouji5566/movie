package com.shanzhu.cm.mapper;

import com.shanzhu.cm.domain.LoginUser;
import com.shanzhu.cm.domain.SysUser;
import com.shanzhu.cm.domain.vo.SysUserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 用户相关 持久层
 *
 * @author: ShanZhu
 * @date: 2023-12-11
 */
@Mapper
public interface SysUserMapper {

    List<SysUser> findAllUsers(SysUser sysUser);

    SysUser findUserById(Long id);

    SysUser findUserByName(String userName);

    int addUser(SysUser sysUser);

    int updateUser(SysUser sysUser);

    int deleteUser(Long id);

    LoginUser findLoginUser(SysUserVo sysUserVo);

    List<Long> checkUserNameUnique(String userName);
}

package com.talenco.tasksystem.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 用户模型
 *
 * @author echcz
 * @date 2019-04-16 22:28:06
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    /**
     * 用户登录信息
     */
    private UserKey key;
    /**
     * 用户实体信息
     */
    private UserDesc desc;
}

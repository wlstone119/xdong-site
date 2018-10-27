package com.xdong.model.entity.userrole;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 角色与菜单对应关系
 * </p>
 *
 * @author wanglei
 * @since 2018-04-30
 */
@TableName("sys_role_menu")
public class SysRoleMenuDo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long              id;
    /**
     * 角色ID
     */
    @TableField("role_id")
    private Long              roleId;
    /**
     * 菜单ID
     */
    @TableField("menu_id")
    private Long              menuId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        return "SysRoleMenu{" + ", id=" + id + ", roleId=" + roleId + ", menuId=" + menuId + "}";
    }
}

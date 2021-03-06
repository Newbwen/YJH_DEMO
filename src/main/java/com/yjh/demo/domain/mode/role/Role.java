package com.yjh.demo.domain.mode.role;

import com.yjh.demo.core.enums.EnableStatus;
import com.yjh.demo.core.id.ConcurrencySafeEntity;
import com.yjh.demo.domain.mode.appkey.AppKey;
import com.yjh.demo.domain.mode.permission.Permission;

import java.util.Date;
import java.util.List;

/**
 * Created by YJH on 2016/3/30.
 */
public class Role extends ConcurrencySafeEntity {

    private String name;                    //角色名称
    private String description;                //角色描述
    private List<Permission> permissions;   //角色包含的权限集合
    private AppKey appKey;                  //应用标识
    private EnableStatus status;            //状态

    public void changeName(String name) {
        this.name = name;
    }

    public void changeDescription(String description) {
        this.description = description;
    }

    public void changePermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public void changeAppKey(AppKey appKey) {
        this.appKey = appKey;
    }

    public void changeStatus(EnableStatus status) {
        this.status = status;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    private void setAppKey(AppKey appKey) {
        this.appKey = appKey;
    }

    private void setStatus(EnableStatus status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public AppKey getAppKey() {
        return appKey;
    }

    public EnableStatus getStatus() {
        return status;
    }

    public Role() {
        super();
    }

    public Role(String name, String description, List<Permission> permissions, AppKey appKey, EnableStatus status) {
        this.name = name;
        this.description = description;
        this.permissions = permissions;
        this.appKey = appKey;
        this.status = status;
        this.setUpdateDate(new Date());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (name != null ? !name.equals(role.name) : role.name != null) return false;
        if (description != null ? !description.equals(role.description) : role.description != null) return false;
        if (permissions != null ? !permissions.equals(role.permissions) : role.permissions != null) return false;
        if (appKey != null ? !appKey.equals(role.appKey) : role.appKey != null) return false;
        return status == role.status;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (permissions != null ? permissions.hashCode() : 0);
        result = 31 * result + (appKey != null ? appKey.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}

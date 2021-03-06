package com.yjh.demo.application.user.command;

import com.yjh.demo.application.shared.command.SharedCommand;
import com.yjh.demo.core.enums.EnableStatus;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by YJH on 2016/3/30 0030.
 */
public class EditUserCommand extends SharedCommand {

    @NotNull(message = "{user.roles.NotNull.message}")
    private List<String> roles;            //用户角色
    @NotBlank(message = "{user.appKey.NotBlank.message}")
    private String appKey;          //应用标识
    @NotNull(message = "{user.status.NotNull.message}")
    private EnableStatus status;     //状态

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public EnableStatus getStatus() {
        return status;
    }

    public void setStatus(EnableStatus status) {
        this.status = status;
    }
}

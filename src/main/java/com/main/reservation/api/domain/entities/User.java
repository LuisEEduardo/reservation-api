package com.main.reservation.api.domain.entities;

import java.util.Objects;

public class User extends Entity {

    private String name;
    private String nickName;
    private String authUser;
    private TypeUser type;
    
    public User(String name, String nickName, String authUser, TypeUser type) {
        this.name = name;
        this.nickName = nickName;
        this.authUser = authUser;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAuthUser() {
        return authUser;
    }

    public void setAuthUser(String authUser) {
        this.authUser = authUser;
    }

    public TypeUser getType() {
        return type;
    }

    public void setType(TypeUser type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        if (!super.equals(o)) return false;

        if (!Objects.equals(name, user.name)) return false;
        if (!Objects.equals(nickName, user.nickName)) return false;
        if (!Objects.equals(authUser, user.authUser)) return false;
        return type == user.type;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        result = 31 * result + (authUser != null ? authUser.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}

package com.main.reservation.api.domain.entities;

import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public abstract class Entity {
    private UUID id;
    private Date createdAt;
    private Date updateAt;
    private Boolean status;

    public Entity() {
        this.id = UUID.randomUUID();
        this.createdAt = new Date();
        this.updateAt = null;
        this.status = true;
    }

    public UUID getId() {
        return id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entity entity)) return false;

        if (!Objects.equals(id, entity.id)) return false;
        if (!Objects.equals(createdAt, entity.createdAt)) return false;
        if (!Objects.equals(updateAt, entity.updateAt)) return false;
        return Objects.equals(status, entity.status);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updateAt != null ? updateAt.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}

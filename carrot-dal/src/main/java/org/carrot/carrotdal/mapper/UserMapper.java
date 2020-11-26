package org.carrot.carrotdal.mapper;

import org.carrot.carrotapi.entity.User;

public interface UserMapper {
    User findByName(String name);
}

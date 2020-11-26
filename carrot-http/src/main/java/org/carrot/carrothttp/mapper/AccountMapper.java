package org.carrot.carrothttp.mapper;

import org.carrot.carrotapi.entity.Account;
import org.carrot.carrotapi.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author zhonglishen
 */
@Mapper
public interface AccountMapper {
    AccountMapper INSTANCE = Mappers.getMapper(AccountMapper.class);

    @Mapping(source = "accountId",target = "id")
    @Mapping(source = "name",target = "name")
    User accountToUser(Account account);
}

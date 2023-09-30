package org.paperless.services.mapper.impl;

import org.openapitools.jackson.nullable.JsonNullable;
import org.paperless.persistence.entity.UserInfo;
import org.paperless.services.dtos.UserInfoDTO;
import org.paperless.services.mapper.UserInfoMapper;
import org.springframework.stereotype.Component;

@Component
public class UserInfoMapperImpl extends AbstractMapper<UserInfo, UserInfoDTO> implements UserInfoMapper {
    @Override
    public UserInfoDTO toDto(UserInfo userInfo) {
        return UserInfoDTO.builder()
                .username(JsonNullable.of(userInfo.getUsername()))
                .password(JsonNullable.of(userInfo.getPassword()))
                .build();
    }

    @Override
    public UserInfo toEntity(UserInfoDTO userInfoDTO) {
        return UserInfo.builder()
                .username(userInfoDTO.getUsername().get())
                .password(userInfoDTO.getPassword().get())
                .build();
    }
}

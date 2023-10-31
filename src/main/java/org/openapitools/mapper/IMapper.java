package org.openapitools.mapper;

import org.openapitools.jackson.nullable.JsonNullable;

public interface IMapper<Entity, Dto> {
    Entity toEntity(Dto dto);
    Dto toDto(Entity entity);


}

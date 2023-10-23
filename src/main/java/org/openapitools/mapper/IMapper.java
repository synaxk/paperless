package org.openapitools.mapper;

public interface IMapper<Entity, Dto> {
    Entity toEntity(Dto dto);
    Dto toDto(Entity entity);


}

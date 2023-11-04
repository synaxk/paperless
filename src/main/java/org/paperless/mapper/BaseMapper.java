package org.paperless.mapper;

import org.openapitools.jackson.nullable.JsonNullable;

public interface BaseMapper<Entity, Dto> {
    Entity dtoToEntity(Dto dto);
    Dto entityToDto(Entity entity);

/*
    default String map(JsonNullable<String> value) {

        if(value == null || !value.isPresent()) {
            return null;
        }

        return value.get();
    }

    default JsonNullable<String> map(String value) {
        return JsonNullable.of(value);
    }
*/


    default <T> T map(JsonNullable<T> value) {
        if(value == null || !value.isPresent()) {
            return null;
        }

        return value.get();
    }

    default <T> JsonNullable<T> map(T value) {
        return JsonNullable.of(value);
    }


}

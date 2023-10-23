package org.openapitools.mapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Document;
import org.openapitools.persistence.entities.DocumentsDocument;
import org.springframework.util.ObjectUtils;

import java.time.OffsetDateTime;
import java.util.Objects;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DocumentsDocumentMapperTest {
/*

    @Mock
    private DocumentsDocument documentEntity;

    @Mock
    private Document documentDto;
*/

    @Test
    void toDTO() {
        Document documentDto = Document.builder().id(1).title(JsonNullable.of("test")).build();
        DocumentsDocument documentEntity = DocumentsDocument.builder().id(1).title("test").build();

    }

    @Test
    void toEntity() {
    }
}
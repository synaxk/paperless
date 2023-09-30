package org.paperless.persistence.entity;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Correspondent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long matchingAlgorithm;
    private boolean isInsensitive;
    private long documentCount;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime lastCorrespondence;

    @OneToMany(mappedBy = "correspondent")
    private List<Document> documents;
}

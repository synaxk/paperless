package at.fhtw.swkom.paperless.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DocumentType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private long matchingAlgorithm;
    private boolean isInsensitive;

    @OneToMany(mappedBy = "documentType")
    private List<Document> documents;
}

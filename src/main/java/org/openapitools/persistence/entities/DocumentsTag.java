package org.openapitools.persistence.entities;

import javax.persistence.*;
import java.util.Set;


@Entity
public class DocumentsTag {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(
            name = "primary_sequence",
            sequenceName = "primary_sequence",
            allocationSize = 1,
            initialValue = 10000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "primary_sequence"
    )
    private Integer id;

    @Column(nullable = false, length = 128)
    private String name;

    @Column(nullable = false, length = 256)
    private String match;

    @Column(nullable = false)
    private Integer matchingAlgorithm;

    @Column(nullable = false)
    private Boolean isInsensitive;

    @Column(nullable = false)
    private Boolean isInboxTag;

    @Column(nullable = false, length = 7)
    private String color;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private AuthUser owner;

    @OneToMany(mappedBy = "tag")
    private Set<DocumentsDocumentTags> tagDocumentsDocumentTagses;

    @OneToMany(mappedBy = "tag")
    private Set<PaperlessMailMailruleAssignTags> tagPaperlessMailMailruleAssignTagses;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(final String match) {
        this.match = match;
    }

    public Integer getMatchingAlgorithm() {
        return matchingAlgorithm;
    }

    public void setMatchingAlgorithm(final Integer matchingAlgorithm) {
        this.matchingAlgorithm = matchingAlgorithm;
    }

    public Boolean getIsInsensitive() {
        return isInsensitive;
    }

    public void setIsInsensitive(final Boolean isInsensitive) {
        this.isInsensitive = isInsensitive;
    }

    public Boolean getIsInboxTag() {
        return isInboxTag;
    }

    public void setIsInboxTag(final Boolean isInboxTag) {
        this.isInboxTag = isInboxTag;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public AuthUser getOwner() {
        return owner;
    }

    public void setOwner(final AuthUser owner) {
        this.owner = owner;
    }

    public Set<DocumentsDocumentTags> getTagDocumentsDocumentTagses() {
        return tagDocumentsDocumentTagses;
    }

    public void setTagDocumentsDocumentTagses(
            final Set<DocumentsDocumentTags> tagDocumentsDocumentTagses) {
        this.tagDocumentsDocumentTagses = tagDocumentsDocumentTagses;
    }

    public Set<PaperlessMailMailruleAssignTags> getTagPaperlessMailMailruleAssignTagses() {
        return tagPaperlessMailMailruleAssignTagses;
    }

    public void setTagPaperlessMailMailruleAssignTagses(
            final Set<PaperlessMailMailruleAssignTags> tagPaperlessMailMailruleAssignTagses) {
        this.tagPaperlessMailMailruleAssignTagses = tagPaperlessMailMailruleAssignTagses;
    }

}

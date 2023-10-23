package org.openapitools.persistence.entities;

import javax.persistence.*;
import java.util.Set;


@Entity
public class DocumentsSavedview {

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

    @Column(nullable = false)
    private Boolean showOnDashboard;

    @Column(nullable = false)
    private Boolean showInSidebar;

    @Column(length = 128)
    private String sortField;

    @Column(nullable = false)
    private Boolean sortReverse;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private AuthUser owner;

    @OneToMany(mappedBy = "savedView")
    private Set<DocumentsSavedviewfilterrule> savedViewDocumentsSavedviewfilterrules;

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

    public Boolean getShowOnDashboard() {
        return showOnDashboard;
    }

    public void setShowOnDashboard(final Boolean showOnDashboard) {
        this.showOnDashboard = showOnDashboard;
    }

    public Boolean getShowInSidebar() {
        return showInSidebar;
    }

    public void setShowInSidebar(final Boolean showInSidebar) {
        this.showInSidebar = showInSidebar;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(final String sortField) {
        this.sortField = sortField;
    }

    public Boolean getSortReverse() {
        return sortReverse;
    }

    public void setSortReverse(final Boolean sortReverse) {
        this.sortReverse = sortReverse;
    }

    public AuthUser getOwner() {
        return owner;
    }

    public void setOwner(final AuthUser owner) {
        this.owner = owner;
    }

    public Set<DocumentsSavedviewfilterrule> getSavedViewDocumentsSavedviewfilterrules() {
        return savedViewDocumentsSavedviewfilterrules;
    }

    public void setSavedViewDocumentsSavedviewfilterrules(
            final Set<DocumentsSavedviewfilterrule> savedViewDocumentsSavedviewfilterrules) {
        this.savedViewDocumentsSavedviewfilterrules = savedViewDocumentsSavedviewfilterrules;
    }

}

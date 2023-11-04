package org.paperless.persistence.entities;

import javax.persistence.*;

import java.time.OffsetDateTime;
import java.util.Set;


@Entity
public class AuthUser {

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
    private String password;

    @Column
    private OffsetDateTime lastLogin;

    @Column(nullable = false)
    private Boolean isSuperuser;

    @Column(nullable = false, length = 150)
    private String username;

    @Column(nullable = false, length = 150)
    private String firstName;

    @Column(nullable = false, length = 150)
    private String lastName;

    @Column(nullable = false, length = 254)
    private String email;

    @Column(nullable = false)
    private Boolean isStaff;

    @Column(nullable = false)
    private Boolean isActive;

    @Column(nullable = false)
    private OffsetDateTime dateJoined;

    @OneToMany(mappedBy = "user")
    private Set<AuthUserGroups> userAuthUserGroupses;

    @OneToMany(mappedBy = "owner")
    private Set<CorrespondentEntity> ownerCorrespondentEntities;

    @OneToMany(mappedBy = "owner")
    private Set<DocumenttypeEntity> ownerDocumenttypeEntities;

    @OneToMany(mappedBy = "owner")
    private Set<StoragepathEntity> ownerStoragepathEntities;

    @OneToMany(mappedBy = "owner")
    private Set<TagEntity> ownerTagEntities;

    @OneToMany(mappedBy = "user")
    private Set<UisettingsEntity> userUisettingsEntities;

    @OneToMany(mappedBy = "owner")
    private Set<SavedviewEntity> ownerSavedviewEntities;

    @OneToMany(mappedBy = "owner")
    private Set<PaperlessMailMailaccount> ownerPaperlessMailMailaccounts;

    @OneToMany(mappedBy = "owner")
    private Set<DocumentEntity> ownerDocumentEntities;

    @OneToMany(mappedBy = "user")
    private Set<NoteEntity> userNoteEntities;

    @OneToMany(mappedBy = "owner")
    private Set<PaperlessMailMailrule> ownerPaperlessMailMailrules;

    @OneToMany(mappedBy = "user")
    private Set<AuthUserUserPermissions> userAuthUserUserPermissionses;

    @OneToMany(mappedBy = "user")
    private Set<AuthtokenToken> userAuthtokenTokens;

    @OneToMany(mappedBy = "owner")
    private Set<PaperlessMailProcessedmail> ownerPaperlessMailProcessedmails;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public OffsetDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(final OffsetDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Boolean getIsSuperuser() {
        return isSuperuser;
    }

    public void setIsSuperuser(final Boolean isSuperuser) {
        this.isSuperuser = isSuperuser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public Boolean getIsStaff() {
        return isStaff;
    }

    public void setIsStaff(final Boolean isStaff) {
        this.isStaff = isStaff;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(final Boolean isActive) {
        this.isActive = isActive;
    }

    public OffsetDateTime getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(final OffsetDateTime dateJoined) {
        this.dateJoined = dateJoined;
    }

    public Set<AuthUserGroups> getUserAuthUserGroupses() {
        return userAuthUserGroupses;
    }

    public void setUserAuthUserGroupses(final Set<AuthUserGroups> userAuthUserGroupses) {
        this.userAuthUserGroupses = userAuthUserGroupses;
    }

    public Set<CorrespondentEntity> getOwnerDocumentsCorrespondents() {
        return ownerCorrespondentEntities;
    }

    public void setOwnerDocumentsCorrespondents(
            final Set<CorrespondentEntity> ownerCorrespondentEntities) {
        this.ownerCorrespondentEntities = ownerCorrespondentEntities;
    }

    public Set<DocumenttypeEntity> getOwnerDocumentsDocumenttypes() {
        return ownerDocumenttypeEntities;
    }

    public void setOwnerDocumentsDocumenttypes(
            final Set<DocumenttypeEntity> ownerDocumenttypeEntities) {
        this.ownerDocumenttypeEntities = ownerDocumenttypeEntities;
    }

    public Set<StoragepathEntity> getOwnerDocumentsStoragepaths() {
        return ownerStoragepathEntities;
    }

    public void setOwnerDocumentsStoragepaths(
            final Set<StoragepathEntity> ownerStoragepathEntities) {
        this.ownerStoragepathEntities = ownerStoragepathEntities;
    }

    public Set<TagEntity> getOwnerDocumentsTags() {
        return ownerTagEntities;
    }

    public void setOwnerDocumentsTags(final Set<TagEntity> ownerTagEntities) {
        this.ownerTagEntities = ownerTagEntities;
    }

    public Set<UisettingsEntity> getUserDocumentsUisettingses() {
        return userUisettingsEntities;
    }

    public void setUserDocumentsUisettingses(
            final Set<UisettingsEntity> userUisettingsEntities) {
        this.userUisettingsEntities = userUisettingsEntities;
    }

    public Set<SavedviewEntity> getOwnerDocumentsSavedviews() {
        return ownerSavedviewEntities;
    }

    public void setOwnerDocumentsSavedviews(
            final Set<SavedviewEntity> ownerSavedviewEntities) {
        this.ownerSavedviewEntities = ownerSavedviewEntities;
    }

    public Set<PaperlessMailMailaccount> getOwnerPaperlessMailMailaccounts() {
        return ownerPaperlessMailMailaccounts;
    }

    public void setOwnerPaperlessMailMailaccounts(
            final Set<PaperlessMailMailaccount> ownerPaperlessMailMailaccounts) {
        this.ownerPaperlessMailMailaccounts = ownerPaperlessMailMailaccounts;
    }

    public Set<DocumentEntity> getOwnerDocumentsDocuments() {
        return ownerDocumentEntities;
    }

    public void setOwnerDocumentsDocuments(final Set<DocumentEntity> ownerDocumentEntities) {
        this.ownerDocumentEntities = ownerDocumentEntities;
    }

    public Set<NoteEntity> getUserDocumentsNotes() {
        return userNoteEntities;
    }

    public void setUserDocumentsNotes(final Set<NoteEntity> userNoteEntities) {
        this.userNoteEntities = userNoteEntities;
    }

    public Set<PaperlessMailMailrule> getOwnerPaperlessMailMailrules() {
        return ownerPaperlessMailMailrules;
    }

    public void setOwnerPaperlessMailMailrules(
            final Set<PaperlessMailMailrule> ownerPaperlessMailMailrules) {
        this.ownerPaperlessMailMailrules = ownerPaperlessMailMailrules;
    }

    public Set<AuthUserUserPermissions> getUserAuthUserUserPermissionses() {
        return userAuthUserUserPermissionses;
    }

    public void setUserAuthUserUserPermissionses(
            final Set<AuthUserUserPermissions> userAuthUserUserPermissionses) {
        this.userAuthUserUserPermissionses = userAuthUserUserPermissionses;
    }

    public Set<AuthtokenToken> getUserAuthtokenTokens() {
        return userAuthtokenTokens;
    }

    public void setUserAuthtokenTokens(final Set<AuthtokenToken> userAuthtokenTokens) {
        this.userAuthtokenTokens = userAuthtokenTokens;
    }

    public Set<PaperlessMailProcessedmail> getOwnerPaperlessMailProcessedmails() {
        return ownerPaperlessMailProcessedmails;
    }

    public void setOwnerPaperlessMailProcessedmails(
            final Set<PaperlessMailProcessedmail> ownerPaperlessMailProcessedmails) {
        this.ownerPaperlessMailProcessedmails = ownerPaperlessMailProcessedmails;
    }

}

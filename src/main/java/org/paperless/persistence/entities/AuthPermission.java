package org.paperless.persistence.entities;

import javax.persistence.*;
import java.util.Set;


@Entity
public class AuthPermission {

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

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, length = 100)
    private String contentType;

    @Column(nullable = false, length = 100)
    private String codename;

    @OneToMany(mappedBy = "permission")
    private Set<AuthGroupPermissions> permissionGroupPermissions;

    @OneToMany(mappedBy = "permission")
    private Set<AuthUserUserPermissions> permissionUserPermissions;

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

    public String getContentType() {
        return contentType;
    }

    public void setContentType(final String contentType) {
        this.contentType = contentType;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(final String codename) {
        this.codename = codename;
    }

    public Set<AuthGroupPermissions> getPermissionGroupPermissions() {
        return permissionGroupPermissions;
    }

    public void setPermissionGroupPermissions(
            final Set<AuthGroupPermissions> permissionAuthGroupPermissionses) {
        this.permissionGroupPermissions = permissionAuthGroupPermissionses;
    }

    public Set<AuthUserUserPermissions> getPermissionUserPermissions() {
        return permissionUserPermissions;
    }

    public void setPermissionUserPermissions(
            final Set<AuthUserUserPermissions> permissionAuthUserUserPermissionses) {
        this.permissionUserPermissions = permissionAuthUserUserPermissionses;
    }

}

package org.openapitools.persistence.entities;

import javax.persistence.*;
import java.util.Set;


@Entity
public class AuthGroup {

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

    @Column(nullable = false, length = 150)
    private String name;

    @OneToMany(mappedBy = "group")
    private Set<AuthUserGroups> groupAuthUserGroupses;

    @OneToMany(mappedBy = "group")
    private Set<AuthGroupPermissions> groupAuthGroupPermissionses;

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

    public Set<AuthUserGroups> getGroupAuthUserGroupses() {
        return groupAuthUserGroupses;
    }

    public void setGroupAuthUserGroupses(final Set<AuthUserGroups> groupAuthUserGroupses) {
        this.groupAuthUserGroupses = groupAuthUserGroupses;
    }

    public Set<AuthGroupPermissions> getGroupAuthGroupPermissionses() {
        return groupAuthGroupPermissionses;
    }

    public void setGroupAuthGroupPermissionses(
            final Set<AuthGroupPermissions> groupAuthGroupPermissionses) {
        this.groupAuthGroupPermissionses = groupAuthGroupPermissionses;
    }

}

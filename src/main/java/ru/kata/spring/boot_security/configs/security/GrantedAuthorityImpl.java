package ru.kata.spring.boot_security.configs.security;

import org.springframework.security.core.GrantedAuthority;
import ru.kata.spring.boot_security.entities.Role;

public class GrantedAuthorityImpl implements GrantedAuthority {

    private final Role role;

    public GrantedAuthorityImpl(Role role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role.getName();
    }

    public Role getRole() {
        return role;
    }
}

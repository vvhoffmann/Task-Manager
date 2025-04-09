package pl.vvhoffmann.taskmanager.service;

import pl.vvhoffmann.taskmanager.model.Role;

import java.util.List;

public interface RoleService {
    Role createRole(Role role);

    List<Role> findAll();
}

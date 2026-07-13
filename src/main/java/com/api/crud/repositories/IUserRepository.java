package com.api.crud.repositories;

import com.api.crud.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //clase que permite hacer querys (consultas) a una base de datos
public interface IUserRepository extends JpaRepository<UserModel, Long> {


}

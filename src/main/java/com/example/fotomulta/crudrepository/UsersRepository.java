package com.example.fotomulta.crudrepository;

import com.example.fotomulta.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UsersRepository extends CrudRepository<Users,Long> {





}

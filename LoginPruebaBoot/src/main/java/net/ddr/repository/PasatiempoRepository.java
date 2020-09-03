package net.ddr.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.ddr.model.Pasatiempo;

@Repository
public interface PasatiempoRepository extends CrudRepository<Pasatiempo, Integer> {

}

package de.springframework.springpetclinic.repositories;

import de.springframework.springpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository <PetType,Long> {
}

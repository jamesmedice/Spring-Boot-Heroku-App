package com.medici.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.medici.model.OwnerPet;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "ownerPets", path = "ownerPets")
public interface OwnerPetRepository extends JpaRepository<OwnerPet, Long> {

}

package com.ninja.repository;

import com.ninja.model.ninjas;
import org.springframework.data.jpa.repository.JpaRepository;



// Repository é nosso jeito de se comunicar com o BD e o JPA já vai ter varias coisas prontas pra isso.
// CLASS = NINJA, LONG = TIPO DO ID
public interface ninjasRepository extends JpaRepository<ninjas, Long > {
}

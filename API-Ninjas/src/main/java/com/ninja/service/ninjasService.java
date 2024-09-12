package com.ninja.service;

import com.ninja.model.ninjas;
import com.ninja.repository.ninjasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


// Service onde vai ficar todo a logica, tanto de salvar no banco, quantou otras logicas.
// Aqui também é onde vamos instanciar, instanciar é onde temos acesso á algo.

@Service
public class ninjasService {

    @Autowired // -> com isso estamos instanciando
    private ninjasRepository repository;

    // Criar um novo ninja
    public ninjas addNinjas(ninjas ninja) {
        return repository.save(ninja);
    }

    // Mostrar ninjas criados
    public List<ninjas> getAllNinjas() {
        return repository.findAll();
    }


    // Mostrar ninja por ID
    public Optional<ninjas> findNinjaById(Long id) {
        return repository.findById(id);
    }


    // Deletar ninja
    public void deleteNinja(Long id) {
        repository.deleteById(id);
    }


    // Atualizar ninja
    public ninjas updateNinja(Long id, ninjas ninjas) {
        Optional<ninjas> oldNinja = repository.findById(id);

        if (oldNinja.isPresent()) {
            ninjas newNinja = oldNinja.get();

            newNinja.setNome(ninjas.getNome());
            newNinja.setElemento(ninjas.getElemento());
            newNinja.setIdade(ninjas.getIdade());
            newNinja.setAldeia(ninjas.getAldeia());
            newNinja.setImgUrl(ninjas.getImgUrl());

            return repository.save(newNinja);


        } else {

        }

        return ninjas;
    }

}

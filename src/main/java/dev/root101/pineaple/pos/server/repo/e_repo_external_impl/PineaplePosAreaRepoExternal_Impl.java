/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.root101.pineaple.pos.server.repo.e_repo_external_impl;

import dev.root101.pineaple.pos.server.repo.b_entity.Area;
import dev.root101.pineaple.pos.server.repo.d_repo_external.*;
import java.util.List;

/**
 *
 * @author Yo
 */
public class PineaplePosAreaRepoExternal_Impl implements PineaplePosAreaRepoExternal {

    private final PineaplePosAreaJPARepo repo;

    public PineaplePosAreaRepoExternal_Impl(PineaplePosAreaJPARepo repo) {
        this.repo = repo;
    }

    @Override
    public Area create(Area newObject) throws RuntimeException {
        return repo.save(newObject);
    }

    @Override
    public Area edit(Area objectToEdit) throws RuntimeException {
        return repo.save(objectToEdit);
    }

    @Override
    public Area destroy(Area objectToDestroy) throws RuntimeException {
        repo.delete(objectToDestroy);
        return objectToDestroy;
    }

    @Override
    public Area destroyById(Object keyId) throws RuntimeException {
        repo.deleteById((Integer) keyId);
        return null;
    }

    @Override
    public Area findBy(Object keyId) throws RuntimeException {
        return repo.findById((Integer) keyId).get();
    }

    @Override
    public List<Area> findAll() throws RuntimeException {
        return repo.findAll();
    }

}

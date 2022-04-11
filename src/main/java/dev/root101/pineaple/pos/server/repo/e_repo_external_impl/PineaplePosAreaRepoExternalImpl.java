/*
 * Copyright 2022 Root101 (jhernandezb96@gmail.com, +53-5-426-8660).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Or read it directly from LICENCE.txt file at the root of this project.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.root101.pineaple.pos.server.repo.e_repo_external_impl;

import dev.root101.pineaple.pos.server.repo.b_entity.Area;
import dev.root101.pineaple.pos.server.repo.d_repo_external.*;
import java.util.List;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class PineaplePosAreaRepoExternalImpl implements PineaplePosAreaRepoExternal {

    private final PineaplePosAreaJPARepo repo;

    public PineaplePosAreaRepoExternalImpl(PineaplePosAreaJPARepo repo) {
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
    public void destroy(Area objectToDestroy) throws RuntimeException {
        repo.delete(objectToDestroy);
    }

    @Override
    public void destroyById(Integer keyId) throws RuntimeException {
        repo.deleteById(keyId);
    }

    @Override
    public Area findBy(Integer keyId) throws RuntimeException {
        return repo.findById(keyId).get();
    }

    @Override
    public List<Area> findAll() throws RuntimeException {
        return repo.findAll();
    }

}

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
package dev.root101.pineaple.pos.server.rest.a_module;

import dev.root101.pineaple.pos.server.core.a_module.*;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;
import dev.root101.pineaple.pos.server.repo.d_repo_external.*;
import org.springframework.beans.factory.annotation.Autowired;
import dev.root101.pineaple.pos.server.repo.a_module.PineaplePosRepoModule;
import dev.root101.pineaple.pos.server.repo.a_module.external.PineaplePosRepoExternalModule;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
@Component
public class PineaplePosRESTModule {

    public static final String BASE_PACKAGE = "dev.root101.pineaple.pos.server";

    //@PersistenceContext
    //private EntityManager entityManager;

    @Bean("PineaplePosRESTModule")
    public String init(@Autowired PineaplePosAreaJPARepo areaRepoExternal) {
        PineaplePosCoreModule.init(
                PineaplePosRepoModule.init(
                        PineaplePosRepoExternalModule.init(areaRepoExternal)
                )
        );
        return "PineaplePosRESTModule";
    }

}

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
package dev.root101.pineaple.pos.server.repo.a_module.external;

import com.google.inject.*;
import dev.root101.pineaple.pos.server.repo.d_repo_external.*;
import dev.root101.pineaple.pos.server.repo.e_repo_external_impl.*;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class PineaplePosRepoExternalGuiceInjectorConfig extends AbstractModule {

    private final PineaplePosAreaRepoExternal areaRepoExternal;

    public PineaplePosRepoExternalGuiceInjectorConfig(PineaplePosAreaJPARepo pineaplePosAreaRepoExternal) {
        this.areaRepoExternal = new PineaplePosAreaRepoExternal_Impl(pineaplePosAreaRepoExternal);
    }

    @Override
    protected void configure() {
        super.configure();

        bind(PineaplePosAreaRepoExternal.class).toInstance(areaRepoExternal);
    }

}

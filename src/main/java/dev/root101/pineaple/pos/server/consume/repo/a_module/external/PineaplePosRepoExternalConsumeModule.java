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
package dev.root101.pineaple.pos.server.consume.repo.a_module.external;

import com.google.inject.*;
import dev.root101.clean.core.app.modules.DefaultAbstractModule;
import dev.root101.clean.core.exceptions.*;
import dev.root101.pineaple.pos.server.repo.d_repo_external.PineaplePosAreaJPARepo;
import java.util.function.Supplier;
import org.springframework.web.client.RestOperations;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class PineaplePosRepoExternalConsumeModule extends DefaultAbstractModule {

    private static Injector inj;

    private static PineaplePosRepoExternalConsumeModule INSTANCE;

    public static PineaplePosRepoExternalConsumeModule getInstance() {
        if (INSTANCE == null) {
            throw new NotInitModule("Modulo sin iniciar");
        }
        return INSTANCE;
    }

    public static PineaplePosRepoExternalConsumeModule init(Supplier<RestOperations> template) {
        if (INSTANCE != null) {
            throw new AlreadyInitModule("Module ya inicializado");
        }
        inj = Guice.createInjector(
                new PineaplePosRepoExternalConsumeGuiceInjectorConfig(
                        template
                )
        );
        INSTANCE = new PineaplePosRepoExternalConsumeModule();
        return getInstance();
    }

    @Override
    protected <T> T getOwnImplementation(Class<T> type) {
        return inj.getInstance(type);
    }

    @Override
    public String getModuleName() {
        return "Pineaple POS Repo External Consume Module";
    }

}

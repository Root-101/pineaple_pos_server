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
package dev.root101.pineaple.pos.server.consume.app.a_module;

import dev.root101.pineaple.pos.server.core.a_module.*;
import com.google.inject.*;
import dev.root101.clean.core.app.modules.DefaultAbstractModule;
import dev.root101.clean.core.exceptions.*;
import static dev.root101.pineaple.pos.server.core.a_module.PosCoreModule.getInstance;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class PosCoreConsumeModule extends DefaultAbstractModule {

    private static final Injector inj = Guice.createInjector(new PosCoreConsumeInjectorConfig());

    private static PosCoreConsumeModule INSTANCE;

    public static PosCoreConsumeModule getInstance() {
        if (INSTANCE == null) {
            throw new NotInitModule("Modulo sin iniciar");
        }
        return INSTANCE;
    }

    public static PosCoreConsumeModule init(dev.root101.clean.core.app.modules.AbstractModule repoModule) {
        if (INSTANCE != null) {
            throw new AlreadyInitModule("Module ya inicializado");
        }
        INSTANCE = new PosCoreConsumeModule();
        INSTANCE.registerModule(repoModule);
        return getInstance();
    }

    public static <T> T find(Class<T> type) {
        return getInstance().getImplementation(type);
    }

    @Override
    protected <T> T getOwnImplementation(Class<T> type) {
        return inj.getInstance(type);
    }

    @Override
    public String getModuleName() {
        return "Pineaple POS Core Consume Module";
    }

}

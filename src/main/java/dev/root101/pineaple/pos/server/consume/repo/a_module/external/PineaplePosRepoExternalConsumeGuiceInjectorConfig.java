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
import dev.root101.pineaple.pos.server.consume.repo.c_repo_consume.PineaplePosAreaRepoExternalConsume;
import dev.root101.pineaple.pos.server.consume.repo.d_repo_consume_impl.PineaplePosAreaRepoExternalConsumeImpl;
import java.util.function.Supplier;
import org.springframework.web.client.RestOperations;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class PineaplePosRepoExternalConsumeGuiceInjectorConfig extends AbstractModule {

    private final PineaplePosAreaRepoExternalConsume areaRepoExternalConsume;

    public PineaplePosRepoExternalConsumeGuiceInjectorConfig(Supplier<RestOperations> template) {
        this.areaRepoExternalConsume = new PineaplePosAreaRepoExternalConsumeImpl(template);
    }

    @Override
    protected void configure() {
        super.configure();

        bind(PineaplePosAreaRepoExternalConsume.class).toInstance(areaRepoExternalConsume);
    }

}

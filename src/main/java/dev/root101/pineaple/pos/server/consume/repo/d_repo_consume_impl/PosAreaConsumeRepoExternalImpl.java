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
package dev.root101.pineaple.pos.server.consume.repo.d_repo_consume_impl;

import dev.root101.pineaple.pos.server.core.b_domain.PosDomains;
import dev.root101.spring.client.ConsumerRepoTemplate;
import java.util.function.Supplier;
import org.springframework.web.client.RestOperations;
import dev.root101.pineaple.pos.server.consume.repo.c_repo_consume.PosAreaConsumeRepoExternal;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class PosAreaConsumeRepoExternalImpl extends ConsumerRepoTemplate<PosDomains.PineaplePOSAreaDomain, Integer> implements PosAreaConsumeRepoExternal {

    private static final String URL_GENERAL = "http://localhost:8080";

    public PosAreaConsumeRepoExternalImpl(Supplier<RestOperations> template) {
        super(PosDomains.PineaplePOSAreaDomain.class, URL_GENERAL + "/pineaple/pos-module/area", template);
    }

}

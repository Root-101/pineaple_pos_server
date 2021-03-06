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
package dev.root101.pineaple.pos.server.consume.repo.b_repo_impl.converter;

import dev.root101.clean.core.repo.Converter;
import dev.root101.pineaple.pos.server.consume.app.b_domain.PosConsumeDomains;
import dev.root101.pineaple.pos.server.core.b_domain.PosDomains;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class PosAreaConsumeConverter implements Converter<PosConsumeDomains.PineaplePOSAreaDomain, PosDomains.PineaplePOSAreaDomain> {

    private static PosAreaConsumeConverter INSTANCE;

    public static PosAreaConsumeConverter getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PosAreaConsumeConverter();
        }
        return INSTANCE;
    }

    @Override
    public PosConsumeDomains.PineaplePOSAreaDomain toDomain(PosDomains.PineaplePOSAreaDomain entity) throws RuntimeException {
        return new PosConsumeDomains.PineaplePOSAreaDomain(entity.idArea(), entity.nameArea(), entity.descriptionArea());
    }

    @Override
    public PosDomains.PineaplePOSAreaDomain toEntity(PosConsumeDomains.PineaplePOSAreaDomain domain) throws RuntimeException {
        return new PosDomains.PineaplePOSAreaDomain(domain.idArea(), domain.nameArea(), domain.descriptionArea());
    }

}

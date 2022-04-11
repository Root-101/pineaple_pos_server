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
package dev.root101.pineaple.pos.server.repo.c_repo_impl.converters;

import dev.root101.clean.core.repo.Converter;
import dev.root101.pineaple.pos.server.core.b_domain.PineaplePosDomains;
import dev.root101.pineaple.pos.server.repo.b_entity.Area;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class PineaplePosAreaConverter implements Converter<PineaplePosDomains.PineaplePOSAreaDomain, Area> {

    private static PineaplePosAreaConverter INSTANCE;

    public static PineaplePosAreaConverter getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PineaplePosAreaConverter();
        }
        return INSTANCE;
    }

    @Override
    public PineaplePosDomains.PineaplePOSAreaDomain toDomain(Area entity) throws RuntimeException {
        return PineaplePosDomains.PineaplePOSAreaDomain.build(
                entity.getIdArea(),
                entity.getNameArea(),
                entity.getDecriptionArea()
        );
    }

    @Override
    public Area toEntity(PineaplePosDomains.PineaplePOSAreaDomain domain) throws RuntimeException {
        return new Area(
                domain.idArea(),
                domain.nameArea(),
                domain.descriptionArea()
        );
    }

}

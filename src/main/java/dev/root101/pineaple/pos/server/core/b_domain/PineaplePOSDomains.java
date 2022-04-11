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
package dev.root101.pineaple.pos.server.core.b_domain;

import dev.root101.clean.core.app.domain.BasicDomainObject;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class PineaplePosDomains {

    public record PineaplePOSAreaDomain(
            Integer idArea,
            @NotEmpty(message = "Nombre del area no puede estar vacio")
            @Size(max = 99, message = "Nombre muy largo")
            String nameArea,
            @Size(min = 0, max = 499, message = "Descripcion muy larga")
            String descriptionArea) implements BasicDomainObject {

        public static PineaplePOSAreaDomain build(int idPosArea, String namePosArea, String descriptionPosArea) {
            return new PineaplePOSAreaDomain(idPosArea, namePosArea, descriptionPosArea);
        }

        public static PineaplePOSAreaDomain build(String namePosArea, String descriptionPosArea) {
            return new PineaplePOSAreaDomain(0, namePosArea, descriptionPosArea);
        }

        public static PineaplePOSAreaDomain copyWith() {
            return null;
        }

    }

}

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
package dev.root101.pineaple.pos.server.rest.c_rest_impl;

import dev.root101.pineaple.pos.server.core.b_domain.PineaplePOSDomains.*;
import dev.root101.pineaple.pos.server.core.c_usecase_def.*;
import static dev.root101.pineaple.pos.server.rest.PineaplePOSRESTConstants.*;
import dev.root101.pineaple.pos.server.rest.a_module.A_PineaplePOSRESTModule;
import dev.root101.pineaple.pos.server.rest.b_rest_def.*;
import dev.root101.spring.server.CRUDRestServiceTemplate;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
@RestController
@RequestMapping(value = AREA_GENERAL_PATH)
public class PineaplePOSArestRESTServiceImpl extends CRUDRestServiceTemplate<PineaplePOSAreaDomain, PineaplePOSAreaUC> implements PineaplePOSAreaRESTService {

    public PineaplePOSArestRESTServiceImpl() {
        super(A_PineaplePOSRESTModule.areaUC);
    }

}

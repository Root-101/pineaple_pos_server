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

import dev.root101.pineaple.pos.server.core.b_domain.PineaplePosDomains.*;
import dev.root101.pineaple.pos.server.core.c_usecase_def.*;
import dev.root101.pineaple.pos.server.repo.c_repo_impl.converters.PineaplePosAreaConverter;
import dev.root101.pineaple.pos.server.repo.e_repo_external_impl.RepoSpring;
import static dev.root101.pineaple.pos.server.rest.PineaplePosRESTConstants.*;
import dev.root101.pineaple.pos.server.rest.a_module.A_PineaplePosRESTModule;
import dev.root101.pineaple.pos.server.rest.b_rest_def.*;
import dev.root101.spring.server.CRUDRestServiceTemplate;
import dev.root101.spring.server.RESTUrlConstants;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
@RestController
@RequestMapping(value = AREA_GENERAL_PATH)
public class PineaplePosArestRESTServiceImpl extends CRUDRestServiceTemplate<PineaplePOSAreaDomain, PineaplePosAreaUC> implements PineaplePosAreaRESTService {

    public PineaplePosArestRESTServiceImpl() {
        super(A_PineaplePosRESTModule.areaUC);
    }

    @Autowired
    public static RepoSpring repo;

    @Override
    @GetMapping(RESTUrlConstants.FIND_ALL_PATH)
    public List<PineaplePOSAreaDomain> findAll() throws RuntimeException {
        return PineaplePosAreaConverter.getInstance().toDomainAll(repo.findAll());
    }

    @GetMapping("/one")
    public PineaplePOSAreaDomain one() throws RuntimeException {
        return PineaplePOSAreaDomain.build("helouuuuu", "prueba de uno solo");
    }

    @PostMapping("/dos")
    public PineaplePOSAreaDomain two() throws RuntimeException {
        return PineaplePOSAreaDomain.build(9999, "dos", "descr dos");
    }

    @PostMapping("/tres")
    public String tres(@RequestBody String string) throws RuntimeException {
        System.out.println(string);
        return string + "okokok";
    }

    @PostMapping("/cuatro")
    public String cuatro(@RequestBody PineaplePOSAreaDomain areaDomain) throws RuntimeException {
        System.out.println(areaDomain);
        return areaDomain.toString();
    }

    @PostMapping("/cinco")
    public PineaplePOSAreaDomain cinco(@RequestBody PineaplePOSAreaDomain areaDomain) throws RuntimeException {
        System.out.println(areaDomain);
        return PineaplePOSAreaDomain.build(9999, areaDomain.nameArea() + " oki doik", areaDomain.descriptionArea());
    }
}

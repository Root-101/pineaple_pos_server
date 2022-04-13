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
package dev.root101.pineaple.pos.server.consume;

import dev.root101.pineaple.pos.server.consume.app.a_module.PosCoreConsumeModule;
import dev.root101.pineaple.pos.server.consume.repo.a_module.PosConsumeRepoModule;
import dev.root101.pineaple.pos.server.consume.repo.a_module.external.PosRepoExternalConsumeModule;
import org.springframework.web.client.RestTemplate;
import dev.root101.pineaple.pos.server.consume.app.c_use_case.PosAreaConsumeUC;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class TestConsumeMain {

    public static void main(String[] args) {
        RestTemplate rt = new RestTemplate();
        PosCoreConsumeModule.init(PosConsumeRepoModule.init(PosRepoExternalConsumeModule.init(() -> {
                            return rt;
                        })
                ));

        PosAreaConsumeUC uc = PosCoreConsumeModule.find(PosAreaConsumeUC.class);
        
        System.out.println(uc.findAll());
    }

}

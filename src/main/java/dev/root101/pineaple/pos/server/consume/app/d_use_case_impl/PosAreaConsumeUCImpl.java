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
package dev.root101.pineaple.pos.server.consume.app.d_use_case_impl;

import dev.root101.clean.core.app.usecase.DefaultCRUDUseCase;
import dev.root101.pineaple.pos.server.consume.app.b_domain.PosConsumeDomains;
import dev.root101.pineaple.pos.server.consume.app.a_module.PosCoreConsumeModule;
import dev.root101.pineaple.pos.server.consume.app.c_use_case.PosAreaConsumeUC;
import dev.root101.pineaple.pos.server.consume.app.e_repo.PosAreaConsumeRepo;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
public class PosAreaConsumeUCImpl extends DefaultCRUDUseCase<PosConsumeDomains.PineaplePOSAreaDomain, Integer, PosAreaConsumeRepo> implements PosAreaConsumeUC {

    public PosAreaConsumeUCImpl() {
        super(PosCoreConsumeModule.find(PosAreaConsumeRepo.class));
    }

}

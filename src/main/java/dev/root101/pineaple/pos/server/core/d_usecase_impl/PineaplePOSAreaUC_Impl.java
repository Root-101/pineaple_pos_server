package dev.root101.pineaple.pos.server.core.d_usecase_impl;

import dev.root101.clean.core.app.usecase.DefaultCRUDUseCase;
import dev.root101.pineaple.pos.server.core.a_module.PineaplePosCoreModule;
import dev.root101.pineaple.pos.server.core.b_domain.PineaplePosDomains.*;
import dev.root101.pineaple.pos.server.core.c_usecase_def.PineaplePosAreaUC;
import dev.root101.pineaple.pos.server.core.e_repo_def.PineaplePosAreaRepo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class PineaplePosAreaUC_Impl extends DefaultCRUDUseCase<PineaplePOSAreaDomain, PineaplePosAreaRepo> implements PineaplePosAreaUC {

    public PineaplePosAreaUC_Impl() {
        super(PineaplePosCoreModule.getInstance().getImplementation(PineaplePosAreaRepo.class));
    }

}

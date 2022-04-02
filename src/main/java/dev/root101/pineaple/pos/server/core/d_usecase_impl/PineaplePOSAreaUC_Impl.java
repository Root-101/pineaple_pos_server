package dev.root101.pineaple.pos.server.core.d_usecase_impl;

import dev.root101.pineaple.pos.server.core.e_repo_def.PineaplePOSAreaRepo;
import dev.root101.pineaple.pos.server.core.c_usecase_def.PineaplePOSAreaUC;
import dev.root101.clean.core.app.usecase.DefaultCRUDUseCase;
import dev.root101.pineaple.pos.server.core.b_domain.PineaplePOSDomains.*;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class PineaplePOSAreaUC_Impl extends DefaultCRUDUseCase<PineaplePOSAreaDomain, PineaplePOSAreaRepo> implements PineaplePOSAreaUC {

    public PineaplePOSAreaUC_Impl() {
        super(null/*TestModule.getImplementation(TestRepo.class)*/);
    }

    @Override
    public List<PineaplePOSAreaDomain> findAll() throws RuntimeException {
        return List.of(
                PineaplePOSAreaDomain.build(0, "Barra", "Solo tragos"),
                PineaplePOSAreaDomain.build(1, "Restaurant", "Toda la comida de la casa")
        );
    }

}

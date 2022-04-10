/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.root101.pineaple.pos.server.repo.c_repo_impl;

import dev.root101.clean.core.repo.DefaultCRUDRepo;
import dev.root101.pineaple.pos.server.core.b_domain.PineaplePosDomains.*;
import dev.root101.pineaple.pos.server.core.e_repo_def.PineaplePosAreaRepo;
import dev.root101.pineaple.pos.server.repo.a_module.PineaplePosRepoModule;
import dev.root101.pineaple.pos.server.repo.b_entity.*;
import dev.root101.pineaple.pos.server.repo.c_repo_impl.converters.PineaplePosAreaConverter;
import dev.root101.pineaple.pos.server.repo.d_repo_external.*;

/**
 *
 * @author Yo
 */
public class PineaplePosAreaRepo_Impl extends DefaultCRUDRepo<PineaplePOSAreaDomain, Area, PineaplePosAreaRepoExternal> implements PineaplePosAreaRepo {

    public PineaplePosAreaRepo_Impl() {
        super(
                PineaplePosRepoModule.getInstance().getImplementation(PineaplePosAreaRepoExternal.class),
                PineaplePosAreaConverter.getInstance()
        );
    }

}

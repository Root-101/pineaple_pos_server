/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.root101.pineaple.pos.server.consume.repo.b_repo_impl;

import dev.root101.clean.core.repo.DefaultCRUDRepo;
import dev.root101.pineaple.pos.server.consume.app.b_domain.PineaplePosDomainsConsume;
import dev.root101.pineaple.pos.server.consume.app.e_repo.PineaplePosAreaRepoConsume;
import dev.root101.pineaple.pos.server.consume.repo.a_module.PineaplePosRepoModuleConsume;
import dev.root101.pineaple.pos.server.consume.repo.c_repo_consume.PineaplePosAreaRepoExternalConsume;
import dev.root101.pineaple.pos.server.consume.repo.b_repo_impl.converter.PineaplePosAreaConverterConsume;
import dev.root101.pineaple.pos.server.core.b_domain.PineaplePosDomains;

public class PineaplePosAreaRepoConsumeImpl
        extends DefaultCRUDRepo<
        PineaplePosDomainsConsume.PineaplePOSAreaDomain, PineaplePosDomains.PineaplePOSAreaDomain, Integer, PineaplePosAreaRepoExternalConsume>
        implements PineaplePosAreaRepoConsume {

    public PineaplePosAreaRepoConsumeImpl() {
        super(
                PineaplePosRepoModuleConsume.getInstance().getImplementation(PineaplePosAreaRepoExternalConsume.class),
                PineaplePosAreaConverterConsume.getInstance()
        );
    }

}

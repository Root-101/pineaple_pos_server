/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.root101.pineaple.pos.server.repo.a_module.external;

import com.google.inject.*;
import dev.root101.pineaple.pos.server.repo.d_repo_external.*;
import dev.root101.pineaple.pos.server.repo.e_repo_external_impl.*;

/**
 *
 * @author Yo
 */
public class PineaplePosRepoExternalGuiceInjectorConfig extends AbstractModule {

    private final PineaplePosAreaRepoExternal areaRepoExternal;

    public PineaplePosRepoExternalGuiceInjectorConfig(PineaplePosAreaJPARepo pineaplePosAreaRepoExternal) {
        this.areaRepoExternal = new PineaplePosAreaRepoExternal_Impl(pineaplePosAreaRepoExternal);
    }

    @Override
    protected void configure() {
        super.configure();

        bind(PineaplePosAreaRepoExternal.class).toInstance(areaRepoExternal);
    }

}

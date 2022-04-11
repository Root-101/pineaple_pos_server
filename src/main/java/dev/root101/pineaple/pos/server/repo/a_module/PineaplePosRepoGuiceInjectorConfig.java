/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.root101.pineaple.pos.server.repo.a_module;

import com.google.inject.*;
import dev.root101.pineaple.pos.server.core.e_repo_def.*;
import dev.root101.pineaple.pos.server.repo.c_repo_impl.*;
import dev.root101.pineaple.pos.server.repo.d_repo_external.*;
import dev.root101.pineaple.pos.server.repo.e_repo_external_impl.*;

/**
 *
 * @author Yo
 */
public class PineaplePosRepoGuiceInjectorConfig extends AbstractModule {

    private final PineaplePosAreaRepoExternal areaRepoExternal;

    public PineaplePosRepoGuiceInjectorConfig(PineaplePosAreaRepoExternal pineaplePosAreaRepoExternal) {
        this.areaRepoExternal = pineaplePosAreaRepoExternal;
    }

    @Override
    protected void configure() {
        super.configure();

        bind(PineaplePosAreaRepo.class).to(PineaplePosAreaRepo_Impl.class).in(Singleton.class);
        bind(PineaplePosAreaRepoExternal.class).toInstance(areaRepoExternal);
    }

}

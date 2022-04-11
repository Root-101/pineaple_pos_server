/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.root101.pineaple.pos.server.repo.a_module;

import com.google.inject.*;
import dev.root101.clean.core.app.modules.DefaultAbstractModule;
import dev.root101.clean.core.exceptions.*;
import dev.root101.pineaple.pos.server.repo.d_repo_external.PineaplePosAreaRepoExternal;

/**
 *
 * @author Yo
 */
public class PineaplePosRepoModule extends DefaultAbstractModule {

    private static Injector inj;

    private static PineaplePosRepoModule INSTANCE;

    public static PineaplePosRepoModule getInstance() {
        if (INSTANCE == null) {
            throw new NotInitModule("Modulo sin iniciar");
        }
        return INSTANCE;
    }

    public static PineaplePosRepoModule init(PineaplePosAreaRepoExternal areaRepoExternal) {
        if (INSTANCE != null) {
            throw new AlreadyInitModule("Module ya inicializado");
        }
        inj = Guice.createInjector(
                new PineaplePosRepoGuiceInjectorConfig(
                        areaRepoExternal
                )
        );
        INSTANCE = new PineaplePosRepoModule();
        return getInstance();
    }

    @Override
    protected <T> T getOwnImplementation(Class<T> type) {
        return inj.getInstance(type);
    }

    @Override
    public String getModuleName() {
        return "Pineaple POS Repo Module";
    }

}

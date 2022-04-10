/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.root101.pineaple.pos.server.core.a_module;

import com.google.inject.*;
import dev.root101.clean.core.app.modules.AbstractModule;
import dev.root101.clean.core.app.modules.DefaultAbstractModule;
import dev.root101.clean.core.exceptions.*;

/**
 *
 * @author Yo
 */
public class PineaplePosCoreModule extends DefaultAbstractModule {

    private static final Injector inj = Guice.createInjector(new PineaplePosGuiceInjectorConfig());
    
    private static PineaplePosCoreModule INSTANCE;

    public static PineaplePosCoreModule getInstance() {
        if (INSTANCE == null) {
            throw new NotInitModule("Modulo sin iniciar");
        }
        return INSTANCE;
    }

    public static PineaplePosCoreModule init(/*AbstractModule repoModule*/) {
        if (INSTANCE != null) {
            throw new AlreadyInitModule("Module ya inicializado");
        }
        INSTANCE = new PineaplePosCoreModule();
        //INSTANCE.registerModule(repoModule);
        return getInstance();
    }

    @Override
    protected <T> T getOwnImplementation(Class<T> type) {
        return inj.getInstance(type);
    }

    @Override
    public String getModuleName() {
        return "Pineaple POS Core Module";
    }

}

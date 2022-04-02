/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.root101.pineaple.pos.server.core.a_module;

import dev.root101.pineaple.pos.server.core.c_usecase_def.PineaplePOSAreaUC;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import dev.root101.pineaple.pos.server.core.d_usecase_impl.*;

/**
 *
 * @author Yo
 */
public class PineaplePOSGuiceInjectorConfig extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();

        bind(PineaplePOSAreaUC.class).to(PineaplePOSAreaUC_Impl.class).in(Singleton.class);
    }

}

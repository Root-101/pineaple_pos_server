/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.root101.pineaple.pos.server.core.a_module;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import dev.root101.pineaple.pos.server.core.d_usecase_impl.*;
import dev.root101.pineaple.pos.server.core.c_usecase_def.PineaplePosAreaUC;

/**
 *
 * @author Yo
 */
public class PineaplePosCoreGuiceInjectorConfig extends AbstractModule {

    @Override
    protected void configure() {
        super.configure();

        bind(PineaplePosAreaUC.class).to(PineaplePosAreaUC_Impl.class).in(Singleton.class);
    }

}

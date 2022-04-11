/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.root101.pineaple.pos.server.rest.c_rest_impl;

import dev.root101.pineaple.pos.server.core.a_module.PineaplePosCoreModule;
import dev.root101.pineaple.pos.server.core.b_domain.PineaplePosDomains.*;
import dev.root101.pineaple.pos.server.core.c_usecase_def.*;
import static dev.root101.pineaple.pos.server.rest.PineaplePosRESTConstants.*;
import dev.root101.pineaple.pos.server.rest.b_rest_def.*;
import dev.root101.spring.server.CRUDRestServiceTemplate;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
@RestController
@RequestMapping(value = AREA_GENERAL_PATH)
@DependsOn({"PineaplePosRESTModule"})
public class PineaplePosArestRESTService_Impl extends CRUDRestServiceTemplate<PineaplePOSAreaDomain, PineaplePosAreaUC> implements PineaplePosAreaRESTService {

    public PineaplePosArestRESTService_Impl() {
        super(
                PineaplePosCoreModule.getInstance().getImplementation(PineaplePosAreaUC.class)
        );
    }

    @GetMapping("/one")
    public PineaplePOSAreaDomain one() throws RuntimeException {
        return PineaplePOSAreaDomain.build("helouuuuu", "prueba de uno solo");
    }

    @PostMapping("/dos")
    public PineaplePOSAreaDomain two() throws RuntimeException {
        return PineaplePOSAreaDomain.build(9999, "dos", "descr dos");
    }

    @PostMapping("/tres")
    public String tres(@RequestBody String string) throws RuntimeException {
        System.out.println(string);
        return string + "okokok";
    }

    @PostMapping("/cuatro")
    public String cuatro(@RequestBody PineaplePOSAreaDomain areaDomain) throws RuntimeException {
        System.out.println(areaDomain);
        return areaDomain.toString();
    }

    @PostMapping("/cinco")
    public PineaplePOSAreaDomain cinco(@RequestBody PineaplePOSAreaDomain areaDomain) throws RuntimeException {
        System.out.println(areaDomain);
        return PineaplePOSAreaDomain.build(9999, areaDomain.nameArea() + " oki doik", areaDomain.descriptionArea());
    }
}

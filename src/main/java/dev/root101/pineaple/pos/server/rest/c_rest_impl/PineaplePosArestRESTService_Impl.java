/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.root101.pineaple.pos.server.rest.c_rest_impl;


import dev.root101.pineaple.pos.server.core.b_domain.PineaplePosDomains.*;
import dev.root101.pineaple.pos.server.core.c_usecase_def.*;
import dev.root101.pineaple.pos.server.repo.c_repo_impl.converters.PineaplePosAreaConverter;
import dev.root101.pineaple.pos.server.repo.e_repo_external_impl.RepoSpring;
import static dev.root101.pineaple.pos.server.rest.PineaplePosRESTConstants.*;
import dev.root101.pineaple.pos.server.rest.a_module.A_PineaplePosRESTModule;
import dev.root101.pineaple.pos.server.rest.b_rest_def.*;
import dev.root101.spring.server.CRUDRestServiceTemplate;
import dev.root101.spring.server.RESTUrlConstants;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Root101 (jhernandezb96@gmail.com, +53-5-426-8660)
 * @author JesusHdezWaterloo@Github
 */
@RestController
@RequestMapping(value = AREA_GENERAL_PATH)
public class PineaplePosArestRESTService_Impl extends CRUDRestServiceTemplate<PineaplePOSAreaDomain, PineaplePosAreaUC> implements PineaplePosAreaRESTService {

    public PineaplePosArestRESTService_Impl() {
        super(A_PineaplePosRESTModule.areaUC);
    }

    @Autowired
    public static RepoSpring repo;

    @Override
    @GetMapping(RESTUrlConstants.FIND_ALL_PATH)
    public List<PineaplePOSAreaDomain> findAll() throws RuntimeException {
        return PineaplePosAreaConverter.getInstance().toDomainAll(repo.findAll());
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

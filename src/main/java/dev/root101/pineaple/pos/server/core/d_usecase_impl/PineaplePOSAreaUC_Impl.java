package dev.root101.pineaple.pos.server.core.d_usecase_impl;

import dev.root101.clean.core.app.usecase.DefaultCRUDUseCase;
import dev.root101.pineaple.pos.server.core.b_domain.PineaplePosDomains.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import dev.root101.pineaple.pos.server.core.c_usecase_def.PineaplePosAreaUC;
import dev.root101.pineaple.pos.server.core.e_repo_def.PineaplePosAreaRepo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class PineaplePosAreaUC_Impl extends DefaultCRUDUseCase<PineaplePOSAreaDomain, PineaplePosAreaRepo> implements PineaplePosAreaUC {

    List<PineaplePOSAreaDomain> l = new ArrayList<>();

    public PineaplePosAreaUC_Impl() {
        super(null/*TestModule.getImplementation(TestRepo.class)*/);

        l.add(PineaplePOSAreaDomain.build(0, "Barra", "Solo tragos"));
        l.add(PineaplePOSAreaDomain.build(1, "Restaurant", "Toda la comida de la casa"));
        l.add(PineaplePOSAreaDomain.build(2, "Te amo", "Toda la comida de la casa"));
        l.add(PineaplePOSAreaDomain.build(3, "Mi nené", "Toda la comida de la casa"));
        l.add(PineaplePOSAreaDomain.build(4, "Linda", "Toda la comida de la casa"));
        l.add(PineaplePOSAreaDomain.build(5, "y Hermosa", "Toda la comida de la casa"));
    }

    @Override
    public List<PineaplePOSAreaDomain> findAll() throws RuntimeException {
        return l;
    }

    @Override
    public PineaplePOSAreaDomain create(PineaplePOSAreaDomain newObject) throws RuntimeException {
        System.out.println("creando " + newObject);
        PineaplePOSAreaDomain created = PineaplePOSAreaDomain.build(new Random().nextInt(5000), newObject.namePosArea(), newObject.descriptionPosArea());
        l.add(created);
        System.out.println("creado " + created);
        return created;
    }

    @Override
    public PineaplePOSAreaDomain destroy(PineaplePOSAreaDomain objectToDestroy) throws RuntimeException {
        System.out.println("destroy " + objectToDestroy);
        l.removeIf((t) -> {
            if (t.idPosArea() == objectToDestroy.idPosArea()) {
                System.out.println("eliminando " + t);
                return true;
            } else {
                return false;
            }
        });
        System.out.println("destroyed " + objectToDestroy);
        return objectToDestroy;
    }

    @Override
    public PineaplePOSAreaDomain edit(PineaplePOSAreaDomain objectToUpdate) throws RuntimeException {
        System.out.println("edit " + objectToUpdate);
        destroy(objectToUpdate);
        create(objectToUpdate);
        System.out.println("edited " + objectToUpdate);
        return objectToUpdate;
    }

    @Override
    public PineaplePOSAreaDomain findBy(Object keyId) throws RuntimeException {
        return l.get((int) keyId);
    }

    @Override
    public int count() throws RuntimeException {
        return l.size();
    }

}

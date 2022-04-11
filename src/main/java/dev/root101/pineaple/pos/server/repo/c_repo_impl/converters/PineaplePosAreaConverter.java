/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.root101.pineaple.pos.server.repo.c_repo_impl.converters;

import dev.root101.clean.core.repo.Converter;
import dev.root101.pineaple.pos.server.core.b_domain.PineaplePosDomains;
import dev.root101.pineaple.pos.server.repo.b_entity.Area;

/**
 *
 * @author Yo
 */
public class PineaplePosAreaConverter implements Converter<PineaplePosDomains.PineaplePOSAreaDomain, Area> {

    private static PineaplePosAreaConverter INSTANCE;

    public static PineaplePosAreaConverter getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PineaplePosAreaConverter();
        }
        return INSTANCE;
    }

    @Override
    public PineaplePosDomains.PineaplePOSAreaDomain toDomain(Area entity) throws RuntimeException {
        return PineaplePosDomains.PineaplePOSAreaDomain.build(
                entity.getIdArea(),
                entity.getNameArea(),
                entity.getDecriptionArea()
        );
    }

    @Override
    public Area toEntity(PineaplePosDomains.PineaplePOSAreaDomain domain) throws RuntimeException {
        return new Area(
                domain.idArea(),
                domain.nameArea(),
                domain.descriptionArea()
        );
    }

}

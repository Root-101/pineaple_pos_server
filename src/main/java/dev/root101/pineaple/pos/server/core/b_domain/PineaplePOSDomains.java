/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.root101.pineaple.pos.server.core.b_domain;

import dev.root101.clean.core.app.domain.BasicDomainObject;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 *
 * @author Yo
 */
public class PineaplePOSDomains {

    public record PineaplePOSAreaDomain(
            Integer idPosArea,
            @NotEmpty(message = "No puede estar vacio")
            @Size(max = 99, message = "Nombre muy largo")
            String namePosArea,
            @Size(min = 0, max = 499, message = "Descripcion muy larga")
            String descriptionPosArea) implements BasicDomainObject {

        public static PineaplePOSAreaDomain build(int idPosArea, String namePosArea, String descriptionPosArea) {
            return new PineaplePOSAreaDomain(idPosArea, namePosArea, descriptionPosArea);
        }

        public static PineaplePOSAreaDomain build(String namePosArea, String descriptionPosArea) {
            return new PineaplePOSAreaDomain(0, namePosArea, descriptionPosArea);
        }
    }

}

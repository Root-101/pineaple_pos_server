/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.root101.pineaple.pos.server.consume.repo.d_repo_consume_impl;

import dev.root101.pineaple.pos.server.core.b_domain.PineaplePosDomains;
import dev.root101.spring.client.ConsumerRepoTemplate;
import dev.root101.pineaple.pos.server.consume.repo.c_repo_consume.PineaplePosAreaRepoExternalConsume;
import java.util.function.Supplier;
import org.springframework.web.client.RestOperations;

public class PineaplePosAreaRepoExternalConsumeImpl extends ConsumerRepoTemplate<PineaplePosDomains.PineaplePOSAreaDomain, Integer> implements PineaplePosAreaRepoExternalConsume {

    public PineaplePosAreaRepoExternalConsumeImpl(Supplier<RestOperations> template) {
        super(PineaplePosDomains.PineaplePOSAreaDomain.class, "", template);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dev.root101.pineaple.pos.server.repo.d_repo_external;

import dev.root101.pineaple.pos.server.repo.b_entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Yo
 */
public interface PineaplePosAreaJPARepo extends JpaRepository<Area, Integer>{
    
}

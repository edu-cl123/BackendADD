/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.repositories;

import com.mycompany.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author matad
 */
public interface UserRepository extends JpaRepository<Usuario, Long>{
    
}
package com.Fundacion.LotoT.util;

import com.Fundacion.LotoT.Security.Entity.Rol;
import com.Fundacion.LotoT.Security.Enums.RolNombre;
import com.Fundacion.LotoT.Security.Service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CreateRoles implements CommandLineRunner {
    @Autowired
    RolService rolService;
    //Creacion de la tabla en la base de datos
    @Override
    public void run(String... args) throws Exception {
        /*Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        rolService.save(rolAdmin);
        rolService.save(rolUser);*/
    }
}

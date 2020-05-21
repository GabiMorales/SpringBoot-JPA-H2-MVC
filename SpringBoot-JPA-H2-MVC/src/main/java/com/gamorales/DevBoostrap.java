package com.gamorales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.gamorales.entity.Rol;
import com.gamorales.repository.RolRepository;

@Component
public class DevBoostrap implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	RolRepository rolRepo;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		rolRepo.save(new Rol("Administrador"));
		rolRepo.save(new Rol("Contable"));
		rolRepo.save(new Rol("Regular"));
		
	}

}

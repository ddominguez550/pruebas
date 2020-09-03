package net.ddr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.ddr.model.Pasatiempo;
import net.ddr.repository.PasatiempoRepository;


@Service
public class PasatiempoService implements IPasatiempoService {
	
	@Autowired
	private PasatiempoRepository pasatiempoRepository;

	@Override
	public List<Pasatiempo> findAll() {
		
		return (List<Pasatiempo>) pasatiempoRepository.findAll();
	}
	
	
	
	

}

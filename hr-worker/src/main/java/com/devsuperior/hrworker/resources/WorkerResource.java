package com.devsuperior.hrworker.resources;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.repositories.WorkerRepository;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

	@Autowired
	private WorkerRepository workerRepository;

	@GetMapping
	public ResponseEntity<Page<Worker>> findAll(Pageable pageable) {
		Page<Worker> cidades = workerRepository.findAll(pageable);
		return ResponseEntity.ok(cidades);
	}

	@GetMapping(value = "/{id}")
	private ResponseEntity<Worker> findById(@PathVariable Long id) {
		Worker worker = workerRepository.findById(id).orElse(null);
		return Objects.isNull(worker) ? ResponseEntity.notFound().build() : ResponseEntity.ok(worker);
	}

}
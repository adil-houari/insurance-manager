package com.pv.insurance;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contracts")
public class InsuranceContractController {

    private final InsuranceContractService service;

    @Autowired
    public InsuranceContractController(InsuranceContractService service) {
        this.service = service;
    }

    @GetMapping
    public List<InsuranceContract> getAllContracts(){
        return service.getAllContracts();
    }

    @GetMapping ("/{id}")
    public ResponseEntity<InsuranceContract> getContractbyId(@PathVariable Long id){
        return service.getContractById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public InsuranceContract createContract(@RequestBody InsuranceContract contract) {
        return service.createContract(contract);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContract(@PathVariable Long id){
        service.deleteContract(id);
        return ResponseEntity.noContent().build();
    }


}

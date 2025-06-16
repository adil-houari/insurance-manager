package com.pv.insurance;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InsuranceContractService {

    private final InsuranceContractRepository repository;

    @Autowired
    public InsuranceContractService(InsuranceContractRepository repository) {
        this.repository = repository;
    }

    public List<InsuranceContract> getAllContracts(){
        return repository.findAll();
    }

    public Optional<InsuranceContract> getContractById(Long id){
        return repository.findById(id);
    }

    public InsuranceContract createContract(InsuranceContract contract){
        return repository.save(contract);
    }

    public void deleteContract(Long id){
        repository.deleteById(id);
    }

}

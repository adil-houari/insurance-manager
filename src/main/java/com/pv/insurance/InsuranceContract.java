package com.pv.insurance;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class InsuranceContract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String policyNumber;
    private String clientName;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double premium;

    @Enumerated(EnumType.STRING)
    private ContractStatus status;

    public enum ContractStatus {
        ACTIVE,
        EXPIRED,
        CANCELLED
    }


}





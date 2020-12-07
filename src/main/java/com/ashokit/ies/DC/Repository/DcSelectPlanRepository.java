package com.ashokit.ies.DC.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.ies.DC.Entity.SelectPlanEntity;

public interface DcSelectPlanRepository extends JpaRepository<SelectPlanEntity, Serializable> {

}

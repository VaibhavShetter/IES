package com.ashokit.ies.DC.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.ies.DC.Entity.CcapPlanEntity;

public interface DcCCAPRepository extends JpaRepository<CcapPlanEntity, Serializable> {
	
	public CcapPlanEntity findBycaseId(Integer caseId);

}

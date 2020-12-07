package com.ashokit.ies.DC.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.ies.DC.Entity.KTWorksEntity;

public interface DcKTWorksRepository extends JpaRepository<KTWorksEntity, Serializable> {
	public KTWorksEntity findBycaseId(Integer caseId);
}

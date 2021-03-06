package com.ashokit.ies.DC.Service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ashokit.ies.ApplicationReg.domain.CitizenAccountDomain;
import com.ashokit.ies.DC.Domain.CreateCaseDomain;
import com.ashokit.ies.DC.Domain.KTWorksDtlsDomain;
import com.ashokit.ies.DC.Domain.SelectPlanDomain;
import com.ashokit.ies.DC.Domain.SnapDtlsDomain;
import com.ashokit.ies.admin.domain.PlanAdminDomain;
import com.ashokit.ies.DC.Domain.CcapDtlsDomain;

@Service
public interface DcService {

	public CitizenAccountDomain CheckApplicationStatus(String appNo);

	public Map<Integer, Boolean> registerCase(CreateCaseDomain createCaseDomain);

	public List<String> loadPlans();

	public Map<Integer, Boolean> registerPlan(SelectPlanDomain selected);

	public Map<Integer, Boolean> registerSnap(SnapDtlsDomain snapDomain);

	public Map<Integer, Boolean> registerKTPlan(KTWorksDtlsDomain ktDomain);
	
	
	public Map<Integer, Boolean> registerCcap (CcapDtlsDomain ccapDomain);

	public Iterable<CcapDtlsDomain> displayAllCcaps();

	public CcapDtlsDomain getCcapbyid(Integer ccapPlanId);

	public boolean isCcapPresent(Integer ccapPlanId);

	public void deleteCcapbyid(Integer ccapPlanId);

}

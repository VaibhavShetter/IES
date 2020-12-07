package com.ashokit.ies.ED.Service;

import com.ashokit.ies.ED.Bindings.EDPlanInfoBinding;

public interface EDService {
	public EDData findCaseId(Integer id);

	public EDPlanInfoBinding registerDetermineEligibility(EDData edData);

	public boolean registerAccount(EDPlanInfoBinding eligibility);
}

package com.payments.psp_router.dto;

import com.payments.psp_router.constants.Outcome;

public record ClientVerdict(Outcome outcome, PspResponse pspResponse) {

    // pspResponse could be null if no response comes back from the PSP

}

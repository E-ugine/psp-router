package com.payments.psp_router.client;

import com.payments.psp_router.dto.PspResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class PspClient {

    private final RestClient client;

    public PspClient(RestClient.Builder builder) {
        this.client = builder.build();
    }

    public PspResponse processPayment() {
            return client.post()
                    .uri("http://localhost:8082/api/payments/process")
                    .retrieve()
                    .body(PspResponse.class);

    }
}
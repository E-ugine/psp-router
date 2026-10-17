package com.payments.psp_router.controller;


import com.payments.psp_router.client.PspClient;
import com.payments.psp_router.dto.PspResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/payments")
public class PaymentController {

private  final PspClient pspClient;

public PaymentController (PspClient pspClient){
    this.pspClient = pspClient;
}
    @PostMapping
    public PspResponse createPayment(){
        return pspClient.processPayment();
    }

}

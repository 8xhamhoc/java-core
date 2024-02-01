package org.quangphan.generics.inheritance;

public class QRCodePaymentDto extends PaymentBaseDto {

    private String rqCode;

    public String getRqCode() {
        return rqCode;
    }

    public void setRqCode(String rqCode) {
        this.rqCode = rqCode;
    }
}

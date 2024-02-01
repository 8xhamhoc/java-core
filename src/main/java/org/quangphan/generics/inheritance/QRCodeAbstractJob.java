package org.quangphan.generics.inheritance;

public class QRCodeAbstractJob extends AbstractJob<QRCodePaymentDto>{

    public QRCodeAbstractJob(QRCodePaymentDto dto) {
        super(dto);
    }

    @Override
    public void run(QRCodePaymentDto qrCodePaymentDto) {

    }
}

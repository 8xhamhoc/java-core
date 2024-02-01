package org.quangphan.generics.inheritance;

public abstract class AbstractJob<T extends PaymentBaseDto> {

    private T dto;

    public AbstractJob(T dto) {
        this.dto = dto;
    }

    public abstract void run(T t);
}

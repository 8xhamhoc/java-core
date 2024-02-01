package org.quangphan.test;

public class ThreadLocalTest {

    private static final ThreadLocal<Tenant> TENANT_HOLDER = new InheritableThreadLocal();

    public static void main(String[] args) {

        Tenant tenant1 = new Tenant("Tatem", "Tatem");
        TENANT_HOLDER.set(tenant1);

        System.out.println(TENANT_HOLDER.get());

        Tenant tenant2 = new Tenant("Tatem", "Tatem2");
        TENANT_HOLDER.set(tenant2);

        System.out.println(TENANT_HOLDER.get());

    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Z42 extends AbstractC0595Ak0<Z42, a> implements JZ0 {
    private static final Z42 DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile InterfaceC5966pc1<Z42> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    public static final class a extends AbstractC0595Ak0.a<Z42, a> implements JZ0 {
    }

    static {
        Z42 z42 = new Z42();
        DEFAULT_INSTANCE = z42;
        AbstractC0595Ak0.u(Z42.class, z42);
    }

    @Override // defpackage.AbstractC0595Ak0
    public final Object q(AbstractC0595Ak0.e eVar) {
        InterfaceC5966pc1 bVar;
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C1930Rm1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", C6561sS.a});
            case 3:
                return new Z42();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5966pc1<Z42> interfaceC5966pc1 = PARSER;
                if (interfaceC5966pc1 != null) {
                    return interfaceC5966pc1;
                }
                synchronized (Z42.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC0595Ak0.b();
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

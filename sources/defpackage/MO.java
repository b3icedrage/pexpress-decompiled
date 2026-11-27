package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class MO extends AbstractC0595Ak0<MO, a> implements JZ0 {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final MO DEFAULT_INSTANCE;
    private static volatile InterfaceC5966pc1<MO> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    public static final class a extends AbstractC0595Ak0.a<MO, a> implements JZ0 {
        public a() {
            super(MO.DEFAULT_INSTANCE);
        }
    }

    static {
        MO mo = new MO();
        DEFAULT_INSTANCE = mo;
        AbstractC0595Ak0.u(MO.class, mo);
    }

    public static void w(MO mo, long j) {
        mo.bitField0_ |= 1;
        mo.clientTimeUs_ = j;
    }

    public static void x(MO mo, long j) {
        mo.bitField0_ |= 2;
        mo.userTimeUs_ = j;
    }

    public static void y(MO mo, long j) {
        mo.bitField0_ |= 4;
        mo.systemTimeUs_ = j;
    }

    public static a z() {
        return DEFAULT_INSTANCE.p();
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
                return new C1930Rm1(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 3:
                return new MO();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5966pc1<MO> interfaceC5966pc1 = PARSER;
                if (interfaceC5966pc1 != null) {
                    return interfaceC5966pc1;
                }
                synchronized (MO.class) {
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

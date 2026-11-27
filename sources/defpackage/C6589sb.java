package defpackage;

/* JADX INFO: renamed from: sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6589sb extends AbstractC0595Ak0<C6589sb, a> implements JZ0 {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final C6589sb DEFAULT_INSTANCE;
    private static volatile InterfaceC5966pc1<C6589sb> PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    /* JADX INFO: renamed from: sb$a */
    public static final class a extends AbstractC0595Ak0.a<C6589sb, a> implements JZ0 {
        public a() {
            super(C6589sb.DEFAULT_INSTANCE);
        }
    }

    static {
        C6589sb c6589sb = new C6589sb();
        DEFAULT_INSTANCE = c6589sb;
        AbstractC0595Ak0.u(C6589sb.class, c6589sb);
    }

    public static void w(C6589sb c6589sb, long j) {
        c6589sb.bitField0_ |= 1;
        c6589sb.clientTimeUs_ = j;
    }

    public static void x(C6589sb c6589sb, int i) {
        c6589sb.bitField0_ |= 2;
        c6589sb.usedAppJavaHeapMemoryKb_ = i;
    }

    public static a y() {
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
                return new C1930Rm1(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 3:
                return new C6589sb();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5966pc1<C6589sb> interfaceC5966pc1 = PARSER;
                if (interfaceC5966pc1 != null) {
                    return interfaceC5966pc1;
                }
                synchronized (C6589sb.class) {
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

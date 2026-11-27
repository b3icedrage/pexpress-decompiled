package defpackage;

/* JADX INFO: renamed from: rk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6416rk0 extends AbstractC0595Ak0<C6416rk0, a> implements JZ0 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final C6416rk0 DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile InterfaceC5966pc1<C6416rk0> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private XB0.c<C6589sb> androidMemoryReadings_;
    private int bitField0_;
    private XB0.c<MO> cpuMetricReadings_;
    private C5997pk0 gaugeMetadata_;
    private String sessionId_ = "";

    /* JADX INFO: renamed from: rk0$a */
    public static final class a extends AbstractC0595Ak0.a<C6416rk0, a> implements JZ0 {
        public a() {
            super(C6416rk0.DEFAULT_INSTANCE);
        }
    }

    static {
        C6416rk0 c6416rk0 = new C6416rk0();
        DEFAULT_INSTANCE = c6416rk0;
        AbstractC0595Ak0.u(C6416rk0.class, c6416rk0);
    }

    public C6416rk0() {
        C0752Ck1<Object> c0752Ck1 = C0752Ck1.h;
        this.cpuMetricReadings_ = c0752Ck1;
        this.androidMemoryReadings_ = c0752Ck1;
    }

    public static C6416rk0 C() {
        return DEFAULT_INSTANCE;
    }

    public static a G() {
        return DEFAULT_INSTANCE.p();
    }

    public static void w(C6416rk0 c6416rk0, String str) {
        c6416rk0.getClass();
        str.getClass();
        c6416rk0.bitField0_ |= 1;
        c6416rk0.sessionId_ = str;
    }

    public static void x(C6416rk0 c6416rk0, C6589sb c6589sb) {
        c6416rk0.getClass();
        c6589sb.getClass();
        XB0.c<C6589sb> cVar = c6416rk0.androidMemoryReadings_;
        if (!cVar.v()) {
            c6416rk0.androidMemoryReadings_ = AbstractC0595Ak0.t(cVar);
        }
        c6416rk0.androidMemoryReadings_.add(c6589sb);
    }

    public static void y(C6416rk0 c6416rk0, C5997pk0 c5997pk0) {
        c6416rk0.getClass();
        c5997pk0.getClass();
        c6416rk0.gaugeMetadata_ = c5997pk0;
        c6416rk0.bitField0_ |= 2;
    }

    public static void z(C6416rk0 c6416rk0, MO mo) {
        c6416rk0.getClass();
        mo.getClass();
        XB0.c<MO> cVar = c6416rk0.cpuMetricReadings_;
        if (!cVar.v()) {
            c6416rk0.cpuMetricReadings_ = AbstractC0595Ak0.t(cVar);
        }
        c6416rk0.cpuMetricReadings_.add(mo);
    }

    public final int A() {
        return this.androidMemoryReadings_.size();
    }

    public final int B() {
        return this.cpuMetricReadings_.size();
    }

    public final C5997pk0 D() {
        C5997pk0 c5997pk0 = this.gaugeMetadata_;
        return c5997pk0 == null ? C5997pk0.z() : c5997pk0;
    }

    public final boolean E() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean F() {
        return (this.bitField0_ & 1) != 0;
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
                return new C1930Rm1(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", MO.class, "gaugeMetadata_", "androidMemoryReadings_", C6589sb.class});
            case 3:
                return new C6416rk0();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5966pc1<C6416rk0> interfaceC5966pc1 = PARSER;
                if (interfaceC5966pc1 != null) {
                    return interfaceC5966pc1;
                }
                synchronized (C6416rk0.class) {
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

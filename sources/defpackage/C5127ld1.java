package defpackage;

/* JADX INFO: renamed from: ld1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5127ld1 extends AbstractC0595Ak0<C5127ld1, a> implements InterfaceC5340md1 {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final C5127ld1 DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile InterfaceC5966pc1<C5127ld1> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private C0822Di applicationInfo_;
    private int bitField0_;
    private C6416rk0 gaugeMetric_;
    private V31 networkRequestMetric_;
    private I02 traceMetric_;
    private Z42 transportInfo_;

    /* JADX INFO: renamed from: ld1$a */
    public static final class a extends AbstractC0595Ak0.a<C5127ld1, a> implements InterfaceC5340md1 {
        public a() {
            super(C5127ld1.DEFAULT_INSTANCE);
        }

        @Override // defpackage.InterfaceC5340md1
        public final boolean g() {
            return ((C5127ld1) this.e).g();
        }

        @Override // defpackage.InterfaceC5340md1
        public final boolean h() {
            return ((C5127ld1) this.e).h();
        }

        @Override // defpackage.InterfaceC5340md1
        public final I02 i() {
            return ((C5127ld1) this.e).i();
        }

        @Override // defpackage.InterfaceC5340md1
        public final boolean j() {
            return ((C5127ld1) this.e).j();
        }

        @Override // defpackage.InterfaceC5340md1
        public final V31 k() {
            return ((C5127ld1) this.e).k();
        }

        @Override // defpackage.InterfaceC5340md1
        public final C6416rk0 m() {
            return ((C5127ld1) this.e).m();
        }
    }

    static {
        C5127ld1 c5127ld1 = new C5127ld1();
        DEFAULT_INSTANCE = c5127ld1;
        AbstractC0595Ak0.u(C5127ld1.class, c5127ld1);
    }

    public static a C() {
        return DEFAULT_INSTANCE.p();
    }

    public static void w(C5127ld1 c5127ld1, C0822Di c0822Di) {
        c5127ld1.getClass();
        c5127ld1.applicationInfo_ = c0822Di;
        c5127ld1.bitField0_ |= 1;
    }

    public static void x(C5127ld1 c5127ld1, C6416rk0 c6416rk0) {
        c5127ld1.getClass();
        c5127ld1.gaugeMetric_ = c6416rk0;
        c5127ld1.bitField0_ |= 8;
    }

    public static void y(C5127ld1 c5127ld1, I02 i02) {
        c5127ld1.getClass();
        c5127ld1.traceMetric_ = i02;
        c5127ld1.bitField0_ |= 2;
    }

    public static void z(C5127ld1 c5127ld1, V31 v31) {
        c5127ld1.getClass();
        c5127ld1.networkRequestMetric_ = v31;
        c5127ld1.bitField0_ |= 4;
    }

    public final C0822Di A() {
        C0822Di c0822Di = this.applicationInfo_;
        return c0822Di == null ? C0822Di.C() : c0822Di;
    }

    public final boolean B() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // defpackage.InterfaceC5340md1
    public final boolean g() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // defpackage.InterfaceC5340md1
    public final boolean h() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // defpackage.InterfaceC5340md1
    public final I02 i() {
        I02 i02 = this.traceMetric_;
        return i02 == null ? I02.J() : i02;
    }

    @Override // defpackage.InterfaceC5340md1
    public final boolean j() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // defpackage.InterfaceC5340md1
    public final V31 k() {
        V31 v31 = this.networkRequestMetric_;
        return v31 == null ? V31.K() : v31;
    }

    @Override // defpackage.InterfaceC5340md1
    public final C6416rk0 m() {
        C6416rk0 c6416rk0 = this.gaugeMetric_;
        return c6416rk0 == null ? C6416rk0.C() : c6416rk0;
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
                return new C1930Rm1(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 3:
                return new C5127ld1();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5966pc1<C5127ld1> interfaceC5966pc1 = PARSER;
                if (interfaceC5966pc1 != null) {
                    return interfaceC5966pc1;
                }
                synchronized (C5127ld1.class) {
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

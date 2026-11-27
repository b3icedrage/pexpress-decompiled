package defpackage;

/* JADX INFO: renamed from: Di, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0822Di extends AbstractC0595Ak0<C0822Di, a> implements JZ0 {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final C0822Di DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile InterfaceC5966pc1<C0822Di> PARSER;
    private C2390Xa androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private C7204vW0<String, String> customAttributes_ = C7204vW0.e;
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    /* JADX INFO: renamed from: Di$a */
    public static final class a extends AbstractC0595Ak0.a<C0822Di, a> implements JZ0 {
        public a() {
            super(C0822Di.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: Di$b */
    public static final class b {
        public static final C6574sW0<String, String> a;

        static {
            EnumC7044uj2.a aVar = EnumC7044uj2.h;
            a = new C6574sW0<>(aVar, aVar, "");
        }
    }

    static {
        C0822Di c0822Di = new C0822Di();
        DEFAULT_INSTANCE = c0822Di;
        AbstractC0595Ak0.u(C0822Di.class, c0822Di);
    }

    public static void A(C0822Di c0822Di, C2390Xa c2390Xa) {
        c0822Di.getClass();
        c0822Di.androidAppInfo_ = c2390Xa;
        c0822Di.bitField0_ |= 4;
    }

    public static C0822Di C() {
        return DEFAULT_INSTANCE;
    }

    public static a H() {
        return DEFAULT_INSTANCE.p();
    }

    public static void w(C0822Di c0822Di, String str) {
        c0822Di.getClass();
        str.getClass();
        c0822Di.bitField0_ |= 1;
        c0822Di.googleAppId_ = str;
    }

    public static void x(C0822Di c0822Di, EnumC1134Hi enumC1134Hi) {
        c0822Di.getClass();
        c0822Di.applicationProcessState_ = enumC1134Hi.d;
        c0822Di.bitField0_ |= 8;
    }

    public static C7204vW0 y(C0822Di c0822Di) {
        C7204vW0<String, String> c7204vW0 = c0822Di.customAttributes_;
        if (!c7204vW0.d) {
            c0822Di.customAttributes_ = c7204vW0.e();
        }
        return c0822Di.customAttributes_;
    }

    public static void z(C0822Di c0822Di, String str) {
        c0822Di.getClass();
        str.getClass();
        c0822Di.bitField0_ |= 2;
        c0822Di.appInstanceId_ = str;
    }

    public final C2390Xa B() {
        C2390Xa c2390Xa = this.androidAppInfo_;
        return c2390Xa == null ? C2390Xa.z() : c2390Xa;
    }

    public final boolean D() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean E() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean F() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean G() {
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
                return new C1930Rm1(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", EnumC1134Hi.a.a, "customAttributes_", b.a});
            case 3:
                return new C0822Di();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5966pc1<C0822Di> interfaceC5966pc1 = PARSER;
                if (interfaceC5966pc1 != null) {
                    return interfaceC5966pc1;
                }
                synchronized (C0822Di.class) {
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

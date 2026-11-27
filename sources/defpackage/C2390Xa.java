package defpackage;

/* JADX INFO: renamed from: Xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2390Xa extends AbstractC0595Ak0<C2390Xa, a> implements JZ0 {
    private static final C2390Xa DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC5966pc1<C2390Xa> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    /* JADX INFO: renamed from: Xa$a */
    public static final class a extends AbstractC0595Ak0.a<C2390Xa, a> implements JZ0 {
        public a() {
            super(C2390Xa.DEFAULT_INSTANCE);
        }
    }

    static {
        C2390Xa c2390Xa = new C2390Xa();
        DEFAULT_INSTANCE = c2390Xa;
        AbstractC0595Ak0.u(C2390Xa.class, c2390Xa);
    }

    public static a C() {
        return DEFAULT_INSTANCE.p();
    }

    public static void w(C2390Xa c2390Xa, String str) {
        c2390Xa.getClass();
        str.getClass();
        c2390Xa.bitField0_ |= 1;
        c2390Xa.packageName_ = str;
    }

    public static void x(C2390Xa c2390Xa) {
        c2390Xa.getClass();
        c2390Xa.bitField0_ |= 2;
        c2390Xa.sdkVersion_ = "20.3.1";
    }

    public static void y(C2390Xa c2390Xa, String str) {
        c2390Xa.getClass();
        c2390Xa.bitField0_ |= 4;
        c2390Xa.versionName_ = str;
    }

    public static C2390Xa z() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return (this.bitField0_ & 1) != 0;
    }

    public final boolean B() {
        return (this.bitField0_ & 2) != 0;
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
                return new C1930Rm1(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 3:
                return new C2390Xa();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5966pc1<C2390Xa> interfaceC5966pc1 = PARSER;
                if (interfaceC5966pc1 != null) {
                    return interfaceC5966pc1;
                }
                synchronized (C2390Xa.class) {
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

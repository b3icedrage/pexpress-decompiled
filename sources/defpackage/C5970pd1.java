package defpackage;

import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: renamed from: pd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5970pd1 extends AbstractC0595Ak0<C5970pd1, b> implements JZ0 {
    private static final C5970pd1 DEFAULT_INSTANCE;
    private static volatile InterfaceC5966pc1<C5970pd1> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final WB0<Integer, EnumC2918bJ1> sessionVerbosity_converter_ = new a();
    private int bitField0_;
    private String sessionId_ = "";
    private XB0.b sessionVerbosity_ = C7772yB0.h;

    /* JADX INFO: renamed from: pd1$a */
    public class a implements WB0<Integer, EnumC2918bJ1> {
    }

    /* JADX INFO: renamed from: pd1$b */
    public static final class b extends AbstractC0595Ak0.a<C5970pd1, b> implements JZ0 {
        public b() {
            super(C5970pd1.DEFAULT_INSTANCE);
        }
    }

    static {
        C5970pd1 c5970pd1 = new C5970pd1();
        DEFAULT_INSTANCE = c5970pd1;
        AbstractC0595Ak0.u(C5970pd1.class, c5970pd1);
    }

    public static b A() {
        return DEFAULT_INSTANCE.p();
    }

    public static void w(C5970pd1 c5970pd1, String str) {
        c5970pd1.getClass();
        str.getClass();
        c5970pd1.bitField0_ |= 1;
        c5970pd1.sessionId_ = str;
    }

    public static void x(C5970pd1 c5970pd1) {
        c5970pd1.getClass();
        RandomAccess randomAccess = c5970pd1.sessionVerbosity_;
        if (!((V0) randomAccess).d) {
            C7772yB0 c7772yB0 = (C7772yB0) randomAccess;
            int i = c7772yB0.g;
            int i2 = i == 0 ? 10 : i * 2;
            if (i2 < i) {
                throw new IllegalArgumentException();
            }
            c5970pd1.sessionVerbosity_ = new C7772yB0(Arrays.copyOf(c7772yB0.e, i2), c7772yB0.g);
        }
        ((C7772yB0) c5970pd1.sessionVerbosity_).b(1);
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
                return new C1930Rm1(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", EnumC2918bJ1.a.a});
            case 3:
                return new C5970pd1();
            case 4:
                return new b();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5966pc1<C5970pd1> interfaceC5966pc1 = PARSER;
                if (interfaceC5966pc1 != null) {
                    return interfaceC5966pc1;
                }
                synchronized (C5970pd1.class) {
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

    public final EnumC2918bJ1 y() {
        EnumC2918bJ1 enumC2918bJ1;
        WB0<Integer, EnumC2918bJ1> wb0 = sessionVerbosity_converter_;
        int iD = ((C7772yB0) this.sessionVerbosity_).d(0);
        ((a) wb0).getClass();
        EnumC2918bJ1 enumC2918bJ2 = EnumC2918bJ1.SESSION_VERBOSITY_NONE;
        if (iD != 0) {
            enumC2918bJ1 = iD != 1 ? null : EnumC2918bJ1.GAUGES_AND_SYSTEM_EVENTS;
        } else {
            enumC2918bJ1 = enumC2918bJ2;
        }
        return enumC2918bJ1 == null ? enumC2918bJ2 : enumC2918bJ1;
    }

    public final int z() {
        return ((C7772yB0) this.sessionVerbosity_).size();
    }
}

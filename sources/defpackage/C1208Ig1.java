package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: Ig1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1208Ig1 extends AbstractC8097zk0<C1208Ig1, a> implements LZ0 {
    private static final C1208Ig1 DEFAULT_INSTANCE;
    private static volatile InterfaceC6805tc1<C1208Ig1> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private C7415wW0<String, C1364Kg1> preferences_ = C7415wW0.e;

    /* JADX INFO: renamed from: Ig1$a */
    public static final class a extends AbstractC8097zk0.a<C1208Ig1, a> implements LZ0 {
        public a() {
            super(C1208Ig1.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: renamed from: Ig1$b */
    public static final class b {
        public static final C6364rW0<String, C1364Kg1> a = new C6364rW0<>(EnumC6834tj2.g, EnumC6834tj2.i, C1364Kg1.B());
    }

    static {
        C1208Ig1 c1208Ig1 = new C1208Ig1();
        DEFAULT_INSTANCE = c1208Ig1;
        AbstractC8097zk0.p(C1208Ig1.class, c1208Ig1);
    }

    public static C7415wW0 r(C1208Ig1 c1208Ig1) {
        C7415wW0<String, C1364Kg1> c7415wW0 = c1208Ig1.preferences_;
        if (!c7415wW0.d) {
            c1208Ig1.preferences_ = c7415wW0.e();
        }
        return c1208Ig1.preferences_;
    }

    public static a t() {
        return (a) ((AbstractC8097zk0.a) DEFAULT_INSTANCE.i(AbstractC8097zk0.f.i));
    }

    public static C1208Ig1 u(FileInputStream fileInputStream) {
        CE bVar;
        C1208Ig1 c1208Ig1 = DEFAULT_INSTANCE;
        if (fileInputStream == null) {
            byte[] bArr = VB0.b;
            bVar = CE.d(bArr, 0, bArr.length, false);
        } else {
            bVar = new CE.b(fileInputStream);
        }
        C1423La0 c1423La0A = C1423La0.a();
        C1208Ig1 c1208Ig1O = c1208Ig1.o();
        try {
            C0674Bk1 c0674Bk1 = C0674Bk1.c;
            c0674Bk1.getClass();
            InterfaceC7989zD1 interfaceC7989zD1A = c0674Bk1.a(c1208Ig1O.getClass());
            FE fe = bVar.d;
            if (fe == null) {
                fe = new FE(bVar);
            }
            interfaceC7989zD1A.e(c1208Ig1O, fe, c1423La0A);
            interfaceC7989zD1A.b(c1208Ig1O);
            if (AbstractC8097zk0.l(c1208Ig1O, true)) {
                return c1208Ig1O;
            }
            throw new C6724tC0(new D82().getMessage());
        } catch (D82 e) {
            throw new C6724tC0(e.getMessage());
        } catch (C6724tC0 e2) {
            if (e2.d) {
                throw new C6724tC0(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof C6724tC0) {
                throw ((C6724tC0) e3.getCause());
            }
            throw new C6724tC0(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C6724tC0) {
                throw ((C6724tC0) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // defpackage.AbstractC8097zk0
    public final Object i(AbstractC8097zk0.f fVar) {
        InterfaceC6805tc1 bVar;
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C2008Sm1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.a});
            case 3:
                return new C1208Ig1();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6805tc1<C1208Ig1> interfaceC6805tc1 = PARSER;
                if (interfaceC6805tc1 != null) {
                    return interfaceC6805tc1;
                }
                synchronized (C1208Ig1.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC8097zk0.b();
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

    public final Map<String, C1364Kg1> s() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}

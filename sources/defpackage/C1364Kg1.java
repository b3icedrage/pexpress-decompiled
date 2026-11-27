package defpackage;

/* JADX INFO: renamed from: Kg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1364Kg1 extends AbstractC8097zk0<C1364Kg1, a> implements LZ0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final C1364Kg1 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC6805tc1<C1364Kg1> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    /* JADX INFO: renamed from: Kg1$a */
    public static final class a extends AbstractC8097zk0.a<C1364Kg1, a> implements LZ0 {
        public a() {
            super(C1364Kg1.DEFAULT_INSTANCE);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: Kg1$b */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final b g;
        public static final b h;
        public static final b i;
        public static final b j;
        public static final b k;
        public static final b l;
        public static final b m;
        public static final /* synthetic */ b[] n;

        static {
            b bVar = new b("BOOLEAN", 0);
            d = bVar;
            b bVar2 = new b("FLOAT", 1);
            e = bVar2;
            b bVar3 = new b("INTEGER", 2);
            g = bVar3;
            b bVar4 = new b("LONG", 3);
            h = bVar4;
            b bVar5 = new b("STRING", 4);
            i = bVar5;
            b bVar6 = new b("STRING_SET", 5);
            j = bVar6;
            b bVar7 = new b("DOUBLE", 6);
            k = bVar7;
            b bVar8 = new b("BYTES", 7);
            l = bVar8;
            b bVar9 = new b("VALUE_NOT_SET", 8);
            m = bVar9;
            n = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) n.clone();
        }
    }

    static {
        C1364Kg1 c1364Kg1 = new C1364Kg1();
        DEFAULT_INSTANCE = c1364Kg1;
        AbstractC8097zk0.p(C1364Kg1.class, c1364Kg1);
    }

    public static C1364Kg1 B() {
        return DEFAULT_INSTANCE;
    }

    public static a J() {
        return (a) ((AbstractC8097zk0.a) DEFAULT_INSTANCE.i(AbstractC8097zk0.f.i));
    }

    public static void q(C1364Kg1 c1364Kg1, long j) {
        c1364Kg1.valueCase_ = 4;
        c1364Kg1.value_ = Long.valueOf(j);
    }

    public static void r(C1364Kg1 c1364Kg1, String str) {
        c1364Kg1.getClass();
        str.getClass();
        c1364Kg1.valueCase_ = 5;
        c1364Kg1.value_ = str;
    }

    public static void s(C1364Kg1 c1364Kg1, C1286Jg1 c1286Jg1) {
        c1364Kg1.getClass();
        c1364Kg1.value_ = c1286Jg1;
        c1364Kg1.valueCase_ = 6;
    }

    public static void t(C1364Kg1 c1364Kg1, double d) {
        c1364Kg1.valueCase_ = 7;
        c1364Kg1.value_ = Double.valueOf(d);
    }

    public static void u(C1364Kg1 c1364Kg1, AbstractC1565Mw.f fVar) {
        c1364Kg1.getClass();
        c1364Kg1.valueCase_ = 8;
        c1364Kg1.value_ = fVar;
    }

    public static void w(C1364Kg1 c1364Kg1, boolean z) {
        c1364Kg1.valueCase_ = 1;
        c1364Kg1.value_ = Boolean.valueOf(z);
    }

    public static void x(C1364Kg1 c1364Kg1, float f) {
        c1364Kg1.valueCase_ = 2;
        c1364Kg1.value_ = Float.valueOf(f);
    }

    public static void y(C1364Kg1 c1364Kg1, int i) {
        c1364Kg1.valueCase_ = 3;
        c1364Kg1.value_ = Integer.valueOf(i);
    }

    public final AbstractC1565Mw A() {
        return this.valueCase_ == 8 ? (AbstractC1565Mw) this.value_ : AbstractC1565Mw.e;
    }

    public final double C() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float D() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int E() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long F() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String G() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final C1286Jg1 H() {
        return this.valueCase_ == 6 ? (C1286Jg1) this.value_ : C1286Jg1.s();
    }

    public final b I() {
        switch (this.valueCase_) {
            case 0:
                return b.m;
            case 1:
                return b.d;
            case 2:
                return b.e;
            case 3:
                return b.g;
            case 4:
                return b.h;
            case 5:
                return b.i;
            case 6:
                return b.j;
            case 7:
                return b.k;
            case 8:
                return b.l;
            default:
                return null;
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
                return new C2008Sm1(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", C1286Jg1.class});
            case 3:
                return new C1364Kg1();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6805tc1<C1364Kg1> interfaceC6805tc1 = PARSER;
                if (interfaceC6805tc1 != null) {
                    return interfaceC6805tc1;
                }
                synchronized (C1364Kg1.class) {
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

    public final boolean z() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class I02 extends AbstractC0595Ak0<I02, a> implements JZ0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final I02 DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile InterfaceC5966pc1<I02> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private C7204vW0<String, Long> counters_;
    private C7204vW0<String, String> customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_;
    private XB0.c<C5970pd1> perfSessions_;
    private XB0.c<I02> subtraces_;

    public static final class a extends AbstractC0595Ak0.a<I02, a> implements JZ0 {
        public a() {
            super(I02.DEFAULT_INSTANCE);
        }

        public final void s(I02 i02) {
            p();
            I02.y((I02) this.e, i02);
        }

        public final void t(String str, long j) {
            str.getClass();
            p();
            I02.x((I02) this.e).put(str, Long.valueOf(j));
        }

        public final void v(long j) {
            p();
            I02.D((I02) this.e, j);
        }

        public final void w(long j) {
            p();
            I02.E((I02) this.e, j);
        }

        public final void x(String str) {
            p();
            I02.w((I02) this.e, str);
        }
    }

    public static final class b {
        public static final C6574sW0<String, Long> a = new C6574sW0<>(EnumC7044uj2.h, EnumC7044uj2.g, 0L);
    }

    public static final class c {
        public static final C6574sW0<String, String> a;

        static {
            EnumC7044uj2.a aVar = EnumC7044uj2.h;
            a = new C6574sW0<>(aVar, aVar, "");
        }
    }

    static {
        I02 i02 = new I02();
        DEFAULT_INSTANCE = i02;
        AbstractC0595Ak0.u(I02.class, i02);
    }

    public I02() {
        C7204vW0 c7204vW0 = C7204vW0.e;
        this.counters_ = c7204vW0;
        this.customAttributes_ = c7204vW0;
        this.name_ = "";
        C0752Ck1<Object> c0752Ck1 = C0752Ck1.h;
        this.subtraces_ = c0752Ck1;
        this.perfSessions_ = c0752Ck1;
    }

    public static C7204vW0 A(I02 i02) {
        C7204vW0<String, String> c7204vW0 = i02.customAttributes_;
        if (!c7204vW0.d) {
            i02.customAttributes_ = c7204vW0.e();
        }
        return i02.customAttributes_;
    }

    public static void B(I02 i02, C5970pd1 c5970pd1) {
        i02.getClass();
        XB0.c<C5970pd1> cVar = i02.perfSessions_;
        if (!cVar.v()) {
            i02.perfSessions_ = AbstractC0595Ak0.t(cVar);
        }
        i02.perfSessions_.add(c5970pd1);
    }

    public static void C(I02 i02, List list) {
        XB0.c<C5970pd1> cVar = i02.perfSessions_;
        if (!cVar.v()) {
            i02.perfSessions_ = AbstractC0595Ak0.t(cVar);
        }
        G0.c(list, i02.perfSessions_);
    }

    public static void D(I02 i02, long j) {
        i02.bitField0_ |= 4;
        i02.clientStartTimeUs_ = j;
    }

    public static void E(I02 i02, long j) {
        i02.bitField0_ |= 8;
        i02.durationUs_ = j;
    }

    public static I02 J() {
        return DEFAULT_INSTANCE;
    }

    public static a P() {
        return DEFAULT_INSTANCE.p();
    }

    public static void w(I02 i02, String str) {
        i02.getClass();
        str.getClass();
        i02.bitField0_ |= 1;
        i02.name_ = str;
    }

    public static C7204vW0 x(I02 i02) {
        C7204vW0<String, Long> c7204vW0 = i02.counters_;
        if (!c7204vW0.d) {
            i02.counters_ = c7204vW0.e();
        }
        return i02.counters_;
    }

    public static void y(I02 i02, I02 i03) {
        i02.getClass();
        i03.getClass();
        XB0.c<I02> cVar = i02.subtraces_;
        if (!cVar.v()) {
            i02.subtraces_ = AbstractC0595Ak0.t(cVar);
        }
        i02.subtraces_.add(i03);
    }

    public static void z(I02 i02, ArrayList arrayList) {
        XB0.c<I02> cVar = i02.subtraces_;
        if (!cVar.v()) {
            i02.subtraces_ = AbstractC0595Ak0.t(cVar);
        }
        G0.c(arrayList, i02.subtraces_);
    }

    public final boolean F() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    public final int G() {
        return this.counters_.size();
    }

    public final Map<String, Long> H() {
        return Collections.unmodifiableMap(this.counters_);
    }

    public final Map<String, String> I() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    public final long K() {
        return this.durationUs_;
    }

    public final String L() {
        return this.name_;
    }

    public final XB0.c M() {
        return this.perfSessions_;
    }

    public final XB0.c N() {
        return this.subtraces_;
    }

    public final boolean O() {
        return (this.bitField0_ & 4) != 0;
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
                return new C1930Rm1(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", b.a, "subtraces_", I02.class, "customAttributes_", c.a, "perfSessions_", C5970pd1.class});
            case 3:
                return new I02();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC5966pc1<I02> interfaceC5966pc1 = PARSER;
                if (interfaceC5966pc1 != null) {
                    return interfaceC5966pc1;
                }
                synchronized (I02.class) {
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

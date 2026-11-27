package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Iq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1237Iq0 implements UB0 {

    @NotNull
    public final b a;

    @NotNull
    public volatile C6702t60 b;

    @NotNull
    public volatile a c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: Iq0$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final /* synthetic */ a[] h;

        static {
            a aVar = new a("NONE", 0);
            d = aVar;
            a aVar2 = new a("BASIC", 1);
            a aVar3 = new a("HEADERS", 2);
            e = aVar3;
            a aVar4 = new a("BODY", 3);
            g = aVar4;
            h = new a[]{aVar, aVar2, aVar3, aVar4};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) h.clone();
        }
    }

    /* JADX INFO: renamed from: Iq0$b */
    public interface b {

        @NotNull
        public static final C1315Jq0 a = new C1315Jq0();

        void a(@NotNull String str);
    }

    public C1237Iq0(@NotNull b logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.a = logger;
        this.b = C6702t60.d;
        this.c = a.d;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:80:0x0200  */
    /* JADX WARN: Code duplicated, block: B:83:0x021c  */
    /* JADX WARN: Code duplicated, block: B:84:0x021f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0243  */
    /* JADX WARN: Code duplicated, block: B:88:0x024c  */
    /* JADX WARN: Code duplicated, block: B:91:0x025f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0268 A[LOOP:1: B:92:0x0266->B:93:0x0268, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x01ee, please report this as an issue */
    @Override // defpackage.UB0
    @NotNull
    public final C0857Dt1 a(@NotNull C5593no1 chain) throws Exception {
        String strJ;
        boolean z;
        boolean z2;
        C0857Dt1 c0857Dt1B;
        long jF;
        String str;
        String strC;
        String strD;
        C2813ao0 c2813ao0;
        int size;
        int i;
        Long lValueOf;
        Charset UTF_8;
        Intrinsics.checkNotNullParameter(chain, "chain");
        a aVar = this.c;
        C4543is1 c4543is1 = chain.e;
        if (aVar == a.d) {
            return chain.b(c4543is1);
        }
        boolean z3 = true;
        boolean z4 = aVar == a.g;
        if (!z4 && aVar != a.e) {
            z3 = false;
        }
        AbstractC5395ms1 abstractC5395ms1 = c4543is1.d;
        K90 k90 = chain.d;
        C3442do1 c3442do1 = k90 != null ? k90.f : null;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(c4543is1.b);
        sb.append(' ');
        sb.append(c4543is1.a);
        String str2 = " ";
        if (c3442do1 != null) {
            EnumC1298Jk1 enumC1298Jk1 = c3442do1.f;
            Intrinsics.checkNotNull(enumC1298Jk1);
            strJ = Intrinsics.j(enumC1298Jk1, " ");
        } else {
            strJ = "";
        }
        sb.append(strJ);
        String string = sb.toString();
        if (!z3 && abstractC5395ms1 != null) {
            StringBuilder sbB = K1.b(string, " (");
            sbB.append(abstractC5395ms1.a());
            sbB.append("-byte body)");
            string = sbB.toString();
        }
        this.a.a(string);
        try {
            if (z3) {
                C2813ao0 c2813ao1 = c4543is1.c;
                z = z4;
                if (abstractC5395ms1 != null) {
                    CY0 cy0B = abstractC5395ms1.b();
                    if (cy0B == null) {
                        z2 = z3;
                    } else {
                        z2 = z3;
                        if (c2813ao1.b("Content-Type") == null) {
                            this.a.a(Intrinsics.j(cy0B, "Content-Type: "));
                        }
                        if (abstractC5395ms1.a() != -1 && c2813ao1.b("Content-Length") == null) {
                            this.a.a(Intrinsics.j(Long.valueOf(abstractC5395ms1.a()), "Content-Length: "));
                        }
                    }
                    if (abstractC5395ms1.a() != -1) {
                        this.a.a(Intrinsics.j(Long.valueOf(abstractC5395ms1.a()), "Content-Length: "));
                    }
                } else {
                    z2 = z3;
                    str2 = " ";
                }
                int size2 = c2813ao1.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    b(c2813ao1, i2);
                }
                if (!z || abstractC5395ms1 == null) {
                    this.a.a(Intrinsics.j(c4543is1.b, "--> END "));
                } else {
                    String strB = c4543is1.c.b("Content-Encoding");
                    if (strB != null && !strB.equalsIgnoreCase("identity") && !strB.equalsIgnoreCase("gzip")) {
                        this.a.a("--> END " + c4543is1.b + " (encoded body omitted)");
                    } else if (abstractC5395ms1 instanceof C2721aS1) {
                        this.a.a("--> END " + c4543is1.b + " (one-shot body omitted)");
                    } else {
                        C1481Lu c1481Lu = new C1481Lu();
                        abstractC5395ms1.c(c1481Lu);
                        CY0 cy0B2 = abstractC5395ms1.b();
                        Charset UTF_9 = cy0B2 == null ? null : cy0B2.a(StandardCharsets.UTF_8);
                        if (UTF_9 == null) {
                            UTF_9 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_9, "UTF_8");
                        }
                        this.a.a("");
                        if (C6561sS.k(c1481Lu)) {
                            this.a.a(c1481Lu.C0(UTF_9));
                            this.a.a("--> END " + c4543is1.b + " (" + abstractC5395ms1.a() + "-byte body)");
                        } else {
                            this.a.a("--> END " + c4543is1.b + " (binary " + abstractC5395ms1.a() + "-byte body omitted)");
                        }
                    }
                }
                long jNanoTime = System.nanoTime();
                c0857Dt1B = chain.b(c4543is1);
                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
                AbstractC1091Gt1 abstractC1091Gt1 = c0857Dt1B.k;
                Intrinsics.checkNotNull(abstractC1091Gt1);
                jF = abstractC1091Gt1.f();
                if (jF != -1) {
                    str = jF + "-byte";
                } else {
                    str = "unknown-length";
                }
                b bVar = this.a;
                StringBuilder sb2 = new StringBuilder("<-- ");
                sb2.append(c0857Dt1B.h);
                if (c0857Dt1B.g.length() == 0) {
                    strC = r12;
                } else {
                    strC = C5491nL.c(str2, c0857Dt1B.g);
                }
                sb2.append(strC);
                sb2.append(' ');
                sb2.append(c0857Dt1B.d.a);
                sb2.append(" (");
                sb2.append(millis);
                sb2.append("ms");
                if (z2) {
                    strD = r12;
                } else {
                    strD = C1039Gc0.d(", ", str, " body");
                }
                sb2.append(strD);
                sb2.append(')');
                bVar.a(sb2.toString());
                if (z2) {
                    c2813ao0 = c0857Dt1B.j;
                    size = c2813ao0.size();
                    for (i = 0; i < size; i++) {
                        b(c2813ao0, i);
                    }
                    if (!z && C1081Gq0.a(c0857Dt1B)) {
                        String strB2 = c0857Dt1B.j.b("Content-Encoding");
                        if (strB2 != null && !strB2.equalsIgnoreCase("identity") && !strB2.equalsIgnoreCase("gzip")) {
                            this.a.a("<-- END HTTP (encoded body omitted)");
                            return c0857Dt1B;
                        }
                        InterfaceC2833av interfaceC2833avK = abstractC1091Gt1.k();
                        interfaceC2833avK.s(Long.MAX_VALUE);
                        C1481Lu c1481LuN = interfaceC2833avK.n();
                        if ("gzip".equalsIgnoreCase(c2813ao0.b("Content-Encoding"))) {
                            lValueOf = Long.valueOf(c1481LuN.e);
                            C6009pn0 c6009pn0 = new C6009pn0(c1481LuN.clone());
                            try {
                                c1481LuN = new C1481Lu();
                                c1481LuN.l0(c6009pn0);
                                c6009pn0.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    C6621sj.b(c6009pn0, th);
                                    throw th2;
                                }
                            }
                        } else {
                            lValueOf = null;
                        }
                        CY0 cy0G = abstractC1091Gt1.g();
                        Charset charsetA = cy0G == null ? null : cy0G.a(StandardCharsets.UTF_8);
                        if (charsetA == null) {
                            UTF_8 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                        } else {
                            UTF_8 = charsetA;
                        }
                        if (!C6561sS.k(c1481LuN)) {
                            this.a.a("");
                            this.a.a("<-- END HTTP (binary " + c1481LuN.e + "-byte body omitted)");
                            return c0857Dt1B;
                        }
                        if (jF != 0) {
                            this.a.a("");
                            this.a.a(c1481LuN.clone().C0(UTF_8));
                        }
                        if (lValueOf == null) {
                            this.a.a("<-- END HTTP (" + c1481LuN.e + "-byte body)");
                            return c0857Dt1B;
                        }
                        this.a.a("<-- END HTTP (" + c1481LuN.e + "-byte, " + lValueOf + "-gzipped-byte body)");
                        return c0857Dt1B;
                    }
                    this.a.a("<-- END HTTP");
                }
                return c0857Dt1B;
            }
            z = z4;
            z2 = z3;
            str2 = " ";
            c0857Dt1B = chain.b(c4543is1);
            long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            AbstractC1091Gt1 abstractC1091Gt2 = c0857Dt1B.k;
            Intrinsics.checkNotNull(abstractC1091Gt2);
            jF = abstractC1091Gt2.f();
            if (jF != -1) {
                str = jF + "-byte";
            } else {
                str = "unknown-length";
            }
            b bVar2 = this.a;
            StringBuilder sb3 = new StringBuilder("<-- ");
            sb3.append(c0857Dt1B.h);
            if (c0857Dt1B.g.length() == 0) {
                strC = r12;
            } else {
                strC = C5491nL.c(str2, c0857Dt1B.g);
            }
            sb3.append(strC);
            sb3.append(' ');
            sb3.append(c0857Dt1B.d.a);
            sb3.append(" (");
            sb3.append(millis2);
            sb3.append("ms");
            if (z2) {
                strD = C1039Gc0.d(", ", str, " body");
            } else {
                strD = r12;
            }
            sb3.append(strD);
            sb3.append(')');
            bVar2.a(sb3.toString());
            if (z2) {
                c2813ao0 = c0857Dt1B.j;
                size = c2813ao0.size();
                while (i < size) {
                    b(c2813ao0, i);
                }
                if (!z) {
                }
                this.a.a("<-- END HTTP");
            }
            return c0857Dt1B;
        } catch (Exception e) {
            this.a.a(Intrinsics.j(e, "<-- HTTP FAILED: "));
            throw e;
        }
        long jNanoTime2 = System.nanoTime();
    }

    public final void b(C2813ao0 c2813ao0, int i) {
        this.b.contains(c2813ao0.c(i));
        String strF = c2813ao0.f(i);
        this.a.a(c2813ao0.c(i) + ": " + strF);
    }
}

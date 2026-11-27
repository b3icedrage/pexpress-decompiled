package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1257Ix implements UB0 {
    public final boolean a;

    public C1257Ix(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0186 A[Catch: IOException -> 0x0184, TryCatch #8 {IOException -> 0x0184, blocks: (B:94:0x016f, B:98:0x0177, B:102:0x0194, B:104:0x01a0, B:111:0x01bb, B:113:0x01bf, B:117:0x01cc, B:119:0x01df, B:120:0x01e7, B:121:0x01f1, B:106:0x01aa, B:101:0x0186), top: B:146:0x016f }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01a0 A[Catch: IOException -> 0x0184, TryCatch #8 {IOException -> 0x0184, blocks: (B:94:0x016f, B:98:0x0177, B:102:0x0194, B:104:0x01a0, B:111:0x01bb, B:113:0x01bf, B:117:0x01cc, B:119:0x01df, B:120:0x01e7, B:121:0x01f1, B:106:0x01aa, B:101:0x0186), top: B:146:0x016f }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01aa A[Catch: IOException -> 0x0184, TryCatch #8 {IOException -> 0x0184, blocks: (B:94:0x016f, B:98:0x0177, B:102:0x0194, B:104:0x01a0, B:111:0x01bb, B:113:0x01bf, B:117:0x01cc, B:119:0x01df, B:120:0x01e7, B:121:0x01f1, B:106:0x01aa, B:101:0x0186), top: B:146:0x016f }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:111:0x01bb A[Catch: IOException -> 0x0184, TryCatch #8 {IOException -> 0x0184, blocks: (B:94:0x016f, B:98:0x0177, B:102:0x0194, B:104:0x01a0, B:111:0x01bb, B:113:0x01bf, B:117:0x01cc, B:119:0x01df, B:120:0x01e7, B:121:0x01f1, B:106:0x01aa, B:101:0x0186), top: B:146:0x016f }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01bf A[Catch: IOException -> 0x0184, TryCatch #8 {IOException -> 0x0184, blocks: (B:94:0x016f, B:98:0x0177, B:102:0x0194, B:104:0x01a0, B:111:0x01bb, B:113:0x01bf, B:117:0x01cc, B:119:0x01df, B:120:0x01e7, B:121:0x01f1, B:106:0x01aa, B:101:0x0186), top: B:146:0x016f }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:117:0x01cc A[Catch: IOException -> 0x0184, TryCatch #8 {IOException -> 0x0184, blocks: (B:94:0x016f, B:98:0x0177, B:102:0x0194, B:104:0x01a0, B:111:0x01bb, B:113:0x01bf, B:117:0x01cc, B:119:0x01df, B:120:0x01e7, B:121:0x01f1, B:106:0x01aa, B:101:0x0186), top: B:146:0x016f }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01df A[Catch: IOException -> 0x0184, TryCatch #8 {IOException -> 0x0184, blocks: (B:94:0x016f, B:98:0x0177, B:102:0x0194, B:104:0x01a0, B:111:0x01bb, B:113:0x01bf, B:117:0x01cc, B:119:0x01df, B:120:0x01e7, B:121:0x01f1, B:106:0x01aa, B:101:0x0186), top: B:146:0x016f }] */
    /* JADX WARN: Code duplicated, block: B:124:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:127:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:129:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa A[Catch: IOException -> 0x010c, TryCatch #7 {IOException -> 0x010c, blocks: (B:72:0x00f1, B:74:0x00fa, B:79:0x010e, B:88:0x013d, B:90:0x0146, B:91:0x0149, B:92:0x0165), top: B:144:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0109 A[PHI: r16
      0x0109: PHI (r16v3 Dt1$a) = (r16v2 Dt1$a), (r16v4 Dt1$a) binds: [B:70:0x00ee, B:73:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0132  */
    /* JADX WARN: Code duplicated, block: B:83:0x0134  */
    /* JADX WARN: Code duplicated, block: B:90:0x0146 A[Catch: IOException -> 0x010c, TryCatch #7 {IOException -> 0x010c, blocks: (B:72:0x00f1, B:74:0x00fa, B:79:0x010e, B:88:0x013d, B:90:0x0146, B:91:0x0149, B:92:0x0165), top: B:144:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0173  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v5 */
    @Override // defpackage.UB0
    @NotNull
    public final C0857Dt1 a(@NotNull C5593no1 chain) throws Throwable {
        Long lValueOf;
        C0857Dt1.a aVarD;
        ?? r10;
        C0857Dt1.a aVar;
        C0857Dt1 response;
        int i;
        C3233co1 c3233co1;
        AbstractC7971z80 abstractC7971z80;
        C0857Dt1 c0857Dt1A;
        AbstractC1091Gt1 abstractC1091Gt1;
        long jF;
        AbstractC1091Gt1 abstractC1091Gt2;
        C0857Dt1.a aVarD2;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(chain, "chain");
        K90 k90 = chain.d;
        Intrinsics.checkNotNull(k90);
        C4543is1 request = chain.e;
        AbstractC5395ms1 abstractC5395ms1 = request.d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z3 = true;
        try {
            C3233co1 c3233co2 = k90.a;
            AbstractC7971z80 abstractC7971z81 = k90.b;
            L90 l90 = k90.d;
            Intrinsics.checkNotNullParameter(request, "request");
            try {
                try {
                    abstractC7971z81.u(c3233co2);
                    l90.a(request);
                    abstractC7971z81.t(c3233co2, request);
                    boolean zR = C3476e.r(request.b);
                    C3233co1 c3233co3 = k90.a;
                    if (!zR || abstractC5395ms1 == null) {
                        lValueOf = null;
                        c3233co3.h(k90, true, false, null);
                        aVarD = null;
                    } else {
                        try {
                            if ("100-continue".equalsIgnoreCase(request.a("Expect"))) {
                                try {
                                    l90.h();
                                    aVarD2 = k90.d(true);
                                    try {
                                        abstractC7971z81.z(c3233co3);
                                        z = false;
                                    } catch (IOException e) {
                                        e = e;
                                        aVarD = aVarD2;
                                        lValueOf = null;
                                        if (e instanceof C3757fK) {
                                            throw e;
                                        }
                                        if (!k90.e) {
                                            throw e;
                                        }
                                        r10 = e;
                                        if (aVarD != null) {
                                            aVar = aVarD;
                                            aVar.getClass();
                                            Intrinsics.checkNotNullParameter(request, "request");
                                            aVar.a = request;
                                            aVar.e = k90.f.e;
                                            aVar.k = jCurrentTimeMillis;
                                            aVar.l = System.currentTimeMillis();
                                            response = aVar.a();
                                            i = response.h;
                                            c3233co1 = k90.a;
                                            abstractC7971z80 = k90.b;
                                            if (i != 100) {
                                                C0857Dt1.a aVarD3 = k90.d(false);
                                                Intrinsics.checkNotNull(aVarD3);
                                                if (z3) {
                                                    abstractC7971z80.z(c3233co1);
                                                }
                                                aVarD3.getClass();
                                                Intrinsics.checkNotNullParameter(request, "request");
                                                aVarD3.a = request;
                                                aVarD3.e = k90.f.e;
                                                aVarD3.k = jCurrentTimeMillis;
                                                aVarD3.l = System.currentTimeMillis();
                                                response = aVarD3.a();
                                                i = response.h;
                                            } else {
                                                C0857Dt1.a aVarD4 = k90.d(false);
                                                Intrinsics.checkNotNull(aVarD4);
                                                if (z3) {
                                                    abstractC7971z80.z(c3233co1);
                                                }
                                                aVarD4.getClass();
                                                Intrinsics.checkNotNullParameter(request, "request");
                                                aVarD4.a = request;
                                                aVarD4.e = k90.f.e;
                                                aVarD4.k = jCurrentTimeMillis;
                                                aVarD4.l = System.currentTimeMillis();
                                                response = aVarD4.a();
                                                i = response.h;
                                            }
                                            Intrinsics.checkNotNullParameter(response, "response");
                                            abstractC7971z80.y(c3233co1, response);
                                            if (this.a) {
                                                C0857Dt1.a aVarK = response.k();
                                                aVarK.g = k90.c(response);
                                                c0857Dt1A = aVarK.a();
                                            } else {
                                                C0857Dt1.a aVarK2 = response.k();
                                                aVarK2.g = k90.c(response);
                                                c0857Dt1A = aVarK2.a();
                                            }
                                            if ("close".equalsIgnoreCase(c0857Dt1A.d.a("Connection"))) {
                                                k90.d.g().l();
                                            } else {
                                                k90.d.g().l();
                                            }
                                            if (i != 204) {
                                                abstractC1091Gt1 = c0857Dt1A.k;
                                                if (abstractC1091Gt1 != null) {
                                                    jF = abstractC1091Gt1.f();
                                                } else {
                                                    jF = -1;
                                                }
                                                if (jF > 0) {
                                                    StringBuilder sb = new StringBuilder("HTTP ");
                                                    sb.append(i);
                                                    sb.append(" had non-zero Content-Length: ");
                                                    abstractC1091Gt2 = c0857Dt1A.k;
                                                    if (abstractC1091Gt2 != null) {
                                                        lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                                    }
                                                    sb.append(lValueOf);
                                                    throw new ProtocolException(sb.toString());
                                                }
                                            } else {
                                                abstractC1091Gt1 = c0857Dt1A.k;
                                                if (abstractC1091Gt1 != null) {
                                                    jF = abstractC1091Gt1.f();
                                                } else {
                                                    jF = -1;
                                                }
                                                if (jF > 0) {
                                                    StringBuilder sb2 = new StringBuilder("HTTP ");
                                                    sb2.append(i);
                                                    sb2.append(" had non-zero Content-Length: ");
                                                    abstractC1091Gt2 = c0857Dt1A.k;
                                                    if (abstractC1091Gt2 != null) {
                                                        lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                                    }
                                                    sb2.append(lValueOf);
                                                    throw new ProtocolException(sb2.toString());
                                                }
                                            }
                                            return c0857Dt1A;
                                        }
                                        try {
                                            aVarD = k90.d(false);
                                            Intrinsics.checkNotNull(aVarD);
                                            if (z3) {
                                                k90.b.z(k90.a);
                                                aVar = aVarD;
                                                z3 = false;
                                            } else {
                                                aVar = aVarD;
                                            }
                                            aVar.getClass();
                                            Intrinsics.checkNotNullParameter(request, "request");
                                            aVar.a = request;
                                            aVar.e = k90.f.e;
                                            aVar.k = jCurrentTimeMillis;
                                            aVar.l = System.currentTimeMillis();
                                            response = aVar.a();
                                            i = response.h;
                                            c3233co1 = k90.a;
                                            abstractC7971z80 = k90.b;
                                            if (i != 100) {
                                                C0857Dt1.a aVarD5 = k90.d(false);
                                                Intrinsics.checkNotNull(aVarD5);
                                                if (z3) {
                                                    abstractC7971z80.z(c3233co1);
                                                }
                                                aVarD5.getClass();
                                                Intrinsics.checkNotNullParameter(request, "request");
                                                aVarD5.a = request;
                                                aVarD5.e = k90.f.e;
                                                aVarD5.k = jCurrentTimeMillis;
                                                aVarD5.l = System.currentTimeMillis();
                                                response = aVarD5.a();
                                                i = response.h;
                                            } else {
                                                C0857Dt1.a aVarD6 = k90.d(false);
                                                Intrinsics.checkNotNull(aVarD6);
                                                if (z3) {
                                                    abstractC7971z80.z(c3233co1);
                                                }
                                                aVarD6.getClass();
                                                Intrinsics.checkNotNullParameter(request, "request");
                                                aVarD6.a = request;
                                                aVarD6.e = k90.f.e;
                                                aVarD6.k = jCurrentTimeMillis;
                                                aVarD6.l = System.currentTimeMillis();
                                                response = aVarD6.a();
                                                i = response.h;
                                            }
                                            Intrinsics.checkNotNullParameter(response, "response");
                                            abstractC7971z80.y(c3233co1, response);
                                            try {
                                                if (this.a) {
                                                    C0857Dt1.a aVarK3 = response.k();
                                                    aVarK3.g = k90.c(response);
                                                    c0857Dt1A = aVarK3.a();
                                                } else {
                                                    C0857Dt1.a aVarK4 = response.k();
                                                    aVarK4.g = k90.c(response);
                                                    c0857Dt1A = aVarK4.a();
                                                }
                                                if ("close".equalsIgnoreCase(c0857Dt1A.d.a("Connection"))) {
                                                    k90.d.g().l();
                                                } else {
                                                    k90.d.g().l();
                                                }
                                                if (i != 204) {
                                                    abstractC1091Gt1 = c0857Dt1A.k;
                                                    if (abstractC1091Gt1 != null) {
                                                        jF = abstractC1091Gt1.f();
                                                    } else {
                                                        jF = -1;
                                                    }
                                                    if (jF > 0) {
                                                        StringBuilder sb3 = new StringBuilder("HTTP ");
                                                        sb3.append(i);
                                                        sb3.append(" had non-zero Content-Length: ");
                                                        abstractC1091Gt2 = c0857Dt1A.k;
                                                        if (abstractC1091Gt2 != null) {
                                                            lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                                        }
                                                        sb3.append(lValueOf);
                                                        throw new ProtocolException(sb3.toString());
                                                    }
                                                } else {
                                                    abstractC1091Gt1 = c0857Dt1A.k;
                                                    if (abstractC1091Gt1 != null) {
                                                        jF = abstractC1091Gt1.f();
                                                    } else {
                                                        jF = -1;
                                                    }
                                                    if (jF > 0) {
                                                        StringBuilder sb4 = new StringBuilder("HTTP ");
                                                        sb4.append(i);
                                                        sb4.append(" had non-zero Content-Length: ");
                                                        abstractC1091Gt2 = c0857Dt1A.k;
                                                        if (abstractC1091Gt2 != null) {
                                                            lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                                        }
                                                        sb4.append(lValueOf);
                                                        throw new ProtocolException(sb4.toString());
                                                    }
                                                }
                                                return c0857Dt1A;
                                            } catch (IOException e2) {
                                                e = e2;
                                            }
                                        } catch (IOException e3) {
                                            e = e3;
                                        }
                                        if (r10 != 0) {
                                            throw e;
                                        }
                                        J90.a(r10, e);
                                        throw r10;
                                    }
                                } catch (IOException e4) {
                                    abstractC7971z81.s(c3233co3, e4);
                                    k90.e(e4);
                                    throw e4;
                                }
                            } else {
                                z = true;
                                aVarD2 = null;
                            }
                            try {
                                if (aVarD2 == null) {
                                    try {
                                        Intrinsics.checkNotNullParameter(request, "request");
                                        AbstractC5395ms1 abstractC5395ms2 = request.d;
                                        Intrinsics.checkNotNull(abstractC5395ms2);
                                        long jA = abstractC5395ms2.a();
                                        abstractC7971z81.r(c3233co3);
                                        aVarD = aVarD2;
                                        try {
                                            z2 = z;
                                            C2814ao1 c2814ao1C = Cm2.c(new K90.a(k90, l90.d(request, jA), jA));
                                            abstractC5395ms1.c(c2814ao1C);
                                            c2814ao1C.close();
                                        } catch (IOException e5) {
                                            e = e5;
                                            z2 = z;
                                            z3 = z2;
                                            lValueOf = null;
                                            if (e instanceof C3757fK) {
                                                throw e;
                                            }
                                            if (!k90.e) {
                                                throw e;
                                            }
                                            r10 = e;
                                            if (aVarD != null) {
                                                aVar = aVarD;
                                                aVar.getClass();
                                                Intrinsics.checkNotNullParameter(request, "request");
                                                aVar.a = request;
                                                aVar.e = k90.f.e;
                                                aVar.k = jCurrentTimeMillis;
                                                aVar.l = System.currentTimeMillis();
                                                response = aVar.a();
                                                i = response.h;
                                                c3233co1 = k90.a;
                                                abstractC7971z80 = k90.b;
                                                if (i != 100) {
                                                    C0857Dt1.a aVarD7 = k90.d(false);
                                                    Intrinsics.checkNotNull(aVarD7);
                                                    if (z3) {
                                                        abstractC7971z80.z(c3233co1);
                                                    }
                                                    aVarD7.getClass();
                                                    Intrinsics.checkNotNullParameter(request, "request");
                                                    aVarD7.a = request;
                                                    aVarD7.e = k90.f.e;
                                                    aVarD7.k = jCurrentTimeMillis;
                                                    aVarD7.l = System.currentTimeMillis();
                                                    response = aVarD7.a();
                                                    i = response.h;
                                                } else {
                                                    C0857Dt1.a aVarD8 = k90.d(false);
                                                    Intrinsics.checkNotNull(aVarD8);
                                                    if (z3) {
                                                        abstractC7971z80.z(c3233co1);
                                                    }
                                                    aVarD8.getClass();
                                                    Intrinsics.checkNotNullParameter(request, "request");
                                                    aVarD8.a = request;
                                                    aVarD8.e = k90.f.e;
                                                    aVarD8.k = jCurrentTimeMillis;
                                                    aVarD8.l = System.currentTimeMillis();
                                                    response = aVarD8.a();
                                                    i = response.h;
                                                }
                                                Intrinsics.checkNotNullParameter(response, "response");
                                                abstractC7971z80.y(c3233co1, response);
                                                if (this.a) {
                                                    C0857Dt1.a aVarK5 = response.k();
                                                    aVarK5.g = k90.c(response);
                                                    c0857Dt1A = aVarK5.a();
                                                } else {
                                                    C0857Dt1.a aVarK6 = response.k();
                                                    aVarK6.g = k90.c(response);
                                                    c0857Dt1A = aVarK6.a();
                                                }
                                                if ("close".equalsIgnoreCase(c0857Dt1A.d.a("Connection"))) {
                                                    k90.d.g().l();
                                                } else {
                                                    k90.d.g().l();
                                                }
                                                if (i != 204) {
                                                    abstractC1091Gt1 = c0857Dt1A.k;
                                                    if (abstractC1091Gt1 != null) {
                                                        jF = abstractC1091Gt1.f();
                                                    } else {
                                                        jF = -1;
                                                    }
                                                    if (jF > 0) {
                                                        StringBuilder sb5 = new StringBuilder("HTTP ");
                                                        sb5.append(i);
                                                        sb5.append(" had non-zero Content-Length: ");
                                                        abstractC1091Gt2 = c0857Dt1A.k;
                                                        if (abstractC1091Gt2 != null) {
                                                            lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                                        }
                                                        sb5.append(lValueOf);
                                                        throw new ProtocolException(sb5.toString());
                                                    }
                                                } else {
                                                    abstractC1091Gt1 = c0857Dt1A.k;
                                                    if (abstractC1091Gt1 != null) {
                                                        jF = abstractC1091Gt1.f();
                                                    } else {
                                                        jF = -1;
                                                    }
                                                    if (jF > 0) {
                                                        StringBuilder sb6 = new StringBuilder("HTTP ");
                                                        sb6.append(i);
                                                        sb6.append(" had non-zero Content-Length: ");
                                                        abstractC1091Gt2 = c0857Dt1A.k;
                                                        if (abstractC1091Gt2 != null) {
                                                            lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                                        }
                                                        sb6.append(lValueOf);
                                                        throw new ProtocolException(sb6.toString());
                                                    }
                                                }
                                                return c0857Dt1A;
                                            }
                                            aVarD = k90.d(false);
                                            Intrinsics.checkNotNull(aVarD);
                                            if (z3) {
                                                k90.b.z(k90.a);
                                                aVar = aVarD;
                                                z3 = false;
                                            } else {
                                                aVar = aVarD;
                                            }
                                            aVar.getClass();
                                            Intrinsics.checkNotNullParameter(request, "request");
                                            aVar.a = request;
                                            aVar.e = k90.f.e;
                                            aVar.k = jCurrentTimeMillis;
                                            aVar.l = System.currentTimeMillis();
                                            response = aVar.a();
                                            i = response.h;
                                            c3233co1 = k90.a;
                                            abstractC7971z80 = k90.b;
                                            if (i != 100) {
                                                C0857Dt1.a aVarD9 = k90.d(false);
                                                Intrinsics.checkNotNull(aVarD9);
                                                if (z3) {
                                                    abstractC7971z80.z(c3233co1);
                                                }
                                                aVarD9.getClass();
                                                Intrinsics.checkNotNullParameter(request, "request");
                                                aVarD9.a = request;
                                                aVarD9.e = k90.f.e;
                                                aVarD9.k = jCurrentTimeMillis;
                                                aVarD9.l = System.currentTimeMillis();
                                                response = aVarD9.a();
                                                i = response.h;
                                            } else {
                                                C0857Dt1.a aVarD10 = k90.d(false);
                                                Intrinsics.checkNotNull(aVarD10);
                                                if (z3) {
                                                    abstractC7971z80.z(c3233co1);
                                                }
                                                aVarD10.getClass();
                                                Intrinsics.checkNotNullParameter(request, "request");
                                                aVarD10.a = request;
                                                aVarD10.e = k90.f.e;
                                                aVarD10.k = jCurrentTimeMillis;
                                                aVarD10.l = System.currentTimeMillis();
                                                response = aVarD10.a();
                                                i = response.h;
                                            }
                                            Intrinsics.checkNotNullParameter(response, "response");
                                            abstractC7971z80.y(c3233co1, response);
                                            if (this.a) {
                                                C0857Dt1.a aVarK7 = response.k();
                                                aVarK7.g = k90.c(response);
                                                c0857Dt1A = aVarK7.a();
                                            } else {
                                                C0857Dt1.a aVarK8 = response.k();
                                                aVarK8.g = k90.c(response);
                                                c0857Dt1A = aVarK8.a();
                                            }
                                            if ("close".equalsIgnoreCase(c0857Dt1A.d.a("Connection"))) {
                                                k90.d.g().l();
                                            } else {
                                                k90.d.g().l();
                                            }
                                            if (i != 204) {
                                                abstractC1091Gt1 = c0857Dt1A.k;
                                                if (abstractC1091Gt1 != null) {
                                                    jF = abstractC1091Gt1.f();
                                                } else {
                                                    jF = -1;
                                                }
                                                if (jF > 0) {
                                                    StringBuilder sb7 = new StringBuilder("HTTP ");
                                                    sb7.append(i);
                                                    sb7.append(" had non-zero Content-Length: ");
                                                    abstractC1091Gt2 = c0857Dt1A.k;
                                                    if (abstractC1091Gt2 != null) {
                                                        lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                                    }
                                                    sb7.append(lValueOf);
                                                    throw new ProtocolException(sb7.toString());
                                                }
                                            } else {
                                                abstractC1091Gt1 = c0857Dt1A.k;
                                                if (abstractC1091Gt1 != null) {
                                                    jF = abstractC1091Gt1.f();
                                                } else {
                                                    jF = -1;
                                                }
                                                if (jF > 0) {
                                                    StringBuilder sb8 = new StringBuilder("HTTP ");
                                                    sb8.append(i);
                                                    sb8.append(" had non-zero Content-Length: ");
                                                    abstractC1091Gt2 = c0857Dt1A.k;
                                                    if (abstractC1091Gt2 != null) {
                                                        lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                                    }
                                                    sb8.append(lValueOf);
                                                    throw new ProtocolException(sb8.toString());
                                                }
                                            }
                                            return c0857Dt1A;
                                            if (r10 != 0) {
                                                throw e;
                                            }
                                            J90.a(r10, e);
                                            throw r10;
                                        }
                                    } catch (IOException e6) {
                                        e = e6;
                                        aVarD = aVarD2;
                                    }
                                } else {
                                    aVarD = aVarD2;
                                    z2 = z;
                                    c3233co3.h(k90, true, false, null);
                                    if (k90.f.g == null) {
                                        z3 = false;
                                    }
                                    if (!z3) {
                                        l90.g().l();
                                    }
                                }
                                z3 = z2;
                                lValueOf = null;
                            } catch (IOException e7) {
                                e = e7;
                            }
                        } catch (IOException e8) {
                            e = e8;
                            lValueOf = null;
                            aVarD = null;
                            if (e instanceof C3757fK) {
                                throw e;
                            }
                            if (!k90.e) {
                                throw e;
                            }
                            r10 = e;
                            if (aVarD != null) {
                                aVar = aVarD;
                                aVar.getClass();
                                Intrinsics.checkNotNullParameter(request, "request");
                                aVar.a = request;
                                aVar.e = k90.f.e;
                                aVar.k = jCurrentTimeMillis;
                                aVar.l = System.currentTimeMillis();
                                response = aVar.a();
                                i = response.h;
                                c3233co1 = k90.a;
                                abstractC7971z80 = k90.b;
                                if (i != 100) {
                                    C0857Dt1.a aVarD11 = k90.d(false);
                                    Intrinsics.checkNotNull(aVarD11);
                                    if (z3) {
                                        abstractC7971z80.z(c3233co1);
                                    }
                                    aVarD11.getClass();
                                    Intrinsics.checkNotNullParameter(request, "request");
                                    aVarD11.a = request;
                                    aVarD11.e = k90.f.e;
                                    aVarD11.k = jCurrentTimeMillis;
                                    aVarD11.l = System.currentTimeMillis();
                                    response = aVarD11.a();
                                    i = response.h;
                                } else {
                                    C0857Dt1.a aVarD12 = k90.d(false);
                                    Intrinsics.checkNotNull(aVarD12);
                                    if (z3) {
                                        abstractC7971z80.z(c3233co1);
                                    }
                                    aVarD12.getClass();
                                    Intrinsics.checkNotNullParameter(request, "request");
                                    aVarD12.a = request;
                                    aVarD12.e = k90.f.e;
                                    aVarD12.k = jCurrentTimeMillis;
                                    aVarD12.l = System.currentTimeMillis();
                                    response = aVarD12.a();
                                    i = response.h;
                                }
                                Intrinsics.checkNotNullParameter(response, "response");
                                abstractC7971z80.y(c3233co1, response);
                                if (this.a) {
                                    C0857Dt1.a aVarK9 = response.k();
                                    aVarK9.g = k90.c(response);
                                    c0857Dt1A = aVarK9.a();
                                } else {
                                    C0857Dt1.a aVarK10 = response.k();
                                    aVarK10.g = k90.c(response);
                                    c0857Dt1A = aVarK10.a();
                                }
                                if ("close".equalsIgnoreCase(c0857Dt1A.d.a("Connection"))) {
                                    k90.d.g().l();
                                } else {
                                    k90.d.g().l();
                                }
                                if (i != 204) {
                                    abstractC1091Gt1 = c0857Dt1A.k;
                                    if (abstractC1091Gt1 != null) {
                                        jF = abstractC1091Gt1.f();
                                    } else {
                                        jF = -1;
                                    }
                                    if (jF > 0) {
                                        StringBuilder sb9 = new StringBuilder("HTTP ");
                                        sb9.append(i);
                                        sb9.append(" had non-zero Content-Length: ");
                                        abstractC1091Gt2 = c0857Dt1A.k;
                                        if (abstractC1091Gt2 != null) {
                                            lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                        }
                                        sb9.append(lValueOf);
                                        throw new ProtocolException(sb9.toString());
                                    }
                                } else {
                                    abstractC1091Gt1 = c0857Dt1A.k;
                                    if (abstractC1091Gt1 != null) {
                                        jF = abstractC1091Gt1.f();
                                    } else {
                                        jF = -1;
                                    }
                                    if (jF > 0) {
                                        StringBuilder sb10 = new StringBuilder("HTTP ");
                                        sb10.append(i);
                                        sb10.append(" had non-zero Content-Length: ");
                                        abstractC1091Gt2 = c0857Dt1A.k;
                                        if (abstractC1091Gt2 != null) {
                                            lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                        }
                                        sb10.append(lValueOf);
                                        throw new ProtocolException(sb10.toString());
                                    }
                                }
                                return c0857Dt1A;
                            }
                            aVarD = k90.d(false);
                            Intrinsics.checkNotNull(aVarD);
                            if (z3) {
                                k90.b.z(k90.a);
                                aVar = aVarD;
                                z3 = false;
                            } else {
                                aVar = aVarD;
                            }
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(request, "request");
                            aVar.a = request;
                            aVar.e = k90.f.e;
                            aVar.k = jCurrentTimeMillis;
                            aVar.l = System.currentTimeMillis();
                            response = aVar.a();
                            i = response.h;
                            c3233co1 = k90.a;
                            abstractC7971z80 = k90.b;
                            if (i != 100) {
                                C0857Dt1.a aVarD13 = k90.d(false);
                                Intrinsics.checkNotNull(aVarD13);
                                if (z3) {
                                    abstractC7971z80.z(c3233co1);
                                }
                                aVarD13.getClass();
                                Intrinsics.checkNotNullParameter(request, "request");
                                aVarD13.a = request;
                                aVarD13.e = k90.f.e;
                                aVarD13.k = jCurrentTimeMillis;
                                aVarD13.l = System.currentTimeMillis();
                                response = aVarD13.a();
                                i = response.h;
                            } else {
                                C0857Dt1.a aVarD14 = k90.d(false);
                                Intrinsics.checkNotNull(aVarD14);
                                if (z3) {
                                    abstractC7971z80.z(c3233co1);
                                }
                                aVarD14.getClass();
                                Intrinsics.checkNotNullParameter(request, "request");
                                aVarD14.a = request;
                                aVarD14.e = k90.f.e;
                                aVarD14.k = jCurrentTimeMillis;
                                aVarD14.l = System.currentTimeMillis();
                                response = aVarD14.a();
                                i = response.h;
                            }
                            Intrinsics.checkNotNullParameter(response, "response");
                            abstractC7971z80.y(c3233co1, response);
                            if (this.a) {
                                C0857Dt1.a aVarK11 = response.k();
                                aVarK11.g = k90.c(response);
                                c0857Dt1A = aVarK11.a();
                            } else {
                                C0857Dt1.a aVarK12 = response.k();
                                aVarK12.g = k90.c(response);
                                c0857Dt1A = aVarK12.a();
                            }
                            if ("close".equalsIgnoreCase(c0857Dt1A.d.a("Connection"))) {
                                k90.d.g().l();
                            } else {
                                k90.d.g().l();
                            }
                            if (i != 204) {
                                abstractC1091Gt1 = c0857Dt1A.k;
                                if (abstractC1091Gt1 != null) {
                                    jF = abstractC1091Gt1.f();
                                } else {
                                    jF = -1;
                                }
                                if (jF > 0) {
                                    StringBuilder sb11 = new StringBuilder("HTTP ");
                                    sb11.append(i);
                                    sb11.append(" had non-zero Content-Length: ");
                                    abstractC1091Gt2 = c0857Dt1A.k;
                                    if (abstractC1091Gt2 != null) {
                                        lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                    }
                                    sb11.append(lValueOf);
                                    throw new ProtocolException(sb11.toString());
                                }
                            } else {
                                abstractC1091Gt1 = c0857Dt1A.k;
                                if (abstractC1091Gt1 != null) {
                                    jF = abstractC1091Gt1.f();
                                } else {
                                    jF = -1;
                                }
                                if (jF > 0) {
                                    StringBuilder sb12 = new StringBuilder("HTTP ");
                                    sb12.append(i);
                                    sb12.append(" had non-zero Content-Length: ");
                                    abstractC1091Gt2 = c0857Dt1A.k;
                                    if (abstractC1091Gt2 != null) {
                                        lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                    }
                                    sb12.append(lValueOf);
                                    throw new ProtocolException(sb12.toString());
                                }
                            }
                            return c0857Dt1A;
                            if (r10 != 0) {
                                throw e;
                            }
                            J90.a(r10, e);
                            throw r10;
                        }
                    }
                    try {
                        l90.c();
                        r10 = lValueOf;
                        if (aVarD != null) {
                            aVarD = k90.d(false);
                            Intrinsics.checkNotNull(aVarD);
                            if (z3) {
                                k90.b.z(k90.a);
                                aVar = aVarD;
                                z3 = false;
                            } else {
                                aVar = aVarD;
                            }
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(request, "request");
                            aVar.a = request;
                            aVar.e = k90.f.e;
                            aVar.k = jCurrentTimeMillis;
                            aVar.l = System.currentTimeMillis();
                            response = aVar.a();
                            i = response.h;
                            c3233co1 = k90.a;
                            abstractC7971z80 = k90.b;
                            if (i != 100 || (102 <= i && i < 200)) {
                                C0857Dt1.a aVarD15 = k90.d(false);
                                Intrinsics.checkNotNull(aVarD15);
                                if (z3) {
                                    abstractC7971z80.z(c3233co1);
                                }
                                aVarD15.getClass();
                                Intrinsics.checkNotNullParameter(request, "request");
                                aVarD15.a = request;
                                aVarD15.e = k90.f.e;
                                aVarD15.k = jCurrentTimeMillis;
                                aVarD15.l = System.currentTimeMillis();
                                response = aVarD15.a();
                                i = response.h;
                            }
                            Intrinsics.checkNotNullParameter(response, "response");
                            abstractC7971z80.y(c3233co1, response);
                            if (this.a || i != 101) {
                                C0857Dt1.a aVarK13 = response.k();
                                aVarK13.g = k90.c(response);
                                c0857Dt1A = aVarK13.a();
                            } else {
                                C0857Dt1.a aVarK14 = response.k();
                                aVarK14.g = C6806tc2.c;
                                c0857Dt1A = aVarK14.a();
                            }
                            if ("close".equalsIgnoreCase(c0857Dt1A.d.a("Connection")) || "close".equalsIgnoreCase(C0857Dt1.f(c0857Dt1A, "Connection"))) {
                                k90.d.g().l();
                            }
                            if (i != 204 || i == 205) {
                                abstractC1091Gt1 = c0857Dt1A.k;
                                if (abstractC1091Gt1 != null) {
                                    jF = abstractC1091Gt1.f();
                                } else {
                                    jF = -1;
                                }
                                if (jF > 0) {
                                    StringBuilder sb13 = new StringBuilder("HTTP ");
                                    sb13.append(i);
                                    sb13.append(" had non-zero Content-Length: ");
                                    abstractC1091Gt2 = c0857Dt1A.k;
                                    if (abstractC1091Gt2 != null) {
                                        lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                    }
                                    sb13.append(lValueOf);
                                    throw new ProtocolException(sb13.toString());
                                }
                            }
                            return c0857Dt1A;
                        }
                        aVar = aVarD;
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(request, "request");
                        aVar.a = request;
                        aVar.e = k90.f.e;
                        aVar.k = jCurrentTimeMillis;
                        aVar.l = System.currentTimeMillis();
                        response = aVar.a();
                        i = response.h;
                        c3233co1 = k90.a;
                        abstractC7971z80 = k90.b;
                        if (i != 100) {
                            C0857Dt1.a aVarD16 = k90.d(false);
                            Intrinsics.checkNotNull(aVarD16);
                            if (z3) {
                                abstractC7971z80.z(c3233co1);
                            }
                            aVarD16.getClass();
                            Intrinsics.checkNotNullParameter(request, "request");
                            aVarD16.a = request;
                            aVarD16.e = k90.f.e;
                            aVarD16.k = jCurrentTimeMillis;
                            aVarD16.l = System.currentTimeMillis();
                            response = aVarD16.a();
                            i = response.h;
                        } else {
                            C0857Dt1.a aVarD17 = k90.d(false);
                            Intrinsics.checkNotNull(aVarD17);
                            if (z3) {
                                abstractC7971z80.z(c3233co1);
                            }
                            aVarD17.getClass();
                            Intrinsics.checkNotNullParameter(request, "request");
                            aVarD17.a = request;
                            aVarD17.e = k90.f.e;
                            aVarD17.k = jCurrentTimeMillis;
                            aVarD17.l = System.currentTimeMillis();
                            response = aVarD17.a();
                            i = response.h;
                        }
                        Intrinsics.checkNotNullParameter(response, "response");
                        abstractC7971z80.y(c3233co1, response);
                        if (this.a) {
                            C0857Dt1.a aVarK15 = response.k();
                            aVarK15.g = k90.c(response);
                            c0857Dt1A = aVarK15.a();
                        } else {
                            C0857Dt1.a aVarK16 = response.k();
                            aVarK16.g = k90.c(response);
                            c0857Dt1A = aVarK16.a();
                        }
                        if ("close".equalsIgnoreCase(c0857Dt1A.d.a("Connection"))) {
                            k90.d.g().l();
                        } else {
                            k90.d.g().l();
                        }
                        if (i != 204) {
                            abstractC1091Gt1 = c0857Dt1A.k;
                            if (abstractC1091Gt1 != null) {
                                jF = abstractC1091Gt1.f();
                            } else {
                                jF = -1;
                            }
                            if (jF > 0) {
                                StringBuilder sb14 = new StringBuilder("HTTP ");
                                sb14.append(i);
                                sb14.append(" had non-zero Content-Length: ");
                                abstractC1091Gt2 = c0857Dt1A.k;
                                if (abstractC1091Gt2 != null) {
                                    lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                }
                                sb14.append(lValueOf);
                                throw new ProtocolException(sb14.toString());
                            }
                        } else {
                            abstractC1091Gt1 = c0857Dt1A.k;
                            if (abstractC1091Gt1 != null) {
                                jF = abstractC1091Gt1.f();
                            } else {
                                jF = -1;
                            }
                            if (jF > 0) {
                                StringBuilder sb15 = new StringBuilder("HTTP ");
                                sb15.append(i);
                                sb15.append(" had non-zero Content-Length: ");
                                abstractC1091Gt2 = c0857Dt1A.k;
                                if (abstractC1091Gt2 != null) {
                                    lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                }
                                sb15.append(lValueOf);
                                throw new ProtocolException(sb15.toString());
                            }
                        }
                        return c0857Dt1A;
                        if (r10 != 0) {
                            throw e;
                        }
                        J90.a(r10, e);
                        throw r10;
                    } catch (IOException e9) {
                        try {
                            abstractC7971z81.s(c3233co3, e9);
                            k90.e(e9);
                            throw e9;
                        } catch (IOException e10) {
                            e = e10;
                            if (e instanceof C3757fK) {
                                throw e;
                            }
                            if (!k90.e) {
                                throw e;
                            }
                            r10 = e;
                            if (aVarD != null) {
                                aVar = aVarD;
                                aVar.getClass();
                                Intrinsics.checkNotNullParameter(request, "request");
                                aVar.a = request;
                                aVar.e = k90.f.e;
                                aVar.k = jCurrentTimeMillis;
                                aVar.l = System.currentTimeMillis();
                                response = aVar.a();
                                i = response.h;
                                c3233co1 = k90.a;
                                abstractC7971z80 = k90.b;
                                if (i != 100) {
                                    C0857Dt1.a aVarD18 = k90.d(false);
                                    Intrinsics.checkNotNull(aVarD18);
                                    if (z3) {
                                        abstractC7971z80.z(c3233co1);
                                    }
                                    aVarD18.getClass();
                                    Intrinsics.checkNotNullParameter(request, "request");
                                    aVarD18.a = request;
                                    aVarD18.e = k90.f.e;
                                    aVarD18.k = jCurrentTimeMillis;
                                    aVarD18.l = System.currentTimeMillis();
                                    response = aVarD18.a();
                                    i = response.h;
                                } else {
                                    C0857Dt1.a aVarD19 = k90.d(false);
                                    Intrinsics.checkNotNull(aVarD19);
                                    if (z3) {
                                        abstractC7971z80.z(c3233co1);
                                    }
                                    aVarD19.getClass();
                                    Intrinsics.checkNotNullParameter(request, "request");
                                    aVarD19.a = request;
                                    aVarD19.e = k90.f.e;
                                    aVarD19.k = jCurrentTimeMillis;
                                    aVarD19.l = System.currentTimeMillis();
                                    response = aVarD19.a();
                                    i = response.h;
                                }
                                Intrinsics.checkNotNullParameter(response, "response");
                                abstractC7971z80.y(c3233co1, response);
                                if (this.a) {
                                    C0857Dt1.a aVarK17 = response.k();
                                    aVarK17.g = k90.c(response);
                                    c0857Dt1A = aVarK17.a();
                                } else {
                                    C0857Dt1.a aVarK18 = response.k();
                                    aVarK18.g = k90.c(response);
                                    c0857Dt1A = aVarK18.a();
                                }
                                if ("close".equalsIgnoreCase(c0857Dt1A.d.a("Connection"))) {
                                    k90.d.g().l();
                                } else {
                                    k90.d.g().l();
                                }
                                if (i != 204) {
                                    abstractC1091Gt1 = c0857Dt1A.k;
                                    if (abstractC1091Gt1 != null) {
                                        jF = abstractC1091Gt1.f();
                                    } else {
                                        jF = -1;
                                    }
                                    if (jF > 0) {
                                        StringBuilder sb16 = new StringBuilder("HTTP ");
                                        sb16.append(i);
                                        sb16.append(" had non-zero Content-Length: ");
                                        abstractC1091Gt2 = c0857Dt1A.k;
                                        if (abstractC1091Gt2 != null) {
                                            lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                        }
                                        sb16.append(lValueOf);
                                        throw new ProtocolException(sb16.toString());
                                    }
                                } else {
                                    abstractC1091Gt1 = c0857Dt1A.k;
                                    if (abstractC1091Gt1 != null) {
                                        jF = abstractC1091Gt1.f();
                                    } else {
                                        jF = -1;
                                    }
                                    if (jF > 0) {
                                        StringBuilder sb17 = new StringBuilder("HTTP ");
                                        sb17.append(i);
                                        sb17.append(" had non-zero Content-Length: ");
                                        abstractC1091Gt2 = c0857Dt1A.k;
                                        if (abstractC1091Gt2 != null) {
                                            lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                        }
                                        sb17.append(lValueOf);
                                        throw new ProtocolException(sb17.toString());
                                    }
                                }
                                return c0857Dt1A;
                            }
                            aVarD = k90.d(false);
                            Intrinsics.checkNotNull(aVarD);
                            if (z3) {
                                k90.b.z(k90.a);
                                aVar = aVarD;
                                z3 = false;
                            } else {
                                aVar = aVarD;
                            }
                            aVar.getClass();
                            Intrinsics.checkNotNullParameter(request, "request");
                            aVar.a = request;
                            aVar.e = k90.f.e;
                            aVar.k = jCurrentTimeMillis;
                            aVar.l = System.currentTimeMillis();
                            response = aVar.a();
                            i = response.h;
                            c3233co1 = k90.a;
                            abstractC7971z80 = k90.b;
                            if (i != 100) {
                                C0857Dt1.a aVarD110 = k90.d(false);
                                Intrinsics.checkNotNull(aVarD110);
                                if (z3) {
                                    abstractC7971z80.z(c3233co1);
                                }
                                aVarD110.getClass();
                                Intrinsics.checkNotNullParameter(request, "request");
                                aVarD110.a = request;
                                aVarD110.e = k90.f.e;
                                aVarD110.k = jCurrentTimeMillis;
                                aVarD110.l = System.currentTimeMillis();
                                response = aVarD110.a();
                                i = response.h;
                            } else {
                                C0857Dt1.a aVarD111 = k90.d(false);
                                Intrinsics.checkNotNull(aVarD111);
                                if (z3) {
                                    abstractC7971z80.z(c3233co1);
                                }
                                aVarD111.getClass();
                                Intrinsics.checkNotNullParameter(request, "request");
                                aVarD111.a = request;
                                aVarD111.e = k90.f.e;
                                aVarD111.k = jCurrentTimeMillis;
                                aVarD111.l = System.currentTimeMillis();
                                response = aVarD111.a();
                                i = response.h;
                            }
                            Intrinsics.checkNotNullParameter(response, "response");
                            abstractC7971z80.y(c3233co1, response);
                            if (this.a) {
                                C0857Dt1.a aVarK19 = response.k();
                                aVarK19.g = k90.c(response);
                                c0857Dt1A = aVarK19.a();
                            } else {
                                C0857Dt1.a aVarK110 = response.k();
                                aVarK110.g = k90.c(response);
                                c0857Dt1A = aVarK110.a();
                            }
                            if ("close".equalsIgnoreCase(c0857Dt1A.d.a("Connection"))) {
                                k90.d.g().l();
                            } else {
                                k90.d.g().l();
                            }
                            if (i != 204) {
                                abstractC1091Gt1 = c0857Dt1A.k;
                                if (abstractC1091Gt1 != null) {
                                    jF = abstractC1091Gt1.f();
                                } else {
                                    jF = -1;
                                }
                                if (jF > 0) {
                                    StringBuilder sb18 = new StringBuilder("HTTP ");
                                    sb18.append(i);
                                    sb18.append(" had non-zero Content-Length: ");
                                    abstractC1091Gt2 = c0857Dt1A.k;
                                    if (abstractC1091Gt2 != null) {
                                        lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                    }
                                    sb18.append(lValueOf);
                                    throw new ProtocolException(sb18.toString());
                                }
                            } else {
                                abstractC1091Gt1 = c0857Dt1A.k;
                                if (abstractC1091Gt1 != null) {
                                    jF = abstractC1091Gt1.f();
                                } else {
                                    jF = -1;
                                }
                                if (jF > 0) {
                                    StringBuilder sb19 = new StringBuilder("HTTP ");
                                    sb19.append(i);
                                    sb19.append(" had non-zero Content-Length: ");
                                    abstractC1091Gt2 = c0857Dt1A.k;
                                    if (abstractC1091Gt2 != null) {
                                        lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                    }
                                    sb19.append(lValueOf);
                                    throw new ProtocolException(sb19.toString());
                                }
                            }
                            return c0857Dt1A;
                            if (r10 != 0) {
                                throw e;
                            }
                            J90.a(r10, e);
                            throw r10;
                        }
                    }
                } catch (IOException e11) {
                    e = e11;
                    aVarD = null;
                    if (e instanceof C3757fK) {
                        throw e;
                    }
                    if (!k90.e) {
                        throw e;
                    }
                    r10 = e;
                    if (aVarD != null) {
                        aVar = aVarD;
                        aVar.getClass();
                        Intrinsics.checkNotNullParameter(request, "request");
                        aVar.a = request;
                        aVar.e = k90.f.e;
                        aVar.k = jCurrentTimeMillis;
                        aVar.l = System.currentTimeMillis();
                        response = aVar.a();
                        i = response.h;
                        c3233co1 = k90.a;
                        abstractC7971z80 = k90.b;
                        if (i != 100) {
                            C0857Dt1.a aVarD112 = k90.d(false);
                            Intrinsics.checkNotNull(aVarD112);
                            if (z3) {
                                abstractC7971z80.z(c3233co1);
                            }
                            aVarD112.getClass();
                            Intrinsics.checkNotNullParameter(request, "request");
                            aVarD112.a = request;
                            aVarD112.e = k90.f.e;
                            aVarD112.k = jCurrentTimeMillis;
                            aVarD112.l = System.currentTimeMillis();
                            response = aVarD112.a();
                            i = response.h;
                        } else {
                            C0857Dt1.a aVarD113 = k90.d(false);
                            Intrinsics.checkNotNull(aVarD113);
                            if (z3) {
                                abstractC7971z80.z(c3233co1);
                            }
                            aVarD113.getClass();
                            Intrinsics.checkNotNullParameter(request, "request");
                            aVarD113.a = request;
                            aVarD113.e = k90.f.e;
                            aVarD113.k = jCurrentTimeMillis;
                            aVarD113.l = System.currentTimeMillis();
                            response = aVarD113.a();
                            i = response.h;
                        }
                        Intrinsics.checkNotNullParameter(response, "response");
                        abstractC7971z80.y(c3233co1, response);
                        if (this.a) {
                            C0857Dt1.a aVarK111 = response.k();
                            aVarK111.g = k90.c(response);
                            c0857Dt1A = aVarK111.a();
                        } else {
                            C0857Dt1.a aVarK112 = response.k();
                            aVarK112.g = k90.c(response);
                            c0857Dt1A = aVarK112.a();
                        }
                        if ("close".equalsIgnoreCase(c0857Dt1A.d.a("Connection"))) {
                            k90.d.g().l();
                        } else {
                            k90.d.g().l();
                        }
                        if (i != 204) {
                            abstractC1091Gt1 = c0857Dt1A.k;
                            if (abstractC1091Gt1 != null) {
                                jF = abstractC1091Gt1.f();
                            } else {
                                jF = -1;
                            }
                            if (jF > 0) {
                                StringBuilder sb110 = new StringBuilder("HTTP ");
                                sb110.append(i);
                                sb110.append(" had non-zero Content-Length: ");
                                abstractC1091Gt2 = c0857Dt1A.k;
                                if (abstractC1091Gt2 != null) {
                                    lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                }
                                sb110.append(lValueOf);
                                throw new ProtocolException(sb110.toString());
                            }
                        } else {
                            abstractC1091Gt1 = c0857Dt1A.k;
                            if (abstractC1091Gt1 != null) {
                                jF = abstractC1091Gt1.f();
                            } else {
                                jF = -1;
                            }
                            if (jF > 0) {
                                StringBuilder sb111 = new StringBuilder("HTTP ");
                                sb111.append(i);
                                sb111.append(" had non-zero Content-Length: ");
                                abstractC1091Gt2 = c0857Dt1A.k;
                                if (abstractC1091Gt2 != null) {
                                    lValueOf = Long.valueOf(abstractC1091Gt2.f());
                                }
                                sb111.append(lValueOf);
                                throw new ProtocolException(sb111.toString());
                            }
                        }
                        return c0857Dt1A;
                    }
                    aVarD = k90.d(false);
                    Intrinsics.checkNotNull(aVarD);
                    if (z3) {
                        k90.b.z(k90.a);
                        aVar = aVarD;
                        z3 = false;
                    } else {
                        aVar = aVarD;
                    }
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(request, "request");
                    aVar.a = request;
                    aVar.e = k90.f.e;
                    aVar.k = jCurrentTimeMillis;
                    aVar.l = System.currentTimeMillis();
                    response = aVar.a();
                    i = response.h;
                    c3233co1 = k90.a;
                    abstractC7971z80 = k90.b;
                    if (i != 100) {
                        C0857Dt1.a aVarD114 = k90.d(false);
                        Intrinsics.checkNotNull(aVarD114);
                        if (z3) {
                            abstractC7971z80.z(c3233co1);
                        }
                        aVarD114.getClass();
                        Intrinsics.checkNotNullParameter(request, "request");
                        aVarD114.a = request;
                        aVarD114.e = k90.f.e;
                        aVarD114.k = jCurrentTimeMillis;
                        aVarD114.l = System.currentTimeMillis();
                        response = aVarD114.a();
                        i = response.h;
                    } else {
                        C0857Dt1.a aVarD115 = k90.d(false);
                        Intrinsics.checkNotNull(aVarD115);
                        if (z3) {
                            abstractC7971z80.z(c3233co1);
                        }
                        aVarD115.getClass();
                        Intrinsics.checkNotNullParameter(request, "request");
                        aVarD115.a = request;
                        aVarD115.e = k90.f.e;
                        aVarD115.k = jCurrentTimeMillis;
                        aVarD115.l = System.currentTimeMillis();
                        response = aVarD115.a();
                        i = response.h;
                    }
                    Intrinsics.checkNotNullParameter(response, "response");
                    abstractC7971z80.y(c3233co1, response);
                    if (this.a) {
                        C0857Dt1.a aVarK113 = response.k();
                        aVarK113.g = k90.c(response);
                        c0857Dt1A = aVarK113.a();
                    } else {
                        C0857Dt1.a aVarK114 = response.k();
                        aVarK114.g = k90.c(response);
                        c0857Dt1A = aVarK114.a();
                    }
                    if ("close".equalsIgnoreCase(c0857Dt1A.d.a("Connection"))) {
                        k90.d.g().l();
                    } else {
                        k90.d.g().l();
                    }
                    if (i != 204) {
                        abstractC1091Gt1 = c0857Dt1A.k;
                        if (abstractC1091Gt1 != null) {
                            jF = abstractC1091Gt1.f();
                        } else {
                            jF = -1;
                        }
                        if (jF > 0) {
                            StringBuilder sb112 = new StringBuilder("HTTP ");
                            sb112.append(i);
                            sb112.append(" had non-zero Content-Length: ");
                            abstractC1091Gt2 = c0857Dt1A.k;
                            if (abstractC1091Gt2 != null) {
                                lValueOf = Long.valueOf(abstractC1091Gt2.f());
                            }
                            sb112.append(lValueOf);
                            throw new ProtocolException(sb112.toString());
                        }
                    } else {
                        abstractC1091Gt1 = c0857Dt1A.k;
                        if (abstractC1091Gt1 != null) {
                            jF = abstractC1091Gt1.f();
                        } else {
                            jF = -1;
                        }
                        if (jF > 0) {
                            StringBuilder sb113 = new StringBuilder("HTTP ");
                            sb113.append(i);
                            sb113.append(" had non-zero Content-Length: ");
                            abstractC1091Gt2 = c0857Dt1A.k;
                            if (abstractC1091Gt2 != null) {
                                lValueOf = Long.valueOf(abstractC1091Gt2.f());
                            }
                            sb113.append(lValueOf);
                            throw new ProtocolException(sb113.toString());
                        }
                    }
                    return c0857Dt1A;
                    if (r10 != 0) {
                        throw e;
                    }
                    J90.a(r10, e);
                    throw r10;
                }
            } catch (IOException e12) {
                abstractC7971z81.s(c3233co2, e12);
                k90.e(e12);
                throw e12;
            }
        } catch (IOException e13) {
            e = e13;
            lValueOf = null;
        }
    }
}

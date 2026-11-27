package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AL0 implements GL {

    @NotNull
    public final UH1 a;

    @NotNull
    public final ArrayList b;

    public AL0(@NotNull UH1 format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.a = format;
        Intrinsics.checkNotNullParameter(format, "format");
        List<CL0> list = C2127Ua0.a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            IL0 il0A = ((CL0) it.next()).a(format);
            if (il0A != null) {
                arrayList.add(il0A);
            }
        }
        this.b = arrayList;
        UH1 uh1 = this.a;
        if ((uh1 instanceof InterfaceC5180ls) || (uh1 instanceof InterfaceC5091lS1)) {
            return;
        }
        throw new IllegalArgumentException(("Only binary and string formats are supported, " + this.a + " is not supported.").toString());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b5 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:31:0x00af, B:33:0x00b5, B:37:0x00c2, B:39:0x00c6, B:41:0x00d0, B:44:0x00db, B:46:0x00e1, B:48:0x00fb, B:49:0x00fe, B:51:0x0104, B:52:0x011b, B:50:0x0101), top: B:55:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:31:0x00af, B:33:0x00b5, B:37:0x00c2, B:39:0x00c6, B:41:0x00d0, B:44:0x00db, B:46:0x00e1, B:48:0x00fb, B:49:0x00fe, B:51:0x0104, B:52:0x011b, B:50:0x0101), top: B:55:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:31:0x00af, B:33:0x00b5, B:37:0x00c2, B:39:0x00c6, B:41:0x00d0, B:44:0x00db, B:46:0x00e1, B:48:0x00fb, B:49:0x00fe, B:51:0x0104, B:52:0x011b, B:50:0x0101), top: B:55:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:31:0x00af, B:33:0x00b5, B:37:0x00c2, B:39:0x00c6, B:41:0x00d0, B:44:0x00db, B:46:0x00e1, B:48:0x00fb, B:49:0x00fe, B:51:0x0104, B:52:0x011b, B:50:0x0101), top: B:55:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00db A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:31:0x00af, B:33:0x00b5, B:37:0x00c2, B:39:0x00c6, B:41:0x00d0, B:44:0x00db, B:46:0x00e1, B:48:0x00fb, B:49:0x00fe, B:51:0x0104, B:52:0x011b, B:50:0x0101), top: B:55:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1 A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:31:0x00af, B:33:0x00b5, B:37:0x00c2, B:39:0x00c6, B:41:0x00d0, B:44:0x00db, B:46:0x00e1, B:48:0x00fb, B:49:0x00fe, B:51:0x0104, B:52:0x011b, B:50:0x0101), top: B:55:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00fb A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:31:0x00af, B:33:0x00b5, B:37:0x00c2, B:39:0x00c6, B:41:0x00d0, B:44:0x00db, B:46:0x00e1, B:48:0x00fb, B:49:0x00fe, B:51:0x0104, B:52:0x011b, B:50:0x0101), top: B:55:0x00af }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // defpackage.GL
    @Nullable
    public final Object a(@NotNull Charset charset, @NotNull A62 a62, @NotNull InterfaceC0942Ew interfaceC0942Ew, @NotNull LM lm) throws C7997zG0 {
        C7171vL0 c7171vL0;
        Object obj;
        InterfaceC0942Ew interfaceC0942Ew2;
        AL0 al0;
        Charset charset2;
        RJ0 rj0;
        C1098Gw c1098Gw;
        UH1 uh1;
        C2895bC c2895bCV;
        if (lm instanceof C7171vL0) {
            c7171vL0 = (C7171vL0) lm;
            int i = c7171vL0.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7171vL0.k = i - Integer.MIN_VALUE;
            } else {
                c7171vL0 = new C7171vL0(this, lm);
            }
        } else {
            c7171vL0 = new C7171vL0(this, lm);
        }
        Object objF = c7171vL0.i;
        MN mn = MN.d;
        int i2 = c7171vL0.k;
        long j = Long.MAX_VALUE;
        if (i2 == 0) {
            C1795Pt1.b(objF);
            C6961uL0 c6961uL0 = new C6961uL0(new C0580Af0(this.b), charset, a62, interfaceC0942Ew);
            C7382wL0 c7382wL0 = new C7382wL0(interfaceC0942Ew, null);
            c7171vL0.d = this;
            c7171vL0.e = charset;
            c7171vL0.g = a62;
            c7171vL0.h = interfaceC0942Ew;
            c7171vL0.k = 1;
            Object objR = C4466ii.r(c6961uL0, c7382wL0, c7171vL0);
            if (objR != mn) {
                obj = objR;
                interfaceC0942Ew2 = interfaceC0942Ew;
                al0 = this;
            }
            return mn;
        }
        if (i2 == 1) {
            InterfaceC0942Ew interfaceC0942Ew3 = c7171vL0.h;
            a62 = (A62) c7171vL0.g;
            charset = c7171vL0.e;
            AL0 al1 = c7171vL0.d;
            C1795Pt1.b(objF);
            interfaceC0942Ew2 = interfaceC0942Ew3;
            al0 = al1;
            obj = objF;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rj0 = (RJ0) c7171vL0.g;
            charset2 = c7171vL0.e;
            al0 = c7171vL0.d;
            C1795Pt1.b(objF);
        }
        c1098Gw = (C1098Gw) objF;
        try {
            uh1 = al0.a;
            if (uh1 instanceof InterfaceC5091lS1) {
                return ((InterfaceC5091lS1) uh1).c(rj0, C6621sj.o(c1098Gw, charset2));
            }
            if (uh1 instanceof InterfaceC5180ls) {
                C6621sj.n(c1098Gw);
                return ((InterfaceC5180ls) uh1).d();
            }
            Intrinsics.checkNotNullParameter(c1098Gw, "<this>");
            while (j != 0) {
                c2895bCV = c1098Gw.v();
                if (c2895bCV != null) {
                    throw new IllegalStateException(("Unsupported format " + al0.a).toString());
                }
                int iMin = (int) Math.min(c2895bCV.c - c2895bCV.b, j);
                c2895bCV.c(iMin);
                c1098Gw.h += iMin;
                if (c2895bCV.c - c2895bCV.b == 0) {
                    c1098Gw.C(c2895bCV);
                }
                j -= (long) iMin;
            }
            c1098Gw.getClass();
            throw new IllegalStateException(("Unsupported format " + al0.a).toString());
        } catch (Throwable th) {
            throw new C7997zG0("Illegal input: " + th.getMessage(), th);
        }
        if (!al0.b.isEmpty() && (obj != null || interfaceC0942Ew2.k())) {
            return obj;
        }
        RJ0 rj0W = C5027l8.w(al0.a.a(), a62);
        c7171vL0.d = al0;
        c7171vL0.e = charset;
        c7171vL0.g = rj0W;
        c7171vL0.h = null;
        c7171vL0.k = 2;
        objF = interfaceC0942Ew2.f(Long.MAX_VALUE, c7171vL0);
        if (objF != mn) {
            charset2 = charset;
            rj0 = rj0W;
            c1098Gw = (C1098Gw) objF;
            uh1 = al0.a;
            if (uh1 instanceof InterfaceC5091lS1) {
                return ((InterfaceC5091lS1) uh1).c(rj0, C6621sj.o(c1098Gw, charset2));
            }
            if (uh1 instanceof InterfaceC5180ls) {
                C6621sj.n(c1098Gw);
                return ((InterfaceC5180ls) uh1).d();
            }
            Intrinsics.checkNotNullParameter(c1098Gw, "<this>");
            while (j != 0) {
                c2895bCV = c1098Gw.v();
                if (c2895bCV != null) {
                    throw new IllegalStateException(("Unsupported format " + al0.a).toString());
                }
                int iMin2 = (int) Math.min(c2895bCV.c - c2895bCV.b, j);
                c2895bCV.c(iMin2);
                c1098Gw.h += iMin2;
                if (c2895bCV.c - c2895bCV.b == 0) {
                    c1098Gw.C(c2895bCV);
                }
                j -= (long) iMin2;
            }
            c1098Gw.getClass();
            throw new IllegalStateException(("Unsupported format " + al0.a).toString());
        }
        return mn;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object b(@NotNull C4651jM c4651jM, @NotNull Charset charset, @NotNull A62 a62, @Nullable Object obj, @NotNull LM lm) {
        C7802yL0 c7802yL0;
        AL0 al0;
        C4651jM c4651jM2;
        Charset charset2;
        A62 a63;
        Object obj2;
        RJ0 rj0M;
        if (lm instanceof C7802yL0) {
            c7802yL0 = (C7802yL0) lm;
            int i = c7802yL0.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7802yL0.l = i - Integer.MIN_VALUE;
            } else {
                c7802yL0 = new C7802yL0(this, lm);
            }
        } else {
            c7802yL0 = new C7802yL0(this, lm);
        }
        Object objR = c7802yL0.j;
        MN mn = MN.d;
        int i2 = c7802yL0.l;
        if (i2 == 0) {
            C1795Pt1.b(objR);
            C7592xL0 c7592xL0 = new C7592xL0(new C0580Af0(this.b), c4651jM, charset, a62, obj);
            C8012zL0 c8012zL0 = new C8012zL0(2, null);
            c7802yL0.d = this;
            c7802yL0.e = c4651jM;
            c7802yL0.g = charset;
            c7802yL0.h = a62;
            c7802yL0.i = obj;
            c7802yL0.l = 1;
            objR = C4466ii.r(c7592xL0, c8012zL0, c7802yL0);
            if (objR == mn) {
                return mn;
            }
            al0 = this;
            c4651jM2 = c4651jM;
            charset2 = charset;
            a63 = a62;
            obj2 = obj;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = c7802yL0.i;
            a63 = c7802yL0.h;
            charset2 = c7802yL0.g;
            c4651jM2 = c7802yL0.e;
            al0 = c7802yL0.d;
            C1795Pt1.b(objR);
        }
        AbstractC1112Ha1 abstractC1112Ha1 = (AbstractC1112Ha1) objR;
        if (abstractC1112Ha1 != null) {
            return abstractC1112Ha1;
        }
        try {
            rj0M = C5027l8.w(al0.a.a(), a63);
        } catch (ZH1 unused) {
            rj0M = C5027l8.m(obj2, al0.a.a());
        }
        UH1 uh1 = al0.a;
        if (uh1 instanceof InterfaceC5091lS1) {
            return new UX1(((InterfaceC5091lS1) uh1).b(rj0M, obj2), C5207m.l(c4651jM2, charset2));
        }
        if (uh1 instanceof InterfaceC5180ls) {
            return new C1955Rv(((InterfaceC5180ls) uh1).e(), c4651jM2);
        }
        throw new IllegalStateException(("Unsupported format " + uh1).toString());
    }
}

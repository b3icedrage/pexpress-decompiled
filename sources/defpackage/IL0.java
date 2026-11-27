package defpackage;

import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class IL0 implements BL0 {

    @NotNull
    public final AbstractC5267mG0 a;

    @NotNull
    public final LinkedHashMap b;

    public IL0(@NotNull AbstractC5267mG0 format) {
        Intrinsics.checkNotNullParameter(format, "format");
        this.a = format;
        this.b = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        if (defpackage.C4994l.k(r10, r9, r2) == r3) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.IL0 r9, defpackage.InterfaceC6396rf0 r10, defpackage.RJ0 r11, java.nio.charset.Charset r12, defpackage.InterfaceC1958Rw r13, defpackage.LM r14) {
        /*
            r9.getClass()
            boolean r2 = r14 instanceof defpackage.HL0
            if (r2 == 0) goto L16
            r2 = r14
            HL0 r2 = (defpackage.HL0) r2
            int r3 = r2.m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.m = r3
            goto L1b
        L16:
            HL0 r2 = new HL0
            r2.<init>(r9, r14)
        L1b:
            java.lang.Object r1 = r2.k
            MN r3 = defpackage.MN.d
            int r4 = r2.m
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L61
            if (r4 == r7) goto L47
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L32
            defpackage.C1795Pt1.b(r1)
            goto Lc2
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            java.lang.Object r9 = r2.e
            tG0 r9 = (defpackage.C6736tG0) r9
            java.lang.Object r10 = r2.d
            Rw r10 = (defpackage.InterfaceC1958Rw) r10
            defpackage.C1795Pt1.b(r1)
            goto Lb3
        L47:
            tG0 r9 = r2.j
            Rw r10 = r2.i
            java.nio.charset.Charset r12 = r2.h
            RJ0 r11 = r2.g
            java.lang.Object r0 = r2.e
            rf0 r0 = (defpackage.InterfaceC6396rf0) r0
            java.lang.Object r4 = r2.d
            IL0 r4 = (defpackage.IL0) r4
            defpackage.C1795Pt1.b(r1)
            r1 = r11
            r11 = r9
            r9 = r1
            r1 = r10
            r10 = r12
            r12 = r4
            goto L94
        L61:
            defpackage.C1795Pt1.b(r1)
            java.util.LinkedHashMap r1 = r9.b
            java.lang.Object r4 = r1.get(r12)
            if (r4 != 0) goto L74
            tG0 r4 = new tG0
            r4.<init>(r12)
            r1.put(r12, r4)
        L74:
            r1 = r4
            tG0 r1 = (defpackage.C6736tG0) r1
            r2.d = r9
            r2.e = r10
            r2.g = r11
            r2.h = r12
            r2.i = r13
            r2.j = r1
            r2.m = r7
            byte[] r4 = r1.a
            java.lang.Object r4 = defpackage.C4994l.k(r13, r4, r2)
            if (r4 != r3) goto L8e
            goto Lc1
        L8e:
            r0 = r10
            r10 = r12
            r12 = r9
            r9 = r11
            r11 = r1
            r1 = r13
        L94:
            FL0 r4 = new FL0
            r13 = r9
            r14 = r10
            r10 = r1
            r9 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            r2.d = r10
            r2.e = r11
            r2.g = r8
            r2.h = r8
            r2.i = r8
            r2.j = r8
            r2.m = r6
            java.lang.Object r9 = r0.c(r9, r2)
            if (r9 != r3) goto Lb2
            goto Lc1
        Lb2:
            r9 = r11
        Lb3:
            byte[] r9 = r9.b
            r2.d = r8
            r2.e = r8
            r2.m = r5
            java.lang.Object r9 = defpackage.C4994l.k(r10, r9, r2)
            if (r9 != r3) goto Lc2
        Lc1:
            return r3
        Lc2:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.IL0.c(IL0, rf0, RJ0, java.nio.charset.Charset, Rw, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.BL0
    @Nullable
    public final Object a(@NotNull Charset charset, @NotNull A62 a62, @NotNull InterfaceC0942Ew interfaceC0942Ew, @NotNull LM lm) throws C7997zG0 {
        EL0 el0;
        if (lm instanceof EL0) {
            el0 = (EL0) lm;
            int i = el0.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                el0.g = i - Integer.MIN_VALUE;
            } else {
                el0 = new EL0(this, lm);
            }
        } else {
            el0 = new EL0(this, lm);
        }
        Object obj = el0.d;
        MN mn = MN.d;
        int i2 = el0.g;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                return obj;
            }
            C1795Pt1.b(obj);
            if (!Intrinsics.a(charset, Charsets.UTF_8) || !Intrinsics.a(a62.a, C2017Sp1.a.b(Sequence.class))) {
                return null;
            }
            AbstractC5267mG0 abstractC5267mG0 = this.a;
            el0.g = 1;
            Object objP = C5189lv.p(C6266r20.c, new C2687aH0(interfaceC0942Ew, a62, abstractC5267mG0, null), el0);
            return objP == mn ? mn : objP;
        } catch (Throwable th) {
            throw new C7997zG0("Illegal input: " + th.getMessage(), th);
        }
    }

    @Override // defpackage.BL0
    @Nullable
    public final C4147hA b(@NotNull C4651jM c4651jM, @NotNull Charset charset, @NotNull A62 a62, @Nullable Object obj) {
        if (!Intrinsics.a(charset, Charsets.UTF_8) || !Intrinsics.a(a62.a, C2017Sp1.a.b(InterfaceC6396rf0.class))) {
            return null;
        }
        return new C4147hA(new GL0(this, obj, C5027l8.w(this.a.b, C5207m.b(a62)), charset, null), C5207m.l(c4651jM, charset));
    }
}

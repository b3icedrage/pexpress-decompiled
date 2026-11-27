package defpackage;

import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes.dex */
public final class PN1 {
    public static final long a;

    static {
        b.a aVar = b.e;
        a = c.g(20, R40.SECONDS);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r7 == r1) goto L21;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull defpackage.GP1 r5, @org.jetbrains.annotations.NotNull E31.a r6, @org.jetbrains.annotations.NotNull defpackage.LM r7) {
        /*
            boolean r0 = r7 instanceof defpackage.NN1
            if (r0 == 0) goto L13
            r0 = r7
            NN1 r0 = (defpackage.NN1) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            NN1 r0 = new NN1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r7)
            goto L59
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            FP1 r5 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L46
        L38:
            defpackage.C1795Pt1.b(r7)
            r0.d = r5
            r0.g = r4
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L46
            goto L58
        L46:
            ON1 r6 = new ON1
            r7 = 0
            r6.<init>(r5, r7)
            r0.d = r7
            r0.g = r3
            long r2 = defpackage.PN1.a
            java.lang.Object r7 = defpackage.OZ1.d(r2, r6, r0)
            if (r7 != r1) goto L59
        L58:
            return r1
        L59:
            MN1 r7 = (defpackage.MN1) r7
            MN1 r5 = defpackage.MN1.e
            if (r7 != r5) goto L60
            goto L61
        L60:
            r4 = 0
        L61:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.PN1.a(GP1, E31$a, LM):java.lang.Object");
    }
}

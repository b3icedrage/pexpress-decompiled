package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5212m1 implements InterfaceC7187vQ1 {

    @Nullable
    public K12.a a;

    @Override // defpackage.InterfaceC7187vQ1
    public final void a(@Nullable K12.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r2.invoke(r6, r0) == r1) goto L28;
     */
    @Override // defpackage.InterfaceC7187vQ1
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull defpackage.C7398wQ1 r6, @org.jetbrains.annotations.NotNull defpackage.LM r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C4999l1
            if (r0 == 0) goto L13
            r0 = r7
            l1 r0 = (defpackage.C4999l1) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            l1 r0 = new l1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 == r3) goto L29
            r6 = 3
            if (r2 != r6) goto L2f
        L29:
            boolean r6 = r0.e
            defpackage.C1795Pt1.b(r7)
            goto L6a
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            m1 r6 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L4c
        L3d:
            defpackage.C1795Pt1.b(r7)
            r0.d = r5
            r0.i = r4
            java.lang.Object r7 = r5.c(r6, r0)
            if (r7 != r1) goto L4b
            goto L65
        L4b:
            r6 = r5
        L4c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L66
            K12$a r2 = r6.a
            if (r2 == 0) goto L69
            r4 = 0
            r0.d = r4
            r0.e = r7
            r0.i = r3
            java.lang.Object r6 = r2.invoke(r6, r0)
            if (r6 != r1) goto L69
        L65:
            return r1
        L66:
            r6.getClass()
        L69:
            r6 = r7
        L6a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5212m1.b(wQ1, LM):java.lang.Object");
    }

    @Nullable
    public abstract Object c(@NotNull C7398wQ1 c7398wQ1, @NotNull JM<? super Boolean> jm);
}

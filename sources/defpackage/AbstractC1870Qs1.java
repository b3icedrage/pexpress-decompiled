package defpackage;

import android.app.Activity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Qs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1870Qs1 implements InterfaceC1555Ms1 {

    @NotNull
    public final Activity d;

    public AbstractC1870Qs1(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.d = activity;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r5 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object e(defpackage.AbstractC1870Qs1 r5, kotlin.jvm.functions.Function0 r6, kotlin.jvm.functions.Function0 r7, kotlin.jvm.functions.Function0 r8, defpackage.LM r9) {
        /*
            boolean r0 = r9 instanceof defpackage.C1714Os1
            if (r0 == 0) goto L13
            r0 = r9
            Os1 r0 = (defpackage.C1714Os1) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            Os1 r0 = new Os1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.h
            MN r1 = defpackage.MN.d
            int r2 = r0.j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r9)
            goto L8d
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            kotlin.jvm.functions.Function0 r7 = r0.g
            kotlin.jvm.functions.Function0 r6 = r0.e
            Qs1 r5 = r0.d
            defpackage.C1795Pt1.b(r9)
            goto L5e
        L3c:
            defpackage.C1795Pt1.b(r9)
            android.app.Activity r9 = r5.d
            java.lang.String r2 = r5.a()
            int r9 = defpackage.C6333rM.checkSelfPermission(r9, r2)
            if (r9 != 0) goto L4f
            r8.invoke()
            goto L69
        L4f:
            r0.d = r5
            r0.e = r6
            r0.g = r7
            r0.j = r4
            java.lang.Object r9 = r5.d(r0)
            if (r9 != r1) goto L5e
            goto L8c
        L5e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            if (r8 == 0) goto L6c
            r6.invoke()
        L69:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L6c:
            r7.invoke()
            r6 = 0
            r0.d = r6
            r0.e = r6
            r0.g = r6
            r0.j = r3
            zg1 r5 = r5.b()
            Ps1 r7 = new Ps1
            r7.<init>(r4, r6)
            java.lang.Object r5 = r5.m(r7, r0)
            if (r5 != r1) goto L88
            goto L8a
        L88:
            kotlin.Unit r5 = kotlin.Unit.a
        L8a:
            if (r5 != r1) goto L8d
        L8c:
            return r1
        L8d:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1870Qs1.e(Qs1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, LM):java.lang.Object");
    }

    @NotNull
    public abstract AbstractC8082zg1<Boolean> b();

    @Override // defpackage.InterfaceC1555Ms1
    @Nullable
    public final Object c(@NotNull Function0 function0, @NotNull Function0 function1, @NotNull Function0 function2, @NotNull AW1 aw1) {
        return e(this, function0, function1, function2, aw1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(LM lm) {
        C1636Ns1 c1636Ns1;
        AbstractC1870Qs1 abstractC1870Qs1;
        if (lm instanceof C1636Ns1) {
            c1636Ns1 = (C1636Ns1) lm;
            int i = c1636Ns1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1636Ns1.h = i - Integer.MIN_VALUE;
            } else {
                c1636Ns1 = new C1636Ns1(this, lm);
            }
        } else {
            c1636Ns1 = new C1636Ns1(this, lm);
        }
        Object objO = c1636Ns1.e;
        MN mn = MN.d;
        int i2 = c1636Ns1.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0<Boolean> interfaceC6396rf0L = b().l();
            c1636Ns1.d = this;
            c1636Ns1.h = 1;
            objO = C4466ii.o(interfaceC6396rf0L, c1636Ns1);
            if (objO == mn) {
                return mn;
            }
            abstractC1870Qs1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC1870Qs1 = c1636Ns1.d;
            C1795Pt1.b(objO);
        }
        return Boolean.valueOf(((Boolean) objO).booleanValue() && !Y6.b(abstractC1870Qs1.d, abstractC1870Qs1.a()));
    }
}

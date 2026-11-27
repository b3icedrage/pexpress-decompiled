package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Cr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0772Cr0 {

    @NotNull
    public final C3032br0 a;

    @NotNull
    public final C1782Pp0 b;

    public C0772Cr0(@NotNull C3032br0 builder, @NotNull C1782Pp0 client) {
        Set setKeySet;
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(client, "client");
        this.a = builder;
        this.b = client;
        Map map = (Map) builder.f.e(C3867fq0.a);
        if (map == null || (setKeySet = map.keySet()) == null) {
            return;
        }
        ArrayList<InterfaceC4755jq0> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (obj instanceof InterfaceC4755jq0) {
                arrayList.add(obj);
            }
        }
        for (InterfaceC4755jq0 interfaceC4755jq0 : arrayList) {
            if (C4965kq0.b(this.b, interfaceC4755jq0) == null) {
                throw new IllegalArgumentException(("Consider installing " + interfaceC4755jq0 + " plugin because the request requires it to be installed").toString());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object a(@NotNull AbstractC5391mr0 abstractC5391mr0, @NotNull LM lm) {
        C7911yr0 c7911yr0;
        if (lm instanceof C7911yr0) {
            c7911yr0 = (C7911yr0) lm;
            int i = c7911yr0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7911yr0.h = i - Integer.MIN_VALUE;
            } else {
                c7911yr0 = new C7911yr0(this, lm);
            }
        } else {
            c7911yr0 = new C7911yr0(this, lm);
        }
        Object obj = c7911yr0.e;
        MN mn = MN.d;
        int i2 = c7911yr0.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            CoroutineContext.Element elementP = abstractC5391mr0.getE().p(XF0.a.d);
            Intrinsics.checkNotNull(elementP);
            FG fg = (FG) elementP;
            fg.X();
            try {
                InterfaceC0942Ew interfaceC0942EwC = abstractC5391mr0.c();
                Intrinsics.checkNotNullParameter(interfaceC0942EwC, "<this>");
                interfaceC0942EwC.i(null);
            } catch (Throwable unused) {
            }
            c7911yr0.d = fg;
            c7911yr0.h = 1;
            if (fg.b1(c7911yr0) == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
    
        if (r2.a(r11, r0) == r1) goto L49;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull defpackage.C0616Ar0 r10, @org.jetbrains.annotations.NotNull defpackage.LM r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.C8121zr0
            if (r0 == 0) goto L13
            r0 = r11
            zr0 r0 = (defpackage.C8121zr0) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            zr0 r0 = new zr0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L64
            if (r2 == r7) goto L58
            if (r2 == r6) goto L47
            if (r2 == r5) goto L41
            if (r2 == r4) goto L35
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            java.lang.Object r10 = r0.d
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            defpackage.C1795Pt1.b(r11)     // Catch: java.util.concurrent.CancellationException -> L3e
            goto La3
        L3e:
            r10 = move-exception
            goto La4
        L41:
            java.lang.Object r10 = r0.d
            defpackage.C1795Pt1.b(r11)     // Catch: java.util.concurrent.CancellationException -> L3e
            return r10
        L47:
            java.lang.Object r10 = r0.e
            mr0 r10 = (defpackage.AbstractC5391mr0) r10
            java.lang.Object r2 = r0.d
            Cr0 r2 = (defpackage.C0772Cr0) r2
            defpackage.C1795Pt1.b(r11)     // Catch: java.lang.Throwable -> L53
            goto L87
        L53:
            r11 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto L96
        L58:
            java.lang.Object r10 = r0.e
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            java.lang.Object r2 = r0.d
            Cr0 r2 = (defpackage.C0772Cr0) r2
            defpackage.C1795Pt1.b(r11)     // Catch: java.util.concurrent.CancellationException -> L3e
            goto L75
        L64:
            defpackage.C1795Pt1.b(r11)
            r0.d = r9     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.e = r10     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.i = r7     // Catch: java.util.concurrent.CancellationException -> L3e
            java.lang.Object r11 = r9.c(r0)     // Catch: java.util.concurrent.CancellationException -> L3e
            if (r11 != r1) goto L74
            goto La2
        L74:
            r2 = r9
        L75:
            mr0 r11 = (defpackage.AbstractC5391mr0) r11     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.d = r2     // Catch: java.lang.Throwable -> L95
            r0.e = r11     // Catch: java.lang.Throwable -> L95
            r0.i = r6     // Catch: java.lang.Throwable -> L95
            java.lang.Object r10 = r10.invoke(r11, r0)     // Catch: java.lang.Throwable -> L95
            if (r10 != r1) goto L84
            goto La2
        L84:
            r8 = r11
            r11 = r10
            r10 = r8
        L87:
            r0.d = r11     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.e = r3     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.i = r5     // Catch: java.util.concurrent.CancellationException -> L3e
            java.lang.Object r10 = r2.a(r10, r0)     // Catch: java.util.concurrent.CancellationException -> L3e
            if (r10 != r1) goto L94
            goto La2
        L94:
            return r11
        L95:
            r10 = move-exception
        L96:
            r0.d = r10     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.e = r3     // Catch: java.util.concurrent.CancellationException -> L3e
            r0.i = r4     // Catch: java.util.concurrent.CancellationException -> L3e
            java.lang.Object r11 = r2.a(r11, r0)     // Catch: java.util.concurrent.CancellationException -> L3e
            if (r11 != r1) goto La3
        La2:
            return r1
        La3:
            throw r10     // Catch: java.util.concurrent.CancellationException -> L3e
        La4:
            java.lang.Throwable r10 = defpackage.QO.r(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0772Cr0.b(Ar0, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(@NotNull LM lm) throws Throwable {
        C0694Br0 c0694Br0;
        if (lm instanceof C0694Br0) {
            c0694Br0 = (C0694Br0) lm;
            int i = c0694Br0.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0694Br0.g = i - Integer.MIN_VALUE;
            } else {
                c0694Br0 = new C0694Br0(this, lm);
            }
        } else {
            c0694Br0 = new C0694Br0(this, lm);
        }
        Object objC = c0694Br0.d;
        MN mn = MN.d;
        int i2 = c0694Br0.g;
        try {
            if (i2 == 0) {
                C1795Pt1.b(objC);
                C3032br0 c3032br0 = new C3032br0();
                c3032br0.c(this.a);
                C1782Pp0 c1782Pp0 = this.b;
                c0694Br0.g = 1;
                objC = c1782Pp0.c(c3032br0, c0694Br0);
                if (objC == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(objC);
            }
            return ((C2250Vp0) objC).d();
        } catch (CancellationException e) {
            throw QO.r(e);
        }
    }

    @NotNull
    public final String toString() {
        return "HttpStatement[" + this.a.a + ']';
    }
}

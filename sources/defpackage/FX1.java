package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class FX1 implements InterfaceC0735Cf {

    @NotNull
    public final InterfaceC0735Cf a;

    @NotNull
    public final String b;

    @Nullable
    public final Function0<Boolean> c;

    @NotNull
    public final InterfaceC3706f42 d;

    @NotNull
    public final EM e;

    public FX1(@NotNull InterfaceC0735Cf delegate, @NotNull String name, @Nullable Function0<Boolean> function0, @NotNull InterfaceC3706f42 telemetry) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(telemetry, "telemetry");
        this.a = delegate;
        this.b = name;
        this.c = function0;
        this.d = telemetry;
        this.e = LN.a(CoroutineContext.Element.a.c(C0564Aa.a(), C6266r20.a));
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean a(@NotNull InterfaceC0735Cf updater) {
        Intrinsics.checkNotNullParameter(updater, "updater");
        return this == updater || this.a.a(updater);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00a7 */
    /* JADX WARN: Code duplicated, block: B:35:0x0083  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.InterfaceC0735Cf
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull defpackage.LM r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.DX1
            if (r0 == 0) goto L14
            r0 = r12
            DX1 r0 = (defpackage.DX1) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.i = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            DX1 r0 = new DX1
            r0.<init>(r11, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.g
            MN r1 = defpackage.MN.d
            int r2 = r12.i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 != r4) goto L3a
            bP1 r1 = r12.e
            FX1 r12 = r12.d
            defpackage.C1795Pt1.b(r0)     // Catch: java.lang.Throwable -> L2f java.util.concurrent.CancellationException -> L35
            r7 = r11
            goto L81
        L2f:
            r0 = move-exception
            r7 = r11
            r2 = r1
            r1 = r0
            goto L93
        L35:
            r0 = move-exception
            r12 = r0
            r7 = r11
            goto Laa
        L3a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L42:
            defpackage.C1795Pt1.b(r0)
            long r8 = java.lang.System.currentTimeMillis()
            Ot1$a r0 = defpackage.C1717Ot1.e     // Catch: java.lang.Throwable -> L55
            f42 r0 = r11.d     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = r11.b     // Catch: java.lang.Throwable -> L55
            r0.k(r2)     // Catch: java.lang.Throwable -> L55
            kotlin.Unit r0 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L55
            goto L5b
        L55:
            r0 = move-exception
            Ot1$a r2 = defpackage.C1717Ot1.e
            defpackage.C1795Pt1.a(r0)
        L5b:
            kotlin.jvm.functions.Function0<java.lang.Boolean> r6 = r11.c
            if (r6 == 0) goto L6f
            EX1 r5 = new EX1
            r10 = 0
            r7 = r11
            r5.<init>(r6, r7, r8, r10)
            r0 = 3
            EM r2 = r7.e
            bP1 r0 = defpackage.C5189lv.k(r2, r3, r5, r0)
            r2 = r0
            goto L71
        L6f:
            r7 = r11
            r2 = r3
        L71:
            Cf r0 = r7.a     // Catch: java.lang.Throwable -> L8e java.util.concurrent.CancellationException -> L90
            r12.d = r7     // Catch: java.lang.Throwable -> L8e java.util.concurrent.CancellationException -> L90
            r12.e = r2     // Catch: java.lang.Throwable -> L8e java.util.concurrent.CancellationException -> L90
            r12.i = r4     // Catch: java.lang.Throwable -> L8e java.util.concurrent.CancellationException -> L90
            java.lang.Object r12 = r0.b(r12)     // Catch: java.lang.Throwable -> L8e java.util.concurrent.CancellationException -> L90
            if (r12 != r1) goto L80
            return r1
        L80:
            r1 = r2
        L81:
            if (r1 == 0) goto L86
            r1.l(r3)
        L86:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        L89:
            r1 = r0
            r12 = r7
            goto L93
        L8c:
            r1 = r2
            goto Laa
        L8e:
            r0 = move-exception
            goto L89
        L90:
            r0 = move-exception
            r12 = r0
            goto L8c
        L93:
            Ot1$a r0 = defpackage.C1717Ot1.e     // Catch: java.lang.Throwable -> L9f
            f42 r0 = r12.d     // Catch: java.lang.Throwable -> L9f
            java.lang.String r12 = r12.b     // Catch: java.lang.Throwable -> L9f
            r0.G(r12, r1)     // Catch: java.lang.Throwable -> L9f
            kotlin.Unit r12 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L9f
            goto La6
        L9f:
            r0 = move-exception
            r12 = r0
            Ot1$a r0 = defpackage.C1717Ot1.e     // Catch: java.lang.Throwable -> La7
            defpackage.C1795Pt1.a(r12)     // Catch: java.lang.Throwable -> La7
        La6:
            throw r1     // Catch: java.lang.Throwable -> La7
        La7:
            r0 = move-exception
            r12 = r0
            goto Lae
        Laa:
            throw r12     // Catch: java.lang.Throwable -> Lab
        Lab:
            r0 = move-exception
            r12 = r0
            r2 = r1
        Lae:
            if (r2 == 0) goto Lb3
            r2.l(r3)
        Lb3:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FX1.b(LM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean c() {
        return this.a.c();
    }

    @Override // defpackage.InterfaceC0735Cf
    public final void stop() {
        this.a.stop();
    }
}

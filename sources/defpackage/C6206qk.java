package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6206qk implements InterfaceC0735Cf {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final C4943kk b;

    @NotNull
    public final InterfaceC3985gQ c;

    @Nullable
    public volatile C2936bP1 d;

    public C6206qk(@NotNull C4923kf appData, @NotNull C4943kk assetsRepository, @NotNull InterfaceC3985gQ cryptoEnablementProvider) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(assetsRepository, "assetsRepository");
        Intrinsics.checkNotNullParameter(cryptoEnablementProvider, "cryptoEnablementProvider");
        this.a = appData;
        this.b = assetsRepository;
        this.c = cryptoEnablementProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        if (r10 == r4) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.C6206qk r10, defpackage.LM r11) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6206qk.d(qk, LM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean a(@NotNull InterfaceC0735Cf interfaceC0735Cf) {
        return InterfaceC0735Cf.a.a(this, interfaceC0735Cf);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (defpackage.LN.d(r6, r0) == r1) goto L25;
     */
    @Override // defpackage.InterfaceC0735Cf
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull defpackage.LM r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.C5786ok
            if (r0 == 0) goto L13
            r0 = r6
            ok r0 = (defpackage.C5786ok) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ok r0 = new ok
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r6)
            goto L61
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            qk r2 = r0.d
            defpackage.C1795Pt1.b(r6)
            goto L50
        L38:
            defpackage.C1795Pt1.b(r6)
            r0.d = r5
            r0.h = r4
            kf r6 = r5.a
            GP1 r6 = r6.k
            java.lang.Object r6 = defpackage.C7236vf0.a(r6, r0)
            if (r6 != r1) goto L4a
            goto L4c
        L4a:
            kotlin.Unit r6 = kotlin.Unit.a
        L4c:
            if (r6 != r1) goto L4f
            goto L60
        L4f:
            r2 = r5
        L50:
            pk r6 = new pk
            r4 = 0
            r6.<init>(r2, r4)
            r0.d = r4
            r0.h = r3
            java.lang.Object r6 = defpackage.LN.d(r6, r0)
            if (r6 != r1) goto L61
        L60:
            return r1
        L61:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6206qk.b(LM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0735Cf
    public final boolean c() {
        return true;
    }

    @Override // defpackage.InterfaceC0735Cf
    public final void stop() {
        C2936bP1 c2936bP1 = this.d;
        if (c2936bP1 != null) {
            c2936bP1.l(null);
        }
    }
}

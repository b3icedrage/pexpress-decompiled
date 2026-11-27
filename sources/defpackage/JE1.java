package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class JE1 implements EE1 {

    @NotNull
    public final AbstractC2167Un1 a;

    @NotNull
    public final O3 b;

    public JE1(@NotNull AbstractC2167Un1 realAccountIdUseCase, @NotNull O3 accountModeSelectionUseCase) {
        Intrinsics.checkNotNullParameter(realAccountIdUseCase, "realAccountIdUseCase");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        this.a = realAccountIdUseCase;
        this.b = accountModeSelectionUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (((defpackage.P3) r7).m(r9, r0) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        if (r10.l(r2, r0) == r1) goto L31;
     */
    @Override // defpackage.EE1
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull com.api.core.backend.domain.models.responseModels.CommonAccount r9, @org.jetbrains.annotations.NotNull defpackage.LM r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.FE1
            if (r0 == 0) goto L13
            r0 = r10
            FE1 r0 = (defpackage.FE1) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            FE1 r0 = new FE1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.C1795Pt1.b(r10)
            goto L8b
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            com.api.core.backend.domain.models.responseModels.CommonAccount r9 = r0.e
            JE1 r2 = r0.d
            defpackage.C1795Pt1.b(r10)
            goto L77
        L3e:
            defpackage.C1795Pt1.b(r10)
            goto L5f
        L42:
            defpackage.C1795Pt1.b(r10)
            com.api.core.backend.domain.models.responseModels.AccountType r10 = r9.getType()
            com.api.core.backend.domain.models.responseModels.AccountType r2 = com.api.core.backend.domain.models.responseModels.AccountType.DEMO
            O3 r7 = r8.b
            if (r10 != r2) goto L62
            GE1 r9 = new GE1
            r9.<init>(r5, r6)
            r0.i = r5
            P3 r7 = (defpackage.P3) r7
            java.lang.Object r9 = r7.m(r9, r0)
            if (r9 != r1) goto L5f
            goto L8a
        L5f:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L62:
            HE1 r10 = new HE1
            r10.<init>(r5, r6)
            r0.d = r8
            r0.e = r9
            r0.i = r4
            P3 r7 = (defpackage.P3) r7
            java.lang.Object r10 = r7.m(r10, r0)
            if (r10 != r1) goto L76
            goto L8a
        L76:
            r2 = r8
        L77:
            Un1 r10 = r2.a
            IE1 r2 = new IE1
            r2.<init>(r9, r6)
            r0.d = r6
            r0.e = r6
            r0.i = r3
            java.lang.Object r9 = r10.l(r2, r0)
            if (r9 != r1) goto L8b
        L8a:
            return r1
        L8b:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.JE1.a(com.api.core.backend.domain.models.responseModels.CommonAccount, LM):java.lang.Object");
    }
}

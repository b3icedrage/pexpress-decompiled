package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.CommonErrorClassificationKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3972gL1 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final AbstractC5045lD0 b;

    public AbstractC3972gL1(@NotNull C4923kf appData, @NotNull AbstractC5045lD0 isShowValueUseCase) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(isShowValueUseCase, "isShowValueUseCase");
        this.a = appData;
        this.b = isShowValueUseCase;
    }

    @Nullable
    public abstract Object a(@NotNull String str, @NotNull LM lm);

    @Nullable
    public final Object b(@NotNull KN kn, @NotNull CommonError commonError, @NotNull String str, boolean z, @NotNull LM lm) {
        if ((commonError instanceof CommonError.EmailAlreadyRegistered) || (commonError instanceof CommonError.BadRequest) || (commonError instanceof CommonError.UserAlreadyRegistered)) {
            return a(str, lm);
        }
        if ((commonError instanceof CommonError.ValidationError) || (commonError instanceof CommonError.InvalidEmail)) {
            return new C4078gq1(C4078gq1.a.i, (String) null, z);
        }
        if ((commonError instanceof CommonError.RestrictedCountry) || (commonError instanceof CommonError.VPNError)) {
            return c(z, lm);
        }
        if (commonError instanceof CommonError.IncorrectCredentials) {
            return new C4078gq1(C4078gq1.a.m, z, 2);
        }
        if (commonError instanceof CommonError.OurServerError) {
            return new C4078gq1(C4078gq1.a.j, z, 2);
        }
        return CommonErrorClassificationKt.c(commonError) ? new C4078gq1(C4078gq1.a.l, z, 2) : new C4078gq1(C4078gq1.a.h, (String) null, z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r7 == r1) goto L24;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(boolean r6, @org.jetbrains.annotations.NotNull defpackage.LM r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C3762fL1
            if (r0 == 0) goto L13
            r0 = r7
            fL1 r0 = (defpackage.C3762fL1) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            fL1 r0 = new fL1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            boolean r6 = r0.e
            defpackage.C1795Pt1.b(r7)
            goto L6b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            boolean r6 = r0.e
            gL1 r2 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L51
        L3c:
            defpackage.C1795Pt1.b(r7)
            kf r7 = r5.a
            GP1 r7 = r7.b
            r0.d = r5
            r0.e = r6
            r0.i = r4
            java.lang.Object r7 = defpackage.C7236vf0.a(r7, r0)
            if (r7 != r1) goto L50
            goto L6a
        L50:
            r2 = r5
        L51:
            FF r7 = (defpackage.FF) r7
            boolean r7 = r7.d
            if (r7 == 0) goto L7b
            lD0 r7 = r2.b
            rf0 r7 = r7.l()
            r2 = 0
            r0.d = r2
            r0.e = r6
            r0.i = r3
            java.lang.Object r7 = defpackage.C4466ii.o(r7, r0)
            if (r7 != r1) goto L6b
        L6a:
            return r1
        L6b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7b
            gq1 r7 = new gq1
            gq1$a r0 = defpackage.C4078gq1.a.d
            r7.<init>(r0, r6, r3)
            return r7
        L7b:
            gq1 r7 = new gq1
            gq1$a r0 = defpackage.C4078gq1.a.e
            r7.<init>(r0, r6, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3972gL1.c(boolean, LM):java.lang.Object");
    }
}

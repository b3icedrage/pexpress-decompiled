package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6097qD implements InterfaceC5887pD {

    @NotNull
    public final C4923kf a;

    /* JADX INFO: renamed from: qD$a */
    @InterfaceC3368dU(c = "com.base.library.registration.usecases.ClearDataUseCaseBase", f = "ClearDataUseCaseBase.kt", l = {15, CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "clearOldAccountData$suspendImpl")
    public static final class a extends LM {
        public C6097qD d;
        public /* synthetic */ Object e;
        public int h;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.h |= Integer.MIN_VALUE;
            return C6097qD.b(C6097qD.this, this);
        }
    }

    public C6097qD(@NotNull C4923kf appData) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        this.a = appData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if (defpackage.C5189lv.p(defpackage.QV0.a, new defpackage.YM(r6, null), r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(defpackage.C6097qD r6, defpackage.JM<? super com.api.core.backend.domain.models.resultModels.CommonResult<?>> r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C6097qD.a
            if (r0 == 0) goto L13
            r0 = r7
            qD$a r0 = (defpackage.C6097qD.a) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            qD$a r0 = new qD$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.C1795Pt1.b(r7)
            goto L8e
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            qD r6 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L54
        L39:
            defpackage.C1795Pt1.b(r7)
            kf r7 = r6.a
            GP1 r7 = r7.k
            r7.setValue(r3)
            kf r7 = r6.a
            qK1 r7 = r7.D
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.d = r6
            r0.h = r5
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L54
            goto L8d
        L54:
            kf r7 = r6.a
            GP1 r7 = r7.l
            r7.setValue(r3)
            kf r6 = r6.a
            GP1 r7 = r6.c
            r7.setValue(r3)
            GP1 r7 = r6.d
            r7.setValue(r3)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            GP1 r6 = r6.e
            r6.getClass()
            r6.m(r3, r7)
            android.webkit.CookieManager r6 = android.webkit.CookieManager.getInstance()
            java.lang.String r7 = "getInstance(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.d = r3
            r0.h = r4
            RV r7 = defpackage.C6266r20.a
            zn0 r7 = defpackage.QV0.a
            YM r2 = new YM
            r2.<init>(r6, r3)
            java.lang.Object r6 = defpackage.C5189lv.p(r7, r2, r0)
            if (r6 != r1) goto L8e
        L8d:
            return r1
        L8e:
            com.api.core.backend.domain.models.resultModels.ResultOk r6 = new com.api.core.backend.domain.models.resultModels.ResultOk
            kotlin.Unit r7 = kotlin.Unit.a
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6097qD.b(qD, JM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC5887pD
    @Nullable
    public final Object a(@NotNull JM<? super CommonResult<?>> jm) {
        return b(this, jm);
    }
}

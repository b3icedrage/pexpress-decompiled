package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class PU1 implements OU1 {

    @NotNull
    public final C4923kf a;

    @NotNull
    public final C4612j90 b;

    @NotNull
    public final C6120qK1 c;

    @NotNull
    public final C1621Nn1 d;

    @InterfaceC3368dU(c = "com.base.library.registration.usecases.SuccessLoginUseCaseBase", f = "SuccessLoginUseCaseBase.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE, ConnectionResult.API_DISABLED, 25}, m = "goToPlatform$suspendImpl")
    public static final class a extends LM {
        public PU1 d;
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
            return PU1.c(PU1.this, this);
        }
    }

    public PU1(@NotNull C4923kf appData, @NotNull C4612j90 eventsFlowsProvider) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
        this.a = appData;
        this.b = eventsFlowsProvider;
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.c = c6120qK1G;
        this.d = C4466ii.e(c6120qK1G);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r6.a(r7, r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(defpackage.PU1 r6, defpackage.JM<? super com.api.core.backend.domain.models.resultModels.CommonResult<?>> r7) {
        /*
            boolean r0 = r7 instanceof PU1.a
            if (r0 == 0) goto L13
            r0 = r7
            PU1$a r0 = (PU1.a) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            PU1$a r0 = new PU1$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.C1795Pt1.b(r7)
            goto L76
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            PU1 r6 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L64
        L3b:
            defpackage.C1795Pt1.b(r7)
            kf r7 = r6.a
            GP1 r7 = r7.c
            java.lang.Object r7 = r7.getValue()
            qK1 r2 = r6.c
            if (r7 == 0) goto L57
            OU1$a r7 = OU1.a.d
            r0.d = r6
            r0.h = r5
            java.lang.Object r7 = r2.a(r7, r0)
            if (r7 != r1) goto L64
            goto L75
        L57:
            OU1$a r7 = OU1.a.e
            r0.d = r6
            r0.h = r4
            java.lang.Object r7 = r2.a(r7, r0)
            if (r7 != r1) goto L64
            goto L75
        L64:
            j90 r6 = r6.b
            qK1 r6 = r6.z
            j90$b r7 = defpackage.C4612j90.b.e
            r2 = 0
            r0.d = r2
            r0.h = r3
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L76
        L75:
            return r1
        L76:
            com.api.core.backend.domain.models.resultModels.ResultOk r6 = new com.api.core.backend.domain.models.resultModels.ResultOk
            kotlin.Unit r7 = kotlin.Unit.a
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.PU1.c(PU1, JM):java.lang.Object");
    }

    @Override // defpackage.OU1
    @Nullable
    public final Object a(@NotNull JM<? super CommonResult<?>> jm) {
        return c(this, jm);
    }

    @Override // defpackage.OU1
    @NotNull
    public final C1621Nn1 b() {
        return this.d;
    }
}

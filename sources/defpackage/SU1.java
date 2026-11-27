package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.google.android.gms.common.ConnectionResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class SU1 implements RU1 {

    @NotNull
    public final C4612j90 a;

    @NotNull
    public final C6120qK1 b;

    @NotNull
    public final C1621Nn1 c;

    @InterfaceC3368dU(c = "com.base.library.registration.usecases.SuccessRegisterUseCaseBase", f = "SuccessRegisterUseCaseBase.kt", l = {17, ConnectionResult.SERVICE_UPDATING}, m = "goToPlatform$suspendImpl")
    public static final class a extends LM {
        public SU1 d;
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
            return SU1.c(SU1.this, this);
        }
    }

    public SU1(@NotNull C4612j90 eventsFlowsProvider) {
        Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
        this.a = eventsFlowsProvider;
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.b = c6120qK1G;
        this.c = C4466ii.e(c6120qK1G);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r5.a(r6, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(defpackage.SU1 r5, defpackage.JM<? super com.api.core.backend.domain.models.resultModels.CommonResult<?>> r6) {
        /*
            boolean r0 = r6 instanceof SU1.a
            if (r0 == 0) goto L13
            r0 = r6
            SU1$a r0 = (SU1.a) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            SU1$a r0 = new SU1$a
            r0.<init>(r6)
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
            goto L5c
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            SU1 r5 = r0.d
            defpackage.C1795Pt1.b(r6)
            goto L4a
        L38:
            defpackage.C1795Pt1.b(r6)
            qK1 r6 = r5.b
            kotlin.Unit r2 = kotlin.Unit.a
            r0.d = r5
            r0.h = r4
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L4a
            goto L5b
        L4a:
            j90 r5 = r5.a
            qK1 r5 = r5.z
            j90$b r6 = defpackage.C4612j90.b.e
            r2 = 0
            r0.d = r2
            r0.h = r3
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L5c
        L5b:
            return r1
        L5c:
            com.api.core.backend.domain.models.resultModels.ResultOk r5 = new com.api.core.backend.domain.models.resultModels.ResultOk
            kotlin.Unit r6 = kotlin.Unit.a
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.SU1.c(SU1, JM):java.lang.Object");
    }

    @Override // defpackage.RU1
    @Nullable
    public final Object a(@NotNull JM<? super CommonResult<?>> jm) {
        return c(this, jm);
    }

    @Override // defpackage.RU1
    @NotNull
    public final C1621Nn1 b() {
        return this.c;
    }
}

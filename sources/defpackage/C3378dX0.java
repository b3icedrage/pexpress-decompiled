package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import com.base.core.backend.modelsOurSideRequest.events.EventLoginRequest;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3378dX0 {
    public static final long f;
    public static final /* synthetic */ int g = 0;

    @NotNull
    public final C4923kf a;

    @NotNull
    public final ReporterApi b;

    @NotNull
    public final C5358mi c;

    @NotNull
    public final InterfaceC5862p6 d;

    @NotNull
    public final MF1 e;

    static {
        b.a aVar = b.e;
        f = c.g(2, R40.SECONDS);
    }

    public C3378dX0(@NotNull C4923kf appDataRepository, @NotNull ReporterApi reporter, @NotNull C5358mi updatesManager, @NotNull InterfaceC5862p6 activationStateProvider, @NotNull MF1 sentToMarketingIdsUseCase) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(updatesManager, "updatesManager");
        Intrinsics.checkNotNullParameter(activationStateProvider, "activationStateProvider");
        Intrinsics.checkNotNullParameter(sentToMarketingIdsUseCase, "sentToMarketingIdsUseCase");
        this.a = appDataRepository;
        this.b = reporter;
        this.c = updatesManager;
        this.d = activationStateProvider;
        this.e = sentToMarketingIdsUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:35:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
    
        if (r8 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.LM r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.YW0
            if (r0 == 0) goto L13
            r0 = r8
            YW0 r0 = (defpackage.YW0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            YW0 r0 = new YW0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            defpackage.C1795Pt1.b(r8)
            goto L9c
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L36:
            dX0 r2 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L62
        L3c:
            dX0 r2 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L53
        L42:
            defpackage.C1795Pt1.b(r8)
            r0.d = r7
            r0.h = r5
            mi r8 = r7.c
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L52
            goto L9b
        L52:
            r2 = r7
        L53:
            mi r8 = r2.c
            hg0 r8 = r8.f
            r0.d = r2
            r0.h = r4
            java.lang.Object r8 = defpackage.C4466ii.o(r8, r0)
            if (r8 != r1) goto L62
            goto L9b
        L62:
            mi$a r8 = (defpackage.C5358mi.a) r8
            boolean r4 = r8 instanceof defpackage.C5358mi.a.b
            if (r4 == 0) goto L9f
            com.base.core.backend.modelsOurSideRequest.events.EventAppVersionRequest r4 = new com.base.core.backend.modelsOurSideRequest.events.EventAppVersionRequest
            mi$a$b r8 = (defpackage.C5358mi.a.b) r8
            java.lang.String r8 = r8.b
            r4.<init>(r8)
            com.api.feature.analytics.reporters.ReporterApi r8 = r2.b
            java.lang.String r4 = defpackage.ZM.a(r4)
            r5 = 0
            java.lang.String r6 = "version"
            r8.j(r6, r4, r5)
            r8 = 0
            r0.d = r8
            r0.h = r3
            mi r2 = r2.c
            GP1 r3 = r2.e
            r3.setValue(r8)
            pi r3 = new pi
            r3.<init>(r2, r8)
            iM0 r8 = r2.b
            java.lang.Object r8 = r8.l(r3, r0)
            if (r8 != r1) goto L97
            goto L99
        L97:
            kotlin.Unit r8 = kotlin.Unit.a
        L99:
            if (r8 != r1) goto L9c
        L9b:
            return r1
        L9c:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L9f:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3378dX0.a(LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(LM lm) {
        ZW0 zw0;
        C3378dX0 c3378dX0;
        if (lm instanceof ZW0) {
            zw0 = (ZW0) lm;
            int i = zw0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                zw0.h = i - Integer.MIN_VALUE;
            } else {
                zw0 = new ZW0(this, lm);
            }
        } else {
            zw0 = new ZW0(this, lm);
        }
        Object objA = zw0.e;
        MN mn = MN.d;
        int i2 = zw0.h;
        if (i2 == 0) {
            C1795Pt1.b(objA);
            GP1 gp1 = this.a.k;
            zw0.d = this;
            zw0.h = 1;
            objA = C7236vf0.a(gp1, zw0);
            if (objA == mn) {
                return mn;
            }
            c3378dX0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3378dX0 = zw0.d;
            C1795Pt1.b(objA);
        }
        long j = ((C6945uG) objA).a;
        C6945uG c6945uG = (C6945uG) c3378dX0.a.k.getValue();
        c3378dX0.b.j("login", ZM.a(new EventLoginRequest(String.valueOf(c6945uG != null ? c6945uG.b : null), j)), false);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0091  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (r9.e.m(r10, r0) == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(long r8, defpackage.LM r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.C2735aX0
            if (r0 == 0) goto L13
            r0 = r10
            aX0 r0 = (defpackage.C2735aX0) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            aX0 r0 = new aX0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L46
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            defpackage.C1795Pt1.b(r10)
            goto Lbd
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            uG r8 = r0.e
            dX0 r9 = r0.d
            defpackage.C1795Pt1.b(r10)
            goto L83
        L3f:
            dX0 r8 = r0.d
            defpackage.C1795Pt1.b(r10)
            r9 = r8
            goto L5a
        L46:
            defpackage.C1795Pt1.b(r10)
            bX0 r10 = new bX0
            r10.<init>(r7, r6)
            r0.d = r7
            r0.i = r5
            java.lang.Object r10 = defpackage.OZ1.d(r8, r10, r0)
            if (r10 != r1) goto L59
            goto Lbc
        L59:
            r9 = r7
        L5a:
            kotlin.Pair r10 = (kotlin.Pair) r10
            if (r10 != 0) goto L61
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L61:
            A r8 = r10.d
            uG r8 = (defpackage.C6945uG) r8
            B r10 = r10.e
            o6 r10 = (defpackage.AbstractC5652o6) r10
            boolean r10 = r10 instanceof defpackage.AbstractC5652o6.c
            if (r10 == 0) goto L70
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L70:
            MF1 r10 = r9.e
            rf0 r10 = r10.l()
            r0.d = r9
            r0.e = r8
            r0.i = r4
            java.lang.Object r10 = defpackage.C4466ii.o(r10, r0)
            if (r10 != r1) goto L83
            goto Lbc
        L83:
            java.util.Set r10 = (java.util.Set) r10
            long r4 = r8.a
            java.lang.String r2 = java.lang.String.valueOf(r4)
            boolean r10 = r10.contains(r2)
            if (r10 == 0) goto L94
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L94:
            com.base.core.backend.modelsOurSideRequest.events.EventRegRequest r10 = new com.base.core.backend.modelsOurSideRequest.events.EventRegRequest
            long r4 = r8.a
            java.lang.String r2 = r8.b
            r10.<init>(r2, r4)
            com.api.feature.analytics.reporters.ReporterApi r2 = r9.b
            java.lang.String r10 = defpackage.ZM.a(r10)
            r4 = 0
            java.lang.String r5 = "register"
            r2.j(r5, r10, r4)
            cX0 r10 = new cX0
            r10.<init>(r8, r6)
            r0.d = r6
            r0.e = r6
            r0.i = r3
            MF1 r8 = r9.e
            java.lang.Object r8 = r8.m(r10, r0)
            if (r8 != r1) goto Lbd
        Lbc:
            return r1
        Lbd:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3378dX0.c(long, LM):java.lang.Object");
    }
}

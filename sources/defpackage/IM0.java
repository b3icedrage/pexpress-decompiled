package defpackage;

import com.api.core.ActivityStateProvider;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class IM0 {

    @NotNull
    public final ReporterApi a;

    @NotNull
    public final BB b;

    @NotNull
    public final ActivityStateProvider c;

    @NotNull
    public final K61 d;

    @NotNull
    public final C6120qK1 e;

    @NotNull
    public final C6120qK1 f;

    @NotNull
    public final C6120qK1 g;
    public KN h;

    @NotNull
    public final GP1 i;

    public IM0(@NotNull ReporterApi reporter, @NotNull BB checkInternetUseCase, @NotNull ActivityStateProvider activityStateProvider, @NotNull K61 notificationPermissionAnalyticsUseCase) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(checkInternetUseCase, "checkInternetUseCase");
        Intrinsics.checkNotNullParameter(activityStateProvider, "activityStateProvider");
        Intrinsics.checkNotNullParameter(notificationPermissionAnalyticsUseCase, "notificationPermissionAnalyticsUseCase");
        this.a = reporter;
        this.b = checkInternetUseCase;
        this.c = activityStateProvider;
        this.d = notificationPermissionAnalyticsUseCase;
        this.e = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.f = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.g = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.i = C1589Ne.i(null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ec A[PHI: r0 r1
      0x00ec: PHI (r0v5 IM0) = (r0v2 IM0), (r0v13 IM0) binds: [B:38:0x00e9, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r1v13 java.lang.Object) = (r1v7 java.lang.Object), (r1v16 java.lang.Object) binds: [B:38:0x00e9, B:18:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
    
        if (r1 == r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0100, code lost:
    
        if (r4.a(r6, r2) == r3) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.IM0 r17, defpackage.LM r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.IM0.a(IM0, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (defpackage.C7236vf0.a(r6, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(defpackage.IM0 r6, defpackage.KN r7, defpackage.LM r8) {
        /*
            boolean r0 = r8 instanceof defpackage.HM0
            if (r0 == 0) goto L13
            r0 = r8
            HM0 r0 = (defpackage.HM0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            HM0 r0 = new HM0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.C1795Pt1.b(r8)
            goto L67
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            IM0 r6 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L5a
        L39:
            defpackage.C1795Pt1.b(r8)
            r6.h = r7
            r0.d = r6
            r0.h = r5
            K61 r7 = r6.d
            r7.c()
            KN r7 = r6.h
            if (r7 == 0) goto L6a
            RV r8 = defpackage.C6266r20.a
            GM0 r2 = new GM0
            r2.<init>(r6, r3)
            defpackage.C5189lv.k(r7, r8, r2, r4)
            kotlin.Unit r7 = kotlin.Unit.a
            if (r7 != r1) goto L5a
            goto L66
        L5a:
            GP1 r6 = r6.i
            r0.d = r3
            r0.h = r4
            java.lang.Object r6 = defpackage.C7236vf0.a(r6, r0)
            if (r6 != r1) goto L67
        L66:
            return r1
        L67:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L6a:
            java.lang.String r6 = "scope"
            kotlin.jvm.internal.Intrinsics.l(r6)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.IM0.b(IM0, KN, LM):java.lang.Object");
    }
}

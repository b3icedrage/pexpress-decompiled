package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: aY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2737aY extends JI implements YX {

    @NotNull
    public final InterfaceC3951gE1 e;

    @NotNull
    public final C5253mB1 f;

    @NotNull
    public final ReporterApi g;

    @NotNull
    public final AbstractC5045lD0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2737aY(@NotNull PackageManager packageManager, @NotNull Context context, @NotNull C4923kf appData, @NotNull InterfaceC3951gE1 screensProvider, @NotNull C5253mB1 router, @NotNull ReporterApi reporter, @NotNull AbstractC5045lD0 isShowUseCaseApi) {
        super(packageManager, context, appData, reporter);
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(isShowUseCaseApi, "isShowUseCaseApi");
        this.e = screensProvider;
        this.f = router;
        this.g = reporter;
        this.h = isShowUseCaseApi;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if (defpackage.JI.i(r2, r0) == r1) goto L32;
     */
    @Override // defpackage.YX
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@org.jetbrains.annotations.NotNull defpackage.LM r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ZX
            if (r0 == 0) goto L13
            r0 = r7
            ZX r0 = (defpackage.ZX) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ZX r0 = new ZX
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.C1795Pt1.b(r7)
            goto L8c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            aY r0 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L6e
        L3b:
            aY r2 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L56
        L41:
            defpackage.C1795Pt1.b(r7)
            lD0 r7 = r6.h
            rf0 r7 = r7.l()
            r0.d = r6
            r0.h = r5
            java.lang.Object r7 = defpackage.C4466ii.o(r7, r0)
            if (r7 != r1) goto L55
            goto L8b
        L55:
            r2 = r6
        L56:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L7d
            com.api.feature.analytics.reporters.ReporterApi r7 = r2.g
            H91 r3 = defpackage.H91.DEPOSIT_SCREEN_TIME
            r0.d = r2
            r0.h = r4
            kotlin.Unit r7 = r7.i(r3, r0)
            if (r7 != r1) goto L6d
            goto L8b
        L6d:
            r0 = r2
        L6e:
            mB1 r7 = r0.f
            gE1 r0 = r0.e
            Bi0 r0 = r0.v()
            r1 = 0
            r7.c(r0, r1)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L7d:
            r7 = 0
            r0.d = r7
            r0.h = r3
            r2.getClass()
            java.lang.Object r7 = defpackage.JI.i(r2, r0)
            if (r7 != r1) goto L8c
        L8b:
            return r1
        L8c:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2737aY.e(LM):java.lang.Object");
    }
}

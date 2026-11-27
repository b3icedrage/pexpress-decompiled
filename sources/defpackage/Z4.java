package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Z4 extends JI implements X4 {

    @NotNull
    public final InterfaceC3951gE1 e;

    @NotNull
    public final C5253mB1 f;

    @NotNull
    public final AbstractC5045lD0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z4(@NotNull PackageManager packageManager, @NotNull Context context, @NotNull C4923kf appData, @NotNull InterfaceC3951gE1 screensProvider, @NotNull C5253mB1 router, @NotNull ReporterApi reporter, @NotNull AbstractC5045lD0 isShowValueUseCase) {
        super(packageManager, context, appData, reporter);
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(isShowValueUseCase, "isShowValueUseCase");
        this.e = screensProvider;
        this.f = router;
        this.g = isShowValueUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (defpackage.JI.i(r2, r0) == r1) goto L26;
     */
    @Override // defpackage.X4
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull defpackage.LM r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.Y4
            if (r0 == 0) goto L13
            r0 = r6
            Y4 r0 = (defpackage.Y4) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            Y4 r0 = new Y4
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
            goto L73
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            Z4 r2 = r0.d
            defpackage.C1795Pt1.b(r6)
            goto L4d
        L38:
            defpackage.C1795Pt1.b(r6)
            lD0 r6 = r5.g
            rf0 r6 = r6.l()
            r0.d = r5
            r0.h = r4
            java.lang.Object r6 = defpackage.C4466ii.o(r6, r0)
            if (r6 != r1) goto L4c
            goto L72
        L4c:
            r2 = r5
        L4d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L64
            mB1 r6 = r2.f
            gE1 r0 = r2.e
            Bi0 r0 = r0.C()
            r1 = 0
            r6.c(r0, r1)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L64:
            r6 = 0
            r0.d = r6
            r0.h = r3
            r2.getClass()
            java.lang.Object r6 = defpackage.JI.i(r2, r0)
            if (r6 != r1) goto L73
        L72:
            return r1
        L73:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Z4.a(LM):java.lang.Object");
    }
}

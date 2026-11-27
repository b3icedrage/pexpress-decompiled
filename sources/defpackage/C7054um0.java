package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: um0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7054um0 {

    @NotNull
    public final ReporterApi a;

    @NotNull
    public final InterfaceC0652Bd0 b;

    @NotNull
    public final AbstractC0757Cm0 c;

    @NotNull
    public final AbstractC1276Jd0 d;

    /* JADX INFO: renamed from: um0$a */
    public final class a {

        @NotNull
        public final String a;

        @NotNull
        public final String b;

        public a(@NotNull String cid, @NotNull String tid) {
            Intrinsics.checkNotNullParameter(cid, "cid");
            Intrinsics.checkNotNullParameter(tid, "tid");
            this.a = cid;
            this.b = tid;
        }
    }

    public C7054um0(@NotNull ReporterApi reporter, @NotNull InterfaceC0652Bd0 firebaseAnalyticsManager, @NotNull AbstractC0757Cm0 googleClientIdUseCase, @NotNull AbstractC1276Jd0 firebaseAppInstanceIdUseCase) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsManager, "firebaseAnalyticsManager");
        Intrinsics.checkNotNullParameter(googleClientIdUseCase, "googleClientIdUseCase");
        Intrinsics.checkNotNullParameter(firebaseAppInstanceIdUseCase, "firebaseAppInstanceIdUseCase");
        this.a = reporter;
        this.b = firebaseAnalyticsManager;
        this.c = googleClientIdUseCase;
        this.d = firebaseAppInstanceIdUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r9.m(r11, r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.C7054um0.a r9, java.lang.String r10, defpackage.LM r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.C7264vm0
            if (r0 == 0) goto L13
            r0 = r11
            vm0 r0 = (defpackage.C7264vm0) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            vm0 r0 = new vm0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.C1795Pt1.b(r11)
            goto L7c
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            java.lang.String r10 = r0.e
            um0 r9 = r0.d
            defpackage.C1795Pt1.b(r11)
            goto L68
        L3b:
            defpackage.C1795Pt1.b(r11)
            java.lang.String r11 = r9.a
            com.base.core.backend.modelsOurSideRequest.events.EventGoogleAnalyticRequest r2 = new com.base.core.backend.modelsOurSideRequest.events.EventGoogleAnalyticRequest
            java.lang.String r6 = r9.b
            r2.<init>(r6, r11, r10)
            java.lang.String r11 = defpackage.ZM.a(r2)
            r2 = 0
            com.api.feature.analytics.reporters.ReporterApi r6 = r8.a
            java.lang.String r7 = "ga"
            r6.j(r7, r11, r2)
            wm0 r11 = new wm0
            r11.<init>(r9, r5)
            r0.d = r8
            r0.e = r10
            r0.i = r4
            Cm0 r9 = r8.c
            java.lang.Object r9 = r9.m(r11, r0)
            if (r9 != r1) goto L67
            goto L7b
        L67:
            r9 = r8
        L68:
            Jd0 r9 = r9.d
            xm0 r11 = new xm0
            r11.<init>(r10, r5)
            r0.d = r5
            r0.e = r5
            r0.i = r3
            java.lang.Object r9 = r9.m(r11, r0)
            if (r9 != r1) goto L7c
        L7b:
            return r1
        L7c:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7054um0.a(um0$a, java.lang.String, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r2.a(r8, (java.lang.String) r9, r0) == r1) goto L29;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@org.jetbrains.annotations.NotNull android.content.Context r8, @org.jetbrains.annotations.NotNull defpackage.LM r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.C7895ym0
            if (r0 == 0) goto L13
            r0 = r9
            ym0 r0 = (defpackage.C7895ym0) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            ym0 r0 = new ym0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r9)
            goto L8f
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            um0$a r8 = r0.e
            um0 r2 = r0.d
            defpackage.C1795Pt1.b(r9)
            goto L7f
        L3a:
            defpackage.C1795Pt1.b(r9)
            com.google.android.gms.analytics.GoogleAnalytics r9 = com.google.android.gms.analytics.GoogleAnalytics.getInstance(r8)
            java.lang.String r2 = "getInstance(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            r2 = 2132148231(0x7f160007, float:1.9938434E38)
            com.google.android.gms.analytics.Tracker r9 = r9.newTracker(r2)
            java.lang.String r2 = "newTracker(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            java.lang.String r2 = "&cid"
            java.lang.String r2 = r9.get(r2)
            java.lang.String r5 = ""
            if (r2 != 0) goto L5d
            r2 = r5
        L5d:
            java.lang.String r6 = "&tid"
            java.lang.String r9 = r9.get(r6)
            if (r9 != 0) goto L66
            goto L67
        L66:
            r5 = r9
        L67:
            um0$a r9 = new um0$a
            r9.<init>(r2, r5)
            r0.d = r7
            r0.e = r9
            r0.i = r4
            Bd0 r2 = r7.b
            java.lang.Object r8 = r2.a(r8, r0)
            if (r8 != r1) goto L7b
            goto L8e
        L7b:
            r2 = r9
            r9 = r8
            r8 = r2
            r2 = r7
        L7f:
            java.lang.String r9 = (java.lang.String) r9
            r4 = 0
            r0.d = r4
            r0.e = r4
            r0.i = r3
            java.lang.Object r8 = r2.a(r8, r9, r0)
            if (r8 != r1) goto L8f
        L8e:
            return r1
        L8f:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7054um0.b(android.content.Context, LM):java.lang.Object");
    }
}

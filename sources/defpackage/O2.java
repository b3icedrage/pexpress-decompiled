package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class O2 implements M2 {

    @NotNull
    public final C5253mB1 a;

    @NotNull
    public final InterfaceC3951gE1 b;

    @NotNull
    public final YX c;

    @NotNull
    public final Fj2 d;

    @NotNull
    public final ReporterApi e;

    @NotNull
    public final C4923kf f;

    @NotNull
    public final C6355rT0 g;

    @NotNull
    public final C4612j90 h;

    @NotNull
    public final AbstractC2903bE1 i;

    public O2(@NotNull C5253mB1 router, @NotNull InterfaceC3951gE1 screensProvider, @NotNull YX depositScreenStarter, @NotNull Fj2 withdrawScreenStarter, @NotNull ReporterApi reporter, @NotNull C4923kf appData, @NotNull C6355rT0 logoutManager, @NotNull C4612j90 events, @NotNull AbstractC2903bE1 screenToChatTransitionProvider) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(depositScreenStarter, "depositScreenStarter");
        Intrinsics.checkNotNullParameter(withdrawScreenStarter, "withdrawScreenStarter");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(logoutManager, "logoutManager");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(screenToChatTransitionProvider, "screenToChatTransitionProvider");
        this.a = router;
        this.b = screensProvider;
        this.c = depositScreenStarter;
        this.d = withdrawScreenStarter;
        this.e = reporter;
        this.f = appData;
        this.g = logoutManager;
        this.h = events;
        this.i = screenToChatTransitionProvider;
    }

    @Override // defpackage.M2
    public final void b() {
        L80 l80 = L80.MAX_PROFIT;
        AbstractC2903bE1 abstractC2903bE1 = this.i;
        abstractC2903bE1.getClass();
        Intrinsics.checkNotNullParameter("Account", "screen");
        GP1 gp1 = abstractC2903bE1.a;
        gp1.getClass();
        gp1.m(null, "Account");
        this.a.c(this.b.l(), false);
    }

    @Override // defpackage.M2
    @Nullable
    public final Object c(@NotNull J2.b bVar) {
        ReporterApi.a.b(this.e, EnumC5028l80.A0, null, null, 14);
        Object objD = this.d.d(bVar);
        return objD == MN.d ? objD : Unit.a;
    }

    @Override // defpackage.M2
    public final void d() {
        this.a.c(this.b.w(), false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        if (r11.a(true, r0) == r1) goto L29;
     */
    @Override // defpackage.M2
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@org.jetbrains.annotations.NotNull defpackage.LM r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.N2
            if (r0 == 0) goto L13
            r0 = r11
            N2 r0 = (defpackage.N2) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            N2 r0 = new N2
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 0
            r4 = 1
            r5 = 2
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r5) goto L2c
            defpackage.C1795Pt1.b(r11)
            goto La4
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L34:
            O2 r2 = r0.d
            defpackage.C1795Pt1.b(r11)
            goto L97
        L3a:
            defpackage.C1795Pt1.b(r11)
            l80 r11 = defpackage.EnumC5028l80.k0
            Z3 r2 = new Z3
            kf r6 = r10.f
            GP1 r6 = r6.c
            java.lang.Object r6 = r6.getValue()
            if (r6 == 0) goto L4e
            java.lang.String r6 = "Our"
            goto L50
        L4e:
            java.lang.String r6 = "Wrong"
        L50:
            r2.<init>(r6)
            com.api.feature.analytics.reporters.ReporterApi r6 = r10.e
            r7 = 12
            com.api.feature.analytics.reporters.ReporterApi.a.b(r6, r11, r2, r3, r7)
            Eu r11 = defpackage.EnumC0936Eu.d
            p60 r2 = defpackage.PW0.c()
            java.lang.String r6 = "level"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r6)
            java.lang.String r6 = "manual"
            java.lang.String r7 = "reason"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            java.lang.String r8 = "extra"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r8)
            Sg r8 = defpackage.U0.O
            if (r8 == 0) goto L85
            kotlin.Pair r9 = new kotlin.Pair
            r9.<init>(r7, r6)
            java.util.Map r2 = defpackage.PW0.h(r2, r9)
            java.lang.String r6 = "auth"
            java.lang.String r7 = "auth.logout"
            r8.l(r6, r7, r11, r2)
        L85:
            j90 r11 = r10.h
            qK1 r11 = r11.s
            kotlin.Unit r2 = kotlin.Unit.a
            r0.d = r10
            r0.h = r4
            java.lang.Object r11 = r11.a(r2, r0)
            if (r11 != r1) goto L96
            goto La3
        L96:
            r2 = r10
        L97:
            rT0 r11 = r2.g
            r0.d = r3
            r0.h = r5
            java.lang.Object r11 = r11.a(r4, r0)
            if (r11 != r1) goto La4
        La3:
            return r1
        La4:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.O2.e(LM):java.lang.Object");
    }

    @Override // defpackage.M2
    public final void f() {
        EnumC5028l80 enumC5028l80 = EnumC5028l80.y0;
        L80 l80 = L80.MAX_PROFIT;
        ReporterApi.a.b(this.e, enumC5028l80, new C1510Md1("Account"), null, 12);
        this.a.c(this.b.E(), false);
    }

    @Override // defpackage.M2
    @Nullable
    public final Object g(@NotNull J2.a aVar) {
        EnumC5028l80 enumC5028l80 = EnumC5028l80.i0;
        L80 l80 = L80.MAX_PROFIT;
        ReporterApi.a.b(this.e, enumC5028l80, new C1510Md1("Account"), null, 12);
        Object objE = this.c.e(aVar);
        return objE == MN.d ? objE : Unit.a;
    }

    @Override // defpackage.M2
    public final void h() {
        this.a.c(this.b.B(), false);
    }

    @Override // defpackage.M2
    public final void i() {
        EnumC5028l80 enumC5028l80 = EnumC5028l80.y0;
        L80 l80 = L80.MAX_PROFIT;
        ReporterApi.a.b(this.e, enumC5028l80, new C1510Md1("Account banner"), null, 12);
        this.a.c(this.b.E(), false);
    }
}

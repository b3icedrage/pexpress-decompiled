package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ix1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4557ix1 implements InterfaceC4099gx1 {

    @NotNull
    public final C5253mB1 a;

    @NotNull
    public final InterfaceC3951gE1 b;

    @NotNull
    public final ReporterApi c;

    @NotNull
    public final YX d;

    @NotNull
    public final InterfaceC5213m10 e;

    @NotNull
    public final C4612j90 f;

    public C4557ix1(@NotNull C5253mB1 router, @NotNull InterfaceC3951gE1 screensProvider, @NotNull ReporterApi reporter, @NotNull YX depositScreenStarter, @NotNull InterfaceC5213m10 dialogScreensProvider, @NotNull C4612j90 eventsFlowsProvider) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(depositScreenStarter, "depositScreenStarter");
        Intrinsics.checkNotNullParameter(dialogScreensProvider, "dialogScreensProvider");
        Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
        this.a = router;
        this.b = screensProvider;
        this.c = reporter;
        this.d = depositScreenStarter;
        this.e = dialogScreensProvider;
        this.f = eventsFlowsProvider;
    }

    @Override // defpackage.InterfaceC4099gx1
    public final void a() {
        EnumC5028l80 enumC5028l80 = EnumC5028l80.y0;
        L80 l80 = L80.MAX_PROFIT;
        ReporterApi.a.b(this.c, enumC5028l80, new C1510Md1("Current investment"), null, 12);
        this.a.c(this.b.E(), false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC4099gx1
    @Nullable
    public final Object b(@NotNull LM lm) {
        C4309hx1 c4309hx1;
        C4557ix1 c4557ix1;
        if (lm instanceof C4309hx1) {
            c4309hx1 = (C4309hx1) lm;
            int i = c4309hx1.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4309hx1.h = i - Integer.MIN_VALUE;
            } else {
                c4309hx1 = new C4309hx1(this, lm);
            }
        } else {
            c4309hx1 = new C4309hx1(this, lm);
        }
        Object obj = c4309hx1.e;
        MN mn = MN.d;
        int i2 = c4309hx1.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C6120qK1 c6120qK1 = this.f.e;
            Unit unit = Unit.a;
            c4309hx1.d = this;
            c4309hx1.h = 1;
            if (c6120qK1.a(unit, c4309hx1) == mn) {
                return mn;
            }
            c4557ix1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c4557ix1 = c4309hx1.d;
            C1795Pt1.b(obj);
        }
        c4557ix1.a.c(c4557ix1.b.k(), false);
        return Unit.a;
    }

    @Override // defpackage.InterfaceC4099gx1
    @Nullable
    public final Object c(@NotNull C1337Jx1.c cVar) {
        EnumC5028l80 enumC5028l80 = EnumC5028l80.i0;
        L80 l80 = L80.MAX_PROFIT;
        ReporterApi.a.b(this.c, enumC5028l80, new C1510Md1("Bet on options App"), null, 12);
        Object objE = this.d.e(cVar);
        return objE == MN.d ? objE : Unit.a;
    }

    @Override // defpackage.InterfaceC4099gx1
    public final void d() {
        this.a.c(this.e.h(), false);
    }

    @Override // defpackage.InterfaceC4099gx1
    public final void e() {
        this.a.c(this.e.l(), false);
    }
}

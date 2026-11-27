package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: z52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7961z52 implements InterfaceC7541x52 {

    @NotNull
    public final C5253mB1 a;

    @NotNull
    public final InterfaceC3951gE1 b;

    @NotNull
    public final AbstractC5045lD0 c;

    @NotNull
    public final ReporterApi d;

    public C7961z52(@NotNull C5253mB1 router, @NotNull InterfaceC3951gE1 screensProvider, @NotNull AbstractC5045lD0 isShowUseCaseApi, @NotNull ReporterApi reporter) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(isShowUseCaseApi, "isShowUseCaseApi");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.a = router;
        this.b = screensProvider;
        this.c = isShowUseCaseApi;
        this.d = reporter;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC7541x52
    @Nullable
    public final Object a(@NotNull LM lm) {
        C7751y52 c7751y52;
        C7961z52 c7961z52;
        if (lm instanceof C7751y52) {
            c7751y52 = (C7751y52) lm;
            int i = c7751y52.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7751y52.h = i - Integer.MIN_VALUE;
            } else {
                c7751y52 = new C7751y52(this, lm);
            }
        } else {
            c7751y52 = new C7751y52(this, lm);
        }
        Object objO = c7751y52.e;
        MN mn = MN.d;
        int i2 = c7751y52.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0<Boolean> interfaceC6396rf0L = this.c.l();
            c7751y52.d = this;
            c7751y52.h = 1;
            objO = C4466ii.o(interfaceC6396rf0L, c7751y52);
            if (objO == mn) {
                return mn;
            }
            c7961z52 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7961z52 = c7751y52.d;
            C1795Pt1.b(objO);
        }
        if (((Boolean) objO).booleanValue()) {
            c7961z52.a.e(c7961z52.b.d());
        } else {
            ReporterApi reporterApi = c7961z52.d;
            EnumC5028l80 enumC5028l80 = EnumC5028l80.o;
            L80 l80 = L80.MAX_PROFIT;
            ReporterApi.a.b(reporterApi, enumC5028l80, new C1510Md1("Onboarding"), null, 12);
            c7961z52.a.e(c7961z52.b.g());
        }
        return Unit.a;
    }
}

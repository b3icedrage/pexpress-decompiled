package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ih1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4464ih1 implements InterfaceC4255hh1 {

    @NotNull
    public final InterfaceC2714aQ0 a;

    @NotNull
    public final JA b;

    public C4464ih1(@NotNull InterfaceC2714aQ0 lineDataSetsProvider, @NotNull JA chartStartTimeProvider) {
        Intrinsics.checkNotNullParameter(lineDataSetsProvider, "lineDataSetsProvider");
        Intrinsics.checkNotNullParameter(chartStartTimeProvider, "chartStartTimeProvider");
        this.a = lineDataSetsProvider;
        this.b = chartStartTimeProvider;
    }

    @Override // defpackage.InterfaceC4255hh1
    public final void a(@NotNull WP0 data, float f, float f2, long j, @Nullable JQ jq, @NotNull Hl2 xAxis) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        InterfaceC3876ft0 interfaceC3876ft0 = (InterfaceC3876ft0) data.e(2);
        InterfaceC3876ft0 interfaceC3876ft1 = interfaceC3876ft0;
        if (interfaceC3876ft0 == null) {
            YP0 yp0A = this.a.a(ZP0.PriceRight);
            data.a(yp0A);
            interfaceC3876ft1 = yp0A;
        }
        interfaceC3876ft1.clear();
        interfaceC3876ft1.w(new C3506e70(f, f2));
        float fMax = Math.max(f + j, jq != null ? this.b.c(jq) : 0.0f);
        interfaceC3876ft1.w(new C3506e70(fMax, f2));
        xAxis.w = true;
        xAxis.x = fMax;
        xAxis.z = Math.abs(fMax - xAxis.y);
    }

    @Override // defpackage.InterfaceC4255hh1
    public final void b(@NotNull WP0 data, float f, float f2) {
        Intrinsics.checkNotNullParameter(data, "data");
        InterfaceC3876ft0 interfaceC3876ft0 = (InterfaceC3876ft0) data.e(3);
        InterfaceC3876ft0 interfaceC3876ft1 = interfaceC3876ft0;
        if (interfaceC3876ft0 == null) {
            YP0 yp0A = this.a.a(ZP0.PricePoint);
            data.a(yp0A);
            interfaceC3876ft1 = yp0A;
        }
        interfaceC3876ft1.clear();
        interfaceC3876ft1.w(new C3506e70(f, f2));
    }

    @Override // defpackage.InterfaceC4255hh1
    public final void c(@NotNull WP0 data, @NotNull InterfaceC3876ft0 set, float f, float f2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(set, "set");
        InterfaceC3876ft0 interfaceC3876ft0 = (InterfaceC3876ft0) data.e(1);
        InterfaceC3876ft0 interfaceC3876ft1 = interfaceC3876ft0;
        if (interfaceC3876ft0 == null) {
            YP0 yp0A = this.a.a(ZP0.PriceLeft);
            data.a(yp0A);
            interfaceC3876ft1 = yp0A;
        }
        interfaceC3876ft1.clear();
        interfaceC3876ft1.w(new C3506e70(set.e(), f));
        interfaceC3876ft1.w(new C3506e70(f2, f));
    }

    @Override // defpackage.InterfaceC4255hh1
    @NotNull
    public final InterfaceC3876ft0 d(@NotNull WP0 data, @NotNull ArrayList entries) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(entries, "entries");
        InterfaceC3876ft0 interfaceC3876ft0 = (InterfaceC3876ft0) data.e(0);
        InterfaceC3876ft0 interfaceC3876ft1 = interfaceC3876ft0;
        if (interfaceC3876ft0 == null) {
            YP0 yp0A = this.a.a(ZP0.Main);
            data.a(yp0A);
            interfaceC3876ft1 = yp0A;
        }
        YP0 yp0 = (YP0) interfaceC3876ft1;
        yp0.o = entries;
        yp0.e0();
        return interfaceC3876ft1;
    }
}

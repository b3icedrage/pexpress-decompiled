package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class E11 extends B11 {
    public boolean d;

    @Override // defpackage.B11
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.B11
    public final void f(long j, @NotNull OQ chart) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        super.f(j, chart);
        this.d = false;
        chart.setDragDecelerationEnabled(true);
    }
}

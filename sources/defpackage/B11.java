package defpackage;

import android.animation.ValueAnimator;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class B11 implements InterfaceC7524x11 {

    @NotNull
    public final JA a;
    public boolean b;
    public long c;

    public B11(@NotNull JA chartStartTimeProvider) {
        Intrinsics.checkNotNullParameter(chartStartTimeProvider, "chartStartTimeProvider");
        this.a = chartStartTimeProvider;
    }

    @Override // defpackage.InterfaceC7524x11
    public final void a() {
        this.c = 0L;
    }

    @Override // defpackage.InterfaceC7524x11
    public final void b(float f, long j, @Nullable JQ jq, @NotNull OQ chart, boolean z) {
        int i = 1;
        Intrinsics.checkNotNullParameter(chart, "chart");
        if (this.b) {
            return;
        }
        float fD = d(jq, f, j, chart);
        float lowestVisibleX = chart.getLowestVisibleX();
        float f2 = AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS;
        int i2 = (lowestVisibleX > (fD - f2) ? 1 : (lowestVisibleX == (fD - f2) ? 0 : -1));
        if (chart.getLowestVisibleX() > d(jq, f, j, chart) - f2) {
            float fD2 = d(jq, f, j, chart);
            float f3 = j * 2;
            if (chart.getVisibleXRange() != f3) {
                chart.l(f3, f3);
            }
            chart.j(fD2);
            return;
        }
        if (!e()) {
            chart.l(j * 2, 1.0f);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(chart.getLowestVisibleX(), d(jq, f, j, chart));
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new A11(this));
        valueAnimatorOfFloat.addUpdateListener(new C6936uD(chart, i));
        valueAnimatorOfFloat.addListener(new C7944z11(this, j, chart));
        valueAnimatorOfFloat.start();
    }

    @Override // defpackage.InterfaceC7524x11
    @NotNull
    public final C4876kR c(@NotNull OQ chart) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        return new C4876kR(new C7734y11(this, chart));
    }

    public final float d(JQ jq, float f, long j, OQ oq) {
        return jq == null ? f - (oq.getVisibleXRange() / 2) : Math.max((this.a.c(jq) - (j * ((long) 2))) + 100.0f, f - (oq.getVisibleXRange() / 2));
    }

    public abstract boolean e();

    public void f(long j, @NotNull OQ chart) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        this.c = j;
    }
}

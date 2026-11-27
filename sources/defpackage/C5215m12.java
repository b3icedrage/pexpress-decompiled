package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: m12, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.usecases.Trader", f = "Trader.kt", l = {713, 714, 718, 732, 734, 745, 759, 761}, m = "notifyAmplitudeAboutLossLimit")
public final class C5215m12 extends LM {
    public S02 d;
    public String e;
    public Double g;
    public ReporterApi h;
    public EnumC5028l80 i;
    public Double j;
    public Double k;
    public Double l;
    public /* synthetic */ Object m;
    public final /* synthetic */ S02<H32> n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5215m12(S02 s02, LM lm) {
        super(lm);
        this.n = s02;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.w(this);
    }
}

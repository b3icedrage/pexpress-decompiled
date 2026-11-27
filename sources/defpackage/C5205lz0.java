package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.indicatorselection.screens.indicators_details.IndicatorsDetailsViewModel", f = "IndicatorsDetailsViewModel.kt", l = {73}, m = "sendAmplitudeEventsIfNeeded")
public final class C5205lz0 extends LM {
    public C4782jz0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C4782jz0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5205lz0(C4782jz0 c4782jz0, LM lm) {
        super(lm);
        this.g = c4782jz0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return C4782jz0.o(this.g, this);
    }
}

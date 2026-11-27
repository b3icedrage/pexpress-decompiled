package defpackage;

import com.google.android.gms.common.api.CommonStatusCodes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.stop_triggers.LossLimitStopChecker", f = "LossLimitStopChecker.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE, 22}, m = "getLossLimit")
public final class PT0 extends LM {
    public QT0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ QT0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PT0(QT0 qt0, LM lm) {
        super(lm);
        this.g = qt0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.e(this);
    }
}

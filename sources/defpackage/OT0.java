package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.stop_triggers.LossLimitStopChecker", f = "LossLimitStopChecker.kt", l = {28, 29, 30, UserVerificationMethods.USER_VERIFY_LOCATION, 33}, m = "currentLossLimit")
public final class OT0 extends LM {
    public QT0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ QT0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OT0(QT0 qt0, LM lm) {
        super(lm);
        this.g = qt0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.d(this);
    }
}

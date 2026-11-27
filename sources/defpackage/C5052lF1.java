package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.other_calculators.SelectingDirectionCalculator", f = "SelectingDirectionCalculator.kt", l = {UserVerificationMethods.USER_VERIFY_LOCATION, 38}, m = "calculateDirectionResult")
public final class C5052lF1 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C4842kF1 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5052lF1(C4842kF1 c4842kF1, LM lm) {
        super(lm);
        this.e = c4842kF1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}

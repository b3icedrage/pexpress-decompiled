package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.navigation.screen_starters.AccountVerificationScreenStarterImpl", f = "AccountVerificationScreenStarterImpl.kt", l = {33, 36}, m = "openVerification")
public final class Y4 extends LM {
    public Z4 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Z4 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y4(Z4 z4, LM lm) {
        super(lm);
        this.g = z4;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(this);
    }
}

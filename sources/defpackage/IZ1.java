package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.android.Timeline", f = "Timeline.kt", l = {126, 129}, m = "startNewSessionIfNeeded")
public final class IZ1 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ KZ1 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IZ1(KZ1 kz1, LM lm) {
        super(lm);
        this.e = kz1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.i(0L, this);
    }
}

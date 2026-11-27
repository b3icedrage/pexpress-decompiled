package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tZ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.providers.TimeSelectionsProvider", f = "TimeSelectionsProvider.kt", l = {29}, m = "getCurrentBetDurationSelection")
public final class C6794tZ1 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ AbstractC7004uZ1 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6794tZ1(AbstractC7004uZ1 abstractC7004uZ1, LM lm) {
        super(lm);
        this.e = abstractC7004uZ1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}

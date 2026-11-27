package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robot.options.usecases.AmountValueUseCaseBase", f = "AmountValueUseCaseBase.kt", l = {52}, m = "formatAmount")
public final class W9 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ V9 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W9(V9 v9, LM lm) {
        super(lm);
        this.e = v9;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.d(null, this);
    }
}

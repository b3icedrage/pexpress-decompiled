package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.SaverImpl", f = "SaverImpl.kt", l = {47, 49}, m = "notSyncedIdentifies")
public final class TC1 extends LM {
    public UC1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ UC1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TC1(UC1 uc1, LM lm) {
        super(lm);
        this.g = uc1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.f(this);
    }
}

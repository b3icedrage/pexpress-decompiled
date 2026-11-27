package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: m90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.EventsProviderImpl", f = "EventsProviderImpl.kt", l = {120, 43}, m = "proceedBackground")
public final class C5245m90 extends LM {
    public A90 d;
    public C4795k21 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ A90 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5245m90(A90 a90, LM lm) {
        super(lm);
        this.h = a90;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}

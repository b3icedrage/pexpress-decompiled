package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: o90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.EventsProviderImpl", f = "EventsProviderImpl.kt", l = {120, 47}, m = "proceedEvent")
public final class C5665o90 extends LM {
    public Object d;
    public C2658a80 e;
    public C4795k21 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ A90 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5665o90(A90 a90, LM lm) {
        super(lm);
        this.i = a90;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.d(null, this);
    }
}

package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: t90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.EventsProviderImpl", f = "EventsProviderImpl.kt", l = {120, 37, 37}, m = "proceedForeground")
public final class C6714t90 extends LM {
    public Object d;
    public Object e;
    public C2658a80 g;
    public InterfaceC3881fv h;
    public /* synthetic */ Object i;
    public final /* synthetic */ A90 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6714t90(A90 a90, LM lm) {
        super(lm);
        this.j = a90;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.e(this);
    }
}

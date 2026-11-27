package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.BuilderInfoImpl", f = "BuilderInfoImpl.kt", l = {159, 160}, m = "getTrackerId")
public final class C4301hv extends LM {
    public C4979kv d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C4979kv g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4301hv(C4979kv c4979kv, LM lm) {
        super(lm);
        this.g = c4979kv;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.f(this);
    }
}

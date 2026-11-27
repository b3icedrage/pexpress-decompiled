package defpackage;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: l90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.EventsProviderImpl", f = "EventsProviderImpl.kt", l = {70}, m = "calculateDiff")
public final class C5032l90 extends LM {
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ A90 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5032l90(A90 a90, LM lm) {
        super(lm);
        this.g = a90;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}

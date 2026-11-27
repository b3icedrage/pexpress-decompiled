package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: eg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.WebSocketConnectionDataSourceImpl", f = "WebSocketConnectionDataSourceImpl.kt", l = {58}, m = "connectNamespace")
public final class C3622eg2 extends LM {
    public C4720jg2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C4720jg2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3622eg2(C4720jg2 c4720jg2, LM lm) {
        super(lm);
        this.g = c4720jg2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.x(this);
    }
}

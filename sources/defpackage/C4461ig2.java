package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ig2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.WebSocketConnectionDataSourceImpl", f = "WebSocketConnectionDataSourceImpl.kt", l = {38}, m = "ping")
public final class C4461ig2 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C4720jg2 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4461ig2(C4720jg2 c4720jg2, LM lm) {
        super(lm);
        this.e = c4720jg2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.y(this);
    }
}

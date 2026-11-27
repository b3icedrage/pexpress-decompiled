package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: th2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.providers.WebSocketUrlProvider", f = "WebSocketUrlProvider.kt", l = {91}, m = "probeAndStore")
public final class C6826th2 extends LM {
    public C6197qh2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C6197qh2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6826th2(C6197qh2 c6197qh2, LM lm) {
        super(lm);
        this.g = c6197qh2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.h(false, this);
    }
}

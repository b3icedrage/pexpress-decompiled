package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.providers.WebSocketUrlProvider", f = "WebSocketUrlProvider.kt", l = {109, 75, 83}, m = "getBestWebSocketUrls")
public final class C6406rh2 extends LM {
    public C6197qh2 d;
    public InterfaceC4117h21 e;
    public C6197qh2 g;
    public boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C6197qh2 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6406rh2(C6197qh2 c6197qh2, LM lm) {
        super(lm);
        this.j = c6197qh2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.f(false, this);
    }
}

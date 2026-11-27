package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.WebSocketListener", f = "WebSocketListener.kt", l = {378}, m = "stopLastMessageJob")
public final class C7663xg2 extends LM {
    public C7242vg2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C7242vg2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7663xg2(C7242vg2 c7242vg2, LM lm) {
        super(lm);
        this.g = c7242vg2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return C7242vg2.b(this.g, this);
    }
}

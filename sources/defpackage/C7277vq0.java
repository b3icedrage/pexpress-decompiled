package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.backend.helpers.HttpExchangeRecorder", f = "HttpExchangeRecorder.kt", l = {51}, m = "bounded")
public final class C7277vq0<T> extends LM {
    public C7698xq0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C7698xq0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7277vq0(C7698xq0 c7698xq0, LM lm) {
        super(lm);
        this.g = c7698xq0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}

package defpackage;

import com.impl.core.backend.modelsRequest.AuthenticationRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.WebSocketConnectionDataSourceImpl", f = "WebSocketConnectionDataSourceImpl.kt", l = {43, 49}, m = "authenticate")
public final class C3203cg2 extends LM {
    public C4720jg2 d;
    public AuthenticationRequest e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C4720jg2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3203cg2(C4720jg2 c4720jg2, LM lm) {
        super(lm);
        this.h = c4720jg2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.w(null, this);
    }
}

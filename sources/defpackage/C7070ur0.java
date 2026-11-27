package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ur0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.HttpSend$DefaultSender", f = "HttpSend.kt", l = {138}, m = "execute")
public final class C7070ur0 extends LM {
    public C6860tr0.b d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C6860tr0.b g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7070ur0(C6860tr0.b bVar, LM lm) {
        super(lm);
        this.g = bVar;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}

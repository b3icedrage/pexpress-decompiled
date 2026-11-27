package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Wq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.HttpRedirect$Plugin", f = "HttpRedirect.kt", l = {113}, m = "handleCall")
public final class C2335Wq0 extends LM {
    public C2253Vq0.b d;
    public JF1 e;
    public C3032br0 g;
    public C1782Pp0 h;
    public C3027bp1 i;
    public C3027bp1 j;
    public C3722f82 k;
    public String l;
    public C3027bp1 m;
    public /* synthetic */ Object n;
    public final /* synthetic */ C2253Vq0.b o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2335Wq0(C2253Vq0.b bVar, LM lm) {
        super(lm);
        this.o = bVar;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return C2253Vq0.b.c(this.o, null, null, null, null, this);
    }
}

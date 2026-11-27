package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Qp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.HttpClient", f = "HttpClient.kt", l = {191}, m = "execute$ktor_client_core")
public final class C1860Qp0 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C1782Pp0 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860Qp0(C1782Pp0 c1782Pp0, LM lm) {
        super(lm);
        this.e = c1782Pp0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}

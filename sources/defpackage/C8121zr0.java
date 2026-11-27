package defpackage;

import com.appsflyer.share.attribution.RequestError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.statement.HttpStatement", f = "HttpStatement.kt", l = {47, RequestError.RESPONSE_CODE_FAILURE, 52, 52}, m = "execute")
public final class C8121zr0<T> extends LM {
    public Object d;
    public Object e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C0772Cr0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8121zr0(C0772Cr0 c0772Cr0, LM lm) {
        super(lm);
        this.h = c0772Cr0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}

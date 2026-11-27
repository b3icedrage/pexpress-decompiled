package defpackage;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: y81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", l = {103}, m = "executeHttpRequest")
public final class C7762y81 extends LM {
    public C7341w81 d;
    public CoroutineContext e;
    public C3241cr0 g;
    public C4944kk0 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C7341w81 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7762y81(C7341w81 c7341w81, LM lm) {
        super(lm);
        this.j = c7341w81;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        KW1 kw1 = C7341w81.m;
        return this.j.c(null, null, null, null, this);
    }
}

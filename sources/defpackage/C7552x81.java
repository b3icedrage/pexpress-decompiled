package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: x81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.engine.okhttp.OkHttpEngine", f = "OkHttpEngine.kt", l = {61, 68, 70}, m = "execute")
public final class C7552x81 extends LM {
    public C7341w81 d;
    public C3241cr0 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C7341w81 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7552x81(C7341w81 c7341w81, LM lm) {
        super(lm);
        this.h = c7341w81;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.h0(null, this);
    }
}

package defpackage;

import java.nio.ByteBuffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1200, 1271, 1279}, m = "copyDirect$ktor_io")
public final class C3255cw extends LM {
    public C2836aw d;
    public C2836aw e;
    public C4634jG0 g;
    public C2817ap1 h;
    public C2836aw i;
    public C2836aw j;
    public C6660su1 k;
    public C6660su1 l;
    public ByteBuffer m;
    public C2836aw n;
    public long o;
    public long p;
    public boolean q;
    public /* synthetic */ Object r;
    public final /* synthetic */ C2836aw s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3255cw(C2836aw c2836aw, LM lm) {
        super(lm);
        this.s = c2836aw;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.u(null, 0L, this);
    }
}

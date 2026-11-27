package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {2093}, m = "readRemainingSuspend")
public final class C3884fw extends LM {
    public C2836aw d;
    public C0864Dw e;
    public C2817ap1 g;
    public C0864Dw h;
    public C2895bC i;
    public /* synthetic */ Object j;
    public final /* synthetic */ C2836aw k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3884fw(C2836aw c2836aw, LM lm) {
        super(lm);
        this.k = c2836aw;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2836aw.j;
        return this.k.C(0L, this);
    }
}

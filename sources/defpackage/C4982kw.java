package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1439, 1441}, m = "writeSuspend")
public final class C4982kw extends LM {
    public C2836aw d;
    public byte[] e;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C2836aw j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4982kw(C2836aw c2836aw, LM lm) {
        super(lm);
        this.j = c2836aw;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2836aw.j;
        return this.j.Z(null, 0, 0, this);
    }
}

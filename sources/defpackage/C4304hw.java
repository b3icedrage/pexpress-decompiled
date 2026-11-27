package defpackage;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.utils.io.ByteBufferChannel", f = "ByteBufferChannel.kt", l = {1507}, m = "write$suspendImpl")
public final class C4304hw extends LM {
    public C2836aw d;
    public Function1 e;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C2836aw i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4304hw(C2836aw c2836aw, LM lm) {
        super(lm);
        this.i = c2836aw;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return C2836aw.T(this.i, 0, null, this);
    }
}

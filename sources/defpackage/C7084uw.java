package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {611}, m = "awaitSuspend")
public final class C7084uw extends LM {
    public AbstractC8135zw d;
    public /* synthetic */ Object e;
    public final /* synthetic */ AbstractC8135zw g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7084uw(AbstractC8135zw abstractC8135zw, LM lm) {
        super(lm);
        this.g = abstractC8135zw;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        this.g.o(0, this);
        return MN.d;
    }
}

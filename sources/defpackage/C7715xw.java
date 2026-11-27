package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {193}, m = "writeFully$suspendImpl")
public final class C7715xw extends LM {
    public AbstractC8135zw d;
    public C1640Nu e;
    public /* synthetic */ Object g;
    public final /* synthetic */ AbstractC8135zw h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7715xw(AbstractC8135zw abstractC8135zw, LM lm) {
        super(lm);
        this.h = abstractC8135zw;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        AbstractC8135zw.u(this.h, null, this);
        return MN.d;
    }
}

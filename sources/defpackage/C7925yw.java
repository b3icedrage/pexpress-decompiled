package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: yw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.utils.io.ByteChannelSequentialBase", f = "ByteChannelSequential.kt", l = {204}, m = "writeFully$suspendImpl")
public final class C7925yw extends LM {
    public AbstractC8135zw d;
    public byte[] e;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ AbstractC8135zw i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7925yw(AbstractC8135zw abstractC8135zw, LM lm) {
        super(lm);
        this.i = abstractC8135zw;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return AbstractC8135zw.t(this.i, null, 0, this);
    }
}

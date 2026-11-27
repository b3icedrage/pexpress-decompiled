package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", l = {438, 441}, m = "doSelectSuspend")
public final class WE1 extends LM {
    public VE1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ VE1<Object> g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WE1(VE1 ve1, LM lm) {
        super(lm);
        this.g = ve1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = VE1.j;
        return this.g.g(this);
    }
}

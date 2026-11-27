package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: eb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.updaters.FTDUpdater", f = "FTDUpdater.kt", l = {74, 79, 80, 81, 82}, m = "handleFTD")
public final class C3600eb0 extends LM {
    public C5118lb0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C5118lb0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3600eb0(C5118lb0 c5118lb0, JM<? super C3600eb0> jm) {
        super(jm);
        this.g = c5118lb0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return C5118lb0.d(this.g, this);
    }
}

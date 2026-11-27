package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.updaters.FTDUpdater", f = "FTDUpdater.kt", l = {89}, m = "notifyAmplitude")
public final class C4020gb0 extends LM {
    public C5118lb0 d;
    public String e;
    public Double g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C5118lb0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4020gb0(C5118lb0 c5118lb0, LM lm) {
        super(lm);
        this.i = c5118lb0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.e(this);
    }
}

package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.graphic.usecases.SubscribeToValueUpdatesUseCaseBase", f = "SubscribeToValueUpdatesUseCaseBase.kt", l = {29}, m = "subscribe")
public final class C4887kU1 extends LM {
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C5730oU1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4887kU1(C5730oU1 c5730oU1, LM lm) {
        super(lm);
        this.g = c5730oU1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase", f = "LaunchAppThirdStepUseCaseBase.kt", l = {257, 263, 265, 267}, m = "navigate")
public final class C6128qN0 extends LM {
    public C3977gN0 d;
    public boolean e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C3977gN0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6128qN0(C3977gN0 c3977gN0, LM lm) {
        super(lm);
        this.h = c3977gN0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        AtomicInteger atomicInteger = C3977gN0.G;
        return this.h.k(false, this);
    }
}

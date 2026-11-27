package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: iN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase", f = "LaunchAppThirdStepUseCaseBase.kt", l = {115, 129, 133, 142, 144, 147, 148, 150}, m = "checkConnectionToServer")
public final class C4397iN0 extends LM {
    public C3977gN0 d;
    public InterfaceC3220cl e;
    public InterfaceC3220cl g;
    public C3977gN0.c h;
    public boolean i;
    public long j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ C3977gN0 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4397iN0(C3977gN0 c3977gN0, LM lm) {
        super(lm);
        this.m = c3977gN0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        AtomicInteger atomicInteger = C3977gN0.G;
        return this.m.i(false, this);
    }
}

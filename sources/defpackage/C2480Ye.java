package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.telemetry.probe.AppDataReadinessProbe", f = "AppDataReadinessProbe.kt", l = {279}, m = "runProbeCycle")
public final class C2480Ye extends LM {
    public InterfaceC4302hv0 d;
    public C5647o42 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C4245hf h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2480Ye(C4245hf c4245hf, LM lm) {
        super(lm);
        this.h = c4245hf;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return C4245hf.b(this.h, this);
    }
}

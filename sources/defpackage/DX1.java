package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.di.modules.TelemetryAppDataUpdater", f = "TelemetryAppDataUpdater.kt", l = {35}, m = "start")
public final class DX1 extends LM {
    public FX1 d;
    public C2936bP1 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ FX1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DX1(FX1 fx1, LM lm) {
        super(lm);
        this.h = fx1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}

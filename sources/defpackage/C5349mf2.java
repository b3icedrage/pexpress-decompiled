package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.VpnInstructionsUseCaseBase", f = "VpnInstructionsUseCaseBase.kt", l = {17}, m = "execute")
public final class C5349mf2 extends LM {
    public C5559nf2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C5559nf2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5349mf2(C5559nf2 c5559nf2, LM lm) {
        super(lm);
        this.g = c5559nf2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(this);
    }
}

package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.updaters.AssetsUpdater", f = "AssetsUpdater.kt", l = {52, 66}, m = "collectAssets")
public final class C5366mk extends LM {
    public C6206qk d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C6206qk g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5366mk(C6206qk c6206qk, LM lm) {
        super(lm);
        this.g = c6206qk;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return C6206qk.d(this.g, this);
    }
}

package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.updaters.AssetsUpdater", f = "AssetsUpdater.kt", l = {34, 35}, m = "start")
public final class C5786ok extends LM {
    public C6206qk d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C6206qk g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5786ok(C6206qk c6206qk, LM lm) {
        super(lm);
        this.g = c6206qk;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(this);
    }
}

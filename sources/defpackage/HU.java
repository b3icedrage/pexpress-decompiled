package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.deeplinks.DeeplinkManager", f = "DeeplinkManager.kt", l = {125, 132}, m = "executeLatestPendingNavigationActionInternal")
public final class HU extends LM {
    public LU d;
    public Object e;
    public /* synthetic */ Object g;
    public final /* synthetic */ LU h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HU(LU lu, LM lm) {
        super(lm);
        this.h = lu;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(this);
    }
}

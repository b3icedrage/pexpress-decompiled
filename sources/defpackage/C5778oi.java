package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.AppUpdatesManagerImpl", f = "AppUpdatesManagerImpl.kt", l = {54}, m = "init")
public final class C5778oi extends LM {
    public C5358mi d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C5358mi g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5778oi(C5358mi c5358mi, LM lm) {
        super(lm);
        this.g = c5358mi;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(this);
    }
}

package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.UserDataSourceImpl", f = "UserDataSourceImpl.kt", l = {66}, m = "fetchPlatformUser")
public final class C3183cb2 extends LM {
    public C2750ab2 d;
    public C7698xq0 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C2750ab2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3183cb2(C2750ab2 c2750ab2, LM lm) {
        super(lm);
        this.h = c2750ab2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.f(null, this);
    }
}

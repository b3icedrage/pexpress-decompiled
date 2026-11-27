package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: il0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.usecases.GetPlatformTimeUseCaseImpl", f = "GetPlatformTimeUseCaseImpl.kt", l = {15}, m = "fetchTimeMillis")
public final class C4479il0 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C4738jl0 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4479il0(C4738jl0 c4738jl0, LM lm) {
        super(lm);
        this.e = c4738jl0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}

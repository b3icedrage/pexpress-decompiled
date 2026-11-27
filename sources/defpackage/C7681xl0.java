package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.usecases.GetUserUseCaseBase", f = "GetUserUseCaseBase.kt", l = {77}, m = "buildRequestParams")
public final class C7681xl0 extends LM {
    public C0754Cl0 d;
    public Long e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C0754Cl0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7681xl0(C0754Cl0 c0754Cl0, LM lm) {
        super(lm);
        this.h = c0754Cl0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        int i = C0754Cl0.h;
        return this.h.c(this);
    }
}

package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.backend.domain.usecases.IsShowUseCaseApi", f = "IsShowUseCaseApi.kt", l = {22}, m = "awaitFromConfig")
public final class C4625jD0 extends LM {
    public AbstractC5045lD0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ AbstractC5045lD0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4625jD0(AbstractC5045lD0 abstractC5045lD0, LM lm) {
        super(lm);
        this.g = abstractC5045lD0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.n(this);
    }
}

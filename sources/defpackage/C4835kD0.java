package defpackage;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.backend.domain.usecases.IsShowUseCaseApi", f = "IsShowUseCaseApi.kt", l = {27, 28, 29, 31}, m = "writeValue$suspendImpl")
public final class C4835kD0 extends LM {
    public Object d;
    public Function1 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ AbstractC5045lD0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4835kD0(AbstractC5045lD0 abstractC5045lD0, LM lm) {
        super(lm);
        this.h = abstractC5045lD0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return AbstractC5045lD0.o(this.h, null, this);
    }
}

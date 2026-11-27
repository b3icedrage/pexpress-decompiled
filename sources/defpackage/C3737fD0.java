package defpackage;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.backend.domain.usecases.IsAmplitudeInitializedUseCaseApi", f = "IsAmplitudeInitializedUseCaseApi.kt", l = {26, 27}, m = "writeValue$suspendImpl")
public final class C3737fD0 extends LM {
    public AbstractC3947gD0 d;
    public Function1 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ AbstractC3947gD0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3737fD0(AbstractC3947gD0 abstractC3947gD0, LM lm) {
        super(lm);
        this.h = abstractC3947gD0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return AbstractC3947gD0.o(this.h, null, this);
    }
}

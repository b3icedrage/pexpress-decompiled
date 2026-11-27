package defpackage;

import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchAppThirdStepUseCaseBase", f = "LaunchAppThirdStepUseCaseBase.kt", l = {192, 199, HttpPlatformResponse.MAX_MESSAGE_LENGTH, 213, 214, 215}, m = "prepareSession")
public final class C7598xN0 extends LM {
    public Object d;
    public XN0 e;
    public long g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ C3977gN0 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7598xN0(C3977gN0 c3977gN0, LM lm) {
        super(lm);
        this.j = c3977gN0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return C3977gN0.g(this.j, 0L, 0, this);
    }
}

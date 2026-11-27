package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oW1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.support.screens.common.SupportViewModelBase", f = "SupportViewModelBase.kt", l = {49}, m = "startListenActivation")
public final class C5736oW1 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C5316mW1 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5736oW1(C5316mW1 c5316mW1, LM lm) {
        super(lm);
        this.e = c5316mW1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        C5316mW1.l(this.e, this);
        return MN.d;
    }
}

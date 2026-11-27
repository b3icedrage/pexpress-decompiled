package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.activation.screens.reregister.ReRegistrationViewModelBase", f = "ReRegistrationViewModelBase.kt", l = {143, 144, 145, 149, 158, 168}, m = "handleRegistrationResult")
public final class C6220qn1 extends LM {
    public C5800on1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C5800on1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6220qn1(C5800on1 c5800on1, LM lm) {
        super(lm);
        this.g = c5800on1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.w(null, null, this);
    }
}

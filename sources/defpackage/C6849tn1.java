package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: tn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.activation.screens.reregister.ReRegistrationViewModelBase", f = "ReRegistrationViewModelBase.kt", l = {130, 135}, m = "registerUser$suspendImpl")
public final class C6849tn1 extends LM {
    public C5800on1 d;
    public String e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C5800on1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6849tn1(C5800on1 c5800on1, LM lm) {
        super(lm);
        this.h = c5800on1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return C5800on1.x(this.h, null, null, null, this);
    }
}

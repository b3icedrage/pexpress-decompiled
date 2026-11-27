package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: iL1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.usecases.ShowErrorUseCaseBase", f = "ShowErrorUseCaseBase.kt", l = {28}, m = "showError")
public final class C4392iL1 extends LM {
    public C4860kL1 d;
    public KN e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C4860kL1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4392iL1(C4860kL1 c4860kL1, LM lm) {
        super(lm);
        this.h = c4860kL1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.d(null, null, this);
    }
}

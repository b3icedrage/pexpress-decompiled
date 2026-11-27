package defpackage;

import com.google.android.gms.common.ConnectionResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: y52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.onboarding.callbacks.TutorialCallbackBase", f = "TutorialCallbackBase.kt", l = {ConnectionResult.API_DISABLED_FOR_CONNECTION}, m = "onDoneClick")
public final class C7751y52 extends LM {
    public C7961z52 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C7961z52 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7751y52(C7961z52 c7961z52, LM lm) {
        super(lm);
        this.g = c7961z52;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(this);
    }
}

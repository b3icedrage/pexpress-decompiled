package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.services.NetworkManager", f = "NetworkManager.kt", l = {206}, m = "showDialogError")
public final class G31 extends LM {
    public C2643a41 d;
    public C2643a41.a e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C6062q31 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G31(C6062q31 c6062q31, JM<? super G31> jm) {
        super(jm);
        this.h = c6062q31;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return C6062q31.c(this.h, this);
    }
}

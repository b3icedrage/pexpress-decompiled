package defpackage;

import com.appsflyer.share.attribution.RequestError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "tryLock")
public final class BM1<T> extends LM {
    public C4795k21 d;
    public boolean e;
    public /* synthetic */ Object g;
    public final /* synthetic */ CM1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BM1(CM1 cm1, LM lm) {
        super(lm);
        this.h = cm1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.c(null, this);
    }
}

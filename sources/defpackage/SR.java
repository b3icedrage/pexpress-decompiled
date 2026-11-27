package defpackage;

import android.webkit.WebView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.platform.usecases.CustomizeDepositWebViewOnLoadUseCaseImpl", f = "CustomizeDepositWebViewOnLoadUseCaseImpl.kt", l = {43, 46}, m = "runScripts")
public final class SR extends LM {
    public RR d;
    public WebView e;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ RR i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SR(RR rr, JM<? super SR> jm) {
        super(jm);
        this.i = rr;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.c(null, this);
    }
}

package defpackage;

import android.webkit.WebView;
import com.appsflyer.share.attribution.RequestError;
import com.impl.feature.platform.screens.withdraw.WithdrawFragmentImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.platform.screens.withdraw.WithdrawFragmentImpl", f = "WithdrawFragmentImpl.kt", l = {49, RequestError.RESPONSE_CODE_FAILURE, 51, 52}, m = "runWithdrawStyleScript")
public final class Ej2 extends LM {
    public Object d;
    public WebView e;
    public /* synthetic */ Object g;
    public final /* synthetic */ WithdrawFragmentImpl h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ej2(WithdrawFragmentImpl withdrawFragmentImpl, LM lm) {
        super(lm);
        this.h = withdrawFragmentImpl;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.z(null, this);
    }
}

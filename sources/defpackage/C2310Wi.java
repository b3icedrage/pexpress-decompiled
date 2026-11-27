package defpackage;

import android.webkit.WebView;
import com.google.android.gms.common.api.CommonStatusCodes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Wi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.platform.usecases.ApplyVerificationScriptUseCaseImpl", f = "ApplyVerificationScriptUseCaseImpl.kt", l = {20, CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "runVerificationStyleScript")
public final class C2310Wi extends LM {
    public WebView d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C2414Xi g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2310Wi(C2414Xi c2414Xi, LM lm) {
        super(lm);
        this.g = c2414Xi;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}

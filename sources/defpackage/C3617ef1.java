package defpackage;

import android.webkit.WebView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ef1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform_webview.webview.PlatformWebChromeClientImpl", f = "PlatformWebChromeClientImpl.kt", l = {61, 62, UserVerificationMethods.USER_VERIFY_EYEPRINT, 68}, m = "runChartPageScript")
public final class C3617ef1 extends LM {
    public C3408df1 d;
    public WebView e;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C3408df1 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3617ef1(C3408df1 c3408df1, LM lm) {
        super(lm);
        this.i = c3408df1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        int i = C3408df1.w;
        return this.i.g(null, this);
    }
}

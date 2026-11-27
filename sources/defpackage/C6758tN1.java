package defpackage;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: tN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.social.SocialLoginWithWebView$loadUrl$2", f = "SocialLoginWithWebView.kt", l = {}, m = "invokeSuspend")
public final class C6758tN1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ AbstractC5709oN1 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6758tN1(AbstractC5709oN1 abstractC5709oN1, String str, JM<? super C6758tN1> jm) {
        super(2, jm);
        this.d = abstractC5709oN1;
        this.e = str;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6758tN1(this.d, this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6758tN1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        WebView webView = this.d.d;
        if (webView == null) {
            return null;
        }
        webView.loadUrl(this.e);
        return Unit.a;
    }
}

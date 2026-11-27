package defpackage;

import RR.a;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class QR implements Function1 {
    public final /* synthetic */ RR d;
    public final /* synthetic */ WebView e;

    public /* synthetic */ QR(RR rr, WebView webView) {
        this.d = rr;
        this.e = webView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String currencyCode = (String) obj;
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        C5189lv.k(C7235vf.a, null, this.d.new a(currencyCode, this.e, null), 3);
        return Unit.a;
    }
}

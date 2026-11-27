package defpackage;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4715jf1 extends AbstractC4456if1 {

    @NotNull
    public Function0<Unit> e;

    @Override // defpackage.AbstractC4456if1
    public final void a(@NotNull C2405Xf block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.e = block;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003e  */
    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
        if (webResourceRequest != null) {
            String string = webResourceRequest.getUrl().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            if (StringsKt.C(string, "deposit-step-1", false)) {
                this.e.invoke();
            } else {
                String string2 = webResourceRequest.getUrl().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                if (StringsKt.C(string2, "repeat-last-deposit", false)) {
                    this.e.invoke();
                } else {
                    String string3 = webResourceRequest.getUrl().toString();
                    Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                    if (StringsKt.C(string3, "binance.com", false)) {
                        this.e.invoke();
                    }
                }
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }
}

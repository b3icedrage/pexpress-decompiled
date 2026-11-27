package defpackage;

import android.webkit.JavascriptInterface;
import io.sentry.android.core.b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class IA {

    @NotNull
    public final C5500nO a;

    @NotNull
    public final C2767ag b;

    @NotNull
    public final A0 c;

    public IA(@NotNull C5500nO onDocumentReady, @NotNull C2767ag onCryptoAssetsHidden, @NotNull A0 onOpenDepositScreen) {
        Intrinsics.checkNotNullParameter(onDocumentReady, "onDocumentReady");
        Intrinsics.checkNotNullParameter(onCryptoAssetsHidden, "onCryptoAssetsHidden");
        Intrinsics.checkNotNullParameter(onOpenDepositScreen, "onOpenDepositScreen");
        this.a = onDocumentReady;
        this.b = onCryptoAssetsHidden;
        this.c = onOpenDepositScreen;
    }

    @JavascriptInterface
    public final void postMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            String strOptString = new JSONObject(message).optString("functionName");
            if (strOptString != null) {
                int iHashCode = strOptString.hashCode();
                if (iHashCode == -1865255511) {
                    if (strOptString.equals("onDocumentReady")) {
                        this.a.invoke();
                    }
                } else if (iHashCode == 1183967917) {
                    if (strOptString.equals("onCryptoAssetsHidden")) {
                        this.b.invoke();
                    }
                } else {
                    if (iHashCode == 1607919232 && strOptString.equals("openDepositScreen")) {
                        this.c.invoke();
                    }
                }
            }
        } catch (JSONException e) {
            b0.d("ChartPageCallbacks", "postMessage: can't parse " + message, e);
        }
    }
}

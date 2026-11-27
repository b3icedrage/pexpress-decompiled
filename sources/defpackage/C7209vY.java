package defpackage;

import android.webkit.JavascriptInterface;
import io.sentry.android.core.b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: vY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7209vY {

    @NotNull
    public final QR a;

    @NotNull
    public final B5 b;

    @NotNull
    public final Q2 c;

    public C7209vY(@NotNull QR onCurrencyChanged, @NotNull B5 onDocumentReady, @NotNull Q2 onCryptoHidden) {
        Intrinsics.checkNotNullParameter(onCurrencyChanged, "onCurrencyChanged");
        Intrinsics.checkNotNullParameter(onDocumentReady, "onDocumentReady");
        Intrinsics.checkNotNullParameter(onCryptoHidden, "onCryptoHidden");
        this.a = onCurrencyChanged;
        this.b = onDocumentReady;
        this.c = onCryptoHidden;
    }

    @JavascriptInterface
    public final void postMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            JSONObject jSONObject = new JSONObject(message);
            String strOptString = jSONObject.optString("functionName");
            if (strOptString != null) {
                int iHashCode = strOptString.hashCode();
                if (iHashCode == -1865255511) {
                    if (strOptString.equals("onDocumentReady")) {
                        this.b.invoke();
                        return;
                    }
                    return;
                }
                if (iHashCode == -198817208) {
                    if (strOptString.equals("onCryptoDepositHidden")) {
                        this.c.invoke();
                        return;
                    }
                    return;
                }
                if (iHashCode == 1386087779 && strOptString.equals("currencyChanged")) {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                    String strOptString2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("currency") : null;
                    if (strOptString2 == null) {
                        strOptString2 = "";
                    }
                    if (strOptString2.length() > 0) {
                        this.a.invoke(strOptString2);
                    }
                }
            }
        } catch (JSONException e) {
            b0.d("DepositWebViewCallbacks", "postMessage: can't parse " + message, e);
        }
    }
}

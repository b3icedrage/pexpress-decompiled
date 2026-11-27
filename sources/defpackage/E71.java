package defpackage;

import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LE71;", "", "Landroid/content/Context;", "context", "Lorg/json/JSONObject;", "fcmPayload", "<init>", "(Landroid/content/Context;Lorg/json/JSONObject;)V", "Landroid/content/Context;", "Lorg/json/JSONObject;", "", "getShouldOpenApp", "()Z", "shouldOpenApp", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class E71 {

    @NotNull
    private final Context context;

    @NotNull
    private final JSONObject fcmPayload;

    public E71(@NotNull Context context, @NotNull JSONObject fcmPayload) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fcmPayload, "fcmPayload");
        this.context = context;
        this.fcmPayload = fcmPayload;
    }

    public final boolean getShouldOpenApp() {
        return D71.INSTANCE.getShouldOpenActivity(this.context) && getUri() == null;
    }

    @Nullable
    public final Uri getUri() {
        D71 d71 = D71.INSTANCE;
        if (!d71.getShouldOpenActivity(this.context) || d71.getSuppressLaunchURL(this.context)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(this.fcmPayload.optString("custom"));
        if (jSONObject.has("u")) {
            String url = jSONObject.optString("u");
            if (!Intrinsics.a(url, "")) {
                Intrinsics.checkNotNullExpressionValue(url, "url");
                int length = url.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.e(url.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                return Uri.parse(url.subSequence(i, length + 1).toString());
            }
        }
        return null;
    }
}

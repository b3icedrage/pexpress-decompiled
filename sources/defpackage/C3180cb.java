package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import io.sentry.android.core.b0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: cb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3180cb implements BR {
    @Override // defpackage.BR
    public final boolean a(@NotNull Context context, @NotNull String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            AR arA = new AR.b().a();
            Uri uri = Uri.parse(url);
            Intent intent = arA.a;
            intent.setData(uri);
            C6333rM.startActivity(context, intent, null);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        } catch (RuntimeException e) {
            b0.e("WebViewWindows", "custom tab failed: ".concat(e.getClass().getSimpleName()));
            return false;
        }
    }
}

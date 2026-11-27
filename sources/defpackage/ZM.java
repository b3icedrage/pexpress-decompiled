package defpackage;

import android.webkit.CookieManager;
import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ZM {
    @NotNull
    public static final String a(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        String strI = new Gson().i(obj);
        Intrinsics.checkNotNullExpressionValue(strI, "toJson(...)");
        return strI;
    }

    public static final void b(@NotNull CookieManager cookieManager, @NotNull String url, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(cookieManager, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        cookieManager.setCookie(url, key + "=" + value + ";");
    }
}

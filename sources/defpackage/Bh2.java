package defpackage;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class Bh2 {
    public static final /* synthetic */ int a = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    @SuppressLint({"PrivateApi"})
    public static PackageInfo a() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }
}

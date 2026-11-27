package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7498wt1 implements LW0<Uri, Uri> {
    public final Context a;

    public C7498wt1(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // defpackage.LW0
    public final boolean a(Uri uri) {
        String authority;
        Uri data = uri;
        Intrinsics.checkNotNullParameter(data, "data");
        if (!Intrinsics.a(data.getScheme(), "android.resource") || (authority = data.getAuthority()) == null || StringsKt.I(authority)) {
            return false;
        }
        List<String> pathSegments = data.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "data.pathSegments");
        return pathSegments.size() == 2;
    }

    @Override // defpackage.LW0
    public final Uri b(Uri uri) throws PackageManager.NameNotFoundException {
        Uri data = uri;
        Intrinsics.checkNotNullParameter(data, "data");
        String authority = data.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = this.a.getPackageManager().getResourcesForApplication(authority);
        Intrinsics.checkNotNullExpressionValue(resourcesForApplication, "context.packageManager.g…rApplication(packageName)");
        List<String> pathSegments = data.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (identifier == 0) {
            throw new IllegalStateException(C4564j.d(data, "Invalid android.resource URI: ").toString());
        }
        Uri uri2 = Uri.parse("android.resource://" + authority + '/' + identifier);
        Intrinsics.b(uri2, "Uri.parse(this)");
        return uri2;
    }
}

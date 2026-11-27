package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: renamed from: lt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5185lt1 implements InterfaceC4765jt1<Uri, Drawable> {
    public static final Z91<Resources.Theme> b = new Z91<>("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, Z91.e);
    public final Context a;

    public C5185lt1(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.InterfaceC4765jt1
    public final /* bridge */ /* synthetic */ InterfaceC3667et1<Drawable> a(@NonNull Uri uri, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        return c(uri, c4227ha1);
    }

    @Override // defpackage.InterfaceC4765jt1
    public final boolean b(@NonNull Uri uri, @NonNull C4227ha1 c4227ha1) {
        String scheme = uri.getScheme();
        return scheme != null && scheme.equals("android.resource");
    }

    public final InterfaceC3667et1 c(@NonNull Uri uri, @NonNull C4227ha1 c4227ha1) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new IllegalStateException("Package name for " + uri + " is null or empty");
        }
        Context context = this.a;
        if (authority.equals(context.getPackageName())) {
            contextCreatePackageContext = context;
        } else {
            try {
                contextCreatePackageContext = context.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e) {
                if (!authority.contains(context.getPackageName())) {
                    throw new IllegalArgumentException(C4564j.d(uri, "Failed to obtain context or unrecognized Uri format for: "), e);
                }
                contextCreatePackageContext = context;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException(C4564j.d(uri, "Failed to find resource id for: "));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException(C4564j.d(uri, "Unrecognized Uri format: "));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e2) {
                throw new IllegalArgumentException(C4564j.d(uri, "Unrecognized Uri format: "), e2);
            }
        }
        Resources.Theme theme = authority.equals(context.getPackageName()) ? (Resources.Theme) c4227ha1.c(b) : null;
        Drawable drawableA = theme == null ? D30.a(context, contextCreatePackageContext, identifier, null) : D30.a(context, context, identifier, theme);
        if (drawableA != null) {
            return new B51(drawableA);
        }
        return null;
    }
}

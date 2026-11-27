package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: ut1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7077ut1 implements InterfaceC5122lc0<Uri> {
    public final Context a;
    public final E30 b;

    public C7077ut1(@NotNull Context context, @NotNull E30 drawableDecoder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(drawableDecoder, "drawableDecoder");
        this.a = context;
        this.b = drawableDecoder;
    }

    @Override // defpackage.InterfaceC5122lc0
    public final boolean a(Uri uri) {
        Uri data = uri;
        Intrinsics.checkNotNullParameter(data, "data");
        return Intrinsics.a(data.getScheme(), "android.resource");
    }

    @Override // defpackage.InterfaceC5122lc0
    public final String b(Uri uri) {
        Uri data = uri;
        Intrinsics.checkNotNullParameter(data, "data");
        StringBuilder sb = new StringBuilder();
        sb.append(data);
        sb.append('-');
        Resources resources = this.a.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        Configuration nightMode = resources.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(nightMode, "context.resources.configuration");
        C2813ao0 c2813ao0 = C4316i.a;
        Intrinsics.checkNotNullParameter(nightMode, "$this$nightMode");
        sb.append(nightMode.uiMode & 48);
        return sb.toString();
    }

    @Override // defpackage.InterfaceC5122lc0
    public final Object c(C2509Yn1 c2509Yn1, Object obj, LM1 lm1, C4695ja1 c4695ja1, S60 s60) throws XmlPullParserException, PackageManager.NameNotFoundException, IOException {
        Integer intOrNull;
        Drawable isVector;
        Uri uri = (Uri) obj;
        String it = uri.getAuthority();
        if (it != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (StringsKt.I(it)) {
                it = null;
            }
            if (it != null) {
                Intrinsics.checkNotNullExpressionValue(it, "data.authority?.takeIf {…InvalidUriException(data)");
                List<String> pathSegments = uri.getPathSegments();
                Intrinsics.checkNotNullExpressionValue(pathSegments, "data.pathSegments");
                String str = (String) CollectionsKt.N(pathSegments);
                if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
                    throw new IllegalStateException(C4564j.d(uri, "Invalid android.resource URI: "));
                }
                int iIntValue = intOrNull.intValue();
                Context getXmlDrawableCompat = c4695ja1.a;
                Resources getDrawableCompat = getXmlDrawableCompat.getPackageManager().getResourcesForApplication(it);
                Intrinsics.checkNotNullExpressionValue(getDrawableCompat, "context.packageManager.g…rApplication(packageName)");
                TypedValue typedValue = new TypedValue();
                boolean z = true;
                getDrawableCompat.getValue(iIntValue, typedValue, true);
                CharSequence path = typedValue.string;
                Intrinsics.checkNotNullExpressionValue(path, "path");
                String string = path.subSequence(StringsKt.J('/', 0, 6, path), path.length()).toString();
                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                Intrinsics.checkNotNullExpressionValue(singleton, "MimeTypeMap.getSingleton()");
                String strA = C4316i.a(singleton, string);
                boolean zA = Intrinsics.a(strA, "text/xml");
                DS ds = DS.e;
                if (!zA) {
                    InputStream inputStreamOpenRawResource = getDrawableCompat.openRawResource(iIntValue);
                    Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "resources.openRawResource(resId)");
                    return new ZN1(Cm2.e(Cm2.q(inputStreamOpenRawResource)), strA, ds);
                }
                if (it.equals(getXmlDrawableCompat.getPackageName())) {
                    isVector = C3686f.k(getXmlDrawableCompat, iIntValue);
                } else {
                    Intrinsics.checkNotNullParameter(getXmlDrawableCompat, "$this$getXmlDrawableCompat");
                    Intrinsics.checkNotNullParameter(getDrawableCompat, "resources");
                    XmlResourceParser xml = getDrawableCompat.getXml(iIntValue);
                    Intrinsics.checkNotNullExpressionValue(xml, "resources.getXml(resId)");
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found.");
                    }
                    Resources.Theme theme = getXmlDrawableCompat.getTheme();
                    Intrinsics.checkNotNullParameter(getDrawableCompat, "$this$getDrawableCompat");
                    ThreadLocal<TypedValue> threadLocal = C7708xt1.a;
                    Drawable drawableA = C7708xt1.a.a(getDrawableCompat, iIntValue, theme);
                    if (drawableA == null) {
                        throw new IllegalStateException(EK.e(iIntValue, "Invalid resource ID: ").toString());
                    }
                    isVector = drawableA;
                }
                Intrinsics.checkNotNullParameter(isVector, "$this$isVector");
                if (!(isVector instanceof C4030gd2) && !(isVector instanceof VectorDrawable)) {
                    z = false;
                }
                if (z) {
                    Bitmap bitmapA = this.b.a(isVector, c4695ja1.b, lm1, c4695ja1.d, c4695ja1.e);
                    Resources resources = getXmlDrawableCompat.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
                    isVector = new BitmapDrawable(resources, bitmapA);
                }
                return new J30(isVector, z, ds);
            }
        }
        throw new IllegalStateException(C4564j.d(uri, "Invalid android.resource URI: "));
    }
}

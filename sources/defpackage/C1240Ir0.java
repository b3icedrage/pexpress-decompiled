package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ir0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1240Ir0 extends AbstractC8118zq0<Uri> {
    @Override // defpackage.AbstractC8118zq0, defpackage.InterfaceC5122lc0
    public final boolean a(Object obj) {
        Uri data = (Uri) obj;
        Intrinsics.checkNotNullParameter(data, "data");
        return Intrinsics.a(data.getScheme(), "http") || Intrinsics.a(data.getScheme(), "https");
    }

    @Override // defpackage.InterfaceC5122lc0
    public final String b(Object obj) {
        Uri data = (Uri) obj;
        Intrinsics.checkNotNullParameter(data, "data");
        String string = data.toString();
        Intrinsics.checkNotNullExpressionValue(string, "data.toString()");
        return string;
    }

    @Override // defpackage.AbstractC8118zq0
    public final C1318Jr0 e(Uri uri) {
        Uri toHttpUrl = uri;
        Intrinsics.checkNotNullParameter(toHttpUrl, "$this$toHttpUrl");
        String string = toHttpUrl.toString();
        Intrinsics.checkNotNullParameter(string, "<this>");
        C1318Jr0.a aVar = new C1318Jr0.a();
        aVar.e(null, string);
        C1318Jr0 c1318Jr0A = aVar.a();
        Intrinsics.checkNotNullExpressionValue(c1318Jr0A, "HttpUrl.get(toString())");
        return c1318Jr0A;
    }
}

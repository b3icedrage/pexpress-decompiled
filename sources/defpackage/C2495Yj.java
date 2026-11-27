package defpackage;

import android.content.Context;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Yj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2495Yj implements InterfaceC5122lc0<Uri> {
    public final Context a;

    public C2495Yj(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // defpackage.InterfaceC5122lc0
    public final boolean a(Uri uri) {
        Uri firstPathSegment = uri;
        Intrinsics.checkNotNullParameter(firstPathSegment, "data");
        if (!Intrinsics.a(firstPathSegment.getScheme(), "file")) {
            return false;
        }
        C2813ao0 c2813ao0 = C4316i.a;
        Intrinsics.checkNotNullParameter(firstPathSegment, "$this$firstPathSegment");
        List<String> pathSegments = firstPathSegment.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "pathSegments");
        return Intrinsics.a((String) CollectionsKt.firstOrNull(pathSegments), "android_asset");
    }

    @Override // defpackage.InterfaceC5122lc0
    public final String b(Uri uri) {
        Uri data = uri;
        Intrinsics.checkNotNullParameter(data, "data");
        String string = data.toString();
        Intrinsics.checkNotNullExpressionValue(string, "data.toString()");
        return string;
    }

    @Override // defpackage.InterfaceC5122lc0
    public final Object c(C2509Yn1 c2509Yn1, Object obj, LM1 lm1, C4695ja1 c4695ja1, S60 s60) throws IOException {
        List<String> pathSegments = ((Uri) obj).getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "data.pathSegments");
        String strJ = CollectionsKt.J(CollectionsKt.A(pathSegments, 1), "/", null, null, null, 62);
        InputStream inputStreamOpen = this.a.getAssets().open(strJ);
        Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(path)");
        C3024bo1 c3024bo1E = Cm2.e(Cm2.q(inputStreamOpen));
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        Intrinsics.checkNotNullExpressionValue(singleton, "MimeTypeMap.getSingleton()");
        return new ZN1(c3024bo1E, C4316i.a(singleton, strJ), DS.g);
    }
}

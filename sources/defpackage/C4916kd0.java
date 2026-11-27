package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4916kd0 implements LW0<Uri, File> {
    @Override // defpackage.LW0
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
        String str = (String) CollectionsKt.firstOrNull(pathSegments);
        return (str == null || str.equals("android_asset")) ? false : true;
    }

    @Override // defpackage.LW0
    public final File b(Uri uri) {
        Uri data = uri;
        Intrinsics.checkNotNullParameter(data, "data");
        if (!Intrinsics.a(data.getScheme(), "file")) {
            throw new IllegalArgumentException(C4564j.d(data, "Uri lacks 'file' scheme: ").toString());
        }
        String path = data.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(C4564j.d(data, "Uri path is null: ").toString());
    }
}

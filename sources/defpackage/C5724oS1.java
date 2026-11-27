package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: oS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5724oS1 implements LW0<String, Uri> {
    @Override // defpackage.LW0
    public final boolean a(String str) {
        String data = str;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(data, "data");
        return true;
    }

    @Override // defpackage.LW0
    public final Uri b(String str) {
        String data = str;
        Intrinsics.checkNotNullParameter(data, "data");
        Uri uri = Uri.parse(data);
        Intrinsics.b(uri, "Uri.parse(this)");
        return uri;
    }
}

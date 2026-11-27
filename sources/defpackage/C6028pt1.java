package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6028pt1 implements LW0<Integer, Uri> {
    public final Context a;

    public C6028pt1(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // defpackage.LW0
    public final boolean a(Integer num) {
        try {
            return this.a.getResources().getResourceEntryName(num.intValue()) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    @Override // defpackage.LW0
    public final Uri b(Integer num) {
        Uri uri = Uri.parse("android.resource://" + this.a.getPackageName() + '/' + num.intValue());
        Intrinsics.b(uri, "Uri.parse(this)");
        return uri;
    }
}

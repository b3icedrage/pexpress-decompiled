package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5236m7 extends AbstractC5023l7<String, Uri> {
    @Override // defpackage.AbstractC5023l7
    public final Intent a(Context context, String str) {
        String input = str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
        Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_GET…          .setType(input)");
        return type;
    }

    @Override // defpackage.AbstractC5023l7
    public final AbstractC5023l7.a<Uri> b(Context context, String str) {
        String input = str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override // defpackage.AbstractC5023l7
    public final Uri c(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }
}

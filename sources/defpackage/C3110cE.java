package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: cE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3110cE {

    @NotNull
    public final Context a;

    public C3110cE(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    public final void a(@NotNull String text) {
        Intrinsics.checkNotNullParameter("id", "label");
        Intrinsics.checkNotNullParameter(text, "text");
        ClipboardManager clipboardManager = (ClipboardManager) C6333rM.getSystemService(this.a, ClipboardManager.class);
        ClipData clipDataNewPlainText = ClipData.newPlainText("id", text);
        Intrinsics.checkNotNullExpressionValue(clipDataNewPlainText, "newPlainText(...)");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(clipDataNewPlainText);
        }
    }
}

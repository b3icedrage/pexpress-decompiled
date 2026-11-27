package defpackage;

import android.content.Context;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Je1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1280Je1 {

    @NotNull
    public final Context a;

    public C1280Je1(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @NotNull
    public final String a() {
        String string = this.a.getString(R.string.platform_name);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}

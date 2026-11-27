package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qE1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6102qE1 {

    @NotNull
    public final Context a;

    @NotNull
    public final String b;

    public C6102qE1(@NotNull Context appContext, @NotNull String widgetId) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        this.a = appContext;
        this.b = widgetId;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6102qE1)) {
            return false;
        }
        C6102qE1 c6102qE1 = (C6102qE1) obj;
        return Intrinsics.a(this.a, c6102qE1.a) && Intrinsics.a(this.b, c6102qE1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkContext(appContext=");
        sb.append(this.a);
        sb.append(", widgetId=");
        return C1039Gc0.e(sb, this.b, ')');
    }
}

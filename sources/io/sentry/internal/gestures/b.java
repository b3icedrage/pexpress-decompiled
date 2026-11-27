package io.sentry.internal.gestures;

import android.view.View;
import io.sentry.util.p;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public final WeakReference<Object> a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    @NotNull
    public final String d = "old_view_system";

    public enum a {
        CLICKABLE,
        SCROLLABLE
    }

    public b(@Nullable View view, @Nullable String str, @Nullable String str2) {
        this.a = new WeakReference<>(view);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return p.a(this.b, bVar.b) && p.a(this.c, bVar.c) && p.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, null});
    }
}

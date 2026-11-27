package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Vr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2255Vr {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @NotNull
    public final String c;

    public C2255Vr(@NotNull String title, @NotNull String description, @NotNull String iconUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        this.a = title;
        this.b = description;
        this.c = iconUrl;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2255Vr)) {
            return false;
        }
        C2255Vr c2255Vr = (C2255Vr) obj;
        return Intrinsics.a(this.a, c2255Vr.a) && Intrinsics.a(this.b, c2255Vr.b) && Intrinsics.a(this.c, c2255Vr.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + C1039Gc0.b(this.a.hashCode() * 31, 31, this.b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("BetNotificationData(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        return C5807oq.b(sb, this.c, ")");
    }
}

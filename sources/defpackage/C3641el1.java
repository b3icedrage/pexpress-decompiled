package defpackage;

import com.jivosite.sdk.model.pojo.push.Notification;
import com.jivosite.sdk.model.pojo.push.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: el1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3641el1 {

    @NotNull
    public final U a;

    @NotNull
    public final Notification b;

    public C3641el1(@NotNull U u, @NotNull Notification notification) {
        Intrinsics.checkNotNullParameter(u, "u");
        Intrinsics.checkNotNullParameter(notification, "notification");
        this.a = u;
        this.b = notification;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3641el1)) {
            return false;
        }
        C3641el1 c3641el1 = (C3641el1) obj;
        return Intrinsics.a(this.a, c3641el1.a) && Intrinsics.a(this.b, c3641el1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "PushData(u=" + this.a + ", notification=" + this.b + ')';
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7474wm {

    @NotNull
    public final EnumC5028l80 a;

    @Nullable
    public final C1510Md1 b;

    public C7474wm(@NotNull EnumC5028l80 event, @Nullable C1510Md1 c1510Md1) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.a = event;
        this.b = c1510Md1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7474wm)) {
            return false;
        }
        C7474wm c7474wm = (C7474wm) obj;
        return this.a == c7474wm.a && Intrinsics.a(this.b, c7474wm.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        C1510Md1 c1510Md1 = this.b;
        return iHashCode + (c1510Md1 == null ? 0 : c1510Md1.a.hashCode());
    }

    @NotNull
    public final String toString() {
        return "AuthorizationScreenEvent(event=" + this.a + ", property=" + this.b + ")";
    }
}

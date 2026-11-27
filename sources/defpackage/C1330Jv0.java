package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Jv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1330Jv0 {

    @Nullable
    public final String a;

    @Nullable
    public final String b;

    @NotNull
    public final Object c;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1330Jv0() {
        String str = null;
        this(7, str, str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1330Jv0)) {
            return false;
        }
        C1330Jv0 c1330Jv0 = (C1330Jv0) obj;
        return Intrinsics.a(this.a, c1330Jv0.a) && Intrinsics.a(this.b, c1330Jv0.b) && Intrinsics.a(this.c, c1330Jv0.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "Identity(userId=" + ((Object) this.a) + ", deviceId=" + ((Object) this.b) + ", userProperties=" + this.c + ')';
    }

    public C1330Jv0(@NotNull Map userProperties, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(userProperties, "userProperties");
        this.a = str;
        this.b = str2;
        this.c = userProperties;
    }

    public /* synthetic */ C1330Jv0(int i, String str, String str2) {
        this(PW0.c(), (i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}

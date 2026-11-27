package defpackage;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Sy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2042Sy {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    @Nullable
    public final String c;

    public C2042Sy(@NotNull String v3, @NotNull String v2, @Nullable String str) {
        Intrinsics.checkNotNullParameter(v3, "v3");
        Intrinsics.checkNotNullParameter(v2, "v2");
        this.a = v3;
        this.b = v2;
        this.c = str;
    }

    @NotNull
    public final String a() {
        String str = this.b;
        int length = str.length();
        String str2 = this.a;
        if (length > 0 && str2.length() > 0) {
            return "v2+v3";
        }
        if (str.length() > 0) {
            return "v2";
        }
        return str2.length() > 0 ? "v3" : DevicePublicKeyStringDef.NONE;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2042Sy)) {
            return false;
        }
        C2042Sy c2042Sy = (C2042Sy) obj;
        return Intrinsics.a(this.a, c2042Sy.a) && Intrinsics.a(this.b, c2042Sy.b) && Intrinsics.a(this.c, c2042Sy.c);
    }

    public final int hashCode() {
        int iB = C1039Gc0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iB + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CaptchaTokens(v3=");
        sb.append(this.a);
        sb.append(", v2=");
        sb.append(this.b);
        sb.append(", v3Error=");
        return C5807oq.b(sb, this.c, ")");
    }
}

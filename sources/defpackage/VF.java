package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class VF {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    public VF(@NotNull String email, @NotNull String captchaToken) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(captchaToken, "captchaToken");
        this.a = email;
        this.b = captchaToken;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VF)) {
            return false;
        }
        VF vf = (VF) obj;
        return Intrinsics.a(this.a, vf.a) && Intrinsics.a(this.b, vf.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CommonForgotPasswordRequest(email=");
        sb.append(this.a);
        sb.append(", captchaToken=");
        return C5807oq.b(sb, this.b, ")");
    }
}

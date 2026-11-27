package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class FL1 {

    @NotNull
    public static final FL1 c = new FL1(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, "Normal closure");
    public final int a;

    @NotNull
    public final String b;

    public FL1(int i, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.a = i;
        this.b = reason;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FL1)) {
            return false;
        }
        FL1 fl1 = (FL1) obj;
        return this.a == fl1.a && Intrinsics.a(this.b, fl1.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ShutdownReason(code=");
        sb.append(this.a);
        sb.append(", reason=");
        return C5807oq.b(sb, this.b, ")");
    }
}

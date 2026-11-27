package defpackage;

import com.api.core.backend.domain.models.responseModels.CommonAccount;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: o5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5648o5 {

    @NotNull
    public final CommonAccount a;
    public final boolean b;

    @NotNull
    public final String c;

    public C5648o5(@NotNull CommonAccount account, boolean z, @NotNull String currencyCode) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter("DEMO", "demoCurrencyCode");
        this.a = account;
        this.b = z;
        this.c = currencyCode;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5648o5)) {
            return false;
        }
        C5648o5 c5648o5 = (C5648o5) obj;
        return this.a.equals(c5648o5.a) && this.b == c5648o5.b && Intrinsics.a(this.c, c5648o5.c);
    }

    public final int hashCode() {
        return ((this.c.hashCode() + C2983be.a(this.a.hashCode() * 31, this.b, 31)) * 31) + 2094563;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountWrapper(account=");
        sb.append(this.a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", currencyCode=");
        return C5807oq.b(sb, this.c, ", demoCurrencyCode=DEMO)");
    }
}

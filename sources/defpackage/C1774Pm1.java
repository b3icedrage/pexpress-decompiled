package defpackage;

import com.jivosite.sdk.model.pojo.rate.RateSettings;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Pm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1774Pm1 {

    @Nullable
    public final RateSettings a;

    @NotNull
    public final AbstractC8106zm1 b;
    public final long c;

    public C1774Pm1() {
        this(0);
    }

    public static C1774Pm1 a(C1774Pm1 c1774Pm1, RateSettings rateSettings, AbstractC8106zm1 ratingFormState, long j, int i) {
        if ((i & 1) != 0) {
            rateSettings = c1774Pm1.a;
        }
        if ((i & 2) != 0) {
            ratingFormState = c1774Pm1.b;
        }
        if ((i & 4) != 0) {
            j = c1774Pm1.c;
        }
        c1774Pm1.getClass();
        Intrinsics.checkNotNullParameter(ratingFormState, "ratingFormState");
        return new C1774Pm1(rateSettings, ratingFormState, j);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1774Pm1)) {
            return false;
        }
        C1774Pm1 c1774Pm1 = (C1774Pm1) obj;
        return Intrinsics.a(this.a, c1774Pm1.a) && Intrinsics.a(this.b, c1774Pm1.b) && this.c == c1774Pm1.c;
    }

    public final int hashCode() {
        RateSettings rateSettings = this.a;
        return Long.hashCode(this.c) + ((this.b.hashCode() + ((rateSettings == null ? 0 : rateSettings.hashCode()) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "RatingState(rateSettings=" + this.a + ", ratingFormState=" + this.b + ", timestamp=" + this.c + ')';
    }

    public C1774Pm1(@Nullable RateSettings rateSettings, @NotNull AbstractC8106zm1 ratingFormState, long j) {
        Intrinsics.checkNotNullParameter(ratingFormState, "ratingFormState");
        this.a = rateSettings;
        this.b = ratingFormState;
        this.c = j;
    }

    public /* synthetic */ C1774Pm1(int i) {
        this(null, AbstractC8106zm1.b.a, 0L);
    }
}

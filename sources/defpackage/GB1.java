package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"LGB1;", "", "", "rywToken", "", "rywDelay", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/Long;)LGB1;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRywToken", "Ljava/lang/Long;", "getRywDelay", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class GB1 {

    @Nullable
    private final Long rywDelay;

    @NotNull
    private final String rywToken;

    public GB1(@NotNull String rywToken, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(rywToken, "rywToken");
        this.rywToken = rywToken;
        this.rywDelay = l;
    }

    public static /* synthetic */ GB1 copy$default(GB1 gb1, String str, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gb1.rywToken;
        }
        if ((i & 2) != 0) {
            l = gb1.rywDelay;
        }
        return gb1.copy(str, l);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRywToken() {
        return this.rywToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getRywDelay() {
        return this.rywDelay;
    }

    @NotNull
    public final GB1 copy(@NotNull String rywToken, @Nullable Long rywDelay) {
        Intrinsics.checkNotNullParameter(rywToken, "rywToken");
        return new GB1(rywToken, rywDelay);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GB1)) {
            return false;
        }
        GB1 gb1 = (GB1) other;
        return Intrinsics.a(this.rywToken, gb1.rywToken) && Intrinsics.a(this.rywDelay, gb1.rywDelay);
    }

    @Nullable
    public final Long getRywDelay() {
        return this.rywDelay;
    }

    @NotNull
    public final String getRywToken() {
        return this.rywToken;
    }

    public int hashCode() {
        int iHashCode = this.rywToken.hashCode() * 31;
        Long l = this.rywDelay;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    @NotNull
    public String toString() {
        return "RywData(rywToken=" + this.rywToken + ", rywDelay=" + this.rywDelay + ')';
    }
}

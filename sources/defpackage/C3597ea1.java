package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ea1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Lea1;", "", "", "cacheKey", "rywToken", "", "retryCount", "", "sessionDuration", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)Lea1;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCacheKey", "getRywToken", "Ljava/lang/Integer;", "getRetryCount", "Ljava/lang/Long;", "getSessionDuration", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class C3597ea1 {

    @Nullable
    private final String cacheKey;

    @Nullable
    private final Integer retryCount;

    @Nullable
    private final String rywToken;

    @Nullable
    private final Long sessionDuration;

    public C3597ea1() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ C3597ea1 copy$default(C3597ea1 c3597ea1, String str, String str2, Integer num, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3597ea1.cacheKey;
        }
        if ((i & 2) != 0) {
            str2 = c3597ea1.rywToken;
        }
        if ((i & 4) != 0) {
            num = c3597ea1.retryCount;
        }
        if ((i & 8) != 0) {
            l = c3597ea1.sessionDuration;
        }
        return c3597ea1.copy(str, str2, num, l);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCacheKey() {
        return this.cacheKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRywToken() {
        return this.rywToken;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getRetryCount() {
        return this.retryCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getSessionDuration() {
        return this.sessionDuration;
    }

    @NotNull
    public final C3597ea1 copy(@Nullable String cacheKey, @Nullable String rywToken, @Nullable Integer retryCount, @Nullable Long sessionDuration) {
        return new C3597ea1(cacheKey, rywToken, retryCount, sessionDuration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3597ea1)) {
            return false;
        }
        C3597ea1 c3597ea1 = (C3597ea1) other;
        return Intrinsics.a(this.cacheKey, c3597ea1.cacheKey) && Intrinsics.a(this.rywToken, c3597ea1.rywToken) && Intrinsics.a(this.retryCount, c3597ea1.retryCount) && Intrinsics.a(this.sessionDuration, c3597ea1.sessionDuration);
    }

    @Nullable
    public final String getCacheKey() {
        return this.cacheKey;
    }

    @Nullable
    public final Integer getRetryCount() {
        return this.retryCount;
    }

    @Nullable
    public final String getRywToken() {
        return this.rywToken;
    }

    @Nullable
    public final Long getSessionDuration() {
        return this.sessionDuration;
    }

    public int hashCode() {
        String str = this.cacheKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rywToken;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.retryCount;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.sessionDuration;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OptionalHeaders(cacheKey=" + this.cacheKey + ", rywToken=" + this.rywToken + ", retryCount=" + this.retryCount + ", sessionDuration=" + this.sessionDuration + ')';
    }

    public C3597ea1(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Long l) {
        this.cacheKey = str;
        this.rywToken = str2;
        this.retryCount = num;
        this.sessionDuration = l;
    }

    public /* synthetic */ C3597ea1(String str, String str2, Integer num, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : l);
    }
}

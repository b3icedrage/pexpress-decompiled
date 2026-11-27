package defpackage;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: l41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Ll41;", "", "<init>", "()V", "", "statusCode", "Ll41$a;", "getResponseStatusType", "(I)Ll41$a;", "maxNetworkRequestAttemptCount", "I", "getMaxNetworkRequestAttemptCount", "()I", "setMaxNetworkRequestAttemptCount", "(I)V", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C5013l41 {

    @NotNull
    public static final C5013l41 INSTANCE = new C5013l41();
    private static int maxNetworkRequestAttemptCount = 3;

    /* JADX INFO: renamed from: l41$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Ll41$a;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "RETRYABLE", "UNAUTHORIZED", "MISSING", "CONFLICT", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum a {
        INVALID,
        RETRYABLE,
        UNAUTHORIZED,
        MISSING,
        CONFLICT
    }

    private C5013l41() {
    }

    public final int getMaxNetworkRequestAttemptCount() {
        return maxNetworkRequestAttemptCount;
    }

    @NotNull
    public final a getResponseStatusType(int statusCode) {
        if (statusCode == 409) {
            return a.CONFLICT;
        }
        if (statusCode != 410) {
            if (statusCode == 429) {
                return a.RETRYABLE;
            }
            switch (statusCode) {
                case 400:
                case 402:
                    return a.INVALID;
                case 401:
                case 403:
                    return a.UNAUTHORIZED;
                case 404:
                    break;
                default:
                    return a.RETRYABLE;
            }
        }
        return a.MISSING;
    }

    public final void setMaxNetworkRequestAttemptCount(int i) {
        maxNetworkRequestAttemptCount = i;
    }
}

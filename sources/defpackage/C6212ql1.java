package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ql1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lql1;", "", "", "token", "LGU1;", "status", "<init>", "(Ljava/lang/String;LGU1;)V", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "LGU1;", "getStatus", "()LGU1;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C6212ql1 {

    @NotNull
    private final GU1 status;

    @Nullable
    private final String token;

    public C6212ql1(@Nullable String str, @NotNull GU1 status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.token = str;
        this.status = status;
    }

    @NotNull
    public final GU1 getStatus() {
        return this.status;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }
}

package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Llr0;", "", "", "statusCode", "", "payload", "", "throwable", "retryAfterSeconds", "retryLimit", "<init>", "(ILjava/lang/String;Ljava/lang/Throwable;Ljava/lang/Integer;Ljava/lang/Integer;)V", "I", "getStatusCode", "()I", "Ljava/lang/String;", "getPayload", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "Ljava/lang/Integer;", "getRetryAfterSeconds", "()Ljava/lang/Integer;", "getRetryLimit", "", "isSuccess", "()Z", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C5178lr0 {

    @Nullable
    private final String payload;

    @Nullable
    private final Integer retryAfterSeconds;

    @Nullable
    private final Integer retryLimit;
    private final int statusCode;

    @Nullable
    private final Throwable throwable;

    public C5178lr0(int i, @Nullable String str, @Nullable Throwable th, @Nullable Integer num, @Nullable Integer num2) {
        this.statusCode = i;
        this.payload = str;
        this.throwable = th;
        this.retryAfterSeconds = num;
        this.retryLimit = num2;
    }

    @Nullable
    public final String getPayload() {
        return this.payload;
    }

    @Nullable
    public final Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    @Nullable
    public final Integer getRetryLimit() {
        return this.retryLimit;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    @Nullable
    public final Throwable getThrowable() {
        return this.throwable;
    }

    public final boolean isSuccess() {
        int i = this.statusCode;
        return i == 200 || i == 202 || i == 304 || i == 201;
    }

    public /* synthetic */ C5178lr0(int i, String str, Throwable th, Integer num, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : th, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : num2);
    }
}

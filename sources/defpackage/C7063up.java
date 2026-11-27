package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: up, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00060\u0001j\u0002`\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lup;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "statusCode", "", Payload.RESPONSE, "retryAfterSeconds", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;)V", "I", "getStatusCode", "()I", "Ljava/lang/String;", "getResponse", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getRetryAfterSeconds", "()Ljava/lang/Integer;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C7063up extends Exception {

    @Nullable
    private final String response;

    @Nullable
    private final Integer retryAfterSeconds;
    private final int statusCode;

    public /* synthetic */ C7063up(int i, String str, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : num);
    }

    @Nullable
    public final String getResponse() {
        return this.response;
    }

    @Nullable
    public final Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public C7063up(int i, @Nullable String str, @Nullable Integer num) {
        this.statusCode = i;
        this.response = str;
        this.retryAfterSeconds = num;
    }
}

package com.impl.core.backend.abstractModels.http;

import defpackage.C5807oq;
import defpackage.C5896pG;
import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/impl/core/backend/abstractModels/http/PlatformHttpError;", "", "", "code", "Ljava/lang/String;", R51.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/lang/String;", "message", "c", "field", "b", "Companion", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PlatformHttpError {

    @NotNull
    public static final String FIELD_CAPTCHA_REBUS = "captcha_rebus";

    @NotNull
    public static final String FIELD_CAPTCHA_TOKEN = "captcha_token";

    @NotNull
    public static final String FIELD_EMAIL = "email";

    @Nullable
    private final String code;

    @Nullable
    private final String field;

    @Nullable
    private final String message;

    public PlatformHttpError() {
        this(null, null, null);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getField() {
        return this.field;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformHttpError)) {
            return false;
        }
        PlatformHttpError platformHttpError = (PlatformHttpError) obj;
        return Intrinsics.a(this.code, platformHttpError.code) && Intrinsics.a(this.message, platformHttpError.message) && Intrinsics.a(this.field, platformHttpError.field);
    }

    public final int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.field;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        String str = this.code;
        String str2 = this.message;
        return C5807oq.b(C5896pG.a("PlatformHttpError(code=", str, ", message=", str2, ", field="), this.field, ")");
    }

    public PlatformHttpError(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.code = str;
        this.message = str2;
        this.field = str3;
    }
}

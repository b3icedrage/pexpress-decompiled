package com.api.core.backend.domain.models.requestModels;

import defpackage.C1039Gc0;
import defpackage.C5807oq;
import defpackage.C5896pG;
import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/api/core/backend/domain/models/requestModels/CommonDuoAuthLoginRequest;", "", "", "code", "Ljava/lang/String;", R51.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "token", "d", "setToken", "Lcom/api/core/backend/domain/models/requestModels/DuoAuthType;", "type", "Lcom/api/core/backend/domain/models/requestModels/DuoAuthType;", "getType", "()Lcom/api/core/backend/domain/models/requestModels/DuoAuthType;", "setType", "(Lcom/api/core/backend/domain/models/requestModels/DuoAuthType;)V", "email", "b", "setEmail", "password", "c", "setPassword", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonDuoAuthLoginRequest {

    @NotNull
    private String code;

    @Nullable
    private String email;

    @Nullable
    private String password;

    @NotNull
    private String token;

    @NotNull
    private DuoAuthType type;

    public CommonDuoAuthLoginRequest(@NotNull String code, @NotNull String token, @NotNull DuoAuthType type, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(type, "type");
        this.code = code;
        this.token = token;
        this.type = type;
        this.email = str;
        this.password = str2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonDuoAuthLoginRequest)) {
            return false;
        }
        CommonDuoAuthLoginRequest commonDuoAuthLoginRequest = (CommonDuoAuthLoginRequest) obj;
        return Intrinsics.a(this.code, commonDuoAuthLoginRequest.code) && Intrinsics.a(this.token, commonDuoAuthLoginRequest.token) && this.type == commonDuoAuthLoginRequest.type && Intrinsics.a(this.email, commonDuoAuthLoginRequest.email) && Intrinsics.a(this.password, commonDuoAuthLoginRequest.password);
    }

    public final int hashCode() {
        int iHashCode = (this.type.hashCode() + C1039Gc0.b(this.code.hashCode() * 31, 31, this.token)) * 31;
        String str = this.email;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.password;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        String str = this.code;
        String str2 = this.token;
        DuoAuthType duoAuthType = this.type;
        String str3 = this.email;
        String str4 = this.password;
        StringBuilder sbA = C5896pG.a("CommonDuoAuthLoginRequest(code=", str, ", token=", str2, ", type=");
        sbA.append(duoAuthType);
        sbA.append(", email=");
        sbA.append(str3);
        sbA.append(", password=");
        return C5807oq.b(sbA, str4, ")");
    }
}

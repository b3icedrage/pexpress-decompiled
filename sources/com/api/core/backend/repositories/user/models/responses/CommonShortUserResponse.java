package com.api.core.backend.repositories.user.models.responses;

import com.api.core.backend.domain.models.resultModels.HttpResponse;
import defpackage.C5896pG;
import defpackage.C6106qG;
import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/api/core/backend/repositories/user/models/responses/CommonShortUserResponse;", "Lcom/api/core/backend/domain/models/resultModels/HttpResponse;", "Lcom/api/core/backend/repositories/user/models/responses/CommonShortUserResponse$Result;", "result", "Lcom/api/core/backend/repositories/user/models/responses/CommonShortUserResponse$Result;", "getResult", "()Lcom/api/core/backend/repositories/user/models/responses/CommonShortUserResponse$Result;", "Result", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonShortUserResponse extends HttpResponse<Result> {

    @Nullable
    private final Result result = null;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/api/core/backend/repositories/user/models/responses/CommonShortUserResponse$Result;", "", "", "email", "Ljava/lang/String;", "getEmail", "()Ljava/lang/String;", "nickname", "getNickname", "country", "getCountry", "", "activated", "Ljava/lang/Boolean;", "getActivated", "()Ljava/lang/Boolean;", "verified", "getVerified", "cryptoEnable", "getCryptoEnable", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result {

        @Nullable
        private final Boolean activated;

        @Nullable
        private final String country;

        @InterfaceC2691aI1("crypto_enable")
        @Nullable
        private final Boolean cryptoEnable;

        @Nullable
        private final String email;

        @Nullable
        private final String nickname;

        @Nullable
        private final Boolean verified;

        public Result() {
            this(0);
        }

        @NotNull
        public final C6106qG a() {
            String str = this.email;
            if (str == null) {
                str = "";
            }
            String str2 = this.nickname;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = this.country;
            String str4 = str3 != null ? str3 : "";
            Boolean bool = this.activated;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = this.verified;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            Boolean bool3 = this.cryptoEnable;
            return new C6106qG(str, str2, str4, zBooleanValue, zBooleanValue2, bool3 != null ? bool3.booleanValue() : false);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return Intrinsics.a(this.email, result.email) && Intrinsics.a(this.nickname, result.nickname) && Intrinsics.a(this.country, result.country) && Intrinsics.a(this.activated, result.activated) && Intrinsics.a(this.verified, result.verified) && Intrinsics.a(this.cryptoEnable, result.cryptoEnable);
        }

        public final int hashCode() {
            String str = this.email;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.nickname;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.country;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.activated;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.verified;
            int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.cryptoEnable;
            return iHashCode5 + (bool3 != null ? bool3.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            String str = this.email;
            String str2 = this.nickname;
            String str3 = this.country;
            Boolean bool = this.activated;
            Boolean bool2 = this.verified;
            Boolean bool3 = this.cryptoEnable;
            StringBuilder sbA = C5896pG.a("Result(email=", str, ", nickname=", str2, ", country=");
            sbA.append(str3);
            sbA.append(", activated=");
            sbA.append(bool);
            sbA.append(", verified=");
            sbA.append(bool2);
            sbA.append(", cryptoEnable=");
            sbA.append(bool3);
            sbA.append(")");
            return sbA.toString();
        }

        public Result(int i) {
            Boolean bool = Boolean.FALSE;
            this.email = "";
            this.nickname = "";
            this.country = "";
            this.activated = bool;
            this.verified = bool;
            this.cryptoEnable = bool;
        }
    }

    @Nullable
    public final C6106qG e() {
        Result result = this.result;
        if (result != null) {
            return result.a();
        }
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonShortUserResponse) && Intrinsics.a(this.result, ((CommonShortUserResponse) obj).result);
    }

    public final int hashCode() {
        Result result = this.result;
        if (result == null) {
            return 0;
        }
        return result.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CommonShortUserResponse(result=" + this.result + ")";
    }
}

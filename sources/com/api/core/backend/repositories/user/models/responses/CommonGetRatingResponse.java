package com.api.core.backend.repositories.user.models.responses;

import com.api.core.backend.domain.models.resultModels.HttpResponse;
import defpackage.C5863p60;
import defpackage.PW0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/api/core/backend/repositories/user/models/responses/CommonGetRatingResponse;", "Lcom/api/core/backend/domain/models/resultModels/HttpResponse;", "Lcom/api/core/backend/repositories/user/models/responses/CommonGetRatingResponse$Result;", "result", "Lcom/api/core/backend/repositories/user/models/responses/CommonGetRatingResponse$Result;", "getResult", "()Lcom/api/core/backend/repositories/user/models/responses/CommonGetRatingResponse$Result;", "Result", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonGetRatingResponse extends HttpResponse<Result> {

    @Nullable
    private final Result result;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0010R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/api/core/backend/repositories/user/models/responses/CommonGetRatingResponse$Result;", "", "", "", "Lcom/api/core/backend/repositories/user/models/responses/CommonPublicHistoryResponse;", "today", "Ljava/util/Map;", "getToday", "()Ljava/util/Map;", "month", "getMonth", "Lcom/api/core/backend/repositories/user/models/responses/CommonGetRatingResponse$Result$ShortUser;", "user", "Lcom/api/core/backend/repositories/user/models/responses/CommonGetRatingResponse$Result$ShortUser;", "getUser", "()Lcom/api/core/backend/repositories/user/models/responses/CommonGetRatingResponse$Result$ShortUser;", "ShortUser", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result {

        @Nullable
        private final Map<String, CommonPublicHistoryResponse> month;

        @Nullable
        private final Map<String, CommonPublicHistoryResponse> today;

        @Nullable
        private final ShortUser user;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/api/core/backend/repositories/user/models/responses/CommonGetRatingResponse$Result$ShortUser;", "", "Lcom/api/core/backend/repositories/user/models/responses/CommonHistoryResponse;", "today", "Lcom/api/core/backend/repositories/user/models/responses/CommonHistoryResponse;", "getToday", "()Lcom/api/core/backend/repositories/user/models/responses/CommonHistoryResponse;", "month", "getMonth", "Lcom/api/core/backend/repositories/user/models/responses/CommonShortUserResponse$Result;", "data", "Lcom/api/core/backend/repositories/user/models/responses/CommonShortUserResponse$Result;", "getData", "()Lcom/api/core/backend/repositories/user/models/responses/CommonShortUserResponse$Result;", "", "flag", "Ljava/lang/String;", "getFlag", "()Ljava/lang/String;", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ShortUser {

            @Nullable
            private final CommonShortUserResponse.Result data;

            @Nullable
            private final String flag;

            @NotNull
            private final CommonHistoryResponse month;

            @NotNull
            private final CommonHistoryResponse today;

            public ShortUser() {
                CommonHistoryResponse today = new CommonHistoryResponse(0);
                CommonHistoryResponse month = new CommonHistoryResponse(0);
                CommonShortUserResponse.Result result = new CommonShortUserResponse.Result(0);
                Intrinsics.checkNotNullParameter(today, "today");
                Intrinsics.checkNotNullParameter(month, "month");
                this.today = today;
                this.month = month;
                this.data = result;
                this.flag = null;
            }

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShortUser)) {
                    return false;
                }
                ShortUser shortUser = (ShortUser) obj;
                return Intrinsics.a(this.today, shortUser.today) && Intrinsics.a(this.month, shortUser.month) && Intrinsics.a(this.data, shortUser.data) && Intrinsics.a(this.flag, shortUser.flag);
            }

            public final int hashCode() {
                int iHashCode = (this.month.hashCode() + (this.today.hashCode() * 31)) * 31;
                CommonShortUserResponse.Result result = this.data;
                int iHashCode2 = (iHashCode + (result == null ? 0 : result.hashCode())) * 31;
                String str = this.flag;
                return iHashCode2 + (str != null ? str.hashCode() : 0);
            }

            @NotNull
            public final String toString() {
                return "ShortUser(today=" + this.today + ", month=" + this.month + ", data=" + this.data + ", flag=" + this.flag + ")";
            }
        }

        public Result() {
            C5863p60 c5863p60C = PW0.c();
            C5863p60 c5863p60C2 = PW0.c();
            this.today = c5863p60C;
            this.month = c5863p60C2;
            this.user = null;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return Intrinsics.a(this.today, result.today) && Intrinsics.a(this.month, result.month) && Intrinsics.a(this.user, result.user);
        }

        public final int hashCode() {
            Map<String, CommonPublicHistoryResponse> map = this.today;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, CommonPublicHistoryResponse> map2 = this.month;
            int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
            ShortUser shortUser = this.user;
            return iHashCode2 + (shortUser != null ? shortUser.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "Result(today=" + this.today + ", month=" + this.month + ", user=" + this.user + ")";
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonGetRatingResponse) && Intrinsics.a(this.result, ((CommonGetRatingResponse) obj).result);
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
        return "CommonGetRatingResponse(result=" + this.result + ")";
    }
}

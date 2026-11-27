package com.api.core.backend.repositories.user.models.requests;

import defpackage.C5896pG;
import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/api/core/backend/repositories/user/models/requests/AddUserRequest;", "", "", "userId", "Ljava/lang/Long;", "getUserId", "()Ljava/lang/Long;", "setUserId", "(Ljava/lang/Long;)V", "", "country", "Ljava/lang/String;", "getCountry", "()Ljava/lang/String;", "setCountry", "(Ljava/lang/String;)V", "currency", "getCurrency", "setCurrency", "email", "getEmail", "setEmail", "", "isMobile", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "setMobile", "(Ljava/lang/Integer;)V", "Companion", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AddUserRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private String country;

    @Nullable
    private String currency;

    @Nullable
    private String email;

    @InterfaceC2691aI1("is_mobile")
    @Nullable
    private Integer isMobile;

    @InterfaceC2691aI1("user_id")
    @Nullable
    private Long userId;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/repositories/user/models/requests/AddUserRequest$Companion;", "", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public AddUserRequest(@Nullable Long l, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
        this.userId = l;
        this.country = str;
        this.currency = str2;
        this.email = str3;
        this.isMobile = num;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddUserRequest)) {
            return false;
        }
        AddUserRequest addUserRequest = (AddUserRequest) obj;
        return Intrinsics.a(this.userId, addUserRequest.userId) && Intrinsics.a(this.country, addUserRequest.country) && Intrinsics.a(this.currency, addUserRequest.currency) && Intrinsics.a(this.email, addUserRequest.email) && Intrinsics.a(this.isMobile, addUserRequest.isMobile);
    }

    public final int hashCode() {
        Long l = this.userId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.country;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.isMobile;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        Long l = this.userId;
        String str = this.country;
        String str2 = this.currency;
        String str3 = this.email;
        Integer num = this.isMobile;
        StringBuilder sb = new StringBuilder("AddUserRequest(userId=");
        sb.append(l);
        sb.append(", country=");
        sb.append(str);
        sb.append(", currency=");
        C5896pG.b(sb, str2, ", email=", str3, ", isMobile=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public AddUserRequest() {
        this(0L, "", "", "", 0);
    }
}

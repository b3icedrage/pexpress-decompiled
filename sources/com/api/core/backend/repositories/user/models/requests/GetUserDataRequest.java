package com.api.core.backend.repositories.user.models.requests;

import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/api/core/backend/repositories/user/models/requests/GetUserDataRequest;", "", "", "userID", "Ljava/lang/Long;", "getUserID", "()Ljava/lang/Long;", "setUserID", "(Ljava/lang/Long;)V", "", "email", "Ljava/lang/String;", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "currency", "getCurrency", "setCurrency", "country", "getCountry", "setCountry", "Companion", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetUserDataRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private String country;

    @Nullable
    private String currency;

    @Nullable
    private String email;

    @InterfaceC2691aI1("user_id")
    @Nullable
    private Long userID;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/repositories/user/models/requests/GetUserDataRequest$Companion;", "", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public GetUserDataRequest(@Nullable String str, @Nullable String str2, @Nullable Long l, @Nullable String str3) {
        this.userID = l;
        this.email = str;
        this.currency = str2;
        this.country = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetUserDataRequest)) {
            return false;
        }
        GetUserDataRequest getUserDataRequest = (GetUserDataRequest) obj;
        return Intrinsics.a(this.userID, getUserDataRequest.userID) && Intrinsics.a(this.email, getUserDataRequest.email) && Intrinsics.a(this.currency, getUserDataRequest.currency) && Intrinsics.a(this.country, getUserDataRequest.country);
    }

    public final int hashCode() {
        Long l = this.userID;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.email;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "GetUserDataRequest(userID=" + this.userID + ", email=" + this.email + ", currency=" + this.currency + ", country=" + this.country + ")";
    }
}

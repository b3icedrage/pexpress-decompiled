package com.api.core.backend.repositories.user.models.requests;

import defpackage.C5807oq;
import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/api/core/backend/repositories/user/models/requests/ChangeChangeUserDataRequest;", "", "", "userId", "Ljava/lang/Long;", "getUserId", "()Ljava/lang/Long;", "setUserId", "(Ljava/lang/Long;)V", "", "nickname", "Ljava/lang/String;", "getNickname", "()Ljava/lang/String;", "setNickname", "(Ljava/lang/String;)V", "email", "getEmail", "setEmail", "Companion", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ChangeChangeUserDataRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private String email;

    @Nullable
    private String nickname;

    @InterfaceC2691aI1("user_id")
    @Nullable
    private Long userId;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/repositories/user/models/requests/ChangeChangeUserDataRequest$Companion;", "", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public ChangeChangeUserDataRequest(@Nullable String str, @Nullable String str2, @Nullable Long l) {
        this.userId = l;
        this.nickname = str;
        this.email = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeChangeUserDataRequest)) {
            return false;
        }
        ChangeChangeUserDataRequest changeChangeUserDataRequest = (ChangeChangeUserDataRequest) obj;
        return Intrinsics.a(this.userId, changeChangeUserDataRequest.userId) && Intrinsics.a(this.nickname, changeChangeUserDataRequest.nickname) && Intrinsics.a(this.email, changeChangeUserDataRequest.email);
    }

    public final int hashCode() {
        Long l = this.userId;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.nickname;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        Long l = this.userId;
        String str = this.nickname;
        String str2 = this.email;
        StringBuilder sb = new StringBuilder("ChangeChangeUserDataRequest(userId=");
        sb.append(l);
        sb.append(", nickname=");
        sb.append(str);
        sb.append(", email=");
        return C5807oq.b(sb, str2, ")");
    }

    public ChangeChangeUserDataRequest() {
        this("", "", 0L);
    }
}

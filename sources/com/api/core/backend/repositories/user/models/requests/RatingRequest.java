package com.api.core.backend.repositories.user.models.requests;

import com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl.NewHtcHomeBadger;
import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \f2\u00020\u0001:\u0001\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/api/core/backend/repositories/user/models/requests/RatingRequest;", "", "", "userId", "Ljava/lang/Long;", "getUserId", "()Ljava/lang/Long;", "", "rowCount", "I", "getRowCount", "()I", "Companion", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RatingRequest {

    @InterfaceC2691aI1(NewHtcHomeBadger.COUNT)
    private final int rowCount;

    @InterfaceC2691aI1("user_id")
    @Nullable
    private final Long userId;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingRequest)) {
            return false;
        }
        RatingRequest ratingRequest = (RatingRequest) obj;
        return Intrinsics.a(this.userId, ratingRequest.userId) && this.rowCount == ratingRequest.rowCount;
    }

    public final int hashCode() {
        Long l = this.userId;
        return Integer.hashCode(this.rowCount) + ((l == null ? 0 : l.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "RatingRequest(userId=" + this.userId + ", rowCount=" + this.rowCount + ")";
    }
}

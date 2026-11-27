package com.base.core.backend.modelsResponse;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/base/core/backend/modelsResponse/CommonWinPercentsChanged;", "", "", "Lcom/base/core/backend/modelsResponse/CommonWinPercentsChanged$CommonWinPercent;", "percents", "Ljava/util/List;", "getPercents", "()Ljava/util/List;", "CommonWinPercent", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CommonWinPercentsChanged {

    @NotNull
    private final List<CommonWinPercent> percents;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/base/core/backend/modelsResponse/CommonWinPercentsChanged$CommonWinPercent;", "", "", "pairId", "Ljava/lang/String;", "getPairId", "()Ljava/lang/String;", "", "percent", "I", "getPercent", "()I", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CommonWinPercent {

        @NotNull
        private final String pairId;
        private final int percent;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommonWinPercent)) {
                return false;
            }
            CommonWinPercent commonWinPercent = (CommonWinPercent) obj;
            return Intrinsics.a(this.pairId, commonWinPercent.pairId) && this.percent == commonWinPercent.percent;
        }

        public final int hashCode() {
            return Integer.hashCode(this.percent) + (this.pairId.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "CommonWinPercent(pairId=" + this.pairId + ", percent=" + this.percent + ")";
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommonWinPercentsChanged) && Intrinsics.a(this.percents, ((CommonWinPercentsChanged) obj).percents);
    }

    public final int hashCode() {
        return this.percents.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CommonWinPercentsChanged(percents=" + this.percents + ")";
    }
}

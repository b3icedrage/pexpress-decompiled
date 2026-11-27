package com.api.core.backend.domain.models.responseModels;

import com.api.core.backend.domain.models.resultModels.HttpResponse;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/TimestampResponse;", "Lcom/api/core/backend/domain/models/resultModels/HttpResponse;", "Lcom/api/core/backend/domain/models/responseModels/TimestampResponse$Time;", "result", "Lcom/api/core/backend/domain/models/responseModels/TimestampResponse$Time;", "getResult", "()Lcom/api/core/backend/domain/models/responseModels/TimestampResponse$Time;", "Time", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimestampResponse extends HttpResponse<Time> {

    @Nullable
    private final Time result;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/TimestampResponse$Time;", "", "", "timestamp", "J", "getTimestamp", "()J", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Time {
        private final long timestamp;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Time) && this.timestamp == ((Time) obj).timestamp;
        }

        public final int hashCode() {
            return Long.hashCode(this.timestamp);
        }

        @NotNull
        public final String toString() {
            return "Time(timestamp=" + this.timestamp + ")";
        }
    }
}

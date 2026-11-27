package com.impl.core.backend.modelsRequest;

import com.impl.core.backend.abstractModels.WebSocketRequestImpl;
import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\b\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/impl/core/backend/modelsRequest/CandlesHistorySubscribeRequest;", "Lcom/impl/core/backend/abstractModels/WebSocketRequestImpl;", "Lcom/impl/core/backend/modelsRequest/CandlesHistorySubscribeRequest$Data;", "payload", "Lcom/impl/core/backend/modelsRequest/CandlesHistorySubscribeRequest$Data;", "getPayload", "()Lcom/impl/core/backend/modelsRequest/CandlesHistorySubscribeRequest$Data;", "Companion", "Data", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CandlesHistorySubscribeRequest extends WebSocketRequestImpl<Data> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @InterfaceC2691aI1("changeSymbol")
    @NotNull
    private final Data payload;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/impl/core/backend/modelsRequest/CandlesHistorySubscribeRequest$Companion;", "", "<init>", "()V", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/impl/core/backend/modelsRequest/CandlesHistorySubscribeRequest$Data;", "", "", "asset", "Ljava/lang/String;", "getAsset", "()Ljava/lang/String;", "", "timeframeSizeSeconds", "I", "getTimeframeSizeSeconds", "()I", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Data {

        @NotNull
        private final String asset;

        @InterfaceC2691aI1("period")
        private final int timeframeSizeSeconds;

        public Data(@NotNull String asset, int i) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            this.asset = asset;
            this.timeframeSizeSeconds = i;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return Intrinsics.a(this.asset, data.asset) && this.timeframeSizeSeconds == data.timeframeSizeSeconds;
        }

        public final int hashCode() {
            return Integer.hashCode(this.timeframeSizeSeconds) + (this.asset.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Data(asset=" + this.asset + ", timeframeSizeSeconds=" + this.timeframeSizeSeconds + ")";
        }
    }

    public CandlesHistorySubscribeRequest(@NotNull String asset, int i) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.payload = new Data(asset, i);
    }

    @Override // com.impl.core.backend.abstractModels.WebSocketRequestImpl
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Data getPayload() {
        return this.payload;
    }
}

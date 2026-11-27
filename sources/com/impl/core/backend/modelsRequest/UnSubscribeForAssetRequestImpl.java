package com.impl.core.backend.modelsRequest;

import com.impl.core.backend.abstractModels.WebSocketRequestImpl;
import defpackage.C1039Gc0;
import defpackage.InterfaceC2691aI1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/impl/core/backend/modelsRequest/UnSubscribeForAssetRequestImpl;", "Lcom/impl/core/backend/abstractModels/WebSocketRequestImpl;", "Lcom/impl/core/backend/modelsRequest/UnSubscribeForAssetRequestImpl$Data;", "payload", "Lcom/impl/core/backend/modelsRequest/UnSubscribeForAssetRequestImpl$Data;", "getPayload", "()Lcom/impl/core/backend/modelsRequest/UnSubscribeForAssetRequestImpl$Data;", "Data", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnSubscribeForAssetRequestImpl extends WebSocketRequestImpl<Data> {

    @InterfaceC2691aI1("unsubfor")
    @NotNull
    private final Data payload;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/impl/core/backend/modelsRequest/UnSubscribeForAssetRequestImpl$Data;", "", "", "asset", "Ljava/lang/String;", "getAsset", "()Ljava/lang/String;", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Data {

        @NotNull
        private final String asset;

        public Data(@NotNull String asset) {
            Intrinsics.checkNotNullParameter(asset, "asset");
            this.asset = asset;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.a(this.asset, ((Data) obj).asset);
        }

        public final int hashCode() {
            return this.asset.hashCode();
        }

        @NotNull
        public final String toString() {
            return C1039Gc0.d("Data(asset=", this.asset, ")");
        }
    }

    public UnSubscribeForAssetRequestImpl(@NotNull String asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.payload = new Data(asset);
    }

    @Override // com.impl.core.backend.abstractModels.WebSocketRequestImpl
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Data getPayload() {
        return this.payload;
    }
}

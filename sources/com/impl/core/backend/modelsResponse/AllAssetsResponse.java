package com.impl.core.backend.modelsResponse;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.impl.core.backend.abstractModels.WebSocketResponseAbstractImpl;
import defpackage.C1039Gc0;
import defpackage.C1332Jw;
import defpackage.C1575Mz0;
import defpackage.C2983be;
import defpackage.C5896pG;
import defpackage.C6942uF;
import defpackage.C7152vF;
import defpackage.EF0;
import defpackage.InterfaceC1247It1;
import defpackage.InterfaceC2691aI1;
import defpackage.N90;
import defpackage.XE;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@N90
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\t\n\bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/impl/core/backend/modelsResponse/AllAssetsResponse;", "Lcom/impl/core/backend/abstractModels/WebSocketResponseAbstractImpl;", "LIt1;", "LvF;", "", "Lcom/impl/core/backend/modelsResponse/AllAssetsResponse$AssetDto;", "payload", "Ljava/util/List;", "Companion", "AssetDto", "TimeFrames", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AllAssetsResponse extends WebSocketResponseAbstractImpl implements InterfaceC1247It1<C7152vF> {

    @NotNull
    private static final String CRYPTO_GROUP_NAME = "cryptocurrency";

    @NotNull
    private final List<AssetDto> payload;

    @N90
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/impl/core/backend/modelsResponse/AllAssetsResponse$AssetDto;", "Lcom/impl/core/backend/abstractModels/WebSocketResponseAbstractImpl;", "LIt1;", "LuF;", "", "id", "I", "getId", "()I", "", "symbol", "Ljava/lang/String;", "getSymbol", "()Ljava/lang/String;", "label", "getLabel", "type", "getType", "isOtc", "", "isActiveAsset", "Z", "()Z", "payout", "getPayout", "", "Lcom/impl/core/backend/modelsResponse/AllAssetsResponse$TimeFrames;", "timeFrames", "Ljava/util/List;", "getTimeFrames", "()Ljava/util/List;", "Companion", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AssetDto extends WebSocketResponseAbstractImpl implements InterfaceC1247It1<C6942uF> {

        @NotNull
        public static final String NAME = "updateAssets";

        @InterfaceC2691aI1("id")
        private final int id;

        @InterfaceC2691aI1(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
        private final boolean isActiveAsset;

        @InterfaceC2691aI1("is_otc")
        private final int isOtc;

        @InterfaceC2691aI1("label")
        @NotNull
        private final String label;

        @InterfaceC2691aI1("payout")
        private final int payout;

        @InterfaceC2691aI1("symbol")
        @NotNull
        private final String symbol;

        @InterfaceC2691aI1("timeframes")
        @NotNull
        private final List<TimeFrames> timeFrames;

        @InterfaceC2691aI1("type")
        @NotNull
        private final String type;

        public AssetDto(int i, @NotNull String symbol, @NotNull String label, @NotNull String type, int i2, boolean z, int i3, @NotNull ArrayList timeFrames) {
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(timeFrames, "timeFrames");
            this.id = i;
            this.symbol = symbol;
            this.label = label;
            this.type = type;
            this.isOtc = i2;
            this.isActiveAsset = z;
            this.payout = i3;
            this.timeFrames = timeFrames;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AssetDto)) {
                return false;
            }
            AssetDto assetDto = (AssetDto) obj;
            return this.id == assetDto.id && Intrinsics.a(this.symbol, assetDto.symbol) && Intrinsics.a(this.label, assetDto.label) && Intrinsics.a(this.type, assetDto.type) && this.isOtc == assetDto.isOtc && this.isActiveAsset == assetDto.isActiveAsset && this.payout == assetDto.payout && Intrinsics.a(this.timeFrames, assetDto.timeFrames);
        }

        @Override // defpackage.InterfaceC1247It1
        @NotNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final C6942uF a() {
            int i = this.id;
            String str = this.symbol;
            String str2 = this.label;
            boolean z = this.isActiveAsset;
            C6942uF.a aVar = Intrinsics.a(this.type, AllAssetsResponse.CRYPTO_GROUP_NAME) ? C6942uF.a.d : C6942uF.a.e;
            int i2 = this.payout;
            return new C6942uF(Integer.valueOf(i), str2, str, z ? 1 : 0, z, Integer.valueOf(i2), z, Integer.valueOf(i2), this.timeFrames.contains(new TimeFrames(60)), this.timeFrames.contains(new TimeFrames(300)), this.timeFrames.contains(new TimeFrames(900)), aVar);
        }

        public final int hashCode() {
            return this.timeFrames.hashCode() + EF0.a(this.payout, C2983be.a(EF0.a(this.isOtc, C1039Gc0.b(C1039Gc0.b(C1039Gc0.b(Integer.hashCode(this.id) * 31, 31, this.symbol), 31, this.label), 31, this.type), 31), this.isActiveAsset, 31), 31);
        }

        @NotNull
        public final String toString() {
            int i = this.id;
            String str = this.symbol;
            String str2 = this.label;
            String str3 = this.type;
            int i2 = this.isOtc;
            boolean z = this.isActiveAsset;
            int i3 = this.payout;
            List<TimeFrames> list = this.timeFrames;
            StringBuilder sb = new StringBuilder("AssetDto(id=");
            sb.append(i);
            sb.append(", symbol=");
            sb.append(str);
            sb.append(", label=");
            C5896pG.b(sb, str2, ", type=", str3, ", isOtc=");
            sb.append(i2);
            sb.append(", isActiveAsset=");
            sb.append(z);
            sb.append(", payout=");
            sb.append(i3);
            sb.append(", timeFrames=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/impl/core/backend/modelsResponse/AllAssetsResponse$TimeFrames;", "", "", C1575Mz0.TIME, "I", "getTime", "()I", "CoreBackendImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeFrames {
        private final int time;

        public TimeFrames(int i) {
            this.time = i;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TimeFrames) && this.time == ((TimeFrames) obj).time;
        }

        public final int hashCode() {
            return Integer.hashCode(this.time);
        }

        @NotNull
        public final String toString() {
            return C1332Jw.a(this.time, "TimeFrames(time=", ")");
        }
    }

    public AllAssetsResponse(@NotNull List<AssetDto> payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.payload = payload;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AllAssetsResponse) && Intrinsics.a(this.payload, ((AllAssetsResponse) obj).payload);
    }

    @Override // defpackage.InterfaceC1247It1
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C7152vF a() {
        List<AssetDto> list = this.payload;
        ArrayList arrayList = new ArrayList(XE.m(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AssetDto) it.next()).a());
        }
        return new C7152vF(CollectionsKt.f0(arrayList), new ArrayList());
    }

    public final int hashCode() {
        return this.payload.hashCode();
    }

    @NotNull
    public final String toString() {
        return "AllAssetsResponse(payload=" + this.payload + ")";
    }
}

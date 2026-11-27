package com.base.core.backend.modelsOurSideResponse;

import com.api.core.backend.domain.models.responseModels.CommonRecommendedDeposit;
import com.api.core.backend.domain.models.resultModels.HttpResponse;
import defpackage.InterfaceC1247It1;
import defpackage.PW0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0001\u000bR,\u0010\u0007\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/base/core/backend/modelsOurSideResponse/RecommendedDepositResponse;", "Lcom/api/core/backend/domain/models/resultModels/HttpResponse;", "", "", "", "LIt1;", "Lcom/api/core/backend/domain/models/responseModels/CommonRecommendedDeposit;", "result", "Ljava/util/Map;", "getResult", "()Ljava/util/Map;", "Result", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RecommendedDepositResponse extends HttpResponse<Map<String, ? extends Integer>> implements InterfaceC1247It1<CommonRecommendedDeposit> {

    @Nullable
    private final Map<String, Integer> result;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R'\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/base/core/backend/modelsOurSideResponse/RecommendedDepositResponse$Result;", "", "", "", "", "amounts", "Ljava/util/Map;", "getAmounts", "()Ljava/util/Map;", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result {

        @NotNull
        private final Map<String, Integer> amounts;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && Intrinsics.a(this.amounts, ((Result) obj).amounts);
        }

        public final int hashCode() {
            return this.amounts.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Result(amounts=" + this.amounts + ")";
        }
    }

    @Override // defpackage.InterfaceC1247It1
    public final CommonRecommendedDeposit a() {
        Map mapC = this.result;
        if (mapC == null) {
            mapC = PW0.c();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapC.entrySet()) {
            String str = (String) entry.getKey();
            Integer num = (Integer) entry.getValue();
            if (str != null && num != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new CommonRecommendedDeposit(linkedHashMap);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendedDepositResponse) && Intrinsics.a(this.result, ((RecommendedDepositResponse) obj).result);
    }

    public final int hashCode() {
        Map<String, Integer> map = this.result;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    @NotNull
    public final String toString() {
        return "RecommendedDepositResponse(result=" + this.result + ")";
    }
}

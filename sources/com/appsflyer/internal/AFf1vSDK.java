package com.appsflyer.internal;

import com.appsflyer.share.AFAdRevenueData;
import com.appsflyer.share.AdRevenueScheme;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.WE;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1vSDK extends AFf1tSDK {

    @NotNull
    private final AFh1lSDK v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1vSDK(@NotNull AFh1lSDK aFh1lSDK, @NotNull AFc1bSDK aFc1bSDK) {
        super(aFh1lSDK, aFc1bSDK, null, 4, null);
        Intrinsics.checkNotNullParameter(aFh1lSDK, "");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        this.v = aFh1lSDK;
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void d(@NotNull AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        super.d(aFh1pSDK);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        AFAdRevenueData aFAdRevenueData = this.v.afDebugLog;
        Intrinsics.checkNotNullExpressionValue(aFAdRevenueData, "");
        linkedHashMap.put("monetization_network", aFAdRevenueData.getMonetizationNetwork());
        linkedHashMap.put("event_revenue_currency", aFAdRevenueData.getCurrencyIso4217Code());
        linkedHashMap.put("mediation_network", aFAdRevenueData.getMediationNetwork().getValue());
        linkedHashMap.put("event_revenue", Double.valueOf(aFAdRevenueData.getRevenue()));
        Map<String, Object> map = this.v.AFLoggerLogLevel;
        if (map != null && !map.isEmpty()) {
            List listF = WE.f(AdRevenueScheme.AD_TYPE, AdRevenueScheme.AD_UNIT, "country", AdRevenueScheme.PLACEMENT);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (listF.contains(key)) {
                    linkedHashMap.put(key, value);
                } else {
                    linkedHashMap2.put(key, value);
                }
            }
            linkedHashMap.put("custom_parameters", linkedHashMap2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "adrevenue_sdk");
        linkedHashMap3.put("payload", linkedHashMap);
        Map<String, Object> map2 = aFh1pSDK.d;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        map2.put("ad_network", linkedHashMap3);
    }
}

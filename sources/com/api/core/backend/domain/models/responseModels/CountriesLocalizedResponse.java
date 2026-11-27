package com.api.core.backend.domain.models.responseModels;

import com.api.core.backend.domain.models.resultModels.HttpResponse;
import defpackage.HF;
import defpackage.IF;
import defpackage.InterfaceC2691aI1;
import defpackage.RW0;
import defpackage.XE;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/CountriesLocalizedResponse;", "Lcom/api/core/backend/domain/models/resultModels/HttpResponse;", "Lcom/api/core/backend/domain/models/responseModels/CountriesLocalizedResponse$Countries;", "result", "Lcom/api/core/backend/domain/models/responseModels/CountriesLocalizedResponse$Countries;", "e", "()Lcom/api/core/backend/domain/models/responseModels/CountriesLocalizedResponse$Countries;", "Countries", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CountriesLocalizedResponse extends HttpResponse<Countries> {

    @Nullable
    private final Countries result;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/CountriesLocalizedResponse$Countries;", "", "", "", "countryMap", "Ljava/util/Map;", "getCountryMap", "()Ljava/util/Map;", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Countries {

        @InterfaceC2691aI1("countries")
        @NotNull
        private final Map<String, String> countryMap;

        @NotNull
        public final HF a() {
            List<Pair> listM = RW0.m(this.countryMap);
            ArrayList arrayList = new ArrayList(XE.m(listM, 10));
            for (Pair pair : listM) {
                arrayList.add(new IF((String) pair.d, (String) pair.e));
            }
            return new HF(arrayList);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Countries) && Intrinsics.a(this.countryMap, ((Countries) obj).countryMap);
        }

        public final int hashCode() {
            return this.countryMap.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Countries(countryMap=" + this.countryMap + ")";
        }
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Countries getResult() {
        return this.result;
    }
}

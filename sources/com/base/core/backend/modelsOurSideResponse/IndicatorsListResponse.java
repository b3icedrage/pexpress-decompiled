package com.base.core.backend.modelsOurSideResponse;

import com.api.core.backend.domain.models.resultModels.HttpResponse;
import defpackage.C1039Gc0;
import defpackage.C2983be;
import defpackage.C5491nL;
import defpackage.C5896pG;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/base/core/backend/modelsOurSideResponse/IndicatorsListResponse;", "Lcom/api/core/backend/domain/models/resultModels/HttpResponse;", "", "Lcom/base/core/backend/modelsOurSideResponse/IndicatorsListResponse$IndicatorResponse;", "result", "Ljava/util/List;", "getResult", "()Ljava/util/List;", "IndicatorResponse", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class IndicatorsListResponse extends HttpResponse<List<? extends IndicatorResponse>> {

    @Nullable
    private final List<IndicatorResponse> result;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/base/core/backend/modelsOurSideResponse/IndicatorsListResponse$IndicatorResponse;", "", "", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "description", "getDescription", "key", "getKey", "", "categories", "Ljava/util/List;", "getCategories", "()Ljava/util/List;", "", "activationRequired", "Z", "getActivationRequired", "()Z", "", "priority", "Ljava/lang/Integer;", "getPriority", "()Ljava/lang/Integer;", "CoreBackendBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IndicatorResponse {
        private final boolean activationRequired;

        @NotNull
        private final List<String> categories;

        @NotNull
        private final String description;

        @NotNull
        private final String key;

        @Nullable
        private final Integer priority;

        @NotNull
        private final String title;

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IndicatorResponse)) {
                return false;
            }
            IndicatorResponse indicatorResponse = (IndicatorResponse) obj;
            return Intrinsics.a(this.title, indicatorResponse.title) && Intrinsics.a(this.description, indicatorResponse.description) && Intrinsics.a(this.key, indicatorResponse.key) && Intrinsics.a(this.categories, indicatorResponse.categories) && this.activationRequired == indicatorResponse.activationRequired && Intrinsics.a(this.priority, indicatorResponse.priority);
        }

        public final int hashCode() {
            int iA = C2983be.a(C5491nL.b(C1039Gc0.b(C1039Gc0.b(this.title.hashCode() * 31, 31, this.description), 31, this.key), 31, this.categories), this.activationRequired, 31);
            Integer num = this.priority;
            return iA + (num == null ? 0 : num.hashCode());
        }

        @NotNull
        public final String toString() {
            String str = this.title;
            String str2 = this.description;
            String str3 = this.key;
            List<String> list = this.categories;
            boolean z = this.activationRequired;
            Integer num = this.priority;
            StringBuilder sbA = C5896pG.a("IndicatorResponse(title=", str, ", description=", str2, ", key=");
            sbA.append(str3);
            sbA.append(", categories=");
            sbA.append(list);
            sbA.append(", activationRequired=");
            sbA.append(z);
            sbA.append(", priority=");
            sbA.append(num);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IndicatorsListResponse) && Intrinsics.a(this.result, ((IndicatorsListResponse) obj).result);
    }

    public final int hashCode() {
        List<IndicatorResponse> list = this.result;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public final String toString() {
        return "IndicatorsListResponse(result=" + this.result + ")";
    }
}

package com.api.core.backend.repositories.experiments.models;

import defpackage.C5807oq;
import defpackage.C5896pG;
import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/api/core/backend/repositories/experiments/models/TestingFeaturesParamsResponse;", "", "", "statusCode", "Ljava/lang/Integer;", "getStatusCode", "()Ljava/lang/Integer;", "", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "error", "getError", "group", R51.PUSH_ADDITIONAL_DATA_KEY, "description", "getDescription", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TestingFeaturesParamsResponse {

    @Nullable
    private final String description;

    @Nullable
    private final String error;

    @Nullable
    private final String group;

    @Nullable
    private final String message;

    @Nullable
    private final Integer statusCode;

    public TestingFeaturesParamsResponse() {
        this(31);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getGroup() {
        return this.group;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestingFeaturesParamsResponse)) {
            return false;
        }
        TestingFeaturesParamsResponse testingFeaturesParamsResponse = (TestingFeaturesParamsResponse) obj;
        return Intrinsics.a(this.statusCode, testingFeaturesParamsResponse.statusCode) && Intrinsics.a(this.message, testingFeaturesParamsResponse.message) && Intrinsics.a(this.error, testingFeaturesParamsResponse.error) && Intrinsics.a(this.group, testingFeaturesParamsResponse.group) && Intrinsics.a(this.description, testingFeaturesParamsResponse.description);
    }

    public final int hashCode() {
        Integer num = this.statusCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.error;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.group;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        Integer num = this.statusCode;
        String str = this.message;
        String str2 = this.error;
        String str3 = this.group;
        String str4 = this.description;
        StringBuilder sb = new StringBuilder("TestingFeaturesParamsResponse(statusCode=");
        sb.append(num);
        sb.append(", message=");
        sb.append(str);
        sb.append(", error=");
        C5896pG.b(sb, str2, ", group=", str3, ", description=");
        return C5807oq.b(sb, str4, ")");
    }

    public TestingFeaturesParamsResponse(int i) {
        String str = (i & 8) != 0 ? null : "A";
        this.statusCode = null;
        this.message = null;
        this.error = null;
        this.group = str;
        this.description = null;
    }
}

package com.api.core.backend.domain.models.responseModels;

import com.api.core.backend.domain.models.resultModels.HttpResponse;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.C1039Gc0;
import defpackage.C3116cG;
import defpackage.C5053lG;
import defpackage.C5266mG;
import defpackage.C5653o60;
import defpackage.C5807oq;
import defpackage.C5896pG;
import defpackage.R51;
import defpackage.XE;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0007\b\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/KnowledgeBaseValuesResponse;", "Lcom/api/core/backend/domain/models/resultModels/HttpResponse;", "Lcom/api/core/backend/domain/models/responseModels/KnowledgeBaseValuesResponse$Result;", "result", "Lcom/api/core/backend/domain/models/responseModels/KnowledgeBaseValuesResponse$Result;", "getResult", "()Lcom/api/core/backend/domain/models/responseModels/KnowledgeBaseValuesResponse$Result;", "Result", "CategoryResponse", "QuestionResponse", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class KnowledgeBaseValuesResponse extends HttpResponse<Result> {

    @Nullable
    private final Result result;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/KnowledgeBaseValuesResponse$CategoryResponse;", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Ljava/lang/String;", R51.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/lang/String;", "slug", "b", "Lcom/api/core/backend/domain/models/responseModels/SupportQuestionType;", "type", "Lcom/api/core/backend/domain/models/responseModels/SupportQuestionType;", "c", "()Lcom/api/core/backend/domain/models/responseModels/SupportQuestionType;", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CategoryResponse {

        @NotNull
        private final String name;

        @NotNull
        private final String slug;

        @NotNull
        private final SupportQuestionType type;

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getSlug() {
            return this.slug;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final SupportQuestionType getType() {
            return this.type;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CategoryResponse)) {
                return false;
            }
            CategoryResponse categoryResponse = (CategoryResponse) obj;
            return Intrinsics.a(this.name, categoryResponse.name) && Intrinsics.a(this.slug, categoryResponse.slug) && this.type == categoryResponse.type;
        }

        public final int hashCode() {
            return this.type.hashCode() + C1039Gc0.b(this.name.hashCode() * 31, 31, this.slug);
        }

        @NotNull
        public final String toString() {
            String str = this.name;
            String str2 = this.slug;
            SupportQuestionType supportQuestionType = this.type;
            StringBuilder sbA = C5896pG.a("CategoryResponse(name=", str, ", slug=", str2, ", type=");
            sbA.append(supportQuestionType);
            sbA.append(")");
            return sbA.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/KnowledgeBaseValuesResponse$QuestionResponse;", "", "", "text", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/api/core/backend/domain/models/responseModels/SupportQuestionType;", "type", "Lcom/api/core/backend/domain/models/responseModels/SupportQuestionType;", "c", "()Lcom/api/core/backend/domain/models/responseModels/SupportQuestionType;", "slug", R51.PUSH_ADDITIONAL_DATA_KEY, "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuestionResponse {

        @NotNull
        private final String slug;

        @NotNull
        private final String text;

        @NotNull
        private final SupportQuestionType type;

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getSlug() {
            return this.slug;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final SupportQuestionType getType() {
            return this.type;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuestionResponse)) {
                return false;
            }
            QuestionResponse questionResponse = (QuestionResponse) obj;
            return Intrinsics.a(this.text, questionResponse.text) && this.type == questionResponse.type && Intrinsics.a(this.slug, questionResponse.slug);
        }

        public final int hashCode() {
            return this.slug.hashCode() + ((this.type.hashCode() + (this.text.hashCode() * 31)) * 31);
        }

        @NotNull
        public final String toString() {
            String str = this.text;
            SupportQuestionType supportQuestionType = this.type;
            String str2 = this.slug;
            StringBuilder sb = new StringBuilder("QuestionResponse(text=");
            sb.append(str);
            sb.append(", type=");
            sb.append(supportQuestionType);
            sb.append(", slug=");
            return C5807oq.b(sb, str2, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/KnowledgeBaseValuesResponse$Result;", "", "", "Lcom/api/core/backend/domain/models/responseModels/KnowledgeBaseValuesResponse$QuestionResponse;", "questions", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/api/core/backend/domain/models/responseModels/KnowledgeBaseValuesResponse$CategoryResponse;", "categories", R51.PUSH_ADDITIONAL_DATA_KEY, "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Result {

        @NotNull
        private final List<CategoryResponse> categories;

        @NotNull
        private final List<QuestionResponse> questions;

        @NotNull
        public final List<CategoryResponse> a() {
            return this.categories;
        }

        @NotNull
        public final List<QuestionResponse> b() {
            return this.questions;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return Intrinsics.a(this.questions, result.questions) && Intrinsics.a(this.categories, result.categories);
        }

        public final int hashCode() {
            return this.categories.hashCode() + (this.questions.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "Result(questions=" + this.questions + ", categories=" + this.categories + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [o60] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [o60] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @NotNull
    public final C3116cG e() {
        ?? arrayList;
        ?? arrayList2;
        List<QuestionResponse> listB;
        List<CategoryResponse> listA;
        Result result = this.result;
        if (result == null || (listA = result.a()) == null) {
            arrayList = C5653o60.d;
        } else {
            arrayList = new ArrayList(XE.m(listA, 10));
            for (CategoryResponse categoryResponse : listA) {
                arrayList.add(new C5266mG(categoryResponse.getName(), categoryResponse.getSlug(), categoryResponse.getType()));
            }
        }
        Result result2 = this.result;
        if (result2 == null || (listB = result2.b()) == null) {
            arrayList2 = C5653o60.d;
        } else {
            arrayList2 = new ArrayList(XE.m(listB, 10));
            for (QuestionResponse questionResponse : listB) {
                arrayList2.add(new C5053lG(questionResponse.getText(), questionResponse.getSlug(), questionResponse.getType()));
            }
        }
        return new C3116cG(arrayList, arrayList2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KnowledgeBaseValuesResponse) && Intrinsics.a(this.result, ((KnowledgeBaseValuesResponse) obj).result);
    }

    public final int hashCode() {
        Result result = this.result;
        if (result == null) {
            return 0;
        }
        return result.hashCode();
    }

    @NotNull
    public final String toString() {
        return "KnowledgeBaseValuesResponse(result=" + this.result + ")";
    }
}

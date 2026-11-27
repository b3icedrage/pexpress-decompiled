package com.api.core.backend.domain.models.responseModels;

import com.api.core.backend.domain.models.resultModels.CommonError;
import com.api.core.backend.domain.models.resultModels.HttpResponse;
import defpackage.C1039Gc0;
import defpackage.R51;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/DefaultResponse;", "Lcom/api/core/backend/domain/models/resultModels/HttpResponse;", "Lcom/api/core/backend/domain/models/responseModels/DefaultResponse$Message;", "result", "Lcom/api/core/backend/domain/models/responseModels/DefaultResponse$Message;", "getResult", "()Lcom/api/core/backend/domain/models/responseModels/DefaultResponse$Message;", "Message", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DefaultResponse extends HttpResponse<Message> {

    @Nullable
    private final Message result;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/api/core/backend/domain/models/responseModels/DefaultResponse$Message;", "", "", "details", "Ljava/lang/String;", R51.PUSH_ADDITIONAL_DATA_KEY, "()Ljava/lang/String;", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Message {

        @Nullable
        private final String details;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDetails() {
            return this.details;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Message) && Intrinsics.a(this.details, ((Message) obj).details);
        }

        public final int hashCode() {
            String str = this.details;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            return C1039Gc0.d("Message(details=", this.details, ")");
        }
    }

    @NotNull
    public final CommonDefaultResponse e() {
        String status;
        Message message = this.result;
        if ((message == null || (status = message.getDetails()) == null) && (status = getStatus()) == null) {
            status = "";
        }
        Integer code = getCode();
        return new CommonDefaultResponse(status, code != null ? code.intValue() : CommonError.Codes.UnexpectedError.getValue());
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultResponse) && Intrinsics.a(this.result, ((DefaultResponse) obj).result);
    }

    public final int hashCode() {
        Message message = this.result;
        if (message == null) {
            return 0;
        }
        return message.hashCode();
    }

    @NotNull
    public final String toString() {
        return "DefaultResponse(result=" + this.result + ")";
    }
}

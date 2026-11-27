package com.api.core.backend.domain.models.requestModels;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/api/core/backend/domain/models/requestModels/CaptchaDestination;", "", "Registration", "Login", "RemindPass", "SmsSend", "Lcom/api/core/backend/domain/models/requestModels/CaptchaDestination$Login;", "Lcom/api/core/backend/domain/models/requestModels/CaptchaDestination$Registration;", "Lcom/api/core/backend/domain/models/requestModels/CaptchaDestination$RemindPass;", "Lcom/api/core/backend/domain/models/requestModels/CaptchaDestination$SmsSend;", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface CaptchaDestination {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/api/core/backend/domain/models/requestModels/CaptchaDestination$Login;", "Lcom/api/core/backend/domain/models/requestModels/CaptchaDestination;", "", "isCaptchaRequired", "Z", "b", "()Z", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Login implements CaptchaDestination {
        private final boolean isCaptchaRequired;

        public Login() {
            this(0);
        }

        @Override // com.api.core.backend.domain.models.requestModels.CaptchaDestination
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsCaptchaRequired() {
            return this.isCaptchaRequired;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Login) && this.isCaptchaRequired == ((Login) obj).isCaptchaRequired;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isCaptchaRequired);
        }

        @NotNull
        public final String toString() {
            return "Login(isCaptchaRequired=" + this.isCaptchaRequired + ")";
        }

        public Login(int i) {
            this.isCaptchaRequired = true;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/api/core/backend/domain/models/requestModels/CaptchaDestination$Registration;", "Lcom/api/core/backend/domain/models/requestModels/CaptchaDestination;", "", "isCaptchaRequired", "Z", "b", "()Z", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Registration implements CaptchaDestination {
        private final boolean isCaptchaRequired;

        public Registration() {
            this(0);
        }

        @Override // com.api.core.backend.domain.models.requestModels.CaptchaDestination
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsCaptchaRequired() {
            return this.isCaptchaRequired;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Registration) && this.isCaptchaRequired == ((Registration) obj).isCaptchaRequired;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isCaptchaRequired);
        }

        @NotNull
        public final String toString() {
            return "Registration(isCaptchaRequired=" + this.isCaptchaRequired + ")";
        }

        public Registration(int i) {
            this.isCaptchaRequired = true;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/api/core/backend/domain/models/requestModels/CaptchaDestination$RemindPass;", "Lcom/api/core/backend/domain/models/requestModels/CaptchaDestination;", "", "isCaptchaRequired", "Z", "b", "()Z", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemindPass implements CaptchaDestination {
        private final boolean isCaptchaRequired;

        public RemindPass() {
            this(0);
        }

        @Override // com.api.core.backend.domain.models.requestModels.CaptchaDestination
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsCaptchaRequired() {
            return this.isCaptchaRequired;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemindPass) && this.isCaptchaRequired == ((RemindPass) obj).isCaptchaRequired;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isCaptchaRequired);
        }

        @NotNull
        public final String toString() {
            return "RemindPass(isCaptchaRequired=" + this.isCaptchaRequired + ")";
        }

        public RemindPass(int i) {
            this.isCaptchaRequired = true;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/api/core/backend/domain/models/requestModels/CaptchaDestination$SmsSend;", "Lcom/api/core/backend/domain/models/requestModels/CaptchaDestination;", "", "isCaptchaRequired", "Z", "b", "()Z", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SmsSend implements CaptchaDestination {
        private final boolean isCaptchaRequired = true;

        @Override // com.api.core.backend.domain.models.requestModels.CaptchaDestination
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsCaptchaRequired() {
            return this.isCaptchaRequired;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SmsSend) && this.isCaptchaRequired == ((SmsSend) obj).isCaptchaRequired;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isCaptchaRequired);
        }

        @NotNull
        public final String toString() {
            return "SmsSend(isCaptchaRequired=" + this.isCaptchaRequired + ")";
        }
    }

    /* JADX INFO: renamed from: b */
    boolean getIsCaptchaRequired();
}

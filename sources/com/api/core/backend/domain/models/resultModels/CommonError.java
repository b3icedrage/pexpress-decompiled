package com.api.core.backend.domain.models.resultModels;

import com.api.core.backend.domain.models.requestModels.DuoAuthType;
import com.api.core.backend.domain.models.responseModels.CommonDuoAuthLoginResponse;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.onesignal.core.activities.PermissionsActivity;
import defpackage.C1952Ru;
import defpackage.C2017Sp1;
import defpackage.C2943bS;
import defpackage.C4175hJ0;
import defpackage.C4385iJ0;
import defpackage.C4643jJ0;
import defpackage.C7175vM1;
import defpackage.InterfaceC4346i70;
import defpackage.PW0;
import defpackage.RI0;
import defpackage.VE;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b'\b\u0016\u0018\u0000 =2\u00020\u0001:!\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u001d\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006?"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError;", "", "text", "", "code", "", "platformCode", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getCode", "()I", "getPlatformCode", "setPlatformCode", "cause", "", "getCause", "()Ljava/lang/Throwable;", "setCause", "(Ljava/lang/Throwable;)V", "http", "", "getHttp", "()Ljava/util/Map;", "setHttp", "(Ljava/util/Map;)V", "toString", "OtherError", "ExperimentError", "VPNError", "RestrictedCountry", "UserNotInDatabase", "UserNotInPlatformDatabase", "ConfigLocked", "NotAuthenticated", "EmailAlreadyRegistered", "ValidationError", "BadRequest", "UserAlreadyRegistered", "NotWebSocketConnection", "InvalidEmail", "IncorrectCredentials", "NoInternet", "CurrentEmail", "SessionMissing", "OurServerError", "TimeoutException", "DuoAuthLogin", "DuoAuthCanceled", "DuoAuthBlocked", "DuoAuthInvalidCode", "TokenError", "WrongCaptcha", "TooManyRequests", "EmailNotExists", "NotImplemented", "RecoveryAlreadySent", "ErrorWithRef", "Companion", "Codes", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class CommonError {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private transient Throwable cause;
    private final int code;

    @NotNull
    private transient Map<String, ? extends Object> http;

    @NotNull
    private String platformCode;

    @NotNull
    private String text;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$BadRequest;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BadRequest extends CommonError {
        public BadRequest() {
            super("Bad request", Codes.BadRequest.getValue(), null, 4, null);
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v25 com.api.core.backend.domain.models.resultModels.CommonError$Codes[], still in use, count: 1, list:
      (r0v25 com.api.core.backend.domain.models.resultModels.CommonError$Codes[]) from 0x0177: INVOKE (r0v25 com.api.core.backend.domain.models.resultModels.CommonError$Codes[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m), WRAPPED] (LINE:376)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$Codes;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "b", "()I", "UnexpectedError", "BadRequest", "NotAuthenticated", "RestrictedCountry", "UserAlreadyRegistered", "ConfigLocked", "UserNotInDatabase", "UserNotInPlatformDatabase", "ValidationError", "EmailAlreadyRegistered", "ErrorTooManyRequests", "ErrorEmailNotExists", "NotInternet", "NotWebSocketConnection", "InvalidEmail", "IncorrectCredentials", "CurrentEmail", "OurServerError", "TimeoutException", "DuoAuthError", "VPN", "WrongCaptcha", "RecoveryAlreadySent", "IncorrectAuthCode", "SessionMissing", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Codes {
        UnexpectedError(123),
        BadRequest(400),
        NotAuthenticated(401),
        RestrictedCountry(403),
        UserAlreadyRegistered(409),
        ConfigLocked(410),
        UserNotInDatabase(415),
        UserNotInPlatformDatabase(416),
        ValidationError(422),
        EmailAlreadyRegistered(498),
        ErrorTooManyRequests(499),
        ErrorEmailNotExists(PermissionsActivity.DELAY_TIME_CALLBACK_CALL),
        NotInternet(502),
        NotWebSocketConnection(504),
        InvalidEmail(505),
        IncorrectCredentials(506),
        CurrentEmail(601),
        OurServerError(602),
        TimeoutException(603),
        DuoAuthError(604),
        VPN(666),
        WrongCaptcha(605),
        RecoveryAlreadySent(607),
        IncorrectAuthCode(608),
        SessionMissing(609);

        private static final /* synthetic */ InterfaceC4346i70 $ENTRIES;
        private final int value;

        static {
            $ENTRIES = C1952Ru.i(codesArr);
        }

        public Codes(int i) {
            super(str, i);
            this.value = i;
        }

        public static Codes valueOf(String str) {
            return (Codes) Enum.valueOf(Codes.class, str);
        }

        public static Codes[] values() {
            return (Codes[]) $VALUES.clone();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$Companion;", "", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public static CommonError a(int i, @NotNull String text, @Nullable String str) {
            ArrayList arrayList;
            Object next;
            Intrinsics.checkNotNullParameter(text, "text");
            Object objA = null;
            try {
                Collection<RI0<?>> collectionE = C2017Sp1.a.b(CommonError.class).e();
                arrayList = new ArrayList();
                for (Object obj : collectionE) {
                    CommonError.INSTANCE.getClass();
                    if (c((RI0) obj)) {
                        arrayList.add(obj);
                    }
                }
            } catch (Exception unused) {
                arrayList = null;
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Object objA2 = C4643jJ0.a((RI0) next);
                    if ((objA2 instanceof CommonError) && ((CommonError) objA2).getCode() == i) {
                        break;
                    }
                }
                RI0 ri0 = (RI0) next;
                if (ri0 != null) {
                    objA = C4643jJ0.a(ri0);
                }
            }
            CommonError otherError = (CommonError) objA;
            if (otherError == null) {
                otherError = new OtherError(text, i);
            }
            if (text.length() > 0) {
                otherError.setText(text);
            }
            if (str != null && str.length() != 0) {
                otherError.setPlatformCode(str);
            }
            return otherError;
        }

        public static /* synthetic */ CommonError b(Companion companion, int i, String str, String str2, int i2) {
            if ((i2 & 2) != 0) {
                str = "";
            }
            if ((i2 & 4) != 0) {
                str2 = "";
            }
            companion.getClass();
            return a(i, str, str2);
        }

        public static boolean c(RI0 ri0) {
            if (!ri0.b()) {
                return false;
            }
            RI0 base = C2017Sp1.a.b(CommonError.class);
            Intrinsics.checkNotNullParameter(ri0, "<this>");
            Intrinsics.checkNotNullParameter(base, "base");
            return ri0.equals(base) || C2943bS.d(VE.c(ri0), new C7175vM1(C4385iJ0.l), new C4175hJ0(base, 0)).booleanValue();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$ConfigLocked;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ConfigLocked extends CommonError {
        public ConfigLocked() {
            super("App locked for current user", Codes.ConfigLocked.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$CurrentEmail;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CurrentEmail extends CommonError {
        public CurrentEmail() {
            super("Current email was typed", Codes.CurrentEmail.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$DuoAuthBlocked;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DuoAuthBlocked extends CommonError {
        public DuoAuthBlocked() {
            super("Duo auth is not available", Codes.DuoAuthError.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$DuoAuthCanceled;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DuoAuthCanceled extends CommonError {
        public DuoAuthCanceled() {
            super("Duo auth canceled", Codes.DuoAuthError.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$DuoAuthInvalidCode;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DuoAuthInvalidCode extends CommonError {
        public DuoAuthInvalidCode() {
            super("Duo auth code is invalid", Codes.IncorrectAuthCode.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$DuoAuthLogin;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", Payload.RESPONSE, "Lcom/api/core/backend/domain/models/responseModels/CommonDuoAuthLoginResponse;", "<init>", "(Lcom/api/core/backend/domain/models/responseModels/CommonDuoAuthLoginResponse;)V", "getResponse", "()Lcom/api/core/backend/domain/models/responseModels/CommonDuoAuthLoginResponse;", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DuoAuthLogin extends CommonError {

        @NotNull
        private final CommonDuoAuthLoginResponse response;

        /* JADX WARN: Multi-variable type inference failed */
        public DuoAuthLogin() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final CommonDuoAuthLoginResponse getResponse() {
            return this.response;
        }

        public /* synthetic */ DuoAuthLogin(CommonDuoAuthLoginResponse commonDuoAuthLoginResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new CommonDuoAuthLoginResponse("", DuoAuthType.NONE) : commonDuoAuthLoginResponse);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DuoAuthLogin(@NotNull CommonDuoAuthLoginResponse response) {
            super("Duo auth required", Codes.DuoAuthError.getValue(), null, 4, null);
            Intrinsics.checkNotNullParameter(response, "response");
            this.response = response;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$EmailAlreadyRegistered;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EmailAlreadyRegistered extends CommonError {
        public EmailAlreadyRegistered() {
            super("Email already registered", Codes.EmailAlreadyRegistered.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$EmailNotExists;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EmailNotExists extends CommonError {
        public EmailNotExists() {
            super("Email not exists", Codes.ErrorEmailNotExists.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$ExperimentError;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "text", "", "code", "", "<init>", "(Ljava/lang/String;I)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getCode", "()I", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ExperimentError extends CommonError {
        private final int code;

        @NotNull
        private String text;

        /* JADX WARN: Multi-variable type inference failed */
        public ExperimentError() {
            this(null, 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.api.core.backend.domain.models.resultModels.CommonError
        public int getCode() {
            return this.code;
        }

        @Override // com.api.core.backend.domain.models.resultModels.CommonError
        @NotNull
        public String getText() {
            return this.text;
        }

        @Override // com.api.core.backend.domain.models.resultModels.CommonError
        public void setText(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.text = str;
        }

        public /* synthetic */ ExperimentError(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "Experiment request not implemented" : str, (i2 & 2) != 0 ? Codes.UnexpectedError.getValue() : i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExperimentError(@NotNull String text, int i) {
            super(text, i, null, 4, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.code = i;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$IncorrectCredentials;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IncorrectCredentials extends CommonError {
        public IncorrectCredentials() {
            super("Incorrect email or password", Codes.IncorrectCredentials.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$InvalidEmail;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InvalidEmail extends CommonError {
        public InvalidEmail() {
            super("Email not valid", Codes.InvalidEmail.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$NoInternet;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NoInternet extends CommonError {
        public NoInternet() {
            super("No internet connection", Codes.NotInternet.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$NotAuthenticated;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotAuthenticated extends CommonError {
        public NotAuthenticated() {
            super("Not authenticated", Codes.NotAuthenticated.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$NotImplemented;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotImplemented extends CommonError {
        public NotImplemented() {
            super("This API method is not implemented", Codes.UnexpectedError.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$NotWebSocketConnection;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotWebSocketConnection extends CommonError {
        public NotWebSocketConnection() {
            super("No WebSocket connection", Codes.NotWebSocketConnection.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$OtherError;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "text", "", "code", "", "<init>", "(Ljava/lang/String;I)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getCode", "()I", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OtherError extends CommonError {
        private final int code;

        @NotNull
        private String text;

        /* JADX WARN: Multi-variable type inference failed */
        public OtherError() {
            this(null, 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.api.core.backend.domain.models.resultModels.CommonError
        public int getCode() {
            return this.code;
        }

        @Override // com.api.core.backend.domain.models.resultModels.CommonError
        @NotNull
        public String getText() {
            return this.text;
        }

        @Override // com.api.core.backend.domain.models.resultModels.CommonError
        public void setText(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.text = str;
        }

        public /* synthetic */ OtherError(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? Codes.UnexpectedError.getValue() : i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtherError(@NotNull String text, int i) {
            super(text, i, null, 4, null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.code = i;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$OurServerError;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OurServerError extends CommonError {
        public OurServerError() {
            super("Our server error", Codes.OurServerError.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$RecoveryAlreadySent;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RecoveryAlreadySent extends CommonError {
        public RecoveryAlreadySent() {
            super("Password recovery email has been already sent", Codes.RecoveryAlreadySent.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$RestrictedCountry;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RestrictedCountry extends CommonError {
        public RestrictedCountry() {
            super("Restricted country", Codes.RestrictedCountry.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$SessionMissing;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SessionMissing extends CommonError {
        public SessionMissing() {
            super("Session missing", Codes.SessionMissing.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$TimeoutException;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TimeoutException extends CommonError {
        public TimeoutException() {
            super("Timeout response", Codes.TimeoutException.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$TokenError;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "error", "<init>", "(Lcom/api/core/backend/domain/models/resultModels/CommonError;)V", "getError", "()Lcom/api/core/backend/domain/models/resultModels/CommonError;", "setError", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TokenError extends CommonError {

        @NotNull
        private CommonError error;

        /* JADX WARN: Multi-variable type inference failed */
        public TokenError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @NotNull
        public final CommonError getError() {
            return this.error;
        }

        public final void setError(@NotNull CommonError commonError) {
            Intrinsics.checkNotNullParameter(commonError, "<set-?>");
            this.error = commonError;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TokenError(@NotNull CommonError error) {
            super("", -1, null, 4, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ TokenError(CommonError commonError, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 1) != 0) {
                commonError = new OtherError(null, 0, 3, 0 == true ? 1 : 0);
            }
            this(commonError);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$TooManyRequests;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TooManyRequests extends CommonError {
        public TooManyRequests() {
            super("Too Many Requests", Codes.ErrorTooManyRequests.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$UserAlreadyRegistered;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UserAlreadyRegistered extends CommonError {
        public UserAlreadyRegistered() {
            super("User already registered", Codes.UserAlreadyRegistered.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$UserNotInDatabase;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UserNotInDatabase extends CommonError {
        public UserNotInDatabase() {
            super("User is not in database", Codes.UserNotInDatabase.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$UserNotInPlatformDatabase;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UserNotInPlatformDatabase extends CommonError {
        public UserNotInPlatformDatabase() {
            super("User is not in platform db", Codes.UserNotInPlatformDatabase.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$VPNError;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class VPNError extends CommonError {
        public VPNError() {
            super("VPN", Codes.VPN.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$ValidationError;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ValidationError extends CommonError {
        public ValidationError() {
            super("Validation Error", Codes.ValidationError.getValue(), null, 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$WrongCaptcha;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "<init>", "()V", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WrongCaptcha extends CommonError {
        public WrongCaptcha() {
            super("Incorrect captcha", Codes.WrongCaptcha.getValue(), null, 4, null);
        }
    }

    public CommonError(@NotNull String text, int i, @NotNull String platformCode) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(platformCode, "platformCode");
        this.text = text;
        this.code = i;
        this.platformCode = platformCode;
        this.http = PW0.c();
    }

    @Nullable
    public final Throwable getCause() {
        return this.cause;
    }

    public int getCode() {
        return this.code;
    }

    @NotNull
    public final Map<String, Object> getHttp() {
        return this.http;
    }

    @NotNull
    public String getPlatformCode() {
        return this.platformCode;
    }

    @NotNull
    public String getText() {
        return this.text;
    }

    public final void setCause(@Nullable Throwable th) {
        this.cause = th;
    }

    public final void setHttp(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.http = map;
    }

    public void setPlatformCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.platformCode = str;
    }

    public void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    @NotNull
    public String toString() {
        return "text = " + getText() + ", code = " + getCode() + ", platform code = " + getPlatformCode();
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/api/core/backend/domain/models/resultModels/CommonError$ErrorWithRef;", "Lcom/api/core/backend/domain/models/resultModels/CommonError;", "text", "", "code", "", "ref", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "()V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getCode", "()I", "getRef", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ErrorWithRef extends CommonError {
        private final int code;

        @NotNull
        private final String ref;

        @NotNull
        private String text;

        public /* synthetic */ ErrorWithRef(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? Codes.UnexpectedError.getValue() : i, str2);
        }

        @Override // com.api.core.backend.domain.models.resultModels.CommonError
        public int getCode() {
            return this.code;
        }

        @NotNull
        public final String getRef() {
            return this.ref;
        }

        @Override // com.api.core.backend.domain.models.resultModels.CommonError
        @NotNull
        public String getText() {
            return this.text;
        }

        @Override // com.api.core.backend.domain.models.resultModels.CommonError
        public void setText(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.text = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorWithRef(@NotNull String text, int i, @NotNull String ref) {
            super(text, i, null, 4, null);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(ref, "ref");
            this.text = text;
            this.code = i;
            this.ref = ref;
        }

        public ErrorWithRef() {
            this("", 0, "", 2, null);
        }
    }

    public /* synthetic */ CommonError(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? "" : str2);
    }
}

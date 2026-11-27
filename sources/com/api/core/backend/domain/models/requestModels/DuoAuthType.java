package com.api.core.backend.domain.models.requestModels;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.C1952Ru;
import defpackage.InterfaceC4346i70;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.api.core.backend.domain.models.requestModels.DuoAuthType[], still in use, count: 1, list:
  (r0v1 com.api.core.backend.domain.models.requestModels.DuoAuthType[]) from 0x004c: INVOKE (r0v1 com.api.core.backend.domain.models.requestModels.DuoAuthType[]) STATIC call: Ru.i(java.lang.Enum[]):k70 A[MD:(java.lang.Enum[]):k70 (m), WRAPPED] (LINE:77)
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
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/api/core/backend/domain/models/requestModels/DuoAuthType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "NONE", "GOOGLE_AUTH", "SMS", "EMAIL", "PUSH", "FB_MESSENGER", "CoreBackendApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DuoAuthType {
    NONE("None"),
    GOOGLE_AUTH("Google Authenticator"),
    SMS("SMS"),
    EMAIL("Email"),
    PUSH("Push"),
    FB_MESSENGER("Facebook Messenger");

    private static final /* synthetic */ InterfaceC4346i70 $ENTRIES;

    @NotNull
    private final String value;

    static {
        $ENTRIES = C1952Ru.i(duoAuthTypeArr);
    }

    public DuoAuthType(String str) {
        super(str, i);
        this.value = str;
    }

    public static DuoAuthType valueOf(String str) {
        return (DuoAuthType) Enum.valueOf(DuoAuthType.class, str);
    }

    public static DuoAuthType[] values() {
        return (DuoAuthType[]) $VALUES.clone();
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}

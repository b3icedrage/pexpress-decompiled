package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: wI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tR$\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0017\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R$\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R(\u0010\u001f\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\"\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR$\u0010%\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR$\u0010(\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\r\"\u0004\b'\u0010\u000fR$\u0010+\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\r\"\u0004\b*\u0010\u000fR$\u0010.\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000fR$\u00104\u001a\u00020/2\u0006\u0010\u000b\u001a\u00020/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00107\u001a\u00020/2\u0006\u0010\u000b\u001a\u00020/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00101\"\u0004\b6\u00103R$\u0010:\u001a\u00020/2\u0006\u0010\u000b\u001a\u00020/8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b8\u00101\"\u0004\b9\u00103R$\u0010@\u001a\u00020;2\u0006\u0010\u000b\u001a\u00020;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010C\u001a\u00020;2\u0006\u0010\u000b\u001a\u00020;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R$\u0010F\u001a\u00020;2\u0006\u0010\u000b\u001a\u00020;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bD\u0010=\"\u0004\bE\u0010?R$\u0010I\u001a\u00020;2\u0006\u0010\u000b\u001a\u00020;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010=\"\u0004\bH\u0010?R$\u0010L\u001a\u00020;2\u0006\u0010\u000b\u001a\u00020;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bJ\u0010=\"\u0004\bK\u0010?R$\u0010O\u001a\u00020;2\u0006\u0010\u000b\u001a\u00020;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bM\u0010=\"\u0004\bN\u0010?R$\u0010R\u001a\u00020;2\u0006\u0010\u000b\u001a\u00020;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010=\"\u0004\bQ\u0010?R$\u0010U\u001a\u00020;2\u0006\u0010\u000b\u001a\u00020;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010=\"\u0004\bT\u0010?R$\u0010X\u001a\u00020;2\u0006\u0010\u000b\u001a\u00020;8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010=\"\u0004\bW\u0010?R(\u0010[\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010\u0011\"\u0004\bZ\u0010\u0013R$\u0010^\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010\r\"\u0004\b]\u0010\u000fR$\u0010a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010\r\"\u0004\b`\u0010\u000fR(\u0010g\u001a\u0004\u0018\u00010b2\b\u0010\u000b\u001a\u0004\u0018\u00010b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010j\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010\r\"\u0004\bi\u0010\u000fR$\u0010m\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bk\u0010\r\"\u0004\bl\u0010\u000fR$\u0010p\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bn\u0010\r\"\u0004\bo\u0010\u000fR$\u0010s\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bq\u0010\r\"\u0004\br\u0010\u000fR\u0011\u0010w\u001a\u00020t8F¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0011\u0010{\u001a\u00020x8F¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006|"}, d2 = {"LwI;", "LD01;", "<init>", "()V", "", "property", "Lorg/json/JSONObject;", "jsonObject", "createModelForProperty", "(Ljava/lang/String;Lorg/json/JSONObject;)LD01;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "isInitializedWithRemote", "()Z", "setInitializedWithRemote", "(Z)V", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "appId", "getPushSubscriptionId", "setPushSubscriptionId", "pushSubscriptionId", "getApiUrl", "setApiUrl", "apiUrl", "getConsentRequired", "()Ljava/lang/Boolean;", "setConsentRequired", "(Ljava/lang/Boolean;)V", "consentRequired", "getConsentGiven", "setConsentGiven", "consentGiven", "getLocationShared", "setLocationShared", "locationShared", "getDisableGMSMissingPrompt", "setDisableGMSMissingPrompt", "disableGMSMissingPrompt", "getUserRejectedGMSUpdate", "setUserRejectedGMSUpdate", "userRejectedGMSUpdate", "getUnsubscribeWhenNotificationsDisabled", "setUnsubscribeWhenNotificationsDisabled", "unsubscribeWhenNotificationsDisabled", "", "getHttpTimeout", "()I", "setHttpTimeout", "(I)V", "httpTimeout", "getHttpGetTimeout", "setHttpGetTimeout", "httpGetTimeout", "getHttpRetryAfterParseFailFallback", "setHttpRetryAfterParseFailFallback", "httpRetryAfterParseFailFallback", "", "getSessionFocusTimeout", "()J", "setSessionFocusTimeout", "(J)V", "sessionFocusTimeout", "getOpRepoExecutionInterval", "setOpRepoExecutionInterval", "opRepoExecutionInterval", "getOpRepoPostWakeDelay", "setOpRepoPostWakeDelay", "opRepoPostWakeDelay", "getOpRepoPostCreateDelay", "setOpRepoPostCreateDelay", "opRepoPostCreateDelay", "getOpRepoPostCreateRetryUpTo", "setOpRepoPostCreateRetryUpTo", "opRepoPostCreateRetryUpTo", "getOpRepoDefaultFailRetryBackoff", "setOpRepoDefaultFailRetryBackoff", "opRepoDefaultFailRetryBackoff", "getFetchIAMMinInterval", "setFetchIAMMinInterval", "fetchIAMMinInterval", "getForegroundFetchNotificationPermissionInterval", "setForegroundFetchNotificationPermissionInterval", "foregroundFetchNotificationPermissionInterval", "getBackgroundFetchNotificationPermissionInterval", "setBackgroundFetchNotificationPermissionInterval", "backgroundFetchNotificationPermissionInterval", "getGoogleProjectNumber", "setGoogleProjectNumber", "googleProjectNumber", "getEnterprise", "setEnterprise", "enterprise", "getUseIdentityVerification", "setUseIdentityVerification", "useIdentityVerification", "Lorg/json/JSONArray;", "getNotificationChannels", "()Lorg/json/JSONArray;", "setNotificationChannels", "(Lorg/json/JSONArray;)V", "notificationChannels", "getFirebaseAnalytics", "setFirebaseAnalytics", "firebaseAnalytics", "getRestoreTTLFilter", "setRestoreTTLFilter", "restoreTTLFilter", "getReceiveReceiptEnabled", "setReceiveReceiptEnabled", "receiveReceiptEnabled", "getClearGroupOnSummaryClick", "setClearGroupOnSummaryClick", "clearGroupOnSummaryClick", "LLz0;", "getInfluenceParams", "()LLz0;", "influenceParams", "LZa0;", "getFcmParams", "()LZa0;", "fcmParams", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C7371wI extends D01 {

    /* JADX INFO: renamed from: wI$A */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class A extends ML0 implements Function0<Boolean> {
        public static final A INSTANCE = new A();

        public A() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: wI$a, reason: case insensitive filesystem */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C7372a extends ML0 implements Function0<String> {
        public static final C7372a INSTANCE = new C7372a();

        public C7372a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "https://api.onesignal.com/";
        }
    }

    /* JADX INFO: renamed from: wI$b */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends ML0 implements Function0<Long> {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            return 86400000L;
        }
    }

    /* JADX INFO: renamed from: wI$c */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends ML0 implements Function0<Boolean> {
        public static final c INSTANCE = new c();

        public c() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: wI$d */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends ML0 implements Function0<Boolean> {
        public static final d INSTANCE = new d();

        public d() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: wI$e */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class e extends ML0 implements Function0<Boolean> {
        public static final e INSTANCE = new e();

        public e() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: wI$f */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class f extends ML0 implements Function0<Object> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Object invoke() {
            return new C2547Za0(C7371wI.this, "fcmParams");
        }
    }

    /* JADX INFO: renamed from: wI$g */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class g extends ML0 implements Function0<Long> {
        public static final g INSTANCE = new g();

        public g() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            return 30000L;
        }
    }

    /* JADX INFO: renamed from: wI$h */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class h extends ML0 implements Function0<Boolean> {
        public static final h INSTANCE = new h();

        public h() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: wI$i */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class i extends ML0 implements Function0<Long> {
        public static final i INSTANCE = new i();

        public i() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            return 1000L;
        }
    }

    /* JADX INFO: renamed from: wI$j */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class j extends ML0 implements Function0<Integer> {
        public static final j INSTANCE = new j();

        public j() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
            return 60000;
        }
    }

    /* JADX INFO: renamed from: wI$k */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class k extends ML0 implements Function0<Integer> {
        public static final k INSTANCE = new k();

        public k() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
            return 60;
        }
    }

    /* JADX INFO: renamed from: wI$l */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class l extends ML0 implements Function0<Integer> {
        public static final l INSTANCE = new l();

        public l() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
            return 120000;
        }
    }

    /* JADX INFO: renamed from: wI$m */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class m extends ML0 implements Function0<Object> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Object invoke() {
            return new C1497Lz0(C7371wI.this, "influenceParams");
        }
    }

    /* JADX INFO: renamed from: wI$n */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class n extends ML0 implements Function0<Boolean> {
        public static final n INSTANCE = new n();

        public n() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: wI$o */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class o extends ML0 implements Function0<Boolean> {
        public static final o INSTANCE = new o();

        public o() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: wI$p */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class p extends ML0 implements Function0<String> {
        public static final p INSTANCE = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return null;
        }
    }

    /* JADX INFO: renamed from: wI$q */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class q extends ML0 implements Function0<Long> {
        public static final q INSTANCE = new q();

        public q() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            return 15000L;
        }
    }

    /* JADX INFO: renamed from: wI$r */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class r extends ML0 implements Function0<Long> {
        public static final r INSTANCE = new r();

        public r() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            return 5000L;
        }
    }

    /* JADX INFO: renamed from: wI$s */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class s extends ML0 implements Function0<Long> {
        public static final s INSTANCE = new s();

        public s() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            return 5000L;
        }
    }

    /* JADX INFO: renamed from: wI$t */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class t extends ML0 implements Function0<Long> {
        public static final t INSTANCE = new t();

        public t() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            return 60000L;
        }
    }

    /* JADX INFO: renamed from: wI$u */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class u extends ML0 implements Function0<Long> {
        public static final u INSTANCE = new u();

        public u() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            return 200L;
        }
    }

    /* JADX INFO: renamed from: wI$v */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class v extends ML0 implements Function0<Boolean> {
        public static final v INSTANCE = new v();

        public v() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: wI$w */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class w extends ML0 implements Function0<Boolean> {
        public static final w INSTANCE = new w();

        public w() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: wI$x */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class x extends ML0 implements Function0<Long> {
        public static final x INSTANCE = new x();

        public x() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Long invoke() {
            return 30000L;
        }
    }

    /* JADX INFO: renamed from: wI$y */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class y extends ML0 implements Function0<Boolean> {
        public static final y INSTANCE = new y();

        public y() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: wI$z */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class z extends ML0 implements Function0<Boolean> {
        public static final z INSTANCE = new z();

        public z() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public C7371wI() {
        super(null, null, 3, null);
    }

    @Override // defpackage.D01
    @Nullable
    public D01 createModelForProperty(@NotNull String property, @NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        if (Intrinsics.a(property, "influenceParams")) {
            C1497Lz0 c1497Lz0 = new C1497Lz0(this, "influenceParams");
            c1497Lz0.initializeFromJson(jsonObject);
            return c1497Lz0;
        }
        if (!Intrinsics.a(property, "fcmParams")) {
            return null;
        }
        C2547Za0 c2547Za0 = new C2547Za0(this, "influenceParams");
        c2547Za0.initializeFromJson(jsonObject);
        return c2547Za0;
    }

    @NotNull
    public final String getApiUrl() {
        return getStringProperty("apiUrl", C7372a.INSTANCE);
    }

    @NotNull
    public final String getAppId() {
        return D01.getStringProperty$default(this, "appId", null, 2, null);
    }

    public final long getBackgroundFetchNotificationPermissionInterval() {
        return getLongProperty("backgroundFetchNotificationPermissionInterval", b.INSTANCE);
    }

    public final boolean getClearGroupOnSummaryClick() {
        return getBooleanProperty("clearGroupOnSummaryClick", c.INSTANCE);
    }

    @Nullable
    public final Boolean getConsentGiven() {
        return D01.getOptBooleanProperty$default(this, "consentGiven", null, 2, null);
    }

    @Nullable
    public final Boolean getConsentRequired() {
        return D01.getOptBooleanProperty$default(this, "consentRequired", null, 2, null);
    }

    public final boolean getDisableGMSMissingPrompt() {
        return getBooleanProperty("disableGMSMissingPrompt", d.INSTANCE);
    }

    public final boolean getEnterprise() {
        return getBooleanProperty("enterprise", e.INSTANCE);
    }

    @NotNull
    public final C2547Za0 getFcmParams() {
        Object anyProperty = getAnyProperty("fcmParams", new f());
        Intrinsics.c(anyProperty, "null cannot be cast to non-null type com.onesignal.core.internal.config.FCMConfigModel");
        return (C2547Za0) anyProperty;
    }

    public final long getFetchIAMMinInterval() {
        return getLongProperty("fetchIAMMinInterval", g.INSTANCE);
    }

    public final boolean getFirebaseAnalytics() {
        return getBooleanProperty("firebaseAnalytics", h.INSTANCE);
    }

    public final long getForegroundFetchNotificationPermissionInterval() {
        return getLongProperty("foregroundFetchNotificationPermissionInterval", i.INSTANCE);
    }

    @Nullable
    public final String getGoogleProjectNumber() {
        return D01.getOptStringProperty$default(this, "googleProjectNumber", null, 2, null);
    }

    public final int getHttpGetTimeout() {
        return getIntProperty("httpGetTimeout", j.INSTANCE);
    }

    public final int getHttpRetryAfterParseFailFallback() {
        return getIntProperty("httpRetryAfterParseFailFallback", k.INSTANCE);
    }

    public final int getHttpTimeout() {
        return getIntProperty("httpTimeout", l.INSTANCE);
    }

    @NotNull
    public final C1497Lz0 getInfluenceParams() {
        Object anyProperty = getAnyProperty("influenceParams", new m());
        Intrinsics.c(anyProperty, "null cannot be cast to non-null type com.onesignal.core.internal.config.InfluenceConfigModel");
        return (C1497Lz0) anyProperty;
    }

    public final boolean getLocationShared() {
        return getBooleanProperty("locationShared", o.INSTANCE);
    }

    @Nullable
    public final JSONArray getNotificationChannels() {
        String optStringProperty = getOptStringProperty("notificationChannels", p.INSTANCE);
        if (optStringProperty == null) {
            optStringProperty = "[]";
        }
        return new JSONArray(optStringProperty);
    }

    public final long getOpRepoDefaultFailRetryBackoff() {
        return getLongProperty("opRepoDefaultFailRetryBackoff", q.INSTANCE);
    }

    public final long getOpRepoExecutionInterval() {
        return getLongProperty("opRepoExecutionInterval", r.INSTANCE);
    }

    public final long getOpRepoPostCreateDelay() {
        return getLongProperty("opRepoPostCreateDelay", s.INSTANCE);
    }

    public final long getOpRepoPostCreateRetryUpTo() {
        return getLongProperty("opRepoPostCreateRetryUpTo", t.INSTANCE);
    }

    public final long getOpRepoPostWakeDelay() {
        return getLongProperty("opRepoPostWakeDelay", u.INSTANCE);
    }

    @Nullable
    public final String getPushSubscriptionId() {
        return D01.getOptStringProperty$default(this, "pushSubscriptionId", null, 2, null);
    }

    public final boolean getReceiveReceiptEnabled() {
        return getBooleanProperty("receiveReceiptEnabled", v.INSTANCE);
    }

    public final boolean getRestoreTTLFilter() {
        return getBooleanProperty("restoreTTLFilter", w.INSTANCE);
    }

    public final long getSessionFocusTimeout() {
        return getLongProperty("sessionFocusTimeout", x.INSTANCE);
    }

    public final boolean getUnsubscribeWhenNotificationsDisabled() {
        return getBooleanProperty("unsubscribeWhenNotificationsDisabled", y.INSTANCE);
    }

    public final boolean getUseIdentityVerification() {
        return getBooleanProperty("useIdentityVerification", z.INSTANCE);
    }

    public final boolean getUserRejectedGMSUpdate() {
        return getBooleanProperty("userRejectedGMSUpdate", A.INSTANCE);
    }

    public final boolean isInitializedWithRemote() {
        return getBooleanProperty("isInitializedWithRemote", n.INSTANCE);
    }

    public final void setApiUrl(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        D01.setStringProperty$default(this, "apiUrl", value, null, false, 12, null);
    }

    public final void setAppId(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        D01.setStringProperty$default(this, "appId", value, null, false, 12, null);
    }

    public final void setBackgroundFetchNotificationPermissionInterval(long j2) {
        D01.setLongProperty$default(this, "backgroundFetchNotificationPermissionInterval", j2, null, false, 12, null);
    }

    public final void setClearGroupOnSummaryClick(boolean z2) {
        D01.setBooleanProperty$default(this, "clearGroupOnSummaryClick", z2, null, false, 12, null);
    }

    public final void setConsentGiven(@Nullable Boolean bool) {
        D01.setOptBooleanProperty$default(this, "consentGiven", bool, null, false, 12, null);
    }

    public final void setConsentRequired(@Nullable Boolean bool) {
        D01.setOptBooleanProperty$default(this, "consentRequired", bool, null, false, 12, null);
    }

    public final void setDisableGMSMissingPrompt(boolean z2) {
        D01.setBooleanProperty$default(this, "disableGMSMissingPrompt", z2, null, false, 12, null);
    }

    public final void setEnterprise(boolean z2) {
        D01.setBooleanProperty$default(this, "enterprise", z2, null, false, 12, null);
    }

    public final void setFetchIAMMinInterval(long j2) {
        D01.setLongProperty$default(this, "fetchIAMMinInterval", j2, null, false, 12, null);
    }

    public final void setFirebaseAnalytics(boolean z2) {
        D01.setBooleanProperty$default(this, "firebaseAnalytics", z2, null, false, 12, null);
    }

    public final void setForegroundFetchNotificationPermissionInterval(long j2) {
        D01.setLongProperty$default(this, "foregroundFetchNotificationPermissionInterval", j2, null, false, 12, null);
    }

    public final void setGoogleProjectNumber(@Nullable String str) {
        D01.setOptStringProperty$default(this, "googleProjectNumber", str, null, false, 12, null);
    }

    public final void setHttpGetTimeout(int i2) {
        D01.setIntProperty$default(this, "httpGetTimeout", i2, null, false, 12, null);
    }

    public final void setHttpRetryAfterParseFailFallback(int i2) {
        D01.setIntProperty$default(this, "httpRetryAfterParseFailFallback", i2, null, false, 12, null);
    }

    public final void setHttpTimeout(int i2) {
        D01.setIntProperty$default(this, "httpTimeout", i2, null, false, 12, null);
    }

    public final void setInitializedWithRemote(boolean z2) {
        D01.setBooleanProperty$default(this, "isInitializedWithRemote", z2, null, false, 12, null);
    }

    public final void setLocationShared(boolean z2) {
        D01.setBooleanProperty$default(this, "locationShared", z2, null, false, 12, null);
    }

    public final void setNotificationChannels(@Nullable JSONArray jSONArray) {
        D01.setOptStringProperty$default(this, "notificationChannels", jSONArray != null ? jSONArray.toString() : null, null, false, 12, null);
    }

    public final void setOpRepoDefaultFailRetryBackoff(long j2) {
        D01.setLongProperty$default(this, "opRepoDefaultFailRetryBackoff", j2, null, false, 12, null);
    }

    public final void setOpRepoExecutionInterval(long j2) {
        D01.setLongProperty$default(this, "opRepoExecutionInterval", j2, null, false, 12, null);
    }

    public final void setOpRepoPostCreateDelay(long j2) {
        D01.setLongProperty$default(this, "opRepoPostCreateDelay", j2, null, false, 12, null);
    }

    public final void setOpRepoPostCreateRetryUpTo(long j2) {
        D01.setLongProperty$default(this, "opRepoPostCreateRetryUpTo", j2, null, false, 12, null);
    }

    public final void setOpRepoPostWakeDelay(long j2) {
        D01.setLongProperty$default(this, "opRepoPostWakeDelay", j2, null, false, 12, null);
    }

    public final void setPushSubscriptionId(@Nullable String str) {
        D01.setOptStringProperty$default(this, "pushSubscriptionId", str, null, false, 12, null);
    }

    public final void setReceiveReceiptEnabled(boolean z2) {
        D01.setBooleanProperty$default(this, "receiveReceiptEnabled", z2, null, false, 12, null);
    }

    public final void setRestoreTTLFilter(boolean z2) {
        D01.setBooleanProperty$default(this, "restoreTTLFilter", z2, null, false, 12, null);
    }

    public final void setSessionFocusTimeout(long j2) {
        D01.setLongProperty$default(this, "sessionFocusTimeout", j2, null, false, 12, null);
    }

    public final void setUnsubscribeWhenNotificationsDisabled(boolean z2) {
        D01.setBooleanProperty$default(this, "unsubscribeWhenNotificationsDisabled", z2, null, false, 12, null);
    }

    public final void setUseIdentityVerification(boolean z2) {
        D01.setBooleanProperty$default(this, "useIdentityVerification", z2, null, false, 12, null);
    }

    public final void setUserRejectedGMSUpdate(boolean z2) {
        D01.setBooleanProperty$default(this, "userRejectedGMSUpdate", z2, null, false, 12, null);
    }
}

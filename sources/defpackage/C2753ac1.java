package defpackage;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.measurement.AppMeasurement;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ac1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lac1;", "Lmu0;", "LGs0;", "_http", "<init>", "(LGs0;)V", "Lorg/json/JSONObject;", "outcomeJson", "LPz0;", "processOutcomeJson", "(Lorg/json/JSONObject;)LPz0;", "", "appId", "subscriptionId", "Lbc1;", "fetchParams", "(Ljava/lang/String;Ljava/lang/String;LJM;)Ljava/lang/Object;", "LGs0;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C2753ac1 implements InterfaceC5400mu0 {

    @NotNull
    private final InterfaceC1087Gs0 _http;

    /* JADX INFO: renamed from: ac1$a */
    @InterfaceC3368dU(c = "com.onesignal.core.internal.backend.impl.ParamsBackendService", f = "ParamsBackendService.kt", l = {35}, m = "fetchParams")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public a(JM<? super a> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C2753ac1.this.fetchParams(null, null, this);
        }
    }

    /* JADX INFO: renamed from: ac1$b */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends ML0 implements Function1<JSONObject, Unit> {
        final /* synthetic */ C3027bp1<C1812Pz0> $influenceParams;
        final /* synthetic */ C2753ac1 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3027bp1<C1812Pz0> c3027bp1, C2753ac1 c2753ac1) {
            super(1);
            this.$influenceParams = c3027bp1;
            this.this$0 = c2753ac1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
            invoke2(jSONObject);
            return Unit.a;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [Pz0, T] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$influenceParams.d = this.this$0.processOutcomeJson(it);
        }
    }

    /* JADX INFO: renamed from: ac1$c */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends ML0 implements Function1<JSONObject, Unit> {
        final /* synthetic */ C3027bp1<C2748ab0> $fcmParams;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C3027bp1<C2748ab0> c3027bp1) {
            super(1);
            this.$fcmParams = c3027bp1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
            invoke2(jSONObject);
            return Unit.a;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, ab0] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C3027bp1<C2748ab0> c3027bp1 = this.$fcmParams;
            String strSafeString = JD0.safeString(it, "api_key");
            c3027bp1.d = new C2748ab0(JD0.safeString(it, "project_id"), JD0.safeString(it, "app_id"), strSafeString);
        }
    }

    /* JADX INFO: renamed from: ac1$d */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends ML0 implements Function1<JSONObject, Unit> {
        final /* synthetic */ C3027bp1<Boolean> $isDirectEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C3027bp1<Boolean> c3027bp1) {
            super(1);
            this.$isDirectEnabled = c3027bp1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
            invoke2(jSONObject);
            return Unit.a;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$isDirectEnabled.d = JD0.safeBool(it, "enabled");
        }
    }

    /* JADX INFO: renamed from: ac1$e */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "indirectJSON", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class e extends ML0 implements Function1<JSONObject, Unit> {
        final /* synthetic */ C3027bp1<Integer> $iamLimit;
        final /* synthetic */ C3027bp1<Integer> $indirectIAMAttributionWindow;
        final /* synthetic */ C3027bp1<Integer> $indirectNotificationAttributionWindow;
        final /* synthetic */ C3027bp1<Boolean> $isIndirectEnabled;
        final /* synthetic */ C3027bp1<Integer> $notificationLimit;

        /* JADX INFO: renamed from: ac1$e$a */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a extends ML0 implements Function1<JSONObject, Unit> {
            final /* synthetic */ C3027bp1<Integer> $indirectNotificationAttributionWindow;
            final /* synthetic */ C3027bp1<Integer> $notificationLimit;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3027bp1<Integer> c3027bp1, C3027bp1<Integer> c3027bp2) {
                super(1);
                this.$indirectNotificationAttributionWindow = c3027bp1;
                this.$notificationLimit = c3027bp2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
                invoke2(jSONObject);
                return Unit.a;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Integer] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull JSONObject it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.$indirectNotificationAttributionWindow.d = JD0.safeInt(it, "minutes_since_displayed");
                this.$notificationLimit.d = JD0.safeInt(it, "limit");
            }
        }

        /* JADX INFO: renamed from: ac1$e$b */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class b extends ML0 implements Function1<JSONObject, Unit> {
            final /* synthetic */ C3027bp1<Integer> $iamLimit;
            final /* synthetic */ C3027bp1<Integer> $indirectIAMAttributionWindow;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C3027bp1<Integer> c3027bp1, C3027bp1<Integer> c3027bp2) {
                super(1);
                this.$indirectIAMAttributionWindow = c3027bp1;
                this.$iamLimit = c3027bp2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
                invoke2(jSONObject);
                return Unit.a;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Integer] */
            /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Integer] */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull JSONObject it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.$indirectIAMAttributionWindow.d = JD0.safeInt(it, "minutes_since_displayed");
                this.$iamLimit.d = JD0.safeInt(it, "limit");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C3027bp1<Boolean> c3027bp1, C3027bp1<Integer> c3027bp2, C3027bp1<Integer> c3027bp3, C3027bp1<Integer> c3027bp4, C3027bp1<Integer> c3027bp5) {
            super(1);
            this.$isIndirectEnabled = c3027bp1;
            this.$indirectNotificationAttributionWindow = c3027bp2;
            this.$notificationLimit = c3027bp3;
            this.$indirectIAMAttributionWindow = c3027bp4;
            this.$iamLimit = c3027bp5;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) throws JSONException {
            invoke2(jSONObject);
            return Unit.a;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Boolean] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull JSONObject indirectJSON) throws JSONException {
            Intrinsics.checkNotNullParameter(indirectJSON, "indirectJSON");
            this.$isIndirectEnabled.d = JD0.safeBool(indirectJSON, "enabled");
            JD0.expandJSONObject(indirectJSON, "notification_attribution", new a(this.$indirectNotificationAttributionWindow, this.$notificationLimit));
            JD0.expandJSONObject(indirectJSON, "in_app_message_attribution", new b(this.$indirectIAMAttributionWindow, this.$iamLimit));
        }
    }

    /* JADX INFO: renamed from: ac1$f */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lorg/json/JSONObject;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class f extends ML0 implements Function1<JSONObject, Unit> {
        final /* synthetic */ C3027bp1<Boolean> $isUnattributedEnabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C3027bp1<Boolean> c3027bp1) {
            super(1);
            this.$isUnattributedEnabled = c3027bp1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JSONObject jSONObject) {
            invoke2(jSONObject);
            return Unit.a;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull JSONObject it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$isUnattributedEnabled.d = JD0.safeBool(it, "enabled");
        }
    }

    public C2753ac1(@NotNull InterfaceC1087Gs0 _http) {
        Intrinsics.checkNotNullParameter(_http, "_http");
        this._http = _http;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1812Pz0 processOutcomeJson(JSONObject outcomeJson) throws JSONException {
        C3027bp1 c3027bp1 = new C3027bp1();
        C3027bp1 c3027bp2 = new C3027bp1();
        C3027bp1 c3027bp3 = new C3027bp1();
        C3027bp1 c3027bp4 = new C3027bp1();
        C3027bp1 c3027bp5 = new C3027bp1();
        C3027bp1 c3027bp6 = new C3027bp1();
        C3027bp1 c3027bp7 = new C3027bp1();
        JD0.expandJSONObject(outcomeJson, "direct", new d(c3027bp5));
        JD0.expandJSONObject(outcomeJson, DevicePublicKeyStringDef.INDIRECT, new e(c3027bp6, c3027bp1, c3027bp2, c3027bp3, c3027bp4));
        JD0.expandJSONObject(outcomeJson, "unattributed", new f(c3027bp7));
        return new C1812Pz0((Integer) c3027bp1.d, (Integer) c3027bp2.d, (Integer) c3027bp3.d, (Integer) c3027bp4.d, (Boolean) c3027bp5.d, (Boolean) c3027bp6.d, (Boolean) c3027bp7.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // defpackage.InterfaceC5400mu0
    @Nullable
    public Object fetchParams(@NotNull String str, @Nullable String str2, @NotNull JM<? super C2977bc1> jm) throws JSONException, C7063up {
        a aVar;
        C2753ac1 c2753ac1;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.label = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object obj = aVar.result;
        MN mn = MN.d;
        int i2 = aVar.label;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            NS0.log(EnumC5513nS0.DEBUG, "ParamsBackendService.fetchParams(appId: " + str + ", subscriptionId: " + str2 + ')');
            StringBuilder sb = new StringBuilder("apps/");
            sb.append(str);
            sb.append("/android_params.js");
            String string = sb.toString();
            if (str2 != null && !C6443rs0.INSTANCE.isLocalId(str2)) {
                string = C2629a1.b(string, "?player_id=", str2);
            }
            InterfaceC1087Gs0 interfaceC1087Gs0 = this._http;
            C3597ea1 c3597ea1 = new C3597ea1("CACHE_KEY_REMOTE_PARAMS", null, null, null, 14, null);
            aVar.L$0 = this;
            aVar.label = 1;
            obj = interfaceC1087Gs0.get(string, c3597ea1, aVar);
            if (obj == mn) {
                return mn;
            }
            c2753ac1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2753ac1 = (C2753ac1) aVar.L$0;
            C1795Pt1.b(obj);
        }
        C5178lr0 c5178lr0 = (C5178lr0) obj;
        if (!c5178lr0.isSuccess()) {
            throw new C7063up(c5178lr0.getStatusCode(), c5178lr0.getPayload(), c5178lr0.getRetryAfterSeconds());
        }
        String payload = c5178lr0.getPayload();
        Intrinsics.checkNotNull(payload);
        JSONObject jSONObject = new JSONObject(payload);
        C3027bp1 c3027bp1 = new C3027bp1();
        JD0.expandJSONObject(jSONObject, "outcomes", new b(c3027bp1, c2753ac1));
        C3027bp1 c3027bp2 = new C3027bp1();
        JD0.expandJSONObject(jSONObject, AppMeasurement.FCM_ORIGIN, new c(c3027bp2));
        String strSafeString = JD0.safeString(jSONObject, "android_sender_id");
        Boolean boolSafeBool = JD0.safeBool(jSONObject, "enterp");
        Boolean boolSafeBool2 = JD0.safeBool(jSONObject, "require_ident_auth");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("chnl_lst");
        Boolean boolSafeBool3 = JD0.safeBool(jSONObject, "fba");
        Boolean boolSafeBool4 = JD0.safeBool(jSONObject, "restore_ttl_filter");
        Boolean boolSafeBool5 = JD0.safeBool(jSONObject, "clear_group_on_summary_click");
        Boolean boolSafeBool6 = JD0.safeBool(jSONObject, "receive_receipts_enable");
        Boolean boolSafeBool7 = JD0.safeBool(jSONObject, "disable_gms_missing_prompt");
        Boolean boolSafeBool8 = JD0.safeBool(jSONObject, "unsubscribe_on_notifications_disabled");
        Boolean boolSafeBool9 = JD0.safeBool(jSONObject, "location_shared");
        Boolean boolSafeBool10 = JD0.safeBool(jSONObject, "requires_user_privacy_consent");
        Long lSafeLong = JD0.safeLong(jSONObject, "oprepo_execution_interval");
        C1812Pz0 c1812Pz0 = (C1812Pz0) c3027bp1.d;
        C1812Pz0 c1812Pz1 = c1812Pz0 == null ? new C1812Pz0(null, null, null, null, null, null, null, 127, null) : c1812Pz0;
        C2748ab0 c2748ab0 = (C2748ab0) c3027bp2.d;
        return new C2977bc1(strSafeString, boolSafeBool, boolSafeBool2, jSONArrayOptJSONArray, boolSafeBool3, boolSafeBool4, boolSafeBool5, boolSafeBool6, boolSafeBool7, boolSafeBool8, boolSafeBool9, boolSafeBool10, lSafeLong, c1812Pz1, c2748ab0 == null ? new C2748ab0(null, null, null, 7, null) : c2748ab0);
    }
}

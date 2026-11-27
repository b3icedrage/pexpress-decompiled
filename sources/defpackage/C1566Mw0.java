package defpackage;

import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: Mw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J1\u0010$\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0006\u0010#\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)JA\u0010+\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0096@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J-\u0010.\u001a\u00020-2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J%\u00102\u001a\u0004\u0018\u0001012\u0006\u0010\r\u001a\u00020\n2\u0006\u00100\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b2\u00103JG\u00107\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u00010\n2\u0006\u00106\u001a\u000205H\u0096@ø\u0001\u0000¢\u0006\u0004\b7\u00108J?\u0010:\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u00109\u001a\u0004\u0018\u00010\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b:\u0010;J5\u0010<\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\n2\u0006\u0010*\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0016\u0010A\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006C"}, d2 = {"LMw0;", "LKs0;", "LGs0;", "_httpClient", "Lws0;", "_deviceService", "LPw0;", "_hydrator", "<init>", "(LGs0;Lws0;LPw0;)V", "", "messageId", "variantId", "appId", "htmlPathForMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "requestType", Payload.RESPONSE, "", "printHttpSuccessForInAppMessageRequest", "(Ljava/lang/String;Ljava/lang/String;)V", "", "statusCode", "printHttpErrorForInAppMessageRequest", "(Ljava/lang/String;ILjava/lang/String;)V", "baseUrl", "LGB1;", "rywData", "Lkotlin/Function0;", "", "sessionDurationProvider", "", "LQw0;", "attemptFetchWithRetries", "(Ljava/lang/String;LGB1;Lkotlin/jvm/functions/Function0;LJM;)Ljava/lang/Object;", ImagesContract.URL, "fetchInAppMessagesWithoutRywToken", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;LJM;)Ljava/lang/Object;", "Lorg/json/JSONObject;", "jsonResponse", "hydrateInAppMessages", "(Lorg/json/JSONObject;)Ljava/util/List;", "subscriptionId", "listInAppMessages", "(Ljava/lang/String;Ljava/lang/String;LGB1;Lkotlin/jvm/functions/Function0;LJM;)Ljava/lang/Object;", "Lfl0;", "getIAMData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LJM;)Ljava/lang/Object;", "previewUUID", "LVw0;", "getIAMPreviewData", "(Ljava/lang/String;Ljava/lang/String;LJM;)Ljava/lang/Object;", "clickId", "", "isFirstClick", "sendIAMClick", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLJM;)Ljava/lang/Object;", C2840ax0.PAGE_ID, "sendIAMPageImpression", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LJM;)Ljava/lang/Object;", "sendIAMImpression", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LJM;)Ljava/lang/Object;", "LGs0;", "Lws0;", "LPw0;", "htmlNetworkRequestAttemptCount", "I", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C1566Mw0 implements InterfaceC1399Ks0 {

    @NotNull
    private final InterfaceC7494ws0 _deviceService;

    @NotNull
    private final InterfaceC1087Gs0 _httpClient;

    @NotNull
    private final C1803Pw0 _hydrator;
    private int htmlNetworkRequestAttemptCount;

    /* JADX INFO: renamed from: Mw0$a */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", f = "InAppBackendService.kt", l = {224, 235, 247}, m = "attemptFetchWithRetries")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends LM {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
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
            return C1566Mw0.this.attemptFetchWithRetries(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: Mw0$b */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", f = "InAppBackendService.kt", l = {255}, m = "fetchInAppMessagesWithoutRywToken")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(JM<? super b> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C1566Mw0.this.fetchInAppMessagesWithoutRywToken(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Mw0$c */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", f = "InAppBackendService.kt", l = {49}, m = "getIAMData")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(JM<? super c> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C1566Mw0.this.getIAMData(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: Mw0$d */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", f = "InAppBackendService.kt", l = {79}, m = "getIAMPreviewData")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(JM<? super d> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C1566Mw0.this.getIAMPreviewData(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Mw0$e */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", f = "InAppBackendService.kt", l = {34, 37}, m = "listInAppMessages")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class e extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public e(JM<? super e> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C1566Mw0.this.listInAppMessages(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: Mw0$f */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", f = "InAppBackendService.kt", l = {110}, m = "sendIAMClick")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class f extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(JM<? super f> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C1566Mw0.this.sendIAMClick(null, null, null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: Mw0$g */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Mw0$g", "Lorg/json/JSONObject;", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class g extends JSONObject {
        public g(String str, C1566Mw0 c1566Mw0, String str2, String str3, String str4, boolean z) throws JSONException {
            put("app_id", str);
            put("device_type", c1566Mw0._deviceService.getDeviceType().getValue());
            put("player_id", str2);
            put("click_id", str3);
            put("variant_id", str4);
            if (z) {
                put("first_click", true);
            }
        }
    }

    /* JADX INFO: renamed from: Mw0$h */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", f = "InAppBackendService.kt", l = {170}, m = "sendIAMImpression")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class h extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(JM<? super h> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C1566Mw0.this.sendIAMImpression(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: Mw0$i */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Mw0$i", "Lorg/json/JSONObject;", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class i extends JSONObject {
        public i(String str, String str2, String str3, C1566Mw0 c1566Mw0) throws JSONException {
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", c1566Mw0._deviceService.getDeviceType().getValue());
            put("first_impression", true);
        }
    }

    /* JADX INFO: renamed from: Mw0$j */
    @InterfaceC3368dU(c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", f = "InAppBackendService.kt", l = {143}, m = "sendIAMPageImpression")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class j extends LM {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public j(JM<? super j> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return C1566Mw0.this.sendIAMPageImpression(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: Mw0$k */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Mw0$k", "Lorg/json/JSONObject;", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class k extends JSONObject {
        public k(String str, String str2, String str3, C1566Mw0 c1566Mw0, String str4) throws JSONException {
            put("app_id", str);
            put("player_id", str2);
            put("variant_id", str3);
            put("device_type", c1566Mw0._deviceService.getDeviceType().getValue());
            put("page_id", str4);
        }
    }

    public C1566Mw0(@NotNull InterfaceC1087Gs0 _httpClient, @NotNull InterfaceC7494ws0 _deviceService, @NotNull C1803Pw0 _hydrator) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_hydrator, "_hydrator");
        this._httpClient = _httpClient;
        this._deviceService = _deviceService;
        this._hydrator = _hydrator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x007e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:34:0x00df  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:46:0x0100  */
    /* JADX WARN: Code duplicated, block: B:49:0x010a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0128 A[PHI: r1 r4 r9 r10 r11 r12 r13
      0x0128: PHI (r1v10 Mw0$a) = (r1v4 Mw0$a), (r1v4 Mw0$a), (r1v2 Mw0$a) binds: [B:48:0x0108, B:50:0x0125, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r4v7 int) = (r4v3 int), (r4v3 int), (r4v10 int) binds: [B:48:0x0108, B:50:0x0125, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v6 int) binds: [B:48:0x0108, B:50:0x0125, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r10v4 kotlin.jvm.functions.Function0<java.lang.Long>) = 
      (r10v1 kotlin.jvm.functions.Function0<java.lang.Long>)
      (r10v1 kotlin.jvm.functions.Function0<java.lang.Long>)
      (r10v9 kotlin.jvm.functions.Function0<java.lang.Long>)
     binds: [B:48:0x0108, B:50:0x0125, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r11v4 GB1) = (r11v1 GB1), (r11v1 GB1), (r11v9 GB1) binds: [B:48:0x0108, B:50:0x0125, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r12v4 java.lang.String) = (r12v1 java.lang.String), (r12v1 java.lang.String), (r12v9 java.lang.String) binds: [B:48:0x0108, B:50:0x0125, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0128: PHI (r13v7 Mw0) = (r13v0 Mw0), (r13v0 Mw0), (r13v11 Mw0) binds: [B:48:0x0108, B:50:0x0125, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0132  */
    /* JADX WARN: Code duplicated, block: B:57:0x0144 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0145  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0108 -> B:52:0x0128). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0125 -> B:52:0x0128). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object attemptFetchWithRetries(java.lang.String r22, defpackage.GB1 r23, kotlin.jvm.functions.Function0<java.lang.Long> r24, defpackage.JM<? super java.util.List<defpackage.C1881Qw0>> r25) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1566Mw0.attemptFetchWithRetries(java.lang.String, GB1, kotlin.jvm.functions.Function0, JM):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchInAppMessagesWithoutRywToken(String str, Function0<Long> function0, JM<? super List<C1881Qw0>> jm) {
        b bVar;
        C1566Mw0 c1566Mw0;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(jm);
            }
        } else {
            bVar = new b(jm);
        }
        Object obj = bVar.result;
        MN mn = MN.d;
        int i3 = bVar.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            InterfaceC1087Gs0 interfaceC1087Gs0 = this._httpClient;
            C3597ea1 c3597ea1 = new C3597ea1(null, null, null, function0.invoke(), 7, null);
            bVar.L$0 = this;
            bVar.label = 1;
            obj = interfaceC1087Gs0.get(str, c3597ea1, bVar);
            if (obj == mn) {
                return mn;
            }
            c1566Mw0 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1566Mw0 = (C1566Mw0) bVar.L$0;
            C1795Pt1.b(obj);
        }
        C5178lr0 c5178lr0 = (C5178lr0) obj;
        if (c5178lr0.isSuccess()) {
            String payload = c5178lr0.getPayload();
            JSONObject jSONObject = payload != null ? new JSONObject(payload) : null;
            if (jSONObject != null) {
                return c1566Mw0.hydrateInAppMessages(jSONObject);
            }
        }
        return null;
    }

    private final String htmlPathForMessage(String messageId, String variantId, String appId) {
        if (variantId != null) {
            StringBuilder sbA = C5896pG.a("in_app_messages/", messageId, "/variants/", variantId, "/html?app_id=");
            sbA.append(appId);
            return sbA.toString();
        }
        NS0.error$default("Unable to find a variant for in-app message " + messageId, null, 2, null);
        return null;
    }

    private final List<C1881Qw0> hydrateInAppMessages(JSONObject jsonResponse) throws JSONException {
        if (!jsonResponse.has("in_app_messages")) {
            return null;
        }
        JSONArray iamMessagesAsJSON = jsonResponse.getJSONArray("in_app_messages");
        C1803Pw0 c1803Pw0 = this._hydrator;
        Intrinsics.checkNotNullExpressionValue(iamMessagesAsJSON, "iamMessagesAsJSON");
        return c1803Pw0.hydrateIAMMessages(iamMessagesAsJSON);
    }

    private final void printHttpErrorForInAppMessageRequest(String requestType, int statusCode, String response) {
        NS0.error$default("Encountered a " + statusCode + " error while attempting in-app message " + requestType + " request: " + response, null, 2, null);
    }

    private final void printHttpSuccessForInAppMessageRequest(String requestType, String response) {
        NS0.debug$default(BX.c("Successful post for in-app message ", requestType, " request: ", response), null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.InterfaceC1399Ks0
    @Nullable
    public Object getIAMData(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull JM<? super C3850fl0> jm) {
        c cVar;
        C1566Mw0 c1566Mw0;
        if (jm instanceof c) {
            cVar = (c) jm;
            int i2 = cVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.label = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(jm);
            }
        } else {
            cVar = new c(jm);
        }
        c cVar2 = cVar;
        Object obj = cVar2.result;
        MN mn = MN.d;
        int i3 = cVar2.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            String strHtmlPathForMessage = htmlPathForMessage(str2, str3, str);
            if (strHtmlPathForMessage == null) {
                return new C3850fl0(null, false);
            }
            InterfaceC1087Gs0 interfaceC1087Gs0 = this._httpClient;
            cVar2.L$0 = this;
            cVar2.label = 1;
            obj = InterfaceC1087Gs0.a.get$default(interfaceC1087Gs0, strHtmlPathForMessage, null, cVar2, 2, null);
            if (obj == mn) {
                return mn;
            }
            c1566Mw0 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1566Mw0 = (C1566Mw0) cVar2.L$0;
            C1795Pt1.b(obj);
        }
        C5178lr0 c5178lr0 = (C5178lr0) obj;
        if (c5178lr0.isSuccess()) {
            c1566Mw0.htmlNetworkRequestAttemptCount = 0;
            String payload = c5178lr0.getPayload();
            Intrinsics.checkNotNull(payload);
            return new C3850fl0(c1566Mw0._hydrator.hydrateIAMMessageContent(new JSONObject(payload)), false);
        }
        c1566Mw0.printHttpErrorForInAppMessageRequest(C2271Vw0.HTML, c5178lr0.getStatusCode(), c5178lr0.getPayload());
        C5013l41 c5013l41 = C5013l41.INSTANCE;
        if (c5013l41.getResponseStatusType(c5178lr0.getStatusCode()) != C5013l41.a.RETRYABLE || c1566Mw0.htmlNetworkRequestAttemptCount >= c5013l41.getMaxNetworkRequestAttemptCount()) {
            c1566Mw0.htmlNetworkRequestAttemptCount = 0;
            return new C3850fl0(null, false);
        }
        c1566Mw0.htmlNetworkRequestAttemptCount++;
        return new C3850fl0(null, true);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.InterfaceC1399Ks0
    @Nullable
    public Object getIAMPreviewData(@NotNull String str, @NotNull String str2, @NotNull JM<? super C2271Vw0> jm) {
        d dVar;
        C1566Mw0 c1566Mw0;
        if (jm instanceof d) {
            dVar = (d) jm;
            int i2 = dVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.label = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(jm);
            }
        } else {
            dVar = new d(jm);
        }
        d dVar2 = dVar;
        Object obj = dVar2.result;
        MN mn = MN.d;
        int i3 = dVar2.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            InterfaceC1087Gs0 interfaceC1087Gs0 = this._httpClient;
            dVar2.L$0 = this;
            dVar2.label = 1;
            obj = InterfaceC1087Gs0.a.get$default(interfaceC1087Gs0, "in_app_messages/device_preview?preview_id=" + str2 + "&app_id=" + str, null, dVar2, 2, null);
            if (obj == mn) {
                return mn;
            }
            c1566Mw0 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1566Mw0 = (C1566Mw0) dVar2.L$0;
            C1795Pt1.b(obj);
        }
        C5178lr0 c5178lr0 = (C5178lr0) obj;
        if (!c5178lr0.isSuccess()) {
            c1566Mw0.printHttpErrorForInAppMessageRequest(C2271Vw0.HTML, c5178lr0.getStatusCode(), c5178lr0.getPayload());
            return null;
        }
        String payload = c5178lr0.getPayload();
        Intrinsics.checkNotNull(payload);
        return c1566Mw0._hydrator.hydrateIAMMessageContent(new JSONObject(payload));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC1399Ks0
    @Nullable
    public Object listInAppMessages(@NotNull String str, @NotNull String str2, @NotNull GB1 gb1, @NotNull Function0<Long> function0, @NotNull JM<? super List<C1881Qw0>> jm) {
        e eVar;
        C1566Mw0 c1566Mw0;
        if (jm instanceof e) {
            eVar = (e) jm;
            int i2 = eVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.label = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(jm);
            }
        } else {
            eVar = new e(jm);
        }
        Object obj = eVar.result;
        MN mn = MN.d;
        int i3 = eVar.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            Long rywDelay = gb1.getRywDelay();
            long jLongValue = rywDelay != null ? rywDelay.longValue() : 500L;
            eVar.L$0 = this;
            eVar.L$1 = str;
            eVar.L$2 = str2;
            eVar.L$3 = gb1;
            eVar.L$4 = function0;
            eVar.label = 1;
            if (IW.b(jLongValue, eVar) != mn) {
                c1566Mw0 = this;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        function0 = (Function0) eVar.L$4;
        gb1 = (GB1) eVar.L$3;
        str2 = (String) eVar.L$2;
        str = (String) eVar.L$1;
        c1566Mw0 = (C1566Mw0) eVar.L$0;
        C1795Pt1.b(obj);
        String strA = C4694ja0.a("apps/", str, "/subscriptions/", str2, "/iams");
        eVar.L$0 = null;
        eVar.L$1 = null;
        eVar.L$2 = null;
        eVar.L$3 = null;
        eVar.L$4 = null;
        eVar.label = 2;
        Object objAttemptFetchWithRetries = c1566Mw0.attemptFetchWithRetries(strA, gb1, function0, eVar);
        return objAttemptFetchWithRetries == mn ? mn : objAttemptFetchWithRetries;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.InterfaceC1399Ks0
    @Nullable
    public Object sendIAMClick(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @Nullable String str5, boolean z, @NotNull JM<? super Unit> jm) throws C7063up {
        f fVar;
        C1566Mw0 c1566Mw0;
        if (jm instanceof f) {
            fVar = (f) jm;
            int i2 = fVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.label = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(jm);
            }
        } else {
            fVar = new f(jm);
        }
        f fVar2 = fVar;
        Object objPost$default = fVar2.result;
        MN mn = MN.d;
        int i3 = fVar2.label;
        if (i3 == 0) {
            C1795Pt1.b(objPost$default);
            g gVar = new g(str, this, str2, str5, str3, z);
            InterfaceC1087Gs0 interfaceC1087Gs0 = this._httpClient;
            String strD = C1039Gc0.d("in_app_messages/", str4, "/click");
            fVar2.L$0 = this;
            fVar2.label = 1;
            objPost$default = InterfaceC1087Gs0.a.post$default(interfaceC1087Gs0, strD, gVar, null, fVar2, 4, null);
            if (objPost$default == mn) {
                return mn;
            }
            c1566Mw0 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1566Mw0 = (C1566Mw0) fVar2.L$0;
            C1795Pt1.b(objPost$default);
        }
        C5178lr0 c5178lr0 = (C5178lr0) objPost$default;
        if (!c5178lr0.isSuccess()) {
            c1566Mw0.printHttpErrorForInAppMessageRequest("engagement", c5178lr0.getStatusCode(), c5178lr0.getPayload());
            throw new C7063up(c5178lr0.getStatusCode(), c5178lr0.getPayload(), c5178lr0.getRetryAfterSeconds());
        }
        String payload = c5178lr0.getPayload();
        Intrinsics.checkNotNull(payload);
        c1566Mw0.printHttpSuccessForInAppMessageRequest("engagement", payload);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.InterfaceC1399Ks0
    @Nullable
    public Object sendIAMImpression(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull JM<? super Unit> jm) throws C7063up {
        h hVar;
        C1566Mw0 c1566Mw0;
        if (jm instanceof h) {
            hVar = (h) jm;
            int i2 = hVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.label = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(jm);
            }
        } else {
            hVar = new h(jm);
        }
        h hVar2 = hVar;
        Object objPost$default = hVar2.result;
        MN mn = MN.d;
        int i3 = hVar2.label;
        if (i3 == 0) {
            C1795Pt1.b(objPost$default);
            i iVar = new i(str, str2, str3, this);
            InterfaceC1087Gs0 interfaceC1087Gs0 = this._httpClient;
            String strD = C1039Gc0.d("in_app_messages/", str4, "/impression");
            hVar2.L$0 = this;
            hVar2.label = 1;
            objPost$default = InterfaceC1087Gs0.a.post$default(interfaceC1087Gs0, strD, iVar, null, hVar2, 4, null);
            if (objPost$default == mn) {
                return mn;
            }
            c1566Mw0 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1566Mw0 = (C1566Mw0) hVar2.L$0;
            C1795Pt1.b(objPost$default);
        }
        C5178lr0 c5178lr0 = (C5178lr0) objPost$default;
        if (!c5178lr0.isSuccess()) {
            c1566Mw0.printHttpErrorForInAppMessageRequest("impression", c5178lr0.getStatusCode(), c5178lr0.getPayload());
            throw new C7063up(c5178lr0.getStatusCode(), c5178lr0.getPayload(), c5178lr0.getRetryAfterSeconds());
        }
        String payload = c5178lr0.getPayload();
        Intrinsics.checkNotNull(payload);
        c1566Mw0.printHttpSuccessForInAppMessageRequest("impression", payload);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.InterfaceC1399Ks0
    @Nullable
    public Object sendIAMPageImpression(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @Nullable String str5, @NotNull JM<? super Unit> jm) throws C7063up {
        j jVar;
        Object objPost$default;
        C1566Mw0 c1566Mw0;
        if (jm instanceof j) {
            jVar = (j) jm;
            int i2 = jVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.label = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(jm);
            }
        } else {
            jVar = new j(jm);
        }
        j jVar2 = jVar;
        Object obj = jVar2.result;
        MN mn = MN.d;
        int i3 = jVar2.label;
        if (i3 == 0) {
            C1795Pt1.b(obj);
            k kVar = new k(str, str2, str3, this, str5);
            InterfaceC1087Gs0 interfaceC1087Gs0 = this._httpClient;
            String strD = C1039Gc0.d("in_app_messages/", str4, "/pageImpression");
            jVar2.L$0 = this;
            jVar2.label = 1;
            objPost$default = InterfaceC1087Gs0.a.post$default(interfaceC1087Gs0, strD, kVar, null, jVar2, 4, null);
            if (objPost$default == mn) {
                return mn;
            }
            c1566Mw0 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1566Mw0 c1566Mw1 = (C1566Mw0) jVar2.L$0;
            C1795Pt1.b(obj);
            c1566Mw0 = c1566Mw1;
            objPost$default = obj;
        }
        C5178lr0 c5178lr0 = (C5178lr0) objPost$default;
        if (!c5178lr0.isSuccess()) {
            c1566Mw0.printHttpErrorForInAppMessageRequest("page impression", c5178lr0.getStatusCode(), c5178lr0.getPayload());
            throw new C7063up(c5178lr0.getStatusCode(), c5178lr0.getPayload(), c5178lr0.getRetryAfterSeconds());
        }
        String payload = c5178lr0.getPayload();
        Intrinsics.checkNotNull(payload);
        c1566Mw0.printHttpSuccessForInAppMessageRequest("page impression", payload);
        return Unit.a;
    }
}

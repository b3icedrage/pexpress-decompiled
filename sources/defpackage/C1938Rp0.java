package defpackage;

import android.net.TrafficStats;
import android.os.Build;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.internal.ImagesContract;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: Rp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u0000 82\u00020\u0001:\u00019B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJA\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010 JE\u0010&\u001a\u00020%2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\"2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0$0#H\u0002¢\u0006\u0004\b&\u0010'J-\u0010)\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J%\u0010+\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J-\u0010-\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b-\u0010*J-\u0010.\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b.\u0010*J%\u0010/\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b/\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00103R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006:"}, d2 = {"LRp0;", "LGs0;", "LHs0;", "_connectionFactory", "Lsu0;", "_prefs", "LxI;", "_configModelStore", "Lgv0;", "_time", "Ldt0;", "_installIdService", "<init>", "(LHs0;Lsu0;LxI;Lgv0;Ldt0;)V", "", ImagesContract.URL, "method", "Lorg/json/JSONObject;", "jsonBody", "", "timeout", "Lea1;", "headers", "Llr0;", "makeRequest", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILea1;LJM;)Ljava/lang/Object;", "makeRequestIODispatcher", "getThreadTimeout", "(I)I", "Ljava/net/HttpURLConnection;", "con", "retryAfterFromResponse", "(Ljava/net/HttpURLConnection;)Ljava/lang/Integer;", "retryLimitFromResponse", "Ljava/net/URL;", "", "", "", "logHTTPSent", "(Ljava/lang/String;Ljava/net/URL;Lorg/json/JSONObject;Ljava/util/Map;)V", "body", "post", "(Ljava/lang/String;Lorg/json/JSONObject;Lea1;LJM;)Ljava/lang/Object;", "get", "(Ljava/lang/String;Lea1;LJM;)Ljava/lang/Object;", "put", "patch", "delete", "LHs0;", "Lsu0;", "LxI;", "Lgv0;", "Ldt0;", "", "delayNewRequestsUntil", "J", "Companion", "e", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C1938Rp0 implements InterfaceC1087Gs0 {

    @NotNull
    private static final String OS_ACCEPT_HEADER = "application/vnd.onesignal.v1+json";

    @NotNull
    private static final String OS_API_VERSION = "1";
    private static final int THREAD_ID = 10000;

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final InterfaceC1165Hs0 _connectionFactory;

    @NotNull
    private final InterfaceC3456dt0 _installIdService;

    @NotNull
    private final InterfaceC6659su0 _prefs;

    @NotNull
    private final InterfaceC4092gv0 _time;
    private long delayNewRequestsUntil;

    /* JADX INFO: renamed from: Rp0$a */
    @InterfaceC3368dU(c = "com.onesignal.core.internal.http.impl.HttpClient", f = "HttpClient.kt", l = {89, 92}, m = "makeRequest")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends LM {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
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
            return C1938Rp0.this.makeRequest(null, null, null, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: Rp0$b */
    @InterfaceC3368dU(c = "com.onesignal.core.internal.http.impl.HttpClient$makeRequest$2", f = "HttpClient.kt", l = {93}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "Llr0;", "<anonymous>", "(LKN;)Llr0;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends AW1 implements Function2<KN, JM<? super C5178lr0>, Object> {
        final /* synthetic */ C3597ea1 $headers;
        final /* synthetic */ JSONObject $jsonBody;
        final /* synthetic */ String $method;
        final /* synthetic */ int $timeout;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, JSONObject jSONObject, int i, C3597ea1 c3597ea1, JM<? super b> jm) {
            super(2, jm);
            this.$url = str;
            this.$method = str2;
            this.$jsonBody = jSONObject;
            this.$timeout = i;
            this.$headers = c3597ea1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C1938Rp0.this.new b(this.$url, this.$method, this.$jsonBody, this.$timeout, this.$headers, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super C5178lr0> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                return obj;
            }
            C1795Pt1.b(obj);
            C1938Rp0 c1938Rp0 = C1938Rp0.this;
            String str = this.$url;
            String str2 = this.$method;
            JSONObject jSONObject = this.$jsonBody;
            int i2 = this.$timeout;
            C3597ea1 c3597ea1 = this.$headers;
            this.label = 1;
            Object objMakeRequestIODispatcher = c1938Rp0.makeRequestIODispatcher(str, str2, jSONObject, i2, c3597ea1, this);
            return objMakeRequestIODispatcher == mn ? mn : objMakeRequestIODispatcher;
        }
    }

    /* JADX INFO: renamed from: Rp0$c */
    @InterfaceC3368dU(c = "com.onesignal.core.internal.http.impl.HttpClient", f = "HttpClient.kt", l = {286}, m = "makeRequestIODispatcher")
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
            return C1938Rp0.this.makeRequestIODispatcher(null, null, null, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: Rp0$d */
    @InterfaceC3368dU(c = "com.onesignal.core.internal.http.impl.HttpClient$makeRequestIODispatcher$job$1", f = "HttpClient.kt", l = {151}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LKN;", "", "<anonymous>", "(LKN;)V"}, k = 3, mv = {1, 7, 1})
    public static final class d extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        final /* synthetic */ C3597ea1 $headers;
        final /* synthetic */ JSONObject $jsonBody;
        final /* synthetic */ String $method;
        final /* synthetic */ C3027bp1<C5178lr0> $retVal;
        final /* synthetic */ int $timeout;
        final /* synthetic */ String $url;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, int i, JSONObject jSONObject, String str2, C3597ea1 c3597ea1, C3027bp1<C5178lr0> c3027bp1, JM<? super d> jm) {
            super(2, jm);
            this.$url = str;
            this.$timeout = i;
            this.$jsonBody = jSONObject;
            this.$method = str2;
            this.$headers = c3597ea1;
            this.$retVal = c3027bp1;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return C1938Rp0.this.new d(this.$url, this.$timeout, this.$jsonBody, this.$method, this.$headers, this.$retVal, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull KN kn, @Nullable JM<? super Unit> jm) {
            return ((d) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:130:0x03fc A[Catch: all -> 0x0418, TryCatch #1 {all -> 0x0418, blocks: (B:128:0x03f8, B:130:0x03fc, B:133:0x0401, B:137:0x042b, B:136:0x041a), top: B:147:0x03f8 }] */
        /* JADX WARN: Code duplicated, block: B:136:0x041a A[Catch: all -> 0x0418, TryCatch #1 {all -> 0x0418, blocks: (B:128:0x03f8, B:130:0x03fc, B:133:0x0401, B:137:0x042b, B:136:0x041a), top: B:147:0x03f8 }] */
        /* JADX WARN: Code duplicated, block: B:139:0x043e A[DONT_GENERATE] */
        /* JADX WARN: Type inference failed for: r11v1, types: [T, lr0] */
        /* JADX WARN: Type inference failed for: r14v24, types: [T, lr0] */
        /* JADX WARN: Type inference failed for: r14v27, types: [T, lr0] */
        /* JADX WARN: Type inference failed for: r14v28, types: [T, lr0] */
        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Throwable th;
            int i;
            HttpURLConnection httpURLConnection;
            HttpURLConnection httpURLConnectionNewHttpURLConnection;
            Object id;
            String str;
            int i2;
            HttpURLConnection httpURLConnection2;
            String headerField;
            String str2;
            MN mn = MN.d;
            int i3 = this.label;
            if (i3 == 0) {
                C1795Pt1.b(obj);
                if (Build.VERSION.SDK_INT >= 26) {
                    TrafficStats.setThreadStatsTag(C1938Rp0.THREAD_ID);
                }
                try {
                    httpURLConnectionNewHttpURLConnection = C1938Rp0.this._connectionFactory.newHttpURLConnection(this.$url);
                    try {
                        httpURLConnectionNewHttpURLConnection.setUseCaches(false);
                        httpURLConnectionNewHttpURLConnection.setConnectTimeout(this.$timeout);
                        httpURLConnectionNewHttpURLConnection.setReadTimeout(this.$timeout);
                        httpURLConnectionNewHttpURLConnection.setRequestProperty("SDK-Version", "onesignal/android/050135");
                        if (J91.getSdkType() != null && J91.getSdkVersion() != null) {
                            httpURLConnectionNewHttpURLConnection.setRequestProperty("SDK-Wrapper", "onesignal/" + J91.getSdkType() + '/' + J91.getSdkVersion());
                        }
                        httpURLConnectionNewHttpURLConnection.setRequestProperty("Accept", C1938Rp0.OS_ACCEPT_HEADER);
                        String pushSubscriptionId = C1938Rp0.this._configModelStore.getModel().getPushSubscriptionId();
                        if (pushSubscriptionId != null && pushSubscriptionId.length() > 0) {
                            httpURLConnectionNewHttpURLConnection.setRequestProperty("OneSignal-Subscription-Id", pushSubscriptionId);
                        }
                        InterfaceC3456dt0 interfaceC3456dt0 = C1938Rp0.this._installIdService;
                        this.L$0 = httpURLConnectionNewHttpURLConnection;
                        this.L$1 = httpURLConnectionNewHttpURLConnection;
                        this.L$2 = "OneSignal-Install-Id";
                        this.I$0 = -1;
                        this.label = 1;
                        id = interfaceC3456dt0.getId(this);
                        if (id == mn) {
                            return mn;
                        }
                        str = "OneSignal-Install-Id";
                        i2 = -1;
                        httpURLConnection2 = httpURLConnectionNewHttpURLConnection;
                    } catch (Throwable th2) {
                        th = th2;
                        i = -1;
                        httpURLConnection = httpURLConnectionNewHttpURLConnection;
                        if (th instanceof ConnectException) {
                            NS0.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        } else {
                            NS0.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        }
                        this.$retVal.d = new C5178lr0(i, null, th, null, null, 24, null);
                        return Unit.a;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i = -1;
                    httpURLConnection = null;
                    if ((th instanceof ConnectException) || (th instanceof UnknownHostException)) {
                        NS0.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                    } else {
                        NS0.warn("HttpClient: " + this.$method + " Error thrown from network stack. ", th);
                    }
                    this.$retVal.d = new C5178lr0(i, null, th, null, null, 24, null);
                    return Unit.a;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.I$0;
                str = (String) this.L$2;
                httpURLConnection2 = (HttpURLConnection) this.L$1;
                httpURLConnectionNewHttpURLConnection = (HttpURLConnection) this.L$0;
                try {
                    C1795Pt1.b(obj);
                    id = obj;
                } catch (Throwable th4) {
                    th = th4;
                    i = i2;
                    httpURLConnection = httpURLConnectionNewHttpURLConnection;
                    try {
                        if (th instanceof ConnectException) {
                            NS0.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        } else {
                            NS0.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        }
                        this.$retVal.d = new C5178lr0(i, null, th, null, null, 24, null);
                        return Unit.a;
                    } finally {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                }
            }
            httpURLConnection2.setRequestProperty(str, ((UUID) id).toString());
            if (this.$jsonBody != null) {
                httpURLConnectionNewHttpURLConnection.setDoInput(true);
            }
            if (this.$method != null) {
                httpURLConnectionNewHttpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                httpURLConnectionNewHttpURLConnection.setRequestMethod(this.$method);
                httpURLConnectionNewHttpURLConnection.setDoOutput(true);
            }
            C1938Rp0 c1938Rp0 = C1938Rp0.this;
            String requestMethod = httpURLConnectionNewHttpURLConnection.getRequestMethod();
            URL url = httpURLConnectionNewHttpURLConnection.getURL();
            Intrinsics.checkNotNullExpressionValue(url, "con.url");
            JSONObject jSONObject = this.$jsonBody;
            Map<String, List<String>> requestProperties = httpURLConnectionNewHttpURLConnection.getRequestProperties();
            Intrinsics.checkNotNullExpressionValue(requestProperties, "con.requestProperties");
            c1938Rp0.logHTTPSent(requestMethod, url, jSONObject, requestProperties);
            JSONObject jSONObject2 = this.$jsonBody;
            if (jSONObject2 != null) {
                String unescapedEUIDString = KD0.INSTANCE.toUnescapedEUIDString(jSONObject2);
                Charset charsetForName = Charset.forName("UTF-8");
                Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(charsetName)");
                byte[] bytes = unescapedEUIDString.getBytes(charsetForName);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                httpURLConnectionNewHttpURLConnection.setFixedLengthStreamingMode(bytes.length);
                httpURLConnectionNewHttpURLConnection.getOutputStream().write(bytes);
            }
            C3597ea1 c3597ea1 = this.$headers;
            if ((c3597ea1 != null ? c3597ea1.getCacheKey() : null) != null) {
                String string$default = InterfaceC6659su0.a.getString$default(C1938Rp0.this._prefs, "OneSignal", "PREFS_OS_ETAG_PREFIX_" + this.$headers.getCacheKey(), null, 4, null);
                if (string$default != null) {
                    httpURLConnectionNewHttpURLConnection.setRequestProperty("If-None-Match", string$default);
                    NS0.debug$default("HttpClient: Adding header if-none-match: ".concat(string$default), null, 2, null);
                }
            }
            C3597ea1 c3597ea2 = this.$headers;
            if ((c3597ea2 != null ? c3597ea2.getRywToken() : null) != null) {
                httpURLConnectionNewHttpURLConnection.setRequestProperty("OneSignal-RYW-Token", this.$headers.getRywToken().toString());
            }
            C3597ea1 c3597ea3 = this.$headers;
            if ((c3597ea3 != null ? c3597ea3.getRetryCount() : null) != null) {
                httpURLConnectionNewHttpURLConnection.setRequestProperty("Onesignal-Retry-Count", this.$headers.getRetryCount().toString());
            }
            C3597ea1 c3597ea4 = this.$headers;
            if ((c3597ea4 != null ? c3597ea4.getSessionDuration() : null) != null) {
                httpURLConnectionNewHttpURLConnection.setRequestProperty("OneSignal-Session-Duration", this.$headers.getSessionDuration().toString());
            }
            int responseCode = httpURLConnectionNewHttpURLConnection.getResponseCode();
            try {
                Integer numRetryAfterFromResponse = C1938Rp0.this.retryAfterFromResponse(httpURLConnectionNewHttpURLConnection);
                Integer numRetryLimitFromResponse = C1938Rp0.this.retryLimitFromResponse(httpURLConnectionNewHttpURLConnection);
                long currentTimeMillis = C1938Rp0.this._time.getCurrentTimeMillis() + ((long) ((numRetryAfterFromResponse != null ? numRetryAfterFromResponse.intValue() : 0) * CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT));
                if (currentTimeMillis > C1938Rp0.this.delayNewRequestsUntil) {
                    C1938Rp0.this.delayNewRequestsUntil = currentTimeMillis;
                }
                String str3 = "GET";
                if (responseCode != 304) {
                    switch (responseCode) {
                        case HttpPlatformResponse.MAX_MESSAGE_LENGTH /* 200 */:
                        case 201:
                        case 202:
                            Scanner scanner = new Scanner(httpURLConnectionNewHttpURLConnection.getInputStream(), "UTF-8");
                            String next = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                            scanner.close();
                            StringBuilder sb = new StringBuilder("HttpClient: Got Response = ");
                            String str4 = this.$method;
                            if (str4 == null) {
                                str4 = "GET";
                            }
                            sb.append(str4);
                            sb.append(' ');
                            sb.append(httpURLConnectionNewHttpURLConnection.getURL());
                            sb.append(" - STATUS: ");
                            sb.append(responseCode);
                            sb.append(" - Body: ");
                            sb.append(next);
                            NS0.debug$default(sb.toString(), null, 2, null);
                            C3597ea1 c3597ea5 = this.$headers;
                            if ((c3597ea5 != null ? c3597ea5.getCacheKey() : null) != null && (headerField = httpURLConnectionNewHttpURLConnection.getHeaderField("etag")) != null) {
                                NS0.debug$default("HttpClient: Got Response = Response has etag of " + headerField + " so caching the response.", null, 2, null);
                                C1938Rp0.this._prefs.saveString("OneSignal", "PREFS_OS_ETAG_PREFIX_" + this.$headers.getCacheKey(), headerField);
                                C1938Rp0.this._prefs.saveString("OneSignal", "PREFS_OS_HTTP_CACHE_PREFIX_" + this.$headers.getCacheKey(), next);
                            }
                            this.$retVal.d = new C5178lr0(responseCode, next, null, numRetryAfterFromResponse, numRetryLimitFromResponse, 4, null);
                            break;
                        default:
                            StringBuilder sb2 = new StringBuilder("HttpClient: Got Response = ");
                            String str5 = this.$method;
                            if (str5 != null) {
                                str3 = str5;
                            }
                            sb2.append(str3);
                            sb2.append(' ');
                            sb2.append(httpURLConnectionNewHttpURLConnection.getURL());
                            sb2.append(" - FAILED STATUS: ");
                            sb2.append(responseCode);
                            NS0.debug$default(sb2.toString(), null, 2, null);
                            InputStream errorStream = httpURLConnectionNewHttpURLConnection.getErrorStream();
                            if (errorStream == null) {
                                errorStream = httpURLConnectionNewHttpURLConnection.getInputStream();
                            }
                            if (errorStream != null) {
                                Scanner scanner2 = new Scanner(errorStream, "UTF-8");
                                String next2 = scanner2.useDelimiter("\\A").hasNext() ? scanner2.next() : "";
                                scanner2.close();
                                NS0.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - Body: " + next2, null, 2, null);
                                str2 = next2;
                            } else {
                                NS0.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - No response body!", null, 2, null);
                                str2 = null;
                            }
                            this.$retVal.d = new C5178lr0(responseCode, str2, null, numRetryAfterFromResponse, numRetryLimitFromResponse, 4, null);
                            break;
                    }
                } else {
                    InterfaceC6659su0 interfaceC6659su0 = C1938Rp0.this._prefs;
                    StringBuilder sb3 = new StringBuilder("PREFS_OS_HTTP_CACHE_PREFIX_");
                    C3597ea1 c3597ea6 = this.$headers;
                    sb3.append(c3597ea6 != null ? c3597ea6.getCacheKey() : null);
                    String string$default2 = InterfaceC6659su0.a.getString$default(interfaceC6659su0, "OneSignal", sb3.toString(), null, 4, null);
                    StringBuilder sb4 = new StringBuilder("HttpClient: Got Response = ");
                    String str6 = this.$method;
                    sb4.append(str6 == null ? "GET" : str6);
                    sb4.append(' ');
                    sb4.append(httpURLConnectionNewHttpURLConnection.getURL());
                    sb4.append(" - Using Cached response due to 304: ");
                    sb4.append(string$default2);
                    NS0.debug$default(sb4.toString(), null, 2, null);
                    this.$retVal.d = new C5178lr0(responseCode, string$default2, null, numRetryAfterFromResponse, numRetryLimitFromResponse, 4, null);
                }
                httpURLConnectionNewHttpURLConnection.disconnect();
            } catch (Throwable th5) {
                th = th5;
                httpURLConnection = httpURLConnectionNewHttpURLConnection;
                i = responseCode;
                if (th instanceof ConnectException) {
                    NS0.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                } else {
                    NS0.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                }
                this.$retVal.d = new C5178lr0(i, null, th, null, null, 24, null);
            }
            return Unit.a;
        }
    }

    public C1938Rp0(@NotNull InterfaceC1165Hs0 _connectionFactory, @NotNull InterfaceC6659su0 _prefs, @NotNull C7582xI _configModelStore, @NotNull InterfaceC4092gv0 _time, @NotNull InterfaceC3456dt0 _installIdService) {
        Intrinsics.checkNotNullParameter(_connectionFactory, "_connectionFactory");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_installIdService, "_installIdService");
        this._connectionFactory = _connectionFactory;
        this._prefs = _prefs;
        this._configModelStore = _configModelStore;
        this._time = _time;
        this._installIdService = _installIdService;
    }

    private final int getThreadTimeout(int timeout) {
        return timeout + 5000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logHTTPSent(String method, URL url, JSONObject jsonBody, Map<String, ? extends List<String>> headers) {
        String strJ = CollectionsKt.J(headers.entrySet(), null, null, null, null, 63);
        if (method == null) {
            method = "GET";
        }
        NS0.debug$default("HttpClient: Request Sent = " + method + ' ' + url + " - Body: " + (jsonBody != null ? KD0.INSTANCE.toUnescapedEUIDString(jsonBody) : null) + " - Headers: " + strJ, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object makeRequest(String str, String str2, JSONObject jSONObject, int i, C3597ea1 c3597ea1, JM<? super C5178lr0> jm) {
        a aVar;
        JSONObject jSONObject2;
        int i2;
        C3597ea1 c3597ea2;
        String str3;
        C1938Rp0 c1938Rp0;
        String str4;
        C1938Rp0 c1938Rp1;
        MZ1 mz1;
        String str5;
        Object objB;
        String str6 = str2;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i3 = aVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.label = i3 - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object obj = aVar.result;
        MN mn = MN.d;
        int i4 = aVar.label;
        try {
            try {
                if (i4 != 0) {
                    if (i4 == 1) {
                        int i5 = aVar.I$0;
                        C3597ea1 c3597ea3 = (C3597ea1) aVar.L$4;
                        JSONObject jSONObject3 = (JSONObject) aVar.L$3;
                        String str7 = (String) aVar.L$2;
                        str4 = (String) aVar.L$1;
                        c1938Rp1 = (C1938Rp0) aVar.L$0;
                        C1795Pt1.b(obj);
                        i2 = i5;
                        jSONObject2 = jSONObject3;
                        c3597ea2 = c3597ea3;
                        str6 = str7;
                    } else {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str5 = (String) aVar.L$0;
                        try {
                            C1795Pt1.b(obj);
                            return obj;
                        } catch (MZ1 e) {
                            mz1 = e;
                        }
                    }
                    NS0.error("HttpClient: Request timed out: " + str5, mz1);
                    return new C5178lr0(0, null, mz1, null, null, 24, null);
                }
                C1795Pt1.b(obj);
                if (str6 != null) {
                    Boolean consentRequired = this._configModelStore.getModel().getConsentRequired();
                    Boolean bool = Boolean.TRUE;
                    if (Intrinsics.a(consentRequired, bool) && !Intrinsics.a(this._configModelStore.getModel().getConsentGiven(), bool)) {
                        NS0.warn$default(ID.c(str6, " `", str, "` was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.privacyConsent"), null, 2, null);
                        return new C5178lr0(0, null, null, null, null, 24, null);
                    }
                }
                long currentTimeMillis = this.delayNewRequestsUntil - this._time.getCurrentTimeMillis();
                if (currentTimeMillis > 0) {
                    aVar.L$0 = this;
                    aVar.L$1 = str;
                    aVar.L$2 = str6;
                    jSONObject2 = jSONObject;
                    aVar.L$3 = jSONObject2;
                    c3597ea2 = c3597ea1;
                    aVar.L$4 = c3597ea2;
                    i2 = i;
                    aVar.I$0 = i2;
                    aVar.label = 1;
                    if (IW.b(currentTimeMillis, aVar) != mn) {
                        str4 = str;
                        c1938Rp1 = this;
                    }
                } else {
                    jSONObject2 = jSONObject;
                    i2 = i;
                    c3597ea2 = c3597ea1;
                    str3 = str;
                    c1938Rp0 = this;
                    String str8 = str6;
                    JSONObject jSONObject4 = jSONObject2;
                    C3597ea1 c3597ea4 = c3597ea2;
                    long threadTimeout = c1938Rp0.getThreadTimeout(i2);
                    b bVar = c1938Rp0.new b(str3, str8, jSONObject4, i2, c3597ea4, null);
                    aVar.L$0 = str3;
                    aVar.L$1 = null;
                    aVar.L$2 = null;
                    aVar.L$3 = null;
                    aVar.L$4 = null;
                    aVar.label = 2;
                    objB = OZ1.b(threadTimeout, bVar, aVar);
                    if (objB != mn) {
                        return objB;
                    }
                }
                return mn;
                long threadTimeout2 = c1938Rp0.getThreadTimeout(i2);
                b bVar2 = c1938Rp0.new b(str3, str8, jSONObject4, i2, c3597ea4, null);
                aVar.L$0 = str3;
                aVar.L$1 = null;
                aVar.L$2 = null;
                aVar.L$3 = null;
                aVar.L$4 = null;
                aVar.label = 2;
                objB = OZ1.b(threadTimeout2, bVar2, aVar);
                if (objB != mn) {
                    return mn;
                }
                return objB;
            } catch (MZ1 e2) {
                mz1 = e2;
                str5 = str3;
            }
            str3 = str4;
            c1938Rp0 = c1938Rp1;
            String str9 = str6;
            JSONObject jSONObject5 = jSONObject2;
            C3597ea1 c3597ea5 = c3597ea2;
        } catch (Throwable th) {
            return new C5178lr0(0, null, th, null, null, 24, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object makeRequestIODispatcher(String str, String str2, JSONObject jSONObject, int i, C3597ea1 c3597ea1, JM<? super C5178lr0> jm) {
        c cVar;
        C3027bp1 c3027bp1;
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
        Object obj = cVar.result;
        MN mn = MN.d;
        int i3 = cVar.label;
        if (i3 == 0) {
            C3027bp1 c3027bp1B = C4564j.b(obj);
            C2936bP1 c2936bP1K = C5189lv.k(C6215qm0.d, C6266r20.c, new d(str, i, jSONObject, str2, c3597ea1, c3027bp1B, null), 2);
            cVar.L$0 = c3027bp1B;
            cVar.label = 1;
            if (c2936bP1K.b1(cVar) == mn) {
                return mn;
            }
            c3027bp1 = c3027bp1B;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3027bp1 = (C3027bp1) cVar.L$0;
            C1795Pt1.b(obj);
        }
        Object obj2 = c3027bp1.d;
        Intrinsics.checkNotNull(obj2);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer retryAfterFromResponse(HttpURLConnection con) {
        String headerField = con.getHeaderField("Retry-After");
        if (headerField != null) {
            NS0.debug$default("HttpClient: Response Retry-After: ".concat(headerField), null, 2, null);
            Integer intOrNull = StringsKt.toIntOrNull(headerField);
            return Integer.valueOf(intOrNull != null ? intOrNull.intValue() : this._configModelStore.getModel().getHttpRetryAfterParseFailFallback());
        }
        if (con.getResponseCode() == 429) {
            return Integer.valueOf(this._configModelStore.getModel().getHttpRetryAfterParseFailFallback());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer retryLimitFromResponse(HttpURLConnection con) {
        String headerField = con.getHeaderField("OneSignal-Retry-Limit");
        if (headerField == null) {
            return null;
        }
        NS0.debug$default("HttpClient: Response OneSignal-Retry-Limit: ".concat(headerField), null, 2, null);
        return StringsKt.toIntOrNull(headerField);
    }

    @Override // defpackage.InterfaceC1087Gs0
    @Nullable
    public Object delete(@NotNull String str, @Nullable C3597ea1 c3597ea1, @NotNull JM<? super C5178lr0> jm) {
        return makeRequest(str, "DELETE", null, this._configModelStore.getModel().getHttpTimeout(), c3597ea1, jm);
    }

    @Override // defpackage.InterfaceC1087Gs0
    @Nullable
    public Object get(@NotNull String str, @Nullable C3597ea1 c3597ea1, @NotNull JM<? super C5178lr0> jm) {
        return makeRequest(str, null, null, this._configModelStore.getModel().getHttpGetTimeout(), c3597ea1, jm);
    }

    @Override // defpackage.InterfaceC1087Gs0
    @Nullable
    public Object patch(@NotNull String str, @NotNull JSONObject jSONObject, @Nullable C3597ea1 c3597ea1, @NotNull JM<? super C5178lr0> jm) {
        return makeRequest(str, "PATCH", jSONObject, this._configModelStore.getModel().getHttpTimeout(), c3597ea1, jm);
    }

    @Override // defpackage.InterfaceC1087Gs0
    @Nullable
    public Object post(@NotNull String str, @NotNull JSONObject jSONObject, @Nullable C3597ea1 c3597ea1, @NotNull JM<? super C5178lr0> jm) {
        return makeRequest(str, "POST", jSONObject, this._configModelStore.getModel().getHttpTimeout(), c3597ea1, jm);
    }

    @Override // defpackage.InterfaceC1087Gs0
    @Nullable
    public Object put(@NotNull String str, @NotNull JSONObject jSONObject, @Nullable C3597ea1 c3597ea1, @NotNull JM<? super C5178lr0> jm) {
        return makeRequest(str, "PUT", jSONObject, this._configModelStore.getModel().getHttpTimeout(), c3597ea1, jm);
    }
}

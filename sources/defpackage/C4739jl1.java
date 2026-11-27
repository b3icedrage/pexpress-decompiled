package defpackage;

import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001'B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Ljl1;", "Lil1;", "LxI;", "_configModelStore", "LWr0;", "_applicationService", "LEm0;", "upgradePrompt", "Lws0;", "deviceService", "<init>", "(LxI;LWr0;LEm0;Lws0;)V", "", "getTokenWithClassFirebaseMessaging", "()Ljava/lang/String;", "senderId", "", "initFirebaseApp", "(Ljava/lang/String;)V", "getToken", "(Ljava/lang/String;LJM;)Ljava/lang/Object;", "LxI;", "get_configModelStore", "()LxI;", "set_configModelStore", "(LxI;)V", "LWr0;", "get_applicationService", "()LWr0;", "projectId", "Ljava/lang/String;", "appId", "apiKey", "LId0;", "firebaseApp", "LId0;", "getProviderName", "providerName", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C4739jl1 extends AbstractC4480il1 {

    @NotNull
    private static final String FCM_APP_NAME = "ONESIGNAL_SDK_FCM_APP_NAME";

    @NotNull
    private static final String FCM_DEFAULT_API_KEY_BASE64 = "QUl6YVN5QW5UTG41LV80TWMyYTJQLWRLVWVFLWFCdGd5Q3JqbFlV";

    @NotNull
    private static final String FCM_DEFAULT_APP_ID = "1:754795614042:android:c682b8144a8dd52bc1ad63";

    @NotNull
    private static final String FCM_DEFAULT_PROJECT_ID = "onesignal-shared-public";

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private C7582xI _configModelStore;

    @NotNull
    private final String apiKey;

    @NotNull
    private final String appId;

    @Nullable
    private C1198Id0 firebaseApp;

    @NotNull
    private final String projectId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4739jl1(@NotNull C7582xI _configModelStore, @NotNull InterfaceC2338Wr0 _applicationService, @NotNull C0913Em0 upgradePrompt, @NotNull InterfaceC7494ws0 deviceService) {
        super(deviceService, _configModelStore, upgradePrompt);
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(upgradePrompt, "upgradePrompt");
        Intrinsics.checkNotNullParameter(deviceService, "deviceService");
        this._configModelStore = _configModelStore;
        this._applicationService = _applicationService;
        C2547Za0 fcmParams = _configModelStore.getModel().getFcmParams();
        String projectId = fcmParams.getProjectId();
        this.projectId = projectId == null ? FCM_DEFAULT_PROJECT_ID : projectId;
        String appId = fcmParams.getAppId();
        this.appId = appId == null ? FCM_DEFAULT_APP_ID : appId;
        byte[] bArrDecode = Base64.decode(FCM_DEFAULT_API_KEY_BASE64, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(FCM_DEFAULT_API_KEY_BASE64, Base64.DEFAULT)");
        String str = new String(bArrDecode, Charsets.UTF_8);
        String apiKey = fcmParams.getApiKey();
        this.apiKey = apiKey != null ? apiKey : str;
    }

    private final String getTokenWithClassFirebaseMessaging() throws Exception {
        Task<String> task;
        C1198Id0 c1198Id0 = this.firebaseApp;
        Intrinsics.checkNotNull(c1198Id0);
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) c1198Id0.b(FirebaseMessaging.class);
        InterfaceC2556Zd0 interfaceC2556Zd0 = firebaseMessaging.b;
        if (interfaceC2556Zd0 != null) {
            task = interfaceC2556Zd0.a();
        } else {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            firebaseMessaging.h.execute(new P(3, firebaseMessaging, taskCompletionSource));
            task = taskCompletionSource.getTask();
        }
        Intrinsics.checkNotNullExpressionValue(task, "fcmInstance.token");
        try {
            Object objAwait = Tasks.await(task);
            Intrinsics.checkNotNullExpressionValue(objAwait, "await(tokenTask)");
            return (String) objAwait;
        } catch (ExecutionException e) {
            Exception exception = task.getException();
            if (exception == null) {
                throw e;
            }
            throw exception;
        }
    }

    private final void initFirebaseApp(String senderId) {
        if (this.firebaseApp != null) {
            return;
        }
        C3193ce0 c3193ce0 = new C3193ce0(Preconditions.checkNotEmpty(this.appId, "ApplicationId must be set."), Preconditions.checkNotEmpty(this.apiKey, "ApiKey must be set."), null, null, senderId, null, this.projectId);
        Intrinsics.checkNotNullExpressionValue(c3193ce0, "Builder()\n              …\n                .build()");
        this.firebaseApp = C1198Id0.f(c3193ce0, this._applicationService.getAppContext(), FCM_APP_NAME);
    }

    @Override // defpackage.AbstractC4480il1
    @NotNull
    public String getProviderName() {
        return "FCM";
    }

    @Override // defpackage.AbstractC4480il1
    @Nullable
    public Object getToken(@NotNull String str, @NotNull JM<? super String> jm) {
        initFirebaseApp(str);
        return getTokenWithClassFirebaseMessaging();
    }

    @NotNull
    public final InterfaceC2338Wr0 get_applicationService() {
        return this._applicationService;
    }

    @NotNull
    public final C7582xI get_configModelStore() {
        return this._configModelStore;
    }

    public final void set_configModelStore(@NotNull C7582xI c7582xI) {
        Intrinsics.checkNotNullParameter(c7582xI, "<set-?>");
        this._configModelStore = c7582xI;
    }
}

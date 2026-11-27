package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.RemoteMessage;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LD91;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "token", "Landroid/os/Bundle;", "bundle", "", "onNewToken", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V", "(Landroid/content/Context;Ljava/lang/String;)V", "Lcom/huawei/hms/push/RemoteMessage;", "message", "onMessageReceived", "(Landroid/content/Context;Lcom/huawei/hms/push/RemoteMessage;)V", "HMS_TTL_KEY", "Ljava/lang/String;", "HMS_SENT_TIME_KEY", "Ljava/util/concurrent/atomic/AtomicBoolean;", "firstToken", "Ljava/util/concurrent/atomic/AtomicBoolean;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class D91 {

    @NotNull
    public static final String HMS_SENT_TIME_KEY = "hms.sent_time";

    @NotNull
    public static final String HMS_TTL_KEY = "hms.ttl";

    @NotNull
    public static final D91 INSTANCE = new D91();

    @NotNull
    private static final AtomicBoolean firstToken = new AtomicBoolean(true);

    @InterfaceC3368dU(c = "com.onesignal.notifications.bridges.OneSignalHmsEventBridge$onNewToken$1", f = "OneSignalHmsEventBridge.kt", l = {43}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ C3027bp1<InterfaceC7289vu0> $registerer;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3027bp1<InterfaceC7289vu0> c3027bp1, String str, JM<? super a> jm) {
            super(1, jm);
            this.$registerer = c3027bp1;
            this.$token = str;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return new a(this.$registerer, this.$token, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC7289vu0 interfaceC7289vu0 = this.$registerer.d;
                String str = this.$token;
                this.label = 1;
                if (interfaceC7289vu0.fireCallback(str, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    private D91() {
    }

    public final void onMessageReceived(@NotNull Context context, @NotNull RemoteMessage message) {
        Bundle bundleJsonStringToBundle;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(message, "message");
        if (C7766y91.c(context)) {
            InterfaceC4092gv0 interfaceC4092gv0 = (InterfaceC4092gv0) C7766y91.b().getService(InterfaceC4092gv0.class);
            InterfaceC0934Et0 interfaceC0934Et0 = (InterfaceC0934Et0) C7766y91.b().getService(InterfaceC0934Et0.class);
            String data = message.getData();
            try {
                JSONObject jSONObject = new JSONObject(message.getData());
                if (message.getTtl() == 0) {
                    jSONObject.put(HMS_TTL_KEY, 259200);
                } else {
                    jSONObject.put(HMS_TTL_KEY, message.getTtl());
                }
                if (message.getSentTime() == 0) {
                    jSONObject.put(HMS_SENT_TIME_KEY, interfaceC4092gv0.getCurrentTimeMillis());
                } else {
                    jSONObject.put(HMS_SENT_TIME_KEY, message.getSentTime());
                }
                data = jSONObject.toString();
            } catch (JSONException unused) {
                NS0.error$default("OneSignalHmsEventBridge error when trying to create RemoteMessage data JSON", null, 2, null);
            }
            if (data == null || (bundleJsonStringToBundle = KD0.INSTANCE.jsonStringToBundle(data)) == null) {
                return;
            }
            interfaceC0934Et0.processBundleFromReceiver(context, bundleJsonStringToBundle);
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [T, java.lang.Object] */
    public final void onNewToken(@NotNull Context context, @NotNull String token, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
        if (!firstToken.compareAndSet(true, false)) {
            NS0.info$default("OneSignalHmsEventBridge ignoring onNewToken - HMS token: " + token + " Bundle: " + bundle, null, 2, null);
            return;
        }
        NS0.info$default("OneSignalHmsEventBridge onNewToken - HMS token: " + token + " Bundle: " + bundle, null, 2, null);
        C3027bp1 c3027bp1 = new C3027bp1();
        c3027bp1.d = C7766y91.b().getService(InterfaceC7289vu0.class);
        LY1.suspendifyOnThread$default(0, new a(c3027bp1, token, null), 1, null);
    }

    public final void onNewToken(@NotNull Context context, @NotNull String token) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
        onNewToken(context, token, null);
    }
}

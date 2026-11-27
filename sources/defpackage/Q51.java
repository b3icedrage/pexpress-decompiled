package defpackage;

import com.google.android.gms.common.ConnectionResult;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"LQ51;", "LDt0;", "LGs0;", "_httpClient", "<init>", "(LGs0;)V", "", "appId", "notificationId", "subscriptionId", "Lws0$a;", "deviceType", "", "updateNotificationAsReceived", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lws0$a;LJM;)Ljava/lang/Object;", "updateNotificationAsOpened", "LGs0;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Q51 implements InterfaceC0856Dt0 {

    @NotNull
    private final InterfaceC1087Gs0 _httpClient;

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.backend.impl.NotificationBackendService", f = "NotificationBackendService.kt", l = {43}, m = "updateNotificationAsOpened")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends LM {
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
            return Q51.this.updateNotificationAsOpened(null, null, null, null, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.backend.impl.NotificationBackendService", f = "NotificationBackendService.kt", l = {ConnectionResult.API_DISABLED_FOR_CONNECTION}, m = "updateNotificationAsReceived")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends LM {
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
            return Q51.this.updateNotificationAsReceived(null, null, null, null, this);
        }
    }

    public Q51(@NotNull InterfaceC1087Gs0 _httpClient) {
        Intrinsics.checkNotNullParameter(_httpClient, "_httpClient");
        this._httpClient = _httpClient;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.InterfaceC0856Dt0
    @Nullable
    public Object updateNotificationAsOpened(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull InterfaceC7494ws0.a aVar, @NotNull JM<? super Unit> jm) throws JSONException, C7063up {
        a aVar2;
        if (jm instanceof a) {
            aVar2 = (a) jm;
            int i = aVar2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar2.label = i - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(jm);
            }
        } else {
            aVar2 = new a(jm);
        }
        a aVar3 = aVar2;
        Object objPut$default = aVar3.result;
        MN mn = MN.d;
        int i2 = aVar3.label;
        if (i2 == 0) {
            C1795Pt1.b(objPut$default);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_id", str);
            jSONObject.put("player_id", str3);
            jSONObject.put("opened", true);
            jSONObject.put("device_type", aVar.getValue());
            InterfaceC1087Gs0 interfaceC1087Gs0 = this._httpClient;
            String strC = C5491nL.c("notifications/", str2);
            aVar3.label = 1;
            objPut$default = InterfaceC1087Gs0.a.put$default(interfaceC1087Gs0, strC, jSONObject, null, aVar3, 4, null);
            if (objPut$default == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objPut$default);
        }
        C5178lr0 c5178lr0 = (C5178lr0) objPut$default;
        if (c5178lr0.isSuccess()) {
            return Unit.a;
        }
        throw new C7063up(c5178lr0.getStatusCode(), c5178lr0.getPayload(), c5178lr0.getRetryAfterSeconds());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.InterfaceC0856Dt0
    @Nullable
    public Object updateNotificationAsReceived(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull InterfaceC7494ws0.a aVar, @NotNull JM<? super Unit> jm) throws JSONException, C7063up {
        b bVar;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i = bVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.label = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(jm);
            }
        } else {
            bVar = new b(jm);
        }
        b bVar2 = bVar;
        Object objPut$default = bVar2.result;
        MN mn = MN.d;
        int i2 = bVar2.label;
        if (i2 == 0) {
            C1795Pt1.b(objPut$default);
            JSONObject jSONObjectPut = new JSONObject().put("app_id", str).put("player_id", str3).put("device_type", aVar.getValue());
            Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n           …_type\", deviceType.value)");
            InterfaceC1087Gs0 interfaceC1087Gs0 = this._httpClient;
            String strD = C1039Gc0.d("notifications/", str2, "/report_received");
            bVar2.label = 1;
            objPut$default = InterfaceC1087Gs0.a.put$default(interfaceC1087Gs0, strD, jSONObjectPut, null, bVar2, 4, null);
            if (objPut$default == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objPut$default);
        }
        C5178lr0 c5178lr0 = (C5178lr0) objPut$default;
        if (c5178lr0.isSuccess()) {
            return Unit.a;
        }
        throw new C7063up(c5178lr0.getStatusCode(), c5178lr0.getPayload(), c5178lr0.getRetryAfterSeconds());
    }
}

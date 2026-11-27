package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: Aa1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JE\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"LAa1;", "Liu0;", "LGs0;", "_http", "<init>", "(LGs0;)V", "", "appId", "userId", "subscriptionId", "deviceType", "", "direct", "Lya1;", "event", "", "sendOutcomeEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lya1;LJM;)Ljava/lang/Object;", "LGs0;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C0566Aa1 implements InterfaceC4547iu0 {

    @NotNull
    private final InterfaceC1087Gs0 _http;

    /* JADX INFO: renamed from: Aa1$a */
    @InterfaceC3368dU(c = "com.onesignal.session.internal.outcomes.impl.OutcomeEventsBackendService", f = "OutcomeEventsBackendService.kt", l = {49}, m = "sendOutcomeEvent")
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
            return C0566Aa1.this.sendOutcomeEvent(null, null, null, null, null, null, this);
        }
    }

    public C0566Aa1(@NotNull InterfaceC1087Gs0 _http) {
        Intrinsics.checkNotNullParameter(_http, "_http");
        this._http = _http;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC4547iu0
    @Nullable
    public Object sendOutcomeEvent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable Boolean bool, @NotNull C7848ya1 c7848ya1, @NotNull JM<? super Unit> jm) throws JSONException, C7063up {
        a aVar;
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
        Object objPost$default = aVar.result;
        MN mn = MN.d;
        int i2 = aVar.label;
        if (i2 == 0) {
            C1795Pt1.b(objPost$default);
            JSONObject jsonObject = new JSONObject().put("app_id", str).put("onesignal_id", str2).put("subscription", new JSONObject().put("id", str3).put("type", str4));
            if (bool != null) {
                jsonObject.put("direct", bool.booleanValue());
            }
            if (c7848ya1.getNotificationIds() != null && c7848ya1.getNotificationIds().length() > 0) {
                jsonObject.put(C1575Mz0.NOTIFICATIONS_IDS, c7848ya1.getNotificationIds());
            }
            jsonObject.put("id", c7848ya1.getName());
            if (c7848ya1.getWeight() > 0.0f) {
                jsonObject.put("weight", new Float(c7848ya1.getWeight()));
            }
            if (c7848ya1.getTimestamp() > 0) {
                jsonObject.put("timestamp", c7848ya1.getTimestamp());
            }
            if (c7848ya1.getSessionTime() > 0) {
                jsonObject.put("session_time", c7848ya1.getSessionTime());
            }
            InterfaceC1087Gs0 interfaceC1087Gs0 = this._http;
            Intrinsics.checkNotNullExpressionValue(jsonObject, "jsonObject");
            aVar.label = 1;
            objPost$default = InterfaceC1087Gs0.a.post$default(interfaceC1087Gs0, "outcomes/measure", jsonObject, null, aVar, 4, null);
            if (objPost$default == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objPost$default);
        }
        C5178lr0 c5178lr0 = (C5178lr0) objPost$default;
        if (c5178lr0.isSuccess()) {
            return Unit.a;
        }
        throw new C7063up(c5178lr0.getStatusCode(), c5178lr0.getPayload(), c5178lr0.getRetryAfterSeconds());
    }
}

package defpackage;

import com.onesignal.notifications.INotificationClickEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: c61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lc61;", "Lcom/onesignal/notifications/INotificationClickEvent;", "LO51;", "_notification", "Ld61;", "_result", "<init>", "(LO51;Ld61;)V", "Lorg/json/JSONObject;", "toJSONObject", "()Lorg/json/JSONObject;", "LO51;", "Ld61;", "LBt0;", "getNotification", "()LBt0;", "notification", "LHt0;", "getResult", "()LHt0;", "result", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C3084c61 implements INotificationClickEvent {

    @NotNull
    private final O51 _notification;

    @NotNull
    private final C3294d61 _result;

    public C3084c61(@NotNull O51 _notification, @NotNull C3294d61 _result) {
        Intrinsics.checkNotNullParameter(_notification, "_notification");
        Intrinsics.checkNotNullParameter(_result, "_result");
        this._notification = _notification;
        this._result = _result;
    }

    @Override // com.onesignal.notifications.INotificationClickEvent
    @NotNull
    public InterfaceC0700Bt0 getNotification() {
        return this._notification;
    }

    @Override // com.onesignal.notifications.INotificationClickEvent
    @NotNull
    public InterfaceC1168Ht0 getResult() {
        return this._result;
    }

    @NotNull
    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("notification", this._notification.toJSONObject()).put("action", this._result.toJSONObject());
        Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n           …, _result.toJSONObject())");
        return jSONObjectPut;
    }
}

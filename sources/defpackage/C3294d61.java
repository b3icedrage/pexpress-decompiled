package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: d61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Ld61;", "LHt0;", "", "actionId", ImagesContract.URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lorg/json/JSONObject;", "toJSONObject", "()Lorg/json/JSONObject;", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "getUrl", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C3294d61 implements InterfaceC1168Ht0 {

    @Nullable
    private final String actionId;

    @Nullable
    private final String url;

    public C3294d61(@Nullable String str, @Nullable String str2) {
        this.actionId = str;
        this.url = str2;
    }

    @Override // defpackage.InterfaceC1168Ht0
    @Nullable
    public String getActionId() {
        return this.actionId;
    }

    @Override // defpackage.InterfaceC1168Ht0
    @Nullable
    public String getUrl() {
        return this.url;
    }

    @NotNull
    public final JSONObject toJSONObject() {
        return JD0.putSafe(JD0.putSafe(new JSONObject(), "actionId", getActionId()), ImagesContract.URL, getUrl());
    }
}

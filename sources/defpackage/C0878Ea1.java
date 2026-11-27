package defpackage;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: Ea1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\n\u0010\u0013R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012\"\u0004\b\f\u0010\u0013¨\u0006\u0015"}, d2 = {"LEa1;", "", "LFa1;", "directBody", "indirectBody", "<init>", "(LFa1;LFa1;)V", "Lorg/json/JSONObject;", "toJSONObject", "()Lorg/json/JSONObject;", "setDirectBody", "(LFa1;)LEa1;", "setIndirectBody", "", "toString", "()Ljava/lang/String;", "LFa1;", "getDirectBody", "()LFa1;", "(LFa1;)V", "getIndirectBody", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C0878Ea1 {

    @Nullable
    private C0956Fa1 directBody;

    @Nullable
    private C0956Fa1 indirectBody;

    public C0878Ea1(@Nullable C0956Fa1 c0956Fa1, @Nullable C0956Fa1 c0956Fa2) {
        this.directBody = c0956Fa1;
        this.indirectBody = c0956Fa2;
    }

    @Nullable
    public final C0956Fa1 getDirectBody() {
        return this.directBody;
    }

    @Nullable
    public final C0956Fa1 getIndirectBody() {
        return this.indirectBody;
    }

    /* JADX INFO: renamed from: setDirectBody, reason: collision with other method in class */
    public final void m4setDirectBody(@Nullable C0956Fa1 c0956Fa1) {
        this.directBody = c0956Fa1;
    }

    /* JADX INFO: renamed from: setIndirectBody, reason: collision with other method in class */
    public final void m5setIndirectBody(@Nullable C0956Fa1 c0956Fa1) {
        this.indirectBody = c0956Fa1;
    }

    @NotNull
    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C0956Fa1 c0956Fa1 = this.directBody;
        if (c0956Fa1 != null) {
            jSONObject.put("direct", c0956Fa1.toJSONObject());
        }
        C0956Fa1 c0956Fa2 = this.indirectBody;
        if (c0956Fa2 != null) {
            jSONObject.put(DevicePublicKeyStringDef.INDIRECT, c0956Fa2.toJSONObject());
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "OutcomeSource{directBody=" + this.directBody + ", indirectBody=" + this.indirectBody + '}';
    }

    @NotNull
    public final C0878Ea1 setDirectBody(@Nullable C0956Fa1 directBody) {
        this.directBody = directBody;
        return this;
    }

    @NotNull
    public final C0878Ea1 setIndirectBody(@Nullable C0956Fa1 indirectBody) {
        this.indirectBody = indirectBody;
        return this;
    }
}

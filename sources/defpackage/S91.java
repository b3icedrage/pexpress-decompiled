package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LS91;", "LL01;", "LQ91;", "Lsu0;", "prefs", "<init>", "(Lsu0;)V", "Lorg/json/JSONObject;", "jsonObject", "", "isValidOperation", "(Lorg/json/JSONObject;)Z", "", "loadOperations", "()V", "create", "(Lorg/json/JSONObject;)LQ91;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class S91 extends L01<Q91> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S91(@NotNull InterfaceC6659su0 prefs) {
        super("operations", prefs);
        Intrinsics.checkNotNullParameter(prefs, "prefs");
    }

    private final boolean isValidOperation(JSONObject jsonObject) throws JSONException {
        if (!jsonObject.has(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
            NS0.error$default("jsonObject must have 'name' attribute", null, 2, null);
            return false;
        }
        String string = jsonObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        String[] elements = {C6146qT0.LOGIN_USER, C5726oT0.LOGIN_USER_FROM_SUBSCRIPTION_USER};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setH = C1526Mj.H(elements);
        if (jsonObject.has("onesignalId") || setH.contains(string)) {
            return true;
        }
        NS0.error$default(string + " jsonObject must have 'onesignalId' attribute", null, 2, null);
        return false;
    }

    public final void loadOperations() {
        load();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.L01, defpackage.InterfaceC7076ut0
    @Nullable
    public Q91 create(@Nullable JSONObject jsonObject) throws Exception {
        Q91 c4684jX;
        if (jsonObject == null) {
            NS0.error$default("null jsonObject sent to OperationModelStore.create", null, 2, null);
            return null;
        }
        if (!isValidOperation(jsonObject)) {
            return null;
        }
        String string = jsonObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (string != null) {
            switch (string.hashCode()) {
                case -1865677906:
                    if (string.equals(C2268Vv0.DELETE_ALIAS)) {
                        c4684jX = new C4684jX();
                        c4684jX.initializeFromJson(jsonObject);
                        return c4684jX;
                    }
                    break;
                case -1793763409:
                    if (string.equals(C6146qT0.LOGIN_USER)) {
                        c4684jX = new C5936pT0();
                        c4684jX.initializeFromJson(jsonObject);
                        return c4684jX;
                    }
                    break;
                case -1606689981:
                    if (string.equals(Y92.TRACK_PURCHASE)) {
                        c4684jX = new N02();
                        c4684jX.initializeFromJson(jsonObject);
                        return c4684jX;
                    }
                    break;
                case -1188793632:
                    if (string.equals(Y92.SET_PROPERTY)) {
                        c4684jX = new C4386iJ1();
                        c4684jX.initializeFromJson(jsonObject);
                        return c4684jX;
                    }
                    break;
                case -1080179201:
                    if (string.equals(FU1.DELETE_SUBSCRIPTION)) {
                        c4684jX = new C4894kX();
                        c4684jX.initializeFromJson(jsonObject);
                        return c4684jX;
                    }
                    break;
                case -828599391:
                    if (string.equals(FU1.UPDATE_SUBSCRIPTION)) {
                        c4684jX = new X92();
                        c4684jX.initializeFromJson(jsonObject);
                        return c4684jX;
                    }
                    break;
                case -516221659:
                    if (string.equals(C2268Vv0.SET_ALIAS)) {
                        c4684jX = new C3127cJ1();
                        c4684jX.initializeFromJson(jsonObject);
                        return c4684jX;
                    }
                    break;
                case -92337283:
                    if (string.equals(C3868fq1.REFRESH_USER)) {
                        c4684jX = new C3658eq1();
                        c4684jX.initializeFromJson(jsonObject);
                        return c4684jX;
                    }
                    break;
                case 532599746:
                    if (string.equals(C5726oT0.LOGIN_USER_FROM_SUBSCRIPTION_USER)) {
                        c4684jX = new C5516nT0();
                        c4684jX.initializeFromJson(jsonObject);
                        return c4684jX;
                    }
                    break;
                case 846157390:
                    if (string.equals(FU1.CREATE_SUBSCRIPTION)) {
                        c4684jX = new PP();
                        c4684jX.initializeFromJson(jsonObject);
                        return c4684jX;
                    }
                    break;
                case 1707031487:
                    if (string.equals(FU1.TRANSFER_SUBSCRIPTION)) {
                        c4684jX = new C6067q42();
                        c4684jX.initializeFromJson(jsonObject);
                        return c4684jX;
                    }
                    break;
                case 1763437688:
                    if (string.equals(Y92.DELETE_TAG)) {
                        c4684jX = new C5104lX();
                        c4684jX.initializeFromJson(jsonObject);
                        return c4684jX;
                    }
                    break;
                case 1852485538:
                    if (string.equals(Y92.TRACK_SESSION_END)) {
                        c4684jX = new O02();
                        c4684jX.initializeFromJson(jsonObject);
                        return c4684jX;
                    }
                    break;
                case 1983836079:
                    if (string.equals(Y92.SET_TAG)) {
                        c4684jX = new C4854kJ1();
                        c4684jX.initializeFromJson(jsonObject);
                        return c4684jX;
                    }
                    break;
                case 2135250281:
                    if (string.equals(Y92.TRACK_SESSION_START)) {
                        c4684jX = new P02();
                        c4684jX.initializeFromJson(jsonObject);
                        return c4684jX;
                    }
                    break;
            }
        }
        throw new Exception(C5491nL.c("Unrecognized operation: ", string));
    }
}

package defpackage;

import com.google.android.gms.common.Scopes;
import io.sentry.ILogger;
import io.sentry.clientreport.b;
import io.sentry.protocol.B;
import io.sentry.protocol.C4526h;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public enum MG1 implements BH0 {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile(Scopes.PROFILE),
    ProfileChunk("profile_chunk"),
    ClientReport("client_report"),
    ReplayEvent("replay_event"),
    ReplayRecording("replay_recording"),
    ReplayVideo("replay_video"),
    CheckIn("check_in"),
    Feedback("feedback"),
    Log("log"),
    TraceMetric("trace_metric"),
    Span("span"),
    Unknown("__unknown__");

    private final String itemType;

    public static final class a implements KG0<MG1> {
        @Override // defpackage.KG0
        @NotNull
        public final MG1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return MG1.valueOfLabel(q71.B().toLowerCase(Locale.ROOT));
        }
    }

    MG1(String str) {
        this.itemType = str;
    }

    public static MG1 resolve(Object obj) {
        if (obj instanceof EG1) {
            return ((C4526h) ((EG1) obj).e.y(C4526h.class, "feedback")) == null ? Event : Feedback;
        }
        if (obj instanceof B) {
            return Transaction;
        }
        if (obj instanceof CI1) {
            return Session;
        }
        return obj instanceof b ? ClientReport : Attachment;
    }

    @NotNull
    public static MG1 valueOfLabel(String str) {
        for (MG1 mg1 : values()) {
            if (mg1.itemType.equals(str)) {
                return mg1;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    @Override // defpackage.BH0
    public void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        ((C6319rH0) w71).j(this.itemType);
    }
}

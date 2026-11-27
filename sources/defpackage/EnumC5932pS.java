package defpackage;

import com.google.android.gms.common.Scopes;

/* JADX INFO: renamed from: pS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC5932pS {
    All("__all__"),
    Default("default"),
    Error("error"),
    Feedback("feedback"),
    Session("session"),
    Attachment("attachment"),
    LogItem("log_item"),
    LogByte("log_byte"),
    TraceMetric("trace_metric"),
    Monitor("monitor"),
    Profile(Scopes.PROFILE),
    ProfileChunkUi("profile_chunk_ui"),
    ProfileChunk("profile_chunk"),
    Transaction("transaction"),
    Replay("replay"),
    Span("span"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");

    private final String category;

    EnumC5932pS(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}

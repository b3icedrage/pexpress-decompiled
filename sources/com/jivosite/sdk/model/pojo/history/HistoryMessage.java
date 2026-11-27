package com.jivosite.sdk.model.pojo.history;

import defpackage.C1039Gc0;
import defpackage.C5491nL;
import defpackage.InterfaceC5477nG0;
import defpackage.InterfaceC7156vG0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7156vG0(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJV\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00022\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/jivosite/sdk/model/pojo/history/HistoryMessage;", "", "", "type", "text", "", "msgId", "chatId", "from", "createdTs", "fromId", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;JLjava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;JLjava/lang/String;)Lcom/jivosite/sdk/model/pojo/history/HistoryMessage;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class HistoryMessage {

    @NotNull
    public final String a;

    @NotNull
    public final String b;
    public final long c;
    public final long d;

    @NotNull
    public final String e;
    public final long f;

    @NotNull
    public final String g;

    public HistoryMessage(@InterfaceC5477nG0(name = "type") @NotNull String type, @InterfaceC5477nG0(name = "text") @NotNull String text, @InterfaceC5477nG0(name = "msg_id") long j, @InterfaceC5477nG0(name = "chat_id") long j2, @InterfaceC5477nG0(name = "from") @NotNull String from, @InterfaceC5477nG0(name = "created_ts") long j3, @InterfaceC5477nG0(name = "from_id") @NotNull String fromId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(fromId, "fromId");
        this.a = type;
        this.b = text;
        this.c = j;
        this.d = j2;
        this.e = from;
        this.f = j3;
        this.g = fromId;
    }

    @NotNull
    public final HistoryMessage copy(@InterfaceC5477nG0(name = "type") @NotNull String type, @InterfaceC5477nG0(name = "text") @NotNull String text, @InterfaceC5477nG0(name = "msg_id") long msgId, @InterfaceC5477nG0(name = "chat_id") long chatId, @InterfaceC5477nG0(name = "from") @NotNull String from, @InterfaceC5477nG0(name = "created_ts") long createdTs, @InterfaceC5477nG0(name = "from_id") @NotNull String fromId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(fromId, "fromId");
        return new HistoryMessage(type, text, msgId, chatId, from, createdTs, fromId);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryMessage)) {
            return false;
        }
        HistoryMessage historyMessage = (HistoryMessage) obj;
        return Intrinsics.a(this.a, historyMessage.a) && Intrinsics.a(this.b, historyMessage.b) && this.c == historyMessage.c && this.d == historyMessage.d && Intrinsics.a(this.e, historyMessage.e) && this.f == historyMessage.f && Intrinsics.a(this.g, historyMessage.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + C5491nL.a(C1039Gc0.b(C5491nL.a(C5491nL.a(C1039Gc0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryMessage(type=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", msgId=");
        sb.append(this.c);
        sb.append(", chatId=");
        sb.append(this.d);
        sb.append(", from=");
        sb.append(this.e);
        sb.append(", createdTs=");
        sb.append(this.f);
        sb.append(", fromId=");
        return C1039Gc0.e(sb, this.g, ')');
    }
}

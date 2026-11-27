package com.jivosite.sdk.model.pojo.history;

import defpackage.InterfaceC5477nG0;
import defpackage.InterfaceC7156vG0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7156vG0(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/jivosite/sdk/model/pojo/history/History;", "Lcom/jivosite/sdk/model/pojo/history/HistoryResult;", "", "Lcom/jivosite/sdk/model/pojo/history/HistoryMessage;", "messages", "<init>", "(Ljava/util/List;)V", "copy", "(Ljava/util/List;)Lcom/jivosite/sdk/model/pojo/history/History;", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class History extends HistoryResult {

    @NotNull
    public final List<HistoryMessage> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public History(@InterfaceC5477nG0(name = "messages") @NotNull List<HistoryMessage> messages) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.d = messages;
    }

    @NotNull
    public final History copy(@InterfaceC5477nG0(name = "messages") @NotNull List<HistoryMessage> messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        return new History(messages);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof History) && Intrinsics.a(this.d, ((History) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @NotNull
    public final String toString() {
        return "History(messages=" + this.d + ')';
    }
}

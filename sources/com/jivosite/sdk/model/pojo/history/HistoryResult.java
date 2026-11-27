package com.jivosite.sdk.model.pojo.history;

import com.jivosite.sdk.model.pojo.response.Response;
import defpackage.InterfaceC5477nG0;
import defpackage.InterfaceC7156vG0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7156vG0(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/jivosite/sdk/model/pojo/history/HistoryResult;", "Lcom/jivosite/sdk/model/pojo/response/Response;", "Lcom/jivosite/sdk/model/pojo/history/History;", "result", "<init>", "(Lcom/jivosite/sdk/model/pojo/history/History;)V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class HistoryResult extends Response {

    @Nullable
    public final History c;

    /* JADX WARN: Multi-variable type inference failed */
    public HistoryResult() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ HistoryResult(History history, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : history);
    }

    public HistoryResult(@InterfaceC5477nG0(name = "result") @Nullable History history) {
        super(false, null, 3, null);
        this.c = history;
    }
}

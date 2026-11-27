package com.jivosite.sdk.model.pojo.response;

import defpackage.InterfaceC5477nG0;
import defpackage.InterfaceC7156vG0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7156vG0(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B#\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/jivosite/sdk/model/pojo/response/Response;", "", "", "isOk", "", "", "errorList", "<init>", "(ZLjava/util/List;)V", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class Response {
    public final boolean a;

    @Nullable
    public final List<String> b;

    /* JADX WARN: Multi-variable type inference failed */
    public Response() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Nullable
    public List<String> a() {
        return this.b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getA() {
        return this.a;
    }

    public Response(@InterfaceC5477nG0(name = "ok") boolean z, @InterfaceC5477nG0(name = "error_list") @Nullable List<String> list) {
        this.a = z;
        this.b = list;
    }

    public /* synthetic */ Response(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list);
    }
}

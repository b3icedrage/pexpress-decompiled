package defpackage;

import com.jivosite.sdk.model.pojo.response.Response;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ar1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0617Ar1 extends ML0 implements Function1<Response, Boolean> {
    public static final C0617Ar1 d = new C0617Ar1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Response response) {
        Response it = response;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.getG());
    }
}

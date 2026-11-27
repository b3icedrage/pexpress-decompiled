package defpackage;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3241cr0 {

    @NotNull
    public final La2 a;

    @NotNull
    public final C1629Nq0 b;

    @NotNull
    public final C3651eo0 c;

    @NotNull
    public final AbstractC1112Ha1 d;

    @NotNull
    public final C4002gV1 e;

    @NotNull
    public final YH f;

    @NotNull
    public final Set<InterfaceC3657eq0<?>> g;

    public C3241cr0(@NotNull La2 url, @NotNull C1629Nq0 method, @NotNull C3651eo0 headers, @NotNull AbstractC1112Ha1 body, @NotNull C4002gV1 executionContext, @NotNull YH attributes) {
        Set<InterfaceC3657eq0<?>> setKeySet;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(executionContext, "executionContext");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.a = url;
        this.b = method;
        this.c = headers;
        this.d = body;
        this.e = executionContext;
        this.f = attributes;
        Map map = (Map) attributes.e(C3867fq0.a);
        this.g = (map == null || (setKeySet = map.keySet()) == null) ? C6702t60.d : setKeySet;
    }

    @Nullable
    public final Object a() {
        C1006Fr0.b key = C1006Fr0.d;
        Intrinsics.checkNotNullParameter(key, "key");
        Map map = (Map) this.f.e(C3867fq0.a);
        if (map != null) {
            return map.get(key);
        }
        return null;
    }

    @NotNull
    public final String toString() {
        return "HttpRequestData(url=" + this.a + ", method=" + this.b + ')';
    }
}

package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: is1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4543is1 {

    @NotNull
    public final C1318Jr0 a;

    @NotNull
    public final String b;

    @NotNull
    public final C2813ao0 c;

    @Nullable
    public final AbstractC5395ms1 d;

    @NotNull
    public final Map<Class<?>, Object> e;

    @Nullable
    public C4307hx f;

    /* JADX INFO: renamed from: is1$a */
    public static class a {

        @Nullable
        public C1318Jr0 a;

        @Nullable
        public AbstractC5395ms1 d;

        @NotNull
        public LinkedHashMap e = new LinkedHashMap();

        @NotNull
        public String b = "GET";

        @NotNull
        public C2813ao0.a c = new C2813ao0.a();

        @NotNull
        public final void a(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.c.a(name, value);
        }

        @NotNull
        public final C4543is1 b() {
            Map mapUnmodifiableMap;
            C1318Jr0 c1318Jr0 = this.a;
            if (c1318Jr0 == null) {
                throw new IllegalStateException("url == null");
            }
            String str = this.b;
            C2813ao0 c2813ao0D = this.c.d();
            AbstractC5395ms1 abstractC5395ms1 = this.d;
            LinkedHashMap linkedHashMap = this.e;
            byte[] bArr = C6806tc2.a;
            Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
            if (linkedHashMap.isEmpty()) {
                mapUnmodifiableMap = PW0.c();
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
            }
            return new C4543is1(c1318Jr0, str, c2813ao0D, abstractC5395ms1, mapUnmodifiableMap);
        }

        @NotNull
        public final void c(@NotNull C4307hx cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            if (string.length() == 0) {
                f("Cache-Control");
            } else {
                d("Cache-Control", string);
            }
        }

        @NotNull
        public final void d(@NotNull String name, @NotNull String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            C2813ao0.a aVar = this.c;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            C2813ao0.b.a(name);
            C2813ao0.b.b(value, name);
            aVar.f(name);
            aVar.c(name, value);
        }

        @NotNull
        public final void e(@NotNull String method, @Nullable AbstractC5395ms1 abstractC5395ms1) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (abstractC5395ms1 == null) {
                Intrinsics.checkNotNullParameter(method, "method");
                if (method.equals("POST") || method.equals("PUT") || method.equals("PATCH") || method.equals("PROPPATCH") || method.equals("REPORT")) {
                    throw new IllegalArgumentException(C1039Gc0.d("method ", method, " must have a request body.").toString());
                }
            } else if (!C3476e.r(method)) {
                throw new IllegalArgumentException(C1039Gc0.d("method ", method, " must not have a request body.").toString());
            }
            this.b = method;
            this.d = abstractC5395ms1;
        }

        @NotNull
        public final void f(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.c.f(name);
        }

        @NotNull
        public final void g(@NotNull Class type, @Nullable Object obj) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (obj == null) {
                this.e.remove(type);
                return;
            }
            if (this.e.isEmpty()) {
                this.e = new LinkedHashMap();
            }
            LinkedHashMap linkedHashMap = this.e;
            Object objCast = type.cast(obj);
            Intrinsics.checkNotNull(objCast);
            linkedHashMap.put(type, objCast);
        }

        @NotNull
        public final void h(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (d.o(url, "ws:", true)) {
                StringBuilder sb = new StringBuilder("http:");
                String strSubstring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                url = sb.toString();
            } else if (d.o(url, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder("https:");
                String strSubstring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring2);
                url = sb2.toString();
            }
            Intrinsics.checkNotNullParameter(url, "<this>");
            C1318Jr0.a aVar = new C1318Jr0.a();
            aVar.e(null, url);
            C1318Jr0 url2 = aVar.a();
            Intrinsics.checkNotNullParameter(url2, "url");
            this.a = url2;
        }
    }

    public C4543is1(@NotNull C1318Jr0 url, @NotNull String method, @NotNull C2813ao0 headers, @Nullable AbstractC5395ms1 abstractC5395ms1, @NotNull Map<Class<?>, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.a = url;
        this.b = method;
        this.c = headers;
        this.d = abstractC5395ms1;
        this.e = tags;
    }

    @Nullable
    public final String a(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.c.b(name);
    }

    @NotNull
    public final a b() {
        Intrinsics.checkNotNullParameter(this, "request");
        a aVar = new a();
        aVar.e = new LinkedHashMap();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.d = this.d;
        Map<Class<?>, Object> map = this.e;
        aVar.e = map.isEmpty() ? new LinkedHashMap() : PW0.l(map);
        aVar.c = this.c.d();
        return aVar;
    }

    @Nullable
    public final <T> T c(@NotNull Class<? extends T> type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type.cast(this.e.get(type));
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        C2813ao0 c2813ao0 = this.c;
        if (c2813ao0.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Pair<? extends String, ? extends String> pair : c2813ao0) {
                int i2 = i + 1;
                if (i < 0) {
                    WE.l();
                    throw null;
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String str = (String) pair2.d;
                String str2 = (String) pair2.e;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        Map<Class<?>, Object> map = this.e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}

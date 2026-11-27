package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Oq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1707Oq0 {

    @NotNull
    public static final b d = new b();

    @NotNull
    public static final C2498Yk<C1707Oq0> e = new C2498Yk<>("HttpPlainText");

    @NotNull
    public final Charset a;

    @NotNull
    public final Charset b;

    @NotNull
    public final String c;

    /* JADX INFO: renamed from: Oq0$a */
    public static final class a {

        @NotNull
        public final LinkedHashSet a = new LinkedHashSet();

        @NotNull
        public final LinkedHashMap b = new LinkedHashMap();

        @NotNull
        public final Charset c = Charsets.UTF_8;
    }

    /* JADX INFO: renamed from: Oq0$b */
    public static final class b implements InterfaceC4755jq0<a, C1707Oq0> {
        @Override // defpackage.InterfaceC4755jq0
        public final void a(C1707Oq0 c1707Oq0, C1782Pp0 scope) {
            C1707Oq0 plugin = c1707Oq0;
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.i.f(C4539ir0.i, new C1785Pq0(plugin, null));
            scope.j.f(C6440rr0.h, new C1863Qq0(plugin, null));
        }

        @Override // defpackage.InterfaceC4755jq0
        public final C1707Oq0 b(Function1<? super a, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return new C1707Oq0(aVar.a, aVar.b, aVar.c);
        }

        @Override // defpackage.InterfaceC4755jq0
        @NotNull
        public final C2498Yk<C1707Oq0> getKey() {
            return C1707Oq0.e;
        }
    }

    public C1707Oq0(@NotNull LinkedHashSet charsets, @NotNull LinkedHashMap charsetQuality, @NotNull Charset responseCharsetFallback) {
        Intrinsics.checkNotNullParameter(charsets, "charsets");
        Intrinsics.checkNotNullParameter(charsetQuality, "charsetQuality");
        Intrinsics.checkNotNullParameter(responseCharsetFallback, "responseCharsetFallback");
        this.a = responseCharsetFallback;
        List<Pair> listZ = CollectionsKt.Z(RW0.m(charsetQuality), new C1941Rq0());
        ArrayList arrayList = new ArrayList();
        for (Object obj : charsets) {
            if (!charsetQuality.containsKey((Charset) obj)) {
                arrayList.add(obj);
            }
        }
        List<Charset> listZ2 = CollectionsKt.Z(arrayList, new C4233hc(1));
        StringBuilder sb = new StringBuilder();
        for (Charset charset : listZ2) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(C6927uA.d(charset));
        }
        for (Pair pair : listZ) {
            Charset charset2 = (Charset) pair.d;
            float fFloatValue = ((Number) pair.e).floatValue();
            if (sb.length() > 0) {
                sb.append(",");
            }
            double d2 = fFloatValue;
            if (0.0d > d2 || d2 > 1.0d) {
                throw new IllegalStateException("Check failed.");
            }
            sb.append(C6927uA.d(charset2) + ";q=" + (((double) QX0.b(100 * fFloatValue)) / 100.0d));
        }
        if (sb.length() == 0) {
            sb.append(C6927uA.d(this.a));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        this.c = string;
        Charset charset3 = (Charset) CollectionsKt.firstOrNull(listZ2);
        if (charset3 == null) {
            Pair pair2 = (Pair) CollectionsKt.firstOrNull(listZ);
            charset3 = pair2 != null ? (Charset) pair2.d : null;
            if (charset3 == null) {
                charset3 = Charsets.UTF_8;
            }
        }
        this.b = charset3;
    }
}

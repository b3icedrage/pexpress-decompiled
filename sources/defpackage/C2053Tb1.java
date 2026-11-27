package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Tb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2053Tb1 implements Iterable<Pair<? extends String, ? extends b>>, InterfaceC6745tJ0 {

    @NotNull
    public static final C2053Tb1 e = new C2053Tb1();
    public final Map<String, b> d;

    /* JADX INFO: renamed from: Tb1$a */
    public static final class a {
        public final LinkedHashMap a;

        public a(@NotNull C2053Tb1 parameters) {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.a = PW0.l(parameters.d);
        }
    }

    /* JADX INFO: renamed from: Tb1$b */
    public static final class b {
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return 0;
        }

        @NotNull
        public final String toString() {
            return "Entry(value=null, cacheKey=null)";
        }
    }

    public C2053Tb1(Map<String, b> map) {
        this.d = map;
    }

    @NotNull
    public final Map<String, String> b() {
        Map<String, b> map = this.d;
        if (map.isEmpty()) {
            return PW0.c();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, b>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().getClass();
        }
        return linkedHashMap;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2053Tb1) {
            return Intrinsics.a(this.d, ((C2053Tb1) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Pair<? extends String, ? extends b>> iterator() {
        Map<String, b> map = this.d;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, b> entry : map.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    @NotNull
    public final String toString() {
        return "Parameters(map=" + this.d + ')';
    }

    public C2053Tb1() {
        this(PW0.c());
    }
}

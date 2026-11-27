package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7607xQ0<K, V> {
    public final a<K, V> a = new a<>(null);
    public final HashMap<K, a<K, V>> b = new HashMap<>();

    /* JADX INFO: renamed from: xQ0$a */
    public static final class a<K, V> {
        public ArrayList a;

        @NotNull
        public a<K, V> b = this;

        @NotNull
        public a<K, V> c = this;

        @Nullable
        public final Integer d;

        public a(@Nullable Integer num) {
            this.d = num;
        }
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkedMultimap( ");
        a<K, V> aVar = this.a;
        a<K, V> aVar2 = aVar.c;
        while (!Intrinsics.a(aVar2, aVar)) {
            sb.append('{');
            sb.append(aVar2.d);
            sb.append(':');
            ArrayList arrayList = aVar2.a;
            sb.append(arrayList != null ? arrayList.size() : 0);
            sb.append('}');
            aVar2 = aVar2.c;
            if (!Intrinsics.a(aVar2, aVar)) {
                sb.append(", ");
            }
        }
        sb.append(" )");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}

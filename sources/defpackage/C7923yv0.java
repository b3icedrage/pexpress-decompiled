package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7923yv0 {

    @NotNull
    public final LinkedHashSet a = new LinkedHashSet();

    @NotNull
    public final LinkedHashMap b = new LinkedHashMap();

    public final synchronized void a(String str, int i, Object obj) {
        if (str.length() == 0) {
            String message = "Attempting to perform operation " + C2756ad0.b(i) + " with a null or empty string property, ignoring";
            Intrinsics.checkNotNullParameter(message, "message");
            C7378wK.b(DS0.a.g, message);
            return;
        }
        if (obj == null) {
            String message2 = "Attempting to perform operation " + C2756ad0.b(i) + " with null value for property " + str + ", ignoring";
            Intrinsics.checkNotNullParameter(message2, "message");
            C7378wK.b(DS0.a.g, message2);
            return;
        }
        if (this.b.containsKey("$clearAll")) {
            Intrinsics.checkNotNullParameter("This Identify already contains a $clearAll operation, ignoring operation %s", "message");
            C7378wK.b(DS0.a.g, "This Identify already contains a $clearAll operation, ignoring operation %s");
            return;
        }
        if (!this.a.contains(str)) {
            if (!this.b.containsKey(C2756ad0.b(i))) {
                this.b.put(C2756ad0.b(i), new LinkedHashMap());
            }
            Object obj2 = this.b.get(C2756ad0.b(i));
            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
            F62.c(obj2).put(str, obj);
            this.a.add(str);
            return;
        }
        String message3 = "Already used property " + str + " in previous operation, ignoring operation " + C2756ad0.b(i);
        Intrinsics.checkNotNullParameter(message3, "message");
        C7378wK.b(DS0.a.g, message3);
    }
}

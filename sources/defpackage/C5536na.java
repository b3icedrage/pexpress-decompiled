package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: na, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5536na {

    @NotNull
    public static final Object c = new Object();

    @NotNull
    public static final LinkedHashMap d = new LinkedHashMap();

    @NotNull
    public final C2454Xv0 a = new C2454Xv0();

    @NotNull
    public final C3930g80 b = new C3930g80();

    /* JADX INFO: renamed from: na$a */
    public static final class a {
        @NotNull
        public static C5536na a(@NotNull String instanceName) {
            C5536na c5536na;
            Intrinsics.checkNotNullParameter(instanceName, "instanceName");
            synchronized (C5536na.c) {
                try {
                    LinkedHashMap linkedHashMap = C5536na.d;
                    Object c5536na2 = linkedHashMap.get(instanceName);
                    if (c5536na2 == null) {
                        c5536na2 = new C5536na();
                        linkedHashMap.put(instanceName, c5536na2);
                    }
                    c5536na = (C5536na) c5536na2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return c5536na;
        }
    }
}

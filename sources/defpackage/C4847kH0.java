package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4847kH0 {

    @NotNull
    public static final C4222hZ.a<Map<String, Integer>> a = new C4222hZ.a<>();

    public static final int a(@NotNull MH1 descriptor, @NotNull AbstractC5267mG0 json, @NotNull String name) {
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        C7577xG0 c7577xG0 = json.a;
        c(json, descriptor);
        int iD = descriptor.d(name);
        if (iD != -3 || !json.a.i) {
            return iD;
        }
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(json, "<this>");
        C4222hZ.a<Map<String, Integer>> key = a;
        C4637jH0 defaultValue = new C4637jH0(json, descriptor);
        C4222hZ c4222hZ = json.c;
        c4222hZ.getClass();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Object value = c4222hZ.a(descriptor, key);
        if (value == null) {
            value = defaultValue.invoke();
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            ConcurrentHashMap concurrentHashMap = c4222hZ.a;
            Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(descriptor, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(key, value);
        }
        Integer num = (Integer) ((Map) value).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int b(@NotNull MH1 mh1, @NotNull AbstractC5267mG0 json, @NotNull String name, @NotNull String suffix) {
        Intrinsics.checkNotNullParameter(mh1, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        int iA = a(mh1, json, name);
        if (iA != -3) {
            return iA;
        }
        throw new ZH1(mh1.a() + " does not contain element with name '" + name + '\'' + suffix);
    }

    @Nullable
    public static final void c(@NotNull AbstractC5267mG0 json, @NotNull MH1 mh1) {
        Intrinsics.checkNotNullParameter(mh1, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        if (Intrinsics.a(mh1.h(), RS1.a.a)) {
            C7577xG0 c7577xG0 = json.a;
        }
    }
}

package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Y11 extends AbstractC0662Bg1 {

    @NotNull
    public final LinkedHashMap a;

    @NotNull
    public final C1922Rk b;

    public static final class a extends ML0 implements Function1<Map.Entry<AbstractC0662Bg1.a<?>, Object>, CharSequence> {
        public static final a d = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(Map.Entry<AbstractC0662Bg1.a<?>, Object> entry) {
            Map.Entry<AbstractC0662Bg1.a<?>, Object> entry2 = entry;
            Intrinsics.checkNotNullParameter(entry2, "entry");
            Object value = entry2.getValue();
            return "  " + entry2.getKey().a + " = " + (value instanceof byte[] ? C1526Mj.w((byte[]) value, ", ", null, 56) : String.valueOf(entry2.getValue()));
        }
    }

    public Y11() {
        this(false, 3);
    }

    @Override // defpackage.AbstractC0662Bg1
    @NotNull
    public final Map<AbstractC0662Bg1.a<?>, Object> a() {
        Pair pair;
        Set<Map.Entry> setEntrySet = this.a.entrySet();
        int iA = OW0.a(XE.m(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap map = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                pair = new Pair(key, bArrCopyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            map.put(pair.d, pair.e);
        }
        Intrinsics.checkNotNullParameter(map, "map");
        Map<AbstractC0662Bg1.a<?>, Object> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractC0662Bg1
    @Nullable
    public final <T> T b(@NotNull AbstractC0662Bg1.a<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t = (T) this.a.get(key);
        if (!(t instanceof byte[])) {
            return t;
        }
        byte[] bArr = (byte[]) t;
        T t2 = (T) Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(t2, "copyOf(this, size)");
        return t2;
    }

    public final void c() {
        if (this.b.a.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void d(@NotNull AbstractC0662Bg1.a<?> key, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        c();
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(key, "key");
            c();
            linkedHashMap.remove(key);
        } else {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                Intrinsics.checkNotNullParameter(set, "set");
                Set setUnmodifiableSet = Collections.unmodifiableSet(CollectionsKt.h0(set));
                Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
                linkedHashMap.put(key, setUnmodifiableSet);
                return;
            }
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(key, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
            linkedHashMap.put(key, bArrCopyOf);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    public final boolean equals(@Nullable Object obj) {
        boolean zA;
        if (obj instanceof Y11) {
            Y11 y11 = (Y11) obj;
            LinkedHashMap linkedHashMap = y11.a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    LinkedHashMap linkedHashMap3 = y11.a;
                    if (!linkedHashMap3.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap3.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zA = Intrinsics.a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zA = true;
                                } else {
                                    zA = false;
                                }
                            } else {
                                zA = false;
                            }
                            if (!zA) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    @NotNull
    public final String toString() {
        return CollectionsKt.J(this.a.entrySet(), ",\n", "{\n", "\n}", a.d, 24);
    }

    public /* synthetic */ Y11(boolean z, int i) {
        this(new LinkedHashMap(), (i & 2) != 0 ? true : z);
    }

    public Y11(@NotNull LinkedHashMap preferencesMap, boolean z) {
        Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.a = preferencesMap;
        this.b = new C1922Rk(z);
    }
}

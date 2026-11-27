package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
public final class C7380wK1 extends AW1 implements InterfaceC1060Gj0<BK1, AbstractC0662Bg1, JM<? super AbstractC0662Bg1>, Object> {
    public /* synthetic */ BK1 d;
    public /* synthetic */ AbstractC0662Bg1 e;

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        BK1 bk1 = this.d;
        AbstractC0662Bg1 abstractC0662Bg1 = this.e;
        Set<AbstractC0662Bg1.a<?>> setKeySet = abstractC0662Bg1.a().keySet();
        ArrayList arrayList = new ArrayList(XE.m(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC0662Bg1.a) it.next()).a);
        }
        Map<String, ?> all = bk1.a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it2.next();
            String key = next.getKey();
            LinkedHashSet linkedHashSet = bk1.b;
            if (linkedHashSet != null ? linkedHashSet.contains(key) : true) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(OW0.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key2 = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Set) {
                value = CollectionsKt.h0((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!arrayList.contains((String) entry2.getKey())) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        Y11 y11 = new Y11(PW0.l(abstractC0662Bg1.a()), false);
        for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
            String name = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof Boolean) {
                AbstractC0662Bg1.a<Boolean> key3 = C1052Gg1.a(name);
                Intrinsics.checkNotNullParameter(key3, "key");
                y11.d(key3, value2);
            } else if (value2 instanceof Float) {
                Intrinsics.checkNotNullParameter(name, "name");
                AbstractC0662Bg1.a<?> key4 = new AbstractC0662Bg1.a<>(name);
                Intrinsics.checkNotNullParameter(key4, "key");
                y11.d(key4, value2);
            } else if (value2 instanceof Integer) {
                AbstractC0662Bg1.a<Integer> key5 = C1052Gg1.b(name);
                Intrinsics.checkNotNullParameter(key5, "key");
                y11.d(key5, value2);
            } else if (value2 instanceof Long) {
                AbstractC0662Bg1.a<Long> key6 = C1052Gg1.c(name);
                Intrinsics.checkNotNullParameter(key6, "key");
                y11.d(key6, value2);
            } else if (value2 instanceof String) {
                AbstractC0662Bg1.a<String> key7 = C1052Gg1.d(name);
                Intrinsics.checkNotNullParameter(key7, "key");
                y11.d(key7, value2);
            } else if (value2 instanceof Set) {
                AbstractC0662Bg1.a<Set<String>> key8 = C1052Gg1.e(name);
                Intrinsics.c(value2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                Intrinsics.checkNotNullParameter(key8, "key");
                y11.d(key8, (Set) value2);
            }
        }
        return new Y11(PW0.l(y11.a()), true);
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(BK1 bk1, AbstractC0662Bg1 abstractC0662Bg1, JM<? super AbstractC0662Bg1> jm) {
        C7380wK1 c7380wK1 = new C7380wK1(3, jm);
        c7380wK1.d = bk1;
        c7380wK1.e = abstractC0662Bg1;
        return c7380wK1.invokeSuspend(Unit.a);
    }
}

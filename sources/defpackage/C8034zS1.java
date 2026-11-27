package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: zS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8034zS1 implements InterfaceC7614xS1 {

    @NotNull
    public final Map<String, List<String>> a = new C4781jz();

    @Override // defpackage.InterfaceC7614xS1
    @NotNull
    public final Set<Map.Entry<String, List<String>>> a() {
        Set<Map.Entry<String, List<String>>> setEntrySet = this.a.entrySet();
        Intrinsics.checkNotNullParameter(setEntrySet, "<this>");
        Set<Map.Entry<String, List<String>>> setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(this)");
        return setUnmodifiableSet;
    }

    @Override // defpackage.InterfaceC7614xS1
    public final void b(@NotNull String name, @NotNull List values) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        List<String> listE = e(name);
        Iterator it = values.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            h(str);
            listE.add(str);
        }
    }

    @Override // defpackage.InterfaceC7614xS1
    @Nullable
    public final List<String> c(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.a.get(name);
    }

    public final void d(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        h(value);
        e(name).add(value);
    }

    public final List<String> e(String str) {
        Map<String, List<String>> map = this.a;
        List<String> list = map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        g(str);
        map.put(str, arrayList);
        return arrayList;
    }

    @Nullable
    public final String f(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> listC = c(name);
        if (listC != null) {
            return (String) CollectionsKt.firstOrNull(listC);
        }
        return null;
    }

    public void g(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public void h(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // defpackage.InterfaceC7614xS1
    @NotNull
    public final Set<String> names() {
        return this.a.keySet();
    }
}

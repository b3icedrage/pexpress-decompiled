package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class AS1 implements InterfaceC7404wS1 {

    @NotNull
    public final Map<String, List<String>> c;

    public AS1(@NotNull Map values) {
        Intrinsics.checkNotNullParameter(values, "values");
        C4781jz c4781jz = new C4781jz();
        for (Map.Entry entry : values.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add((String) list.get(i));
            }
            c4781jz.put(str, arrayList);
        }
        this.c = c4781jz;
    }

    @Override // defpackage.InterfaceC7404wS1
    @NotNull
    public final Set<Map.Entry<String, List<String>>> a() {
        Set<Map.Entry<String, List<String>>> setEntrySet = this.c.entrySet();
        Intrinsics.checkNotNullParameter(setEntrySet, "<this>");
        Set<Map.Entry<String, List<String>>> setUnmodifiableSet = Collections.unmodifiableSet(setEntrySet);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(this)");
        return setUnmodifiableSet;
    }

    @Override // defpackage.InterfaceC7404wS1
    public final void b(@NotNull Function2<? super String, ? super List<String>, Unit> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        for (Map.Entry<String, List<String>> entry : this.c.entrySet()) {
            body.invoke(entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.InterfaceC7404wS1
    public final boolean c() {
        return true;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC7404wS1)) {
            return false;
        }
        InterfaceC7404wS1 interfaceC7404wS1 = (InterfaceC7404wS1) obj;
        if (true != interfaceC7404wS1.c()) {
            return false;
        }
        return Intrinsics.a(a(), interfaceC7404wS1.a());
    }

    @Override // defpackage.InterfaceC7404wS1
    @Nullable
    public final String get(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List<String> list = this.c.get(name);
        if (list != null) {
            return (String) CollectionsKt.firstOrNull(list);
        }
        return null;
    }

    public final int hashCode() {
        Set<Map.Entry<String, List<String>>> setA = a();
        return setA.hashCode() + (Boolean.hashCode(true) * 961);
    }

    @Override // defpackage.InterfaceC7404wS1
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }
}
